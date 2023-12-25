package simple.gameshop.logic.parsers;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import simple.gameshop.controller.dto.Game;
import simple.gameshop.logic.parsers.models.RawgGetGamesResponse;
import simple.gameshop.logic.parsers.models.RawgGetScreenshotResponse;
import simple.gameshop.logic.parsers.models.rawg.RawgGameDetailedDto;
import simple.gameshop.logic.parsers.models.rawg.RawgGameDto;
import simple.gameshop.logic.parsers.models.rawg.RawgScreenshotDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class RAWGParser {
    private final String RAWG_API_GAMES_URL = "https://api.rawg.io/api/games";
    private final String API_KEY = "6f087618f8a04c94b21bf0b741092c39";

    public List<RawgGameDto> getGames(Long page) {
        RestTemplate restTemplate = new RestTemplate();
        String url = RAWG_API_GAMES_URL + "?key=" + API_KEY + "&page_size=30&page=" + page;

        // Выполняем запрос к RAWG API
        RawgGetGamesResponse rawgGetGamesResponse = restTemplate.getForObject(url, RawgGetGamesResponse.class);

        return rawgGetGamesResponse.results;
    }

    public RawgGameDetailedDto getGameDetailed(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = RAWG_API_GAMES_URL + "/" + id + "?key=" + API_KEY;

        // Выполняем запрос к RAWG API
        RawgGameDetailedDto rawgGetGameDetailedResponse = restTemplate.getForObject(url, RawgGameDetailedDto.class);

        return rawgGetGameDetailedResponse;
    }

    public List<RawgScreenshotDto> getScreenshots(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = RAWG_API_GAMES_URL + "/" + id + "/screenshots" + "?key=" + API_KEY;
        // Выполняем запрос к RAWG API
        RawgGetScreenshotResponse rawgGetScreenshotResponse = restTemplate.getForObject(url, RawgGetScreenshotResponse.class);

        return rawgGetScreenshotResponse.getResults();
    }
}

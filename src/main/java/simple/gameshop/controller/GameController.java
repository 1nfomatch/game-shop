package simple.gameshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import simple.gameshop.controller.dto.GameBuyInfoDto;
import simple.gameshop.controller.dto.GameDetailedDto;
import simple.gameshop.logic.parsers.RAWGParser;
import simple.gameshop.logic.parsers.models.rawg.RawgGameDetailedDto;
import simple.gameshop.logic.parsers.models.rawg.RawgGameDto;
import simple.gameshop.logic.parsers.models.rawg.RawgScreenshotDto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@Controller
@RequestMapping("games")
public class GameController {
    @Autowired
    private RAWGParser rawgParser;

    private ArrayList<RawgGameDto> cachedGames = new ArrayList<>();

    @GetMapping("/{id}")
    public ResponseEntity<GameDetailedDto> getGameById(@PathVariable Long id) {
        RawgGameDetailedDto game = rawgParser.getGameDetailed(id);
        List<RawgScreenshotDto> screenshots = rawgParser.getScreenshots(id);

        var response = new GameDetailedDto(game, screenshots);

        if (game != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<RawgGameDto>> getGames(@RequestParam Long page) {
        var games = rawgParser.getGames(page);
        cachedGames.addAll(games);
        return new ResponseEntity<>(games, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ArrayList<GameBuyInfoDto>> getGameBuyInfoList(@RequestBody ArrayList<String> gameIdList) {
        var result = new ArrayList<GameBuyInfoDto>();
        Random rand = new Random();
        for (String gameId : gameIdList) {
            var getGameResult = cachedGames.stream()
                    .filter(x->x.getId().toString().equals(gameId))
                    .findFirst();

            if (getGameResult.isPresent()) {
                var game = getGameResult.get();
                result.add(new GameBuyInfoDto(game.getBackgroundImage(), game.getName(),
                        rand.nextLong(5,100), game.getId()));
            }
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

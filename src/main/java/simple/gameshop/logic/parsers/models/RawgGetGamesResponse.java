package simple.gameshop.logic.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import simple.gameshop.controller.dto.Game;
import simple.gameshop.logic.parsers.models.rawg.RawgGameDto;

import java.util.List;

public class RawgGetGamesResponse {
    @JsonProperty("results")
    public List<RawgGameDto> results;
}

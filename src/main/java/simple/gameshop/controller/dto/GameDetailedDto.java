package simple.gameshop.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import simple.gameshop.logic.parsers.models.rawg.RawgGameDetailedDto;
import simple.gameshop.logic.parsers.models.rawg.RawgScreenshotDto;

import java.util.List;

public class GameDetailedDto {
    @JsonProperty("game")
    public RawgGameDetailedDto game;
    @JsonProperty("screenshots")
    public List<RawgScreenshotDto> screenshots;

    public GameDetailedDto(RawgGameDetailedDto game, List<RawgScreenshotDto> screenshots) {
        this.game = game;
        this.screenshots = screenshots;
    }
}

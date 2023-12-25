package simple.gameshop.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Game {
    @JsonProperty("background_image")
    public String backgroundImage;
    @JsonProperty("name")
    public String name;
    @JsonProperty("genres")
    public List<String> genres;

    public Game(String backgroundImage, String name, List<String> genres) {
        this.backgroundImage = backgroundImage;
        this.name = name;
        this.genres = genres;
    }
}

package simple.gameshop.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameBuyInfoDto {
    @JsonProperty("id")
    public Long id;
    @JsonProperty("background_image")
    public String backgroundImage;
    @JsonProperty("name")
    public String name;
    @JsonProperty("price")
    public Long price;

    public GameBuyInfoDto(String backgroundImage, String name, Long price, Long id) {
        this.backgroundImage = backgroundImage;
        this.name = name;
        this.price = price;
        this.id = id;
    }
}

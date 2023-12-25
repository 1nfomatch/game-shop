package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgShortScreenshotDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("image")
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

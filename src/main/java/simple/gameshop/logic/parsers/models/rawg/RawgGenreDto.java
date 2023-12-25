package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgGenreDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("games_count")
    private int gamesCount;
    @JsonProperty("image_background")
    private String imageBackground;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(int gamesCount) {
        this.gamesCount = gamesCount;
    }

    public String getImageBackground() {
        return imageBackground;
    }

    public void setImageBackground(String imageBackground) {
        this.imageBackground = imageBackground;
    }
}

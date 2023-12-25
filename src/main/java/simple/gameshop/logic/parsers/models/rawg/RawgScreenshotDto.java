package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgScreenshotDto {
    @JsonProperty("id")
    private long id;

    @JsonProperty("image")
    private String image;

    @JsonProperty("width")
    private int width;

    @JsonProperty("height")
    private int height;

    @JsonProperty("is_deleted")
    private boolean isDeleted;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}

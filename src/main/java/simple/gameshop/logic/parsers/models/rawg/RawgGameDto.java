package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

public class RawgGameDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("name")
    private String name;
    @JsonProperty("released")
    private String released;
    @JsonProperty("tba")
    private boolean tba;
    @JsonProperty("background_image")
    private String backgroundImage;
    @JsonProperty("rating")
    private double rating;
    @JsonProperty("rating_top")
    private int ratingTop;
    @JsonProperty("ratings")
    private List<RawgRatingDto> ratings;
    @JsonProperty("ratings_count")
    private int ratingsCount;
    @JsonProperty("reviews_text_count")
    private int reviewsTextCount;
    @JsonProperty("added")
    private int added;
    @JsonProperty("added_by_status")
    private RawgAddedByStatusDto addedByStatus;
    @JsonProperty("metacritic")
    private int metacritic;
    @JsonProperty("playtime")
    private int playtime;
    @JsonProperty("suggestions_count")
    private int suggestionsCount;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("user_game")
    private Object userGame;
    @JsonProperty("reviews_count")
    private int reviewsCount;
    @JsonProperty("saturated_color")
    private String saturatedColor;
    @JsonProperty("dominant_color")
    private String dominantColor;
    @JsonProperty("platforms")
    private List<RawgPlatformDto> platforms;
    @JsonProperty("parent_platforms")
    private List<RawgParentPlatformDto> parentPlatforms;
    @JsonProperty("genres")
    private List<RawgGenreDto> genres;
    @JsonProperty("stores")
    private List<RawgStoreDto> stores;
    @JsonProperty("clip")
    private Object clip;
    @JsonProperty("tags")
    private List<RawgTagDto> tags;
    @JsonProperty("esrb_rating")
    private RawgEsrbRatingDto esrbRating;
    @JsonProperty("short_screenshots")
    private List<RawgShortScreenshotDto> shortScreenshots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public boolean isTba() {
        return tba;
    }

    public void setTba(boolean tba) {
        this.tba = tba;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingTop() {
        return ratingTop;
    }

    public void setRatingTop(int ratingTop) {
        this.ratingTop = ratingTop;
    }

    public List<RawgRatingDto> getRatings() {
        return ratings;
    }

    public void setRatings(List<RawgRatingDto> ratings) {
        this.ratings = ratings;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(int ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public int getReviewsTextCount() {
        return reviewsTextCount;
    }

    public void setReviewsTextCount(int reviewsTextCount) {
        this.reviewsTextCount = reviewsTextCount;
    }

    public int getAdded() {
        return added;
    }

    public void setAdded(int added) {
        this.added = added;
    }

    public RawgAddedByStatusDto getAddedByStatus() {
        return addedByStatus;
    }

    public void setAddedByStatus(RawgAddedByStatusDto addedByStatus) {
        this.addedByStatus = addedByStatus;
    }

    public int getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(int metacritic) {
        this.metacritic = metacritic;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public int getSuggestionsCount() {
        return suggestionsCount;
    }

    public void setSuggestionsCount(int suggestionsCount) {
        this.suggestionsCount = suggestionsCount;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Object getUserGame() {
        return userGame;
    }

    public void setUserGame(Object userGame) {
        this.userGame = userGame;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getSaturatedColor() {
        return saturatedColor;
    }

    public void setSaturatedColor(String saturatedColor) {
        this.saturatedColor = saturatedColor;
    }

    public String getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(String dominantColor) {
        this.dominantColor = dominantColor;
    }

    public List<RawgPlatformDto> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<RawgPlatformDto> platforms) {
        this.platforms = platforms;
    }

    public List<RawgParentPlatformDto> getParentPlatforms() {
        return parentPlatforms;
    }

    public void setParentPlatforms(List<RawgParentPlatformDto> parentPlatforms) {
        this.parentPlatforms = parentPlatforms;
    }

    public String getGenresPrintView() {
        return genres.stream()
                .map(RawgGenreDto::getName)
                .collect(Collectors.joining(", "));
    }

    public List<RawgGenreDto> getGenres() {
        return genres;
    }

    public void setGenres(List<RawgGenreDto> genres) {
        this.genres = genres;
    }

    public List<RawgStoreDto> getStores() {
        return stores;
    }

    public void setStores(List<RawgStoreDto> stores) {
        this.stores = stores;
    }

    public Object getClip() {
        return clip;
    }

    public void setClip(Object clip) {
        this.clip = clip;
    }

    public List<RawgTagDto> getTags() {
        return tags;
    }

    public void setTags(List<RawgTagDto> tags) {
        this.tags = tags;
    }

    public RawgEsrbRatingDto getEsrbRating() {
        return esrbRating;
    }

    public void setEsrbRating(RawgEsrbRatingDto esrbRating) {
        this.esrbRating = esrbRating;
    }

    public List<RawgShortScreenshotDto> getShortScreenshots() {
        return shortScreenshots;
    }

    public void setShortScreenshots(List<RawgShortScreenshotDto> shortScreenshots) {
        this.shortScreenshots = shortScreenshots;
    }
}

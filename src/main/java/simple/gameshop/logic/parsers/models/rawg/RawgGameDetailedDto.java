package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RawgGameDetailedDto {
    @JsonProperty("id")
    private long id;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("name")
    private String name;

    @JsonProperty("name_original")
    private String nameOriginal;

    @JsonProperty("description")
    private String description;

    @JsonProperty("released")
    private String released;

    @JsonProperty("tba")
    private boolean tba;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("background_image")
    private String backgroundImage;

    @JsonProperty("background_image_additional")
    private String backgroundImageAdditional;

    @JsonProperty("website")
    private String website;

    @JsonProperty("rating")
    private double rating;

    @JsonProperty("rating_top")
    private int ratingTop;

    @JsonProperty("ratings")
    private List<RawgRatingDto> ratings;

    @JsonProperty("reactions")
    private RawgReactionsDto reactions;

    @JsonProperty("added")
    private int added;

    @JsonProperty("added_by_status")
    private RawgAddedByStatusDto addedByStatus;

    @JsonProperty("playtime")
    private int playtime;

    @JsonProperty("screenshots_count")
    private int screenshotsCount;

    @JsonProperty("movies_count")
    private int moviesCount;

    @JsonProperty("creators_count")
    private int creatorsCount;

    @JsonProperty("achievements_count")
    private int achievementsCount;

    @JsonProperty("parent_achievements_count")
    private int parentAchievementsCount;

    @JsonProperty("reddit_url")
    private String redditUrl;

    @JsonProperty("reddit_name")
    private String redditName;

    @JsonProperty("reddit_description")
    private String redditDescription;

    @JsonProperty("reddit_logo")
    private String redditLogo;

    @JsonProperty("reddit_count")
    private int redditCount;

    @JsonProperty("twitch_count")
    private int twitchCount;

    @JsonProperty("youtube_count")
    private int youtubeCount;

    @JsonProperty("reviews_text_count")
    private int reviewsTextCount;

    @JsonProperty("ratings_count")
    private int ratingsCount;

    @JsonProperty("suggestions_count")
    private int suggestionsCount;

    @JsonProperty("alternative_names")
    private List<Object> alternativeNames;

    @JsonProperty("metacritic_url")
    private String metacriticUrl;

    @JsonProperty("parents_count")
    private int parentsCount;

    @JsonProperty("additions_count")
    private int additionsCount;

    @JsonProperty("game_series_count")
    private int gameSeriesCount;

    @JsonProperty("user_game")
    private Object userGame;

    @JsonProperty("reviews_count")
    private int reviewsCount;

    @JsonProperty("saturated_color")
    private String saturatedColor;

    @JsonProperty("dominant_color")
    private String dominantColor;

    @JsonProperty("parent_platforms")
    private List<RawgParentPlatformDto> parentPlatforms;

    @JsonProperty("platforms")
    private List<RawgPlatformDto> platforms;

    @JsonProperty("stores")
    private List<RawgStoreDto> stores;

    @JsonProperty("developers")
    private List<RawgDeveloperDto> developers;

    @JsonProperty("genres")
    private List<RawgGenreDto> genres;

    @JsonProperty("tags")
    private List<RawgTagDto> tags;

    @JsonProperty("publishers")
    private List<RawgPublisherDto> publishers;

    @JsonProperty("esrb_rating")
    private RawgEsrbRatingDto esrbRating;

    @JsonProperty("clip")
    private Object clip;

    @JsonProperty("description_raw")
    private String descriptionRaw;
}

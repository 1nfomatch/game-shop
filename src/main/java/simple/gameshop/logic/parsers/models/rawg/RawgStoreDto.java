package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgStoreDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("store")
    private RawgStoreDetailsDto store;
    @JsonProperty("url")
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RawgStoreDetailsDto getStore() {
        return store;
    }

    public void setStore(RawgStoreDetailsDto store) {
        this.store = store;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

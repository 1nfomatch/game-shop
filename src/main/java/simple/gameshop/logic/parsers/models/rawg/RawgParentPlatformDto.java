package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgParentPlatformDto {
    @JsonProperty("platform")
    private RawgPlatformDetailsDto platform;

    public RawgPlatformDetailsDto getPlatform() {
        return platform;
    }

    public void setPlatform(RawgPlatformDetailsDto platform) {
        this.platform = platform;
    }
}

package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgPlatformDto {
    @JsonProperty("platform")
    private RawgPlatformDetailsDto platform;
    @JsonProperty("released_at")
    private String releasedAt;
    @JsonProperty("requirements_en")
    private Object requirementsEn;
    @JsonProperty("requirements_ru")
    private Object requirementsRu;

    public RawgPlatformDetailsDto getPlatform() {
        return platform;
    }

    public void setPlatform(RawgPlatformDetailsDto platform) {
        this.platform = platform;
    }

    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public Object getRequirementsEn() {
        return requirementsEn;
    }

    public void setRequirementsEn(Object requirementsEn) {
        this.requirementsEn = requirementsEn;
    }

    public Object getRequirementsRu() {
        return requirementsRu;
    }

    public void setRequirementsRu(Object requirementsRu) {
        this.requirementsRu = requirementsRu;
    }
}

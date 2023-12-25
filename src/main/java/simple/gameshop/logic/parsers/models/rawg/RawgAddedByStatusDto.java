package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawgAddedByStatusDto {
    @JsonProperty("yet")
    private int yet;
    @JsonProperty("owned")
    private int owned;
    @JsonProperty("beaten")
    private int beaten;
    @JsonProperty("toPlay")
    private int toPlay;
    @JsonProperty("dropped")
    private int dropped;
    @JsonProperty("playing")
    private int playing;

    public int getYet() {
        return yet;
    }

    public void setYet(int yet) {
        this.yet = yet;
    }

    public int getOwned() {
        return owned;
    }

    public void setOwned(int owned) {
        this.owned = owned;
    }

    public int getBeaten() {
        return beaten;
    }

    public void setBeaten(int beaten) {
        this.beaten = beaten;
    }

    public int getToPlay() {
        return toPlay;
    }

    public void setToPlay(int toPlay) {
        this.toPlay = toPlay;
    }

    public int getDropped() {
        return dropped;
    }

    public void setDropped(int dropped) {
        this.dropped = dropped;
    }

    public int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing) {
        this.playing = playing;
    }
}

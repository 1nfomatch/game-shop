package simple.gameshop.logic.parsers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import simple.gameshop.logic.parsers.models.rawg.RawgScreenshotDto;

import java.util.List;

public class RawgGetScreenshotResponse {
    @JsonProperty("count")
    private int count;

    @JsonProperty("next")
    private String next;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("results")
    private List<RawgScreenshotDto> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<RawgScreenshotDto> getResults() {
        return results;
    }

    public void setResults(List<RawgScreenshotDto> results) {
        this.results = results;
    }
}

package simple.gameshop.logic.parsers.models.rawg;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class RawgReactionsDto {
    private Map<String, Integer> reactions = new HashMap<>();

    @JsonAnySetter
    public void setReaction(String key, Integer value) {
        reactions.put(key, value);
    }

    public Map<String, Integer> getReactions() {
        return reactions;
    }
}

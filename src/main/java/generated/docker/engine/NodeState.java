package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * NodeState represents the state of a node.
 */
public enum NodeState {

    UNKNOWN("unknown"),

    DOWN("down"),

    READY("ready"),

    DISCONNECTED("disconnected");

    private final String value;

    NodeState(String value) {
        this.value = value;
    }

    @JsonCreator
    public static NodeState fromValue(String value) {
        for (var b : NodeState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
}



package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Current local status of this node.
 */
public enum LocalNodeState {

    EMPTY(""),

    INACTIVE("inactive"),

    PENDING("pending"),

    ACTIVE("active"),

    ERROR("error"),

    LOCKED("locked");

    private final String value;

    LocalNodeState(String value) {
        this.value = value;
    }

    @JsonCreator
    public static LocalNodeState fromValue(String value) {
        for (var b : LocalNodeState.values()) {
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



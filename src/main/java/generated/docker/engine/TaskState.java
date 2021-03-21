package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TaskState
 */
public enum TaskState {

    NEW("new"),

    ALLOCATED("allocated"),

    PENDING("pending"),

    ASSIGNED("assigned"),

    ACCEPTED("accepted"),

    PREPARING("preparing"),

    READY("ready"),

    STARTING("starting"),

    RUNNING("running"),

    COMPLETE("complete"),

    SHUTDOWN("shutdown"),

    FAILED("failed"),

    REJECTED("rejected"),

    REMOVE("remove"),

    ORPHANED("orphaned");

    private final String value;

    TaskState(String value) {
        this.value = value;
    }

    @JsonCreator
    public static TaskState fromValue(String value) {
        for (var b : TaskState.values()) {
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



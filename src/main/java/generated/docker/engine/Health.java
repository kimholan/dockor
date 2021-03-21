package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Health stores information about the container&#39;s healthcheck results.
 **/

public class Health {

    private StatusEnum status;

    private Integer failingStreak;

    private List<HealthcheckResult> log = new ArrayList<>();

    /**
     * Status is one of &#x60;none&#x60;, &#x60;starting&#x60;, &#x60;healthy&#x60; or &#x60;unhealthy&#x60;  - \&quot;none\&quot;      Indicates there is no healthcheck - \&quot;starting\&quot;  Starting indicates that the container is not yet ready - \&quot;healthy\&quot;   Healthy indicates that the container is running correctly - \&quot;unhealthy\&quot; Unhealthy indicates that the container has a problem
     **/
    public Health status(StatusEnum status) {
        this.status = status;
        return this;
    }

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * FailingStreak is the number of consecutive failures
     **/
    public Health failingStreak(Integer failingStreak) {
        this.failingStreak = failingStreak;
        return this;
    }

    @JsonProperty("FailingStreak")
    public Integer getFailingStreak() {
        return failingStreak;
    }

    public void setFailingStreak(Integer failingStreak) {
        this.failingStreak = failingStreak;
    }

    /**
     * Log contains the last few results (oldest first)
     **/
    public Health log(List<HealthcheckResult> log) {
        this.log = log;
        return this;
    }

    @JsonProperty("Log")
    public List<HealthcheckResult> getLog() {
        return log;
    }

    public void setLog(List<HealthcheckResult> log) {
        this.log = log;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var health = (Health) o;
        return Objects.equals(this.status, health.status) &&
                       Objects.equals(this.failingStreak, health.failingStreak) &&
                       Objects.equals(this.log, health.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, failingStreak, log);
    }

    @Override
    public String toString() {
        return "class Health {\n" +
                       "    status: " + toIndentedString(status) + "\n" +
                       "    failingStreak: " + toIndentedString(failingStreak) + "\n" +
                       "    log: " + toIndentedString(log) + "\n" +
                       "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public enum StatusEnum {

        NONE("none"), STARTING("starting"), HEALTHY("healthy"), UNHEALTHY("unhealthy");

        private final String value;

        StatusEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (var b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

}


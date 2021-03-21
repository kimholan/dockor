package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * HealthcheckResult stores information about a single run of a healthcheck probe
 **/

public class HealthcheckResult {

    private OffsetDateTime start;

    private String end;

    private Integer exitCode;

    private String output;

    /**
     * Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public HealthcheckResult start(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    @JsonProperty("Start")
    public OffsetDateTime getStart() {
        return start;
    }

    public void setStart(OffsetDateTime start) {
        this.start = start;
    }

    /**
     * Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public HealthcheckResult end(String end) {
        this.end = end;
        return this;
    }

    @JsonProperty("End")
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * ExitCode meanings:  - &#x60;0&#x60; healthy - &#x60;1&#x60; unhealthy - &#x60;2&#x60; reserved (considered unhealthy) - other values: error running probe
     **/
    public HealthcheckResult exitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    @JsonProperty("ExitCode")
    public Integer getExitCode() {
        return exitCode;
    }

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * Output from last check
     **/
    public HealthcheckResult output(String output) {
        this.output = output;
        return this;
    }

    @JsonProperty("Output")
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var healthcheckResult = (HealthcheckResult) o;
        return Objects.equals(this.start, healthcheckResult.start) &&
                       Objects.equals(this.end, healthcheckResult.end) &&
                       Objects.equals(this.exitCode, healthcheckResult.exitCode) &&
                       Objects.equals(this.output, healthcheckResult.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, exitCode, output);
    }

    @Override
    public String toString() {

        return "class HealthcheckResult {\n" +
                            "    start: " + toIndentedString(start) + "\n" +
                            "    end: " + toIndentedString(end) + "\n" +
                            "    exitCode: " + toIndentedString(exitCode) + "\n" +
                            "    output: " + toIndentedString(output) + "\n" +
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

}


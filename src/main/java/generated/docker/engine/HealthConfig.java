package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A test to perform to check that the container is healthy.
 **/

public class HealthConfig {

    private List<String> test = new ArrayList<>();

    private Integer interval;

    private Integer timeout;

    private Integer retries;

    private Integer startPeriod;

    /**
     * The test to perform. Possible values are:  - &#x60;[]&#x60; inherit healthcheck from image or parent image - &#x60;[\&quot;NONE\&quot;]&#x60; disable healthcheck - &#x60;[\&quot;CMD\&quot;, args...]&#x60; exec arguments directly - &#x60;[\&quot;CMD-SHELL\&quot;, command]&#x60; run command with system&#39;s default shell
     **/
    public HealthConfig test(List<String> test) {
        this.test = test;
        return this;
    }

    @JsonProperty("Test")
    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    /**
     * The time to wait between checks in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit.
     **/
    public HealthConfig interval(Integer interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("Interval")
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * The time to wait before considering the check to have hung. It should be 0 or at least 1000000 (1 ms). 0 means inherit.
     **/
    public HealthConfig timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    @JsonProperty("Timeout")
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * The number of consecutive failures needed to consider a container as unhealthy. 0 means inherit.
     **/
    public HealthConfig retries(Integer retries) {
        this.retries = retries;
        return this;
    }

    @JsonProperty("Retries")
    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * Start period for the container to initialize before starting health-retries countdown in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit.
     **/
    public HealthConfig startPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }

    @JsonProperty("StartPeriod")
    public Integer getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var healthConfig = (HealthConfig) o;
        return Objects.equals(this.test, healthConfig.test) &&
                       Objects.equals(this.interval, healthConfig.interval) &&
                       Objects.equals(this.timeout, healthConfig.timeout) &&
                       Objects.equals(this.retries, healthConfig.retries) &&
                       Objects.equals(this.startPeriod, healthConfig.startPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test, interval, timeout, retries, startPeriod);
    }

    @Override
    public String toString() {

        return "class HealthConfig {\n" +
                            "    test: " + toIndentedString(test) + "\n" +
                            "    interval: " + toIndentedString(interval) + "\n" +
                            "    timeout: " + toIndentedString(timeout) + "\n" +
                            "    retries: " + toIndentedString(retries) + "\n" +
                            "    startPeriod: " + toIndentedString(startPeriod) + "\n" +
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


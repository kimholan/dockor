package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * An object describing a limit on resources which can be requested by a task.
 **/

public class Limit {

    private Long nanoCPUs;

    private Long memoryBytes;

    private Long pids = 0l;

    /**
     *
     **/
    public Limit nanoCPUs(Long nanoCPUs) {
        this.nanoCPUs = nanoCPUs;
        return this;
    }

    @JsonProperty("NanoCPUs")
    public Long getNanoCPUs() {
        return nanoCPUs;
    }

    public void setNanoCPUs(Long nanoCPUs) {
        this.nanoCPUs = nanoCPUs;
    }

    /**
     *
     **/
    public Limit memoryBytes(Long memoryBytes) {
        this.memoryBytes = memoryBytes;
        return this;
    }

    @JsonProperty("MemoryBytes")
    public Long getMemoryBytes() {
        return memoryBytes;
    }

    public void setMemoryBytes(Long memoryBytes) {
        this.memoryBytes = memoryBytes;
    }

    /**
     * Limits the maximum number of PIDs in the container. Set &#x60;0&#x60; for unlimited.
     **/
    public Limit pids(Long pids) {
        this.pids = pids;
        return this;
    }

    @JsonProperty("Pids")
    public Long getPids() {
        return pids;
    }

    public void setPids(Long pids) {
        this.pids = pids;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var limit = (Limit) o;
        return Objects.equals(this.nanoCPUs, limit.nanoCPUs) &&
                       Objects.equals(this.memoryBytes, limit.memoryBytes) &&
                       Objects.equals(this.pids, limit.pids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nanoCPUs, memoryBytes, pids);
    }

    @Override
    public String toString() {
        return "class Limit {\n" +
                       "    nanoCPUs: " + toIndentedString(nanoCPUs) + "\n" +
                       "    memoryBytes: " + toIndentedString(memoryBytes) + "\n" +
                       "    pids: " + toIndentedString(pids) + "\n" +
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


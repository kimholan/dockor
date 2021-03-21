package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BuildPruneResponse {

    private List<String> cachesDeleted = new ArrayList<>();

    private Long spaceReclaimed;

    /**
     *
     **/
    public BuildPruneResponse cachesDeleted(List<String> cachesDeleted) {
        this.cachesDeleted = cachesDeleted;
        return this;
    }

    @JsonProperty("CachesDeleted")
    public List<String> getCachesDeleted() {
        return cachesDeleted;
    }

    public void setCachesDeleted(List<String> cachesDeleted) {
        this.cachesDeleted = cachesDeleted;
    }

    /**
     * Disk space reclaimed in bytes
     **/
    public BuildPruneResponse spaceReclaimed(Long spaceReclaimed) {
        this.spaceReclaimed = spaceReclaimed;
        return this;
    }

    @JsonProperty("SpaceReclaimed")
    public Long getSpaceReclaimed() {
        return spaceReclaimed;
    }

    public void setSpaceReclaimed(Long spaceReclaimed) {
        this.spaceReclaimed = spaceReclaimed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var buildPruneResponse = (BuildPruneResponse) o;
        return Objects.equals(this.cachesDeleted, buildPruneResponse.cachesDeleted) &&
                       Objects.equals(this.spaceReclaimed, buildPruneResponse.spaceReclaimed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cachesDeleted, spaceReclaimed);
    }

    @Override
    public String toString() {

        return "class BuildPruneResponse {\n" +
                            "    cachesDeleted: " + toIndentedString(cachesDeleted) + "\n" +
                            "    spaceReclaimed: " + toIndentedString(spaceReclaimed) + "\n" +
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


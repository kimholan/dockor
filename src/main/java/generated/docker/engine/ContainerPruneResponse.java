package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerPruneResponse {

    private List<String> containersDeleted = new ArrayList<>();

    private Long spaceReclaimed;

    /**
     * Container IDs that were deleted
     **/
    public ContainerPruneResponse containersDeleted(List<String> containersDeleted) {
        this.containersDeleted = containersDeleted;
        return this;
    }

    @JsonProperty("ContainersDeleted")
    public List<String> getContainersDeleted() {
        return containersDeleted;
    }

    public void setContainersDeleted(List<String> containersDeleted) {
        this.containersDeleted = containersDeleted;
    }

    /**
     * Disk space reclaimed in bytes
     **/
    public ContainerPruneResponse spaceReclaimed(Long spaceReclaimed) {
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
        var containerPruneResponse = (ContainerPruneResponse) o;
        return Objects.equals(this.containersDeleted, containerPruneResponse.containersDeleted) &&
                       Objects.equals(this.spaceReclaimed, containerPruneResponse.spaceReclaimed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containersDeleted, spaceReclaimed);
    }

    @Override
    public String toString() {

        return "class ContainerPruneResponse {\n" +
                            "    containersDeleted: " + toIndentedString(containersDeleted) + "\n" +
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


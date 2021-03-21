package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPruneResponse {

    private List<String> networksDeleted = new ArrayList<>();

    /**
     * Networks that were deleted
     **/
    public NetworkPruneResponse networksDeleted(List<String> networksDeleted) {
        this.networksDeleted = networksDeleted;
        return this;
    }

    @JsonProperty("NetworksDeleted")
    public List<String> getNetworksDeleted() {
        return networksDeleted;
    }

    public void setNetworksDeleted(List<String> networksDeleted) {
        this.networksDeleted = networksDeleted;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var networkPruneResponse = (NetworkPruneResponse) o;
        return Objects.equals(this.networksDeleted, networkPruneResponse.networksDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networksDeleted);
    }

    @Override
    public String toString() {

        return "class NetworkPruneResponse {\n" +
                            "    networksDeleted: " + toIndentedString(networksDeleted) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NetworkingConfig represents the container&#39;s networking configuration for each of its interfaces. It is used for the networking configs specified in the &#x60;docker create&#x60; and &#x60;docker network connect&#x60; commands.
 **/

public class NetworkingConfig {

    private Map<String, EndpointSettings> endpointsConfig = new HashMap<>();

    /**
     * A mapping of network name to endpoint configuration for that network.
     **/
    public NetworkingConfig endpointsConfig(Map<String, EndpointSettings> endpointsConfig) {
        this.endpointsConfig = endpointsConfig;
        return this;
    }

    @JsonProperty("EndpointsConfig")
    public Map<String, EndpointSettings> getEndpointsConfig() {
        return endpointsConfig;
    }

    public void setEndpointsConfig(Map<String, EndpointSettings> endpointsConfig) {
        this.endpointsConfig = endpointsConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var networkingConfig = (NetworkingConfig) o;
        return Objects.equals(this.endpointsConfig, networkingConfig.endpointsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointsConfig);
    }

    @Override
    public String toString() {

        return "class NetworkingConfig {\n" +
                            "    endpointsConfig: " + toIndentedString(endpointsConfig) + "\n" +
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


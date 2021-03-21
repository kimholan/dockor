package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class InlineObject3 {

    private String container;

    private EndpointSettings endpointConfig;

    /**
     * The ID or name of the container to connect to the network.
     **/
    public InlineObject3 container(String container) {
        this.container = container;
        return this;
    }

    @JsonProperty("Container")
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     *
     **/
    public InlineObject3 endpointConfig(EndpointSettings endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }

    @JsonProperty("EndpointConfig")
    public EndpointSettings getEndpointConfig() {
        return endpointConfig;
    }

    public void setEndpointConfig(EndpointSettings endpointConfig) {
        this.endpointConfig = endpointConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var inlineObject3 = (InlineObject3) o;
        return Objects.equals(this.container, inlineObject3.container) &&
                       Objects.equals(this.endpointConfig, inlineObject3.endpointConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(container, endpointConfig);
    }

    @Override
    public String toString() {

        return "class InlineObject3 {\n" +
                            "    container: " + toIndentedString(container) + "\n" +
                            "    endpointConfig: " + toIndentedString(endpointConfig) + "\n" +
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


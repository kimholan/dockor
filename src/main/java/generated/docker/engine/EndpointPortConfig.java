package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

public class EndpointPortConfig {

    private String name;

    private ProtocolEnum protocol;

    private Integer targetPort;

    private Integer publishedPort;

    private PublishModeEnum publishMode = PublishModeEnum.INGRESS;

    /**
     *
     **/
    public EndpointPortConfig name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/
    public EndpointPortConfig protocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    @JsonProperty("Protocol")
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    /**
     * The port inside the container.
     **/
    public EndpointPortConfig targetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    @JsonProperty("TargetPort")
    public Integer getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
    }

    /**
     * The port on the swarm hosts.
     **/
    public EndpointPortConfig publishedPort(Integer publishedPort) {
        this.publishedPort = publishedPort;
        return this;
    }

    @JsonProperty("PublishedPort")
    public Integer getPublishedPort() {
        return publishedPort;
    }

    public void setPublishedPort(Integer publishedPort) {
        this.publishedPort = publishedPort;
    }

    /**
     * The mode in which port is published.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  - \&quot;ingress\&quot; makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \&quot;host\&quot; bypasses the routing mesh and publish the port directly on   the swarm node where that service is running.
     **/
    public EndpointPortConfig publishMode(PublishModeEnum publishMode) {
        this.publishMode = publishMode;
        return this;
    }

    @JsonProperty("PublishMode")
    public PublishModeEnum getPublishMode() {
        return publishMode;
    }

    public void setPublishMode(PublishModeEnum publishMode) {
        this.publishMode = publishMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var endpointPortConfig = (EndpointPortConfig) o;
        return Objects.equals(this.name, endpointPortConfig.name) &&
                       Objects.equals(this.protocol, endpointPortConfig.protocol) &&
                       Objects.equals(this.targetPort, endpointPortConfig.targetPort) &&
                       Objects.equals(this.publishedPort, endpointPortConfig.publishedPort) &&
                       Objects.equals(this.publishMode, endpointPortConfig.publishMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protocol, targetPort, publishedPort, publishMode);
    }

    @Override
    public String toString() {

        return "class EndpointPortConfig {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    protocol: " + toIndentedString(protocol) + "\n" +
                            "    targetPort: " + toIndentedString(targetPort) + "\n" +
                            "    publishedPort: " + toIndentedString(publishedPort) + "\n" +
                            "    publishMode: " + toIndentedString(publishMode) + "\n" +
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

    public enum ProtocolEnum {

        TCP("tcp"), UDP("udp"), SCTP("sctp");

        private final String value;

        ProtocolEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            for (var b : ProtocolEnum.values()) {
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

    public enum PublishModeEnum {

        INGRESS("ingress"), HOST("host");

        private final String value;

        PublishModeEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static PublishModeEnum fromValue(String value) {
            for (var b : PublishModeEnum.values()) {
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


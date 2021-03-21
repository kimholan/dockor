package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Properties that can be configured to access and load balance a service.
 **/

public class EndpointSpec {

    private ModeEnum mode = ModeEnum.VIP;

    private List<EndpointPortConfig> ports = new ArrayList<>();

    /**
     * The mode of resolution to use for internal load balancing between tasks.
     **/
    public EndpointSpec mode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    @JsonProperty("Mode")
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    /**
     * List of exposed ports that this service is accessible on from the outside. Ports can only be provided if &#x60;vip&#x60; resolution mode is used.
     **/
    public EndpointSpec ports(List<EndpointPortConfig> ports) {
        this.ports = ports;
        return this;
    }

    @JsonProperty("Ports")
    public List<EndpointPortConfig> getPorts() {
        return ports;
    }

    public void setPorts(List<EndpointPortConfig> ports) {
        this.ports = ports;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var endpointSpec = (EndpointSpec) o;
        return Objects.equals(this.mode, endpointSpec.mode) &&
                       Objects.equals(this.ports, endpointSpec.ports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, ports);
    }

    @Override
    public String toString() {

        return "class EndpointSpec {\n" +
                            "    mode: " + toIndentedString(mode) + "\n" +
                            "    ports: " + toIndentedString(ports) + "\n" +
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

    public enum ModeEnum {

        VIP("vip"), DNSRR("dnsrr");

        private final String value;

        ModeEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static ModeEnum fromValue(String value) {
            for (var b : ModeEnum.values()) {
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


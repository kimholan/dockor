package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * An open port on a container
 **/

public class Port {

    private String IP;

    private Integer privatePort;

    private Integer publicPort;

    private TypeEnum type;

    /**
     * Host IP address that the container&#39;s port is mapped to
     **/
    public Port IP(String IP) {
        this.IP = IP;
        return this;
    }

    @JsonProperty("IP")
    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Port on the container
     **/
    public Port privatePort(Integer privatePort) {
        this.privatePort = privatePort;
        return this;
    }

    @JsonProperty("PrivatePort")
    public Integer getPrivatePort() {
        return privatePort;
    }

    public void setPrivatePort(Integer privatePort) {
        this.privatePort = privatePort;
    }

    /**
     * Port exposed on the host
     **/
    public Port publicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    @JsonProperty("PublicPort")
    public Integer getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
    }

    /**
     *
     **/
    public Port type(TypeEnum type) {
        this.type = type;
        return this;
    }

    @JsonProperty("Type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var port = (Port) o;
        return Objects.equals(this.IP, port.IP) &&
                       Objects.equals(this.privatePort, port.privatePort) &&
                       Objects.equals(this.publicPort, port.publicPort) &&
                       Objects.equals(this.type, port.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IP, privatePort, publicPort, type);
    }

    @Override
    public String toString() {
        return "class Port {\n" +
                       "    IP: " + toIndentedString(IP) + "\n" +
                       "    privatePort: " + toIndentedString(privatePort) + "\n" +
                       "    publicPort: " + toIndentedString(publicPort) + "\n" +
                       "    type: " + toIndentedString(type) + "\n" +
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

    public enum TypeEnum {

        TCP("tcp"), UDP("udp"), SCTP("sctp");

        private final String value;

        TypeEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (var b : TypeEnum.values()) {
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


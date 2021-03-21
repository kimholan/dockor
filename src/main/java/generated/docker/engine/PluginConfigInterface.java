package generated.docker.engine;

import generated.docker.engine.PluginInterfaceType;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The interface between Docker and the plugin
 **/

public class PluginConfigInterface {

    private List<PluginInterfaceType> types = new ArrayList<>();

    private String socket;

    public enum ProtocolSchemeEnum {

        EMPTY(String.valueOf("")), MOBY_PLUGINS_HTTP_V1(String.valueOf("moby.plugins.http/v1"));

        private String value;

        ProtocolSchemeEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolSchemeEnum fromValue(String value) {
            for (var b : ProtocolSchemeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ProtocolSchemeEnum protocolScheme;

    /**
     *
     **/
    public PluginConfigInterface types(List<PluginInterfaceType> types) {
        this.types = types;
        return this;
    }

    @JsonProperty("Types")
    public List<PluginInterfaceType> getTypes() {
        return types;
    }

    public void setTypes(List<PluginInterfaceType> types) {
        this.types = types;
    }

    /**
     *
     **/
    public PluginConfigInterface socket(String socket) {
        this.socket = socket;
        return this;
    }

    @JsonProperty("Socket")
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    /**
     * Protocol to use for clients connecting to the plugin.
     **/
    public PluginConfigInterface protocolScheme(ProtocolSchemeEnum protocolScheme) {
        this.protocolScheme = protocolScheme;
        return this;
    }

    @JsonProperty("ProtocolScheme")
    public ProtocolSchemeEnum getProtocolScheme() {
        return protocolScheme;
    }

    public void setProtocolScheme(ProtocolSchemeEnum protocolScheme) {
        this.protocolScheme = protocolScheme;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var pluginConfigInterface = (PluginConfigInterface) o;
        return Objects.equals(this.types, pluginConfigInterface.types) &&
                       Objects.equals(this.socket, pluginConfigInterface.socket) &&
                       Objects.equals(this.protocolScheme, pluginConfigInterface.protocolScheme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(types, socket, protocolScheme);
    }

    @Override
    public String toString() {

        return "class PluginConfigInterface {\n" +
                            "    types: " + toIndentedString(types) + "\n" +
                            "    socket: " + toIndentedString(socket) + "\n" +
                            "    protocolScheme: " + toIndentedString(protocolScheme) + "\n" +
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


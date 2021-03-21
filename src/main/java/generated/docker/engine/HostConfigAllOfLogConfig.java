package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The logging configuration for this container
 **/

public class HostConfigAllOfLogConfig {

    private TypeEnum type;

    private Map<String, String> config = new HashMap<>();

    /**
     *
     **/
    public HostConfigAllOfLogConfig type(TypeEnum type) {
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

    /**
     *
     **/
    public HostConfigAllOfLogConfig config(Map<String, String> config) {
        this.config = config;
        return this;
    }

    @JsonProperty("Config")
    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var hostConfigAllOfLogConfig = (HostConfigAllOfLogConfig) o;
        return Objects.equals(this.type, hostConfigAllOfLogConfig.type) &&
                       Objects.equals(this.config, hostConfigAllOfLogConfig.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, config);
    }

    @Override
    public String toString() {

        return "class HostConfigAllOfLogConfig {\n" +
                            "    type: " + toIndentedString(type) + "\n" +
                            "    config: " + toIndentedString(config) + "\n" +
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

        JSON_FILE("json-file"), SYSLOG("syslog"), JOURNALD("journald"), GELF("gelf"), FLUENTD("fluentd"), AWSLOGS("awslogs"), SPLUNK("splunk"), ETWLOGS("etwlogs"), NONE("none");

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


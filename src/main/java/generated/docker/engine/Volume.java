package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Volume {

    private String name;

    private String driver;

    private String mountpoint;

    private String createdAt;

    private Map<String, Object> status = new HashMap<>();

    private Map<String, String> labels = new HashMap<>();

    private ScopeEnum scope = ScopeEnum.LOCAL;

    private Map<String, String> options = new HashMap<>();

    private VolumeUsageData usageData;

    /**
     * Name of the volume.
     **/
    public Volume name(String name) {
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
     * Name of the volume driver used by the volume.
     **/
    public Volume driver(String driver) {
        this.driver = driver;
        return this;
    }

    @JsonProperty("Driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * Mount path of the volume on the host.
     **/
    public Volume mountpoint(String mountpoint) {
        this.mountpoint = mountpoint;
        return this;
    }

    @JsonProperty("Mountpoint")
    public String getMountpoint() {
        return mountpoint;
    }

    public void setMountpoint(String mountpoint) {
        this.mountpoint = mountpoint;
    }

    /**
     * Date/Time the volume was created.
     **/
    public Volume createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("CreatedAt")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature.
     **/
    public Volume status(Map<String, Object> status) {
        this.status = status;
        return this;
    }

    @JsonProperty("Status")
    public Map<String, Object> getStatus() {
        return status;
    }

    public void setStatus(Map<String, Object> status) {
        this.status = status;
    }

    /**
     * User-defined key/value metadata.
     **/
    public Volume labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("Labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level.
     **/
    public Volume scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    @JsonProperty("Scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    /**
     * The driver specific options used when creating the volume.
     **/
    public Volume options(Map<String, String> options) {
        this.options = options;
        return this;
    }

    @JsonProperty("Options")
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    /**
     *
     **/
    public Volume usageData(VolumeUsageData usageData) {
        this.usageData = usageData;
        return this;
    }

    @JsonProperty("UsageData")
    public VolumeUsageData getUsageData() {
        return usageData;
    }

    public void setUsageData(VolumeUsageData usageData) {
        this.usageData = usageData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var volume = (Volume) o;
        return Objects.equals(this.name, volume.name) &&
                       Objects.equals(this.driver, volume.driver) &&
                       Objects.equals(this.mountpoint, volume.mountpoint) &&
                       Objects.equals(this.createdAt, volume.createdAt) &&
                       Objects.equals(this.status, volume.status) &&
                       Objects.equals(this.labels, volume.labels) &&
                       Objects.equals(this.scope, volume.scope) &&
                       Objects.equals(this.options, volume.options) &&
                       Objects.equals(this.usageData, volume.usageData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driver, mountpoint, createdAt, status, labels, scope, options, usageData);
    }

    @Override
    public String toString() {
        return "class Volume {\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    driver: " + toIndentedString(driver) + "\n" +
                       "    mountpoint: " + toIndentedString(mountpoint) + "\n" +
                       "    createdAt: " + toIndentedString(createdAt) + "\n" +
                       "    status: " + toIndentedString(status) + "\n" +
                       "    labels: " + toIndentedString(labels) + "\n" +
                       "    scope: " + toIndentedString(scope) + "\n" +
                       "    options: " + toIndentedString(options) + "\n" +
                       "    usageData: " + toIndentedString(usageData) + "\n" +
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

    public enum ScopeEnum {

        LOCAL("local"), GLOBAL("global");

        private final String value;

        ScopeEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static ScopeEnum fromValue(String value) {
            for (var b : ScopeEnum.values()) {
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


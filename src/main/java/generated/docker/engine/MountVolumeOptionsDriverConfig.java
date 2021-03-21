package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Map of driver specific options
 **/

public class MountVolumeOptionsDriverConfig {

    private String name;

    private Map<String, String> options = new HashMap<>();

    /**
     * Name of the driver to use to create the volume.
     **/
    public MountVolumeOptionsDriverConfig name(String name) {
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
     * key/value map of driver specific options.
     **/
    public MountVolumeOptionsDriverConfig options(Map<String, String> options) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var mountVolumeOptionsDriverConfig = (MountVolumeOptionsDriverConfig) o;
        return Objects.equals(this.name, mountVolumeOptionsDriverConfig.name) &&
                       Objects.equals(this.options, mountVolumeOptionsDriverConfig.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, options);
    }

    @Override
    public String toString() {

        return "class MountVolumeOptionsDriverConfig {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    options: " + toIndentedString(options) + "\n" +
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


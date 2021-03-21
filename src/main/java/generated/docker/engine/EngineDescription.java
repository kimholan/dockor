package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * EngineDescription provides information about an generated.docker.engine.
 **/

public class EngineDescription {

    private String engineVersion;

    private Map<String, String> labels = new HashMap<>();

    private List<EngineDescriptionPlugins> plugins = new ArrayList<>();

    /**
     *
     **/
    public EngineDescription engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    @JsonProperty("EngineVersion")
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     *
     **/
    public EngineDescription labels(Map<String, String> labels) {
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
     *
     **/
    public EngineDescription plugins(List<EngineDescriptionPlugins> plugins) {
        this.plugins = plugins;
        return this;
    }

    @JsonProperty("Plugins")
    public List<EngineDescriptionPlugins> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<EngineDescriptionPlugins> plugins) {
        this.plugins = plugins;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var engineDescription = (EngineDescription) o;
        return Objects.equals(this.engineVersion, engineDescription.engineVersion) &&
                       Objects.equals(this.labels, engineDescription.labels) &&
                       Objects.equals(this.plugins, engineDescription.plugins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVersion, labels, plugins);
    }

    @Override
    public String toString() {

        return "class EngineDescription {\n" +
                            "    engineVersion: " + toIndentedString(engineVersion) + "\n" +
                            "    labels: " + toIndentedString(labels) + "\n" +
                            "    plugins: " + toIndentedString(plugins) + "\n" +
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


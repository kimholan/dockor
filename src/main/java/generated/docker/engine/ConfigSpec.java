package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ConfigSpec {

    private String name;

    private Map<String, String> labels = new HashMap<>();

    private String data;

    private Driver templating;

    /**
     * User-defined name of the config.
     **/
    public ConfigSpec name(String name) {
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
     * User-defined key/value metadata.
     **/
    public ConfigSpec labels(Map<String, String> labels) {
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
     * Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) config data.
     **/
    public ConfigSpec data(String data) {
        this.data = data;
        return this;
    }

    @JsonProperty("Data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     *
     **/
    public ConfigSpec templating(Driver templating) {
        this.templating = templating;
        return this;
    }

    @JsonProperty("Templating")
    public Driver getTemplating() {
        return templating;
    }

    public void setTemplating(Driver templating) {
        this.templating = templating;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var configSpec = (ConfigSpec) o;
        return Objects.equals(this.name, configSpec.name) &&
                       Objects.equals(this.labels, configSpec.labels) &&
                       Objects.equals(this.data, configSpec.data) &&
                       Objects.equals(this.templating, configSpec.templating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels, data, templating);
    }

    @Override
    public String toString() {

        return "class ConfigSpec {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    labels: " + toIndentedString(labels) + "\n" +
                            "    data: " + toIndentedString(data) + "\n" +
                            "    templating: " + toIndentedString(templating) + "\n" +
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


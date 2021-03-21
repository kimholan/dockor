package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PluginEnv {

    private String name;

    private String description;

    private List<String> settable = new ArrayList<>();

    private String value;

    /**
     *
     **/
    public PluginEnv name(String name) {
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
    public PluginEnv description(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     **/
    public PluginEnv settable(List<String> settable) {
        this.settable = settable;
        return this;
    }

    @JsonProperty("Settable")
    public List<String> getSettable() {
        return settable;
    }

    public void setSettable(List<String> settable) {
        this.settable = settable;
    }

    /**
     *
     **/
    public PluginEnv value(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var pluginEnv = (PluginEnv) o;
        return Objects.equals(this.name, pluginEnv.name) &&
                       Objects.equals(this.description, pluginEnv.description) &&
                       Objects.equals(this.settable, pluginEnv.settable) &&
                       Objects.equals(this.value, pluginEnv.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, settable, value);
    }

    @Override
    public String toString() {
        return "class PluginEnv {\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    description: " + toIndentedString(description) + "\n" +
                       "    settable: " + toIndentedString(settable) + "\n" +
                       "    value: " + toIndentedString(value) + "\n" +
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


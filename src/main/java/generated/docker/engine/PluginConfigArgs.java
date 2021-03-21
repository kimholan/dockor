package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PluginConfigArgs {

    private String name;

    private String description;

    private List<String> settable = new ArrayList<>();

    private List<String> value = new ArrayList<>();

    /**
     *
     **/
    public PluginConfigArgs name(String name) {
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
    public PluginConfigArgs description(String description) {
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
    public PluginConfigArgs settable(List<String> settable) {
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
    public PluginConfigArgs value(List<String> value) {
        this.value = value;
        return this;
    }

    @JsonProperty("Value")
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
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
        var pluginConfigArgs = (PluginConfigArgs) o;
        return Objects.equals(this.name, pluginConfigArgs.name) &&
                       Objects.equals(this.description, pluginConfigArgs.description) &&
                       Objects.equals(this.settable, pluginConfigArgs.settable) &&
                       Objects.equals(this.value, pluginConfigArgs.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, settable, value);
    }

    @Override
    public String toString() {

        return "class PluginConfigArgs {\n" +
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


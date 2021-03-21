package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Describes a permission accepted by the user upon installing the plugin.
 **/

public class InlineObject {

    private String name;

    private String description;

    private List<String> value = new ArrayList<>();

    /**
     *
     **/
    public InlineObject name(String name) {
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
    public InlineObject description(String description) {
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
    public InlineObject value(List<String> value) {
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
        var inlineObject = (InlineObject) o;
        return Objects.equals(this.name, inlineObject.name) &&
                       Objects.equals(this.description, inlineObject.description) &&
                       Objects.equals(this.value, inlineObject.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, value);
    }

    @Override
    public String toString() {

        return "class InlineObject {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    description: " + toIndentedString(description) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class EngineDescriptionPlugins {

    private String type;

    private String name;

    /**
     *
     **/
    public EngineDescriptionPlugins type(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/
    public EngineDescriptionPlugins name(String name) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var engineDescriptionPlugins = (EngineDescriptionPlugins) o;
        return Objects.equals(this.type, engineDescriptionPlugins.type) &&
                       Objects.equals(this.name, engineDescriptionPlugins.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    @Override
    public String toString() {

        return "class EngineDescriptionPlugins {\n" +
                            "    type: " + toIndentedString(type) + "\n" +
                            "    name: " + toIndentedString(name) + "\n" +
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


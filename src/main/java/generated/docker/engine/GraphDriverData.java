package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Information about a container&#39;s graph driver.
 **/

public class GraphDriverData {

    private String name;

    private Map<String, String> data = new HashMap<>();

    /**
     *
     **/
    public GraphDriverData name(String name) {
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
    public GraphDriverData data(Map<String, String> data) {
        this.data = data;
        return this;
    }

    @JsonProperty("Data")
    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var graphDriverData = (GraphDriverData) o;
        return Objects.equals(this.name, graphDriverData.name) &&
                       Objects.equals(this.data, graphDriverData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, data);
    }

    @Override
    public String toString() {

        return "class GraphDriverData {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    data: " + toIndentedString(data) + "\n" +
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


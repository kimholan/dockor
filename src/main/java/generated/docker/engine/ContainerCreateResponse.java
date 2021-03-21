package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OK response to ContainerCreate operation
 **/

public class ContainerCreateResponse {

    private String id;

    private List<String> warnings = new ArrayList<>();

    /**
     * The ID of the created container
     **/
    public ContainerCreateResponse id(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Warnings encountered when creating the container
     **/
    public ContainerCreateResponse warnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    @JsonProperty("Warnings")
    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerCreateResponse = (ContainerCreateResponse) o;
        return Objects.equals(this.id, containerCreateResponse.id) &&
                       Objects.equals(this.warnings, containerCreateResponse.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warnings);
    }

    @Override
    public String toString() {

        return "class ContainerCreateResponse {\n" +
                            "    id: " + toIndentedString(id) + "\n" +
                            "    warnings: " + toIndentedString(warnings) + "\n" +
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


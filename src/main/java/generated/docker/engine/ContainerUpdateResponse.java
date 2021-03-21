package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OK response to ContainerUpdate operation
 **/

public class ContainerUpdateResponse {

    private List<String> warnings = new ArrayList<>();

    /**
     *
     **/
    public ContainerUpdateResponse warnings(List<String> warnings) {
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
        var containerUpdateResponse = (ContainerUpdateResponse) o;
        return Objects.equals(this.warnings, containerUpdateResponse.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warnings);
    }

    @Override
    public String toString() {

        return "class ContainerUpdateResponse {\n" +
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


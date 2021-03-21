package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class NetworkCreateResponse {

    private String id;

    private String warning;

    /**
     * The ID of the created network.
     **/
    public NetworkCreateResponse id(String id) {
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
     *
     **/
    public NetworkCreateResponse warning(String warning) {
        this.warning = warning;
        return this;
    }

    @JsonProperty("Warning")
    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var networkCreateResponse = (NetworkCreateResponse) o;
        return Objects.equals(this.id, networkCreateResponse.id) &&
                       Objects.equals(this.warning, networkCreateResponse.warning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warning);
    }

    @Override
    public String toString() {

        return "class NetworkCreateResponse {\n" +
                            "    id: " + toIndentedString(id) + "\n" +
                            "    warning: " + toIndentedString(warning) + "\n" +
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


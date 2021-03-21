package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * container waiting error, if any
 **/

public class ContainerWaitResponseError {

    private String message;

    /**
     * Details of an error
     **/
    public ContainerWaitResponseError message(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerWaitResponseError = (ContainerWaitResponseError) o;
        return Objects.equals(this.message, containerWaitResponseError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {

        return "class ContainerWaitResponseError {\n" +
                            "    message: " + toIndentedString(message) + "\n" +
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


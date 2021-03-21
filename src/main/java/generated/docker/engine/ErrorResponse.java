package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents an error.
 **/

public class ErrorResponse {

    private String message;

    /**
     * The error message.
     **/
    public ErrorResponse message(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("message")
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
        var errorResponse = (ErrorResponse) o;
        return Objects.equals(this.message, errorResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {

        return "class ErrorResponse {\n" +
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


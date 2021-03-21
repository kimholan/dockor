package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class InlineResponse400 {

    private ErrorResponse errorResponse;

    private String message;

    /**
     *
     **/
    public InlineResponse400 errorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }

    @JsonProperty("ErrorResponse")
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    /**
     * The error message. Either \&quot;must specify path parameter\&quot; (path cannot be empty) or \&quot;not a directory\&quot; (path was asserted to be a directory but exists as a file).
     **/
    public InlineResponse400 message(String message) {
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
        var inlineResponse400 = (InlineResponse400) o;
        return Objects.equals(this.errorResponse, inlineResponse400.errorResponse) &&
                       Objects.equals(this.message, inlineResponse400.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorResponse, message);
    }

    @Override
    public String toString() {

        return "class InlineResponse400 {\n" +
                            "    errorResponse: " + toIndentedString(errorResponse) + "\n" +
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


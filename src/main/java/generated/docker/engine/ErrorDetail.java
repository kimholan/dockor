package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ErrorDetail {

    private Integer code;

    private String message;

    /**
     *
     **/
    public ErrorDetail code(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     *
     **/
    public ErrorDetail message(String message) {
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
        var errorDetail = (ErrorDetail) o;
        return Objects.equals(this.code, errorDetail.code) &&
                       Objects.equals(this.message, errorDetail.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {

        return "class ErrorDetail {\n" +
                            "    code: " + toIndentedString(code) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OK response to ContainerWait operation
 **/

public class ContainerWaitResponse {

    private Integer statusCode;

    private ContainerWaitResponseError error;

    /**
     * Exit code of the container
     **/
    public ContainerWaitResponse statusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @JsonProperty("StatusCode")
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     *
     **/
    public ContainerWaitResponse error(ContainerWaitResponseError error) {
        this.error = error;
        return this;
    }

    @JsonProperty("Error")
    public ContainerWaitResponseError getError() {
        return error;
    }

    public void setError(ContainerWaitResponseError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerWaitResponse = (ContainerWaitResponse) o;
        return Objects.equals(this.statusCode, containerWaitResponse.statusCode) &&
                       Objects.equals(this.error, containerWaitResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, error);
    }

    @Override
    public String toString() {

        return "class ContainerWaitResponse {\n" +
                            "    statusCode: " + toIndentedString(statusCode) + "\n" +
                            "    error: " + toIndentedString(error) + "\n" +
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


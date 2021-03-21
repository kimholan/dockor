package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * change item in response to ContainerChanges operation
 **/

public class ContainerChangeResponseItem {

    private String path;

    private Integer kind;

    /**
     * Path to file that has changed
     **/
    public ContainerChangeResponseItem path(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Kind of change
     **/
    public ContainerChangeResponseItem kind(Integer kind) {
        this.kind = kind;
        return this;
    }

    @JsonProperty("Kind")
    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerChangeResponseItem = (ContainerChangeResponseItem) o;
        return Objects.equals(this.path, containerChangeResponseItem.path) &&
                       Objects.equals(this.kind, containerChangeResponseItem.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, kind);
    }

    @Override
    public String toString() {

        return "class ContainerChangeResponseItem {\n" +
                            "    path: " + toIndentedString(path) + "\n" +
                            "    kind: " + toIndentedString(kind) + "\n" +
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


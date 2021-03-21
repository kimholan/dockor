package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class InlineObject4 {

    private String container;

    private Boolean force;

    /**
     * The ID or name of the container to disconnect from the network.
     **/
    public InlineObject4 container(String container) {
        this.container = container;
        return this;
    }

    @JsonProperty("Container")
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * Force the container to disconnect from the network.
     **/
    public InlineObject4 force(Boolean force) {
        this.force = force;
        return this;
    }

    @JsonProperty("Force")
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var inlineObject4 = (InlineObject4) o;
        return Objects.equals(this.container, inlineObject4.container) &&
                       Objects.equals(this.force, inlineObject4.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(container, force);
    }

    @Override
    public String toString() {

        return "class InlineObject4 {\n" +
                            "    container: " + toIndentedString(container) + "\n" +
                            "    force: " + toIndentedString(force) + "\n" +
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


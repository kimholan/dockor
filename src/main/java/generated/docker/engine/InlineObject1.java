package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class InlineObject1 {

    private Boolean detach;

    private Boolean tty;

    /**
     * Detach from the command.
     **/
    public InlineObject1 detach(Boolean detach) {
        this.detach = detach;
        return this;
    }

    @JsonProperty("Detach")
    public Boolean getDetach() {
        return detach;
    }

    public void setDetach(Boolean detach) {
        this.detach = detach;
    }

    /**
     * Allocate a pseudo-TTY.
     **/
    public InlineObject1 tty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    @JsonProperty("Tty")
    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var inlineObject1 = (InlineObject1) o;
        return Objects.equals(this.detach, inlineObject1.detach) &&
                       Objects.equals(this.tty, inlineObject1.tty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detach, tty);
    }

    @Override
    public String toString() {

        return "class InlineObject1 {\n" +
                            "    detach: " + toIndentedString(detach) + "\n" +
                            "    tty: " + toIndentedString(tty) + "\n" +
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


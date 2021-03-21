package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * Optional configuration for the &#x60;bind&#x60; type.
 **/

public class MountBindOptions {

    private PropagationEnum propagation;

    private Boolean nonRecursive = false;

    /**
     * A propagation mode with the value &#x60;[r]private&#x60;, &#x60;[r]shared&#x60;, or &#x60;[r]slave&#x60;.
     **/
    public MountBindOptions propagation(PropagationEnum propagation) {
        this.propagation = propagation;
        return this;
    }

    @JsonProperty("Propagation")
    public PropagationEnum getPropagation() {
        return propagation;
    }

    public void setPropagation(PropagationEnum propagation) {
        this.propagation = propagation;
    }

    /**
     * Disable recursive bind mount.
     **/
    public MountBindOptions nonRecursive(Boolean nonRecursive) {
        this.nonRecursive = nonRecursive;
        return this;
    }

    @JsonProperty("NonRecursive")
    public Boolean getNonRecursive() {
        return nonRecursive;
    }

    public void setNonRecursive(Boolean nonRecursive) {
        this.nonRecursive = nonRecursive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var mountBindOptions = (MountBindOptions) o;
        return Objects.equals(this.propagation, mountBindOptions.propagation) &&
                       Objects.equals(this.nonRecursive, mountBindOptions.nonRecursive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propagation, nonRecursive);
    }

    @Override
    public String toString() {

        return "class MountBindOptions {\n" +
                            "    propagation: " + toIndentedString(propagation) + "\n" +
                            "    nonRecursive: " + toIndentedString(nonRecursive) + "\n" +
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

    public enum PropagationEnum {

        PRIVATE("private"), RPRIVATE("rprivate"), SHARED("shared"), RSHARED("rshared"), SLAVE("slave"), RSLAVE("rslave");

        private final String value;

        PropagationEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static PropagationEnum fromValue(String value) {
            for (var b : PropagationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

}


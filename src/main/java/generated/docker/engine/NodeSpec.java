package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NodeSpec {

    private String name;

    private Map<String, String> labels = new HashMap<>();

    private RoleEnum role;

    private AvailabilityEnum availability;

    /**
     * Name for the node.
     **/
    public NodeSpec name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * User-defined key/value metadata.
     **/
    public NodeSpec labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("Labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * Role of the node.
     **/
    public NodeSpec role(RoleEnum role) {
        this.role = role;
        return this;
    }

    @JsonProperty("Role")
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * Availability of the node.
     **/
    public NodeSpec availability(AvailabilityEnum availability) {
        this.availability = availability;
        return this;
    }

    @JsonProperty("Availability")
    public AvailabilityEnum getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityEnum availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var nodeSpec = (NodeSpec) o;
        return Objects.equals(this.name, nodeSpec.name) &&
                       Objects.equals(this.labels, nodeSpec.labels) &&
                       Objects.equals(this.role, nodeSpec.role) &&
                       Objects.equals(this.availability, nodeSpec.availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels, role, availability);
    }

    @Override
    public String toString() {
        return "class NodeSpec {\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    labels: " + toIndentedString(labels) + "\n" +
                       "    role: " + toIndentedString(role) + "\n" +
                       "    availability: " + toIndentedString(availability) + "\n" +
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

    public enum RoleEnum {

        WORKER("worker"), MANAGER("manager");

        private final String value;

        RoleEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static RoleEnum fromValue(String value) {
            for (var b : RoleEnum.values()) {
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

    public enum AvailabilityEnum {

        ACTIVE("active"), PAUSE("pause"), DRAIN("drain");

        private final String value;

        AvailabilityEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static AvailabilityEnum fromValue(String value) {
            for (var b : AvailabilityEnum.values()) {
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Node {

    private String ID;

    private ObjectVersion version;

    private String createdAt;

    private String updatedAt;

    private NodeSpec spec;

    private NodeDescription description;

    private NodeStatus status;

    private ManagerStatus managerStatus;

    /**
     *
     **/
    public Node ID(String ID) {
        this.ID = ID;
        return this;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     **/
    public Node version(ObjectVersion version) {
        this.version = version;
        return this;
    }

    @JsonProperty("Version")
    public ObjectVersion getVersion() {
        return version;
    }

    public void setVersion(ObjectVersion version) {
        this.version = version;
    }

    /**
     * Date and time at which the node was added to the swarm in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public Node createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("CreatedAt")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Date and time at which the node was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public Node updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("UpdatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     **/
    public Node spec(NodeSpec spec) {
        this.spec = spec;
        return this;
    }

    @JsonProperty("Spec")
    public NodeSpec getSpec() {
        return spec;
    }

    public void setSpec(NodeSpec spec) {
        this.spec = spec;
    }

    /**
     *
     **/
    public Node description(NodeDescription description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Description")
    public NodeDescription getDescription() {
        return description;
    }

    public void setDescription(NodeDescription description) {
        this.description = description;
    }

    /**
     *
     **/
    public Node status(NodeStatus status) {
        this.status = status;
        return this;
    }

    @JsonProperty("Status")
    public NodeStatus getStatus() {
        return status;
    }

    public void setStatus(NodeStatus status) {
        this.status = status;
    }

    /**
     *
     **/
    public Node managerStatus(ManagerStatus managerStatus) {
        this.managerStatus = managerStatus;
        return this;
    }

    @JsonProperty("ManagerStatus")
    public ManagerStatus getManagerStatus() {
        return managerStatus;
    }

    public void setManagerStatus(ManagerStatus managerStatus) {
        this.managerStatus = managerStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var node = (Node) o;
        return Objects.equals(this.ID, node.ID) &&
                       Objects.equals(this.version, node.version) &&
                       Objects.equals(this.createdAt, node.createdAt) &&
                       Objects.equals(this.updatedAt, node.updatedAt) &&
                       Objects.equals(this.spec, node.spec) &&
                       Objects.equals(this.description, node.description) &&
                       Objects.equals(this.status, node.status) &&
                       Objects.equals(this.managerStatus, node.managerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, version, createdAt, updatedAt, spec, description, status, managerStatus);
    }

    @Override
    public String toString() {
        return "class Node {\n" +
                       "    ID: " + toIndentedString(ID) + "\n" +
                       "    version: " + toIndentedString(version) + "\n" +
                       "    createdAt: " + toIndentedString(createdAt) + "\n" +
                       "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
                       "    spec: " + toIndentedString(spec) + "\n" +
                       "    description: " + toIndentedString(description) + "\n" +
                       "    status: " + toIndentedString(status) + "\n" +
                       "    managerStatus: " + toIndentedString(managerStatus) + "\n" +
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


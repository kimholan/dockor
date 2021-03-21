package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task {

    private String ID;

    private ObjectVersion version;

    private String createdAt;

    private String updatedAt;

    private String name;

    private Map<String, String> labels = new HashMap<>();

    private TaskSpec spec;

    private String serviceID;

    private Integer slot;

    private String nodeID;

    private GenericResources assignedGenericResources = new GenericResources();

    private TaskStatus status;

    private TaskState desiredState;

    private ObjectVersion jobIteration;

    /**
     * The ID of the task.
     **/
    public Task ID(String ID) {
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
    public Task version(ObjectVersion version) {
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
     *
     **/
    public Task createdAt(String createdAt) {
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
     *
     **/
    public Task updatedAt(String updatedAt) {
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
     * Name of the task.
     **/
    public Task name(String name) {
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
    public Task labels(Map<String, String> labels) {
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
     *
     **/
    public Task spec(TaskSpec spec) {
        this.spec = spec;
        return this;
    }

    @JsonProperty("Spec")
    public TaskSpec getSpec() {
        return spec;
    }

    public void setSpec(TaskSpec spec) {
        this.spec = spec;
    }

    /**
     * The ID of the service this task is part of.
     **/
    public Task serviceID(String serviceID) {
        this.serviceID = serviceID;
        return this;
    }

    @JsonProperty("ServiceID")
    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    /**
     *
     **/
    public Task slot(Integer slot) {
        this.slot = slot;
        return this;
    }

    @JsonProperty("Slot")
    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * The ID of the node that this task is on.
     **/
    public Task nodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    @JsonProperty("NodeID")
    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    /**
     *
     **/
    public Task assignedGenericResources(GenericResources assignedGenericResources) {
        this.assignedGenericResources = assignedGenericResources;
        return this;
    }

    @JsonProperty("AssignedGenericResources")
    public GenericResources getAssignedGenericResources() {
        return assignedGenericResources;
    }

    public void setAssignedGenericResources(GenericResources assignedGenericResources) {
        this.assignedGenericResources = assignedGenericResources;
    }

    /**
     *
     **/
    public Task status(TaskStatus status) {
        this.status = status;
        return this;
    }

    @JsonProperty("Status")
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    /**
     *
     **/
    public Task desiredState(TaskState desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    @JsonProperty("DesiredState")
    public TaskState getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(TaskState desiredState) {
        this.desiredState = desiredState;
    }

    /**
     *
     **/
    public Task jobIteration(ObjectVersion jobIteration) {
        this.jobIteration = jobIteration;
        return this;
    }

    @JsonProperty("JobIteration")
    public ObjectVersion getJobIteration() {
        return jobIteration;
    }

    public void setJobIteration(ObjectVersion jobIteration) {
        this.jobIteration = jobIteration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var task = (Task) o;
        return Objects.equals(this.ID, task.ID) &&
                       Objects.equals(this.version, task.version) &&
                       Objects.equals(this.createdAt, task.createdAt) &&
                       Objects.equals(this.updatedAt, task.updatedAt) &&
                       Objects.equals(this.name, task.name) &&
                       Objects.equals(this.labels, task.labels) &&
                       Objects.equals(this.spec, task.spec) &&
                       Objects.equals(this.serviceID, task.serviceID) &&
                       Objects.equals(this.slot, task.slot) &&
                       Objects.equals(this.nodeID, task.nodeID) &&
                       Objects.equals(this.assignedGenericResources, task.assignedGenericResources) &&
                       Objects.equals(this.status, task.status) &&
                       Objects.equals(this.desiredState, task.desiredState) &&
                       Objects.equals(this.jobIteration, task.jobIteration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, version, createdAt, updatedAt, name, labels, spec, serviceID, slot, nodeID, assignedGenericResources, status, desiredState, jobIteration);
    }

    @Override
    public String toString() {
        return "class Task {\n" +
                       "    ID: " + toIndentedString(ID) + "\n" +
                       "    version: " + toIndentedString(version) + "\n" +
                       "    createdAt: " + toIndentedString(createdAt) + "\n" +
                       "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    labels: " + toIndentedString(labels) + "\n" +
                       "    spec: " + toIndentedString(spec) + "\n" +
                       "    serviceID: " + toIndentedString(serviceID) + "\n" +
                       "    slot: " + toIndentedString(slot) + "\n" +
                       "    nodeID: " + toIndentedString(nodeID) + "\n" +
                       "    assignedGenericResources: " + toIndentedString(assignedGenericResources) + "\n" +
                       "    status: " + toIndentedString(status) + "\n" +
                       "    desiredState: " + toIndentedString(desiredState) + "\n" +
                       "    jobIteration: " + toIndentedString(jobIteration) + "\n" +
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


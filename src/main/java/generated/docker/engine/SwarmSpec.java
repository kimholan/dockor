package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * User modifiable swarm configuration.
 **/

public class SwarmSpec {

    private String name;

    private Map<String, String> labels = new HashMap<>();

    private SwarmSpecOrchestration orchestration;

    private SwarmSpecRaft raft;

    private SwarmSpecDispatcher dispatcher;

    private SwarmSpecCAConfig caConfig;

    private SwarmSpecEncryptionConfig encryptionConfig;

    private SwarmSpecTaskDefaults taskDefaults;

    /**
     * Name of the swarm.
     **/
    public SwarmSpec name(String name) {
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
    public SwarmSpec labels(Map<String, String> labels) {
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
    public SwarmSpec orchestration(SwarmSpecOrchestration orchestration) {
        this.orchestration = orchestration;
        return this;
    }

    @JsonProperty("Orchestration")
    public SwarmSpecOrchestration getOrchestration() {
        return orchestration;
    }

    public void setOrchestration(SwarmSpecOrchestration orchestration) {
        this.orchestration = orchestration;
    }

    /**
     *
     **/
    public SwarmSpec raft(SwarmSpecRaft raft) {
        this.raft = raft;
        return this;
    }

    @JsonProperty("Raft")
    public SwarmSpecRaft getRaft() {
        return raft;
    }

    public void setRaft(SwarmSpecRaft raft) {
        this.raft = raft;
    }

    /**
     *
     **/
    public SwarmSpec dispatcher(SwarmSpecDispatcher dispatcher) {
        this.dispatcher = dispatcher;
        return this;
    }

    @JsonProperty("Dispatcher")
    public SwarmSpecDispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(SwarmSpecDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    /**
     *
     **/
    public SwarmSpec caConfig(SwarmSpecCAConfig caConfig) {
        this.caConfig = caConfig;
        return this;
    }

    @JsonProperty("CAConfig")
    public SwarmSpecCAConfig getCaConfig() {
        return caConfig;
    }

    public void setCaConfig(SwarmSpecCAConfig caConfig) {
        this.caConfig = caConfig;
    }

    /**
     *
     **/
    public SwarmSpec encryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    @JsonProperty("EncryptionConfig")
    public SwarmSpecEncryptionConfig getEncryptionConfig() {
        return encryptionConfig;
    }

    public void setEncryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     *
     **/
    public SwarmSpec taskDefaults(SwarmSpecTaskDefaults taskDefaults) {
        this.taskDefaults = taskDefaults;
        return this;
    }

    @JsonProperty("TaskDefaults")
    public SwarmSpecTaskDefaults getTaskDefaults() {
        return taskDefaults;
    }

    public void setTaskDefaults(SwarmSpecTaskDefaults taskDefaults) {
        this.taskDefaults = taskDefaults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var swarmSpec = (SwarmSpec) o;
        return Objects.equals(this.name, swarmSpec.name) &&
                       Objects.equals(this.labels, swarmSpec.labels) &&
                       Objects.equals(this.orchestration, swarmSpec.orchestration) &&
                       Objects.equals(this.raft, swarmSpec.raft) &&
                       Objects.equals(this.dispatcher, swarmSpec.dispatcher) &&
                       Objects.equals(this.caConfig, swarmSpec.caConfig) &&
                       Objects.equals(this.encryptionConfig, swarmSpec.encryptionConfig) &&
                       Objects.equals(this.taskDefaults, swarmSpec.taskDefaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels, orchestration, raft, dispatcher, caConfig, encryptionConfig, taskDefaults);
    }

    @Override
    public String toString() {
        return "class SwarmSpec {\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    labels: " + toIndentedString(labels) + "\n" +
                       "    orchestration: " + toIndentedString(orchestration) + "\n" +
                       "    raft: " + toIndentedString(raft) + "\n" +
                       "    dispatcher: " + toIndentedString(dispatcher) + "\n" +
                       "    caConfig: " + toIndentedString(caConfig) + "\n" +
                       "    encryptionConfig: " + toIndentedString(encryptionConfig) + "\n" +
                       "    taskDefaults: " + toIndentedString(taskDefaults) + "\n" +
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


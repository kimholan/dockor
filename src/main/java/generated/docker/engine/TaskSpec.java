package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User modifiable task configuration.
 **/

public class TaskSpec {

    private TaskSpecPluginSpec pluginSpec;

    private TaskSpecContainerSpec containerSpec;

    private TaskSpecNetworkAttachmentSpec networkAttachmentSpec;

    private TaskSpecResources resources;

    private TaskSpecRestartPolicy restartPolicy;

    private TaskSpecPlacement placement;

    private Integer forceUpdate;

    private String runtime;

    private List<NetworkAttachmentConfig> networks = new ArrayList<>();

    private TaskSpecLogDriver logDriver;

    /**
     *
     **/
    public TaskSpec pluginSpec(TaskSpecPluginSpec pluginSpec) {
        this.pluginSpec = pluginSpec;
        return this;
    }

    @JsonProperty("PluginSpec")
    public TaskSpecPluginSpec getPluginSpec() {
        return pluginSpec;
    }

    public void setPluginSpec(TaskSpecPluginSpec pluginSpec) {
        this.pluginSpec = pluginSpec;
    }

    /**
     *
     **/
    public TaskSpec containerSpec(TaskSpecContainerSpec containerSpec) {
        this.containerSpec = containerSpec;
        return this;
    }

    @JsonProperty("ContainerSpec")
    public TaskSpecContainerSpec getContainerSpec() {
        return containerSpec;
    }

    public void setContainerSpec(TaskSpecContainerSpec containerSpec) {
        this.containerSpec = containerSpec;
    }

    /**
     *
     **/
    public TaskSpec networkAttachmentSpec(TaskSpecNetworkAttachmentSpec networkAttachmentSpec) {
        this.networkAttachmentSpec = networkAttachmentSpec;
        return this;
    }

    @JsonProperty("NetworkAttachmentSpec")
    public TaskSpecNetworkAttachmentSpec getNetworkAttachmentSpec() {
        return networkAttachmentSpec;
    }

    public void setNetworkAttachmentSpec(TaskSpecNetworkAttachmentSpec networkAttachmentSpec) {
        this.networkAttachmentSpec = networkAttachmentSpec;
    }

    /**
     *
     **/
    public TaskSpec resources(TaskSpecResources resources) {
        this.resources = resources;
        return this;
    }

    @JsonProperty("Resources")
    public TaskSpecResources getResources() {
        return resources;
    }

    public void setResources(TaskSpecResources resources) {
        this.resources = resources;
    }

    /**
     *
     **/
    public TaskSpec restartPolicy(TaskSpecRestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    @JsonProperty("RestartPolicy")
    public TaskSpecRestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(TaskSpecRestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     *
     **/
    public TaskSpec placement(TaskSpecPlacement placement) {
        this.placement = placement;
        return this;
    }

    @JsonProperty("Placement")
    public TaskSpecPlacement getPlacement() {
        return placement;
    }

    public void setPlacement(TaskSpecPlacement placement) {
        this.placement = placement;
    }

    /**
     * A counter that triggers an update even if no relevant parameters have been changed.
     **/
    public TaskSpec forceUpdate(Integer forceUpdate) {
        this.forceUpdate = forceUpdate;
        return this;
    }

    @JsonProperty("ForceUpdate")
    public Integer getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Integer forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    /**
     * Runtime is the type of runtime specified for the task executor.
     **/
    public TaskSpec runtime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    @JsonProperty("Runtime")
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * Specifies which networks the service should attach to.
     **/
    public TaskSpec networks(List<NetworkAttachmentConfig> networks) {
        this.networks = networks;
        return this;
    }

    @JsonProperty("Networks")
    public List<NetworkAttachmentConfig> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NetworkAttachmentConfig> networks) {
        this.networks = networks;
    }

    /**
     *
     **/
    public TaskSpec logDriver(TaskSpecLogDriver logDriver) {
        this.logDriver = logDriver;
        return this;
    }

    @JsonProperty("LogDriver")
    public TaskSpecLogDriver getLogDriver() {
        return logDriver;
    }

    public void setLogDriver(TaskSpecLogDriver logDriver) {
        this.logDriver = logDriver;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var taskSpec = (TaskSpec) o;
        return Objects.equals(this.pluginSpec, taskSpec.pluginSpec) &&
                       Objects.equals(this.containerSpec, taskSpec.containerSpec) &&
                       Objects.equals(this.networkAttachmentSpec, taskSpec.networkAttachmentSpec) &&
                       Objects.equals(this.resources, taskSpec.resources) &&
                       Objects.equals(this.restartPolicy, taskSpec.restartPolicy) &&
                       Objects.equals(this.placement, taskSpec.placement) &&
                       Objects.equals(this.forceUpdate, taskSpec.forceUpdate) &&
                       Objects.equals(this.runtime, taskSpec.runtime) &&
                       Objects.equals(this.networks, taskSpec.networks) &&
                       Objects.equals(this.logDriver, taskSpec.logDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginSpec, containerSpec, networkAttachmentSpec, resources, restartPolicy, placement, forceUpdate, runtime, networks, logDriver);
    }

    @Override
    public String toString() {
        return "class TaskSpec {\n" +
                       "    pluginSpec: " + toIndentedString(pluginSpec) + "\n" +
                       "    containerSpec: " + toIndentedString(containerSpec) + "\n" +
                       "    networkAttachmentSpec: " + toIndentedString(networkAttachmentSpec) + "\n" +
                       "    resources: " + toIndentedString(resources) + "\n" +
                       "    restartPolicy: " + toIndentedString(restartPolicy) + "\n" +
                       "    placement: " + toIndentedString(placement) + "\n" +
                       "    forceUpdate: " + toIndentedString(forceUpdate) + "\n" +
                       "    runtime: " + toIndentedString(runtime) + "\n" +
                       "    networks: " + toIndentedString(networks) + "\n" +
                       "    logDriver: " + toIndentedString(logDriver) + "\n" +
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


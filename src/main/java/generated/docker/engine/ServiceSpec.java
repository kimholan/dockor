package generated.docker.engine;

import generated.docker.engine.EndpointSpec;
import generated.docker.engine.NetworkAttachmentConfig;
import generated.docker.engine.ServiceSpecMode;
import generated.docker.engine.ServiceSpecRollbackConfig;
import generated.docker.engine.ServiceSpecUpdateConfig;
import generated.docker.engine.TaskSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User modifiable configuration for a service.
 **/

public class ServiceSpec   {
  
  private String name;
  private Map<String, String> labels = new HashMap<>();
  private TaskSpec taskTemplate;
  private ServiceSpecMode mode;
  private ServiceSpecUpdateConfig updateConfig;
  private ServiceSpecRollbackConfig rollbackConfig;
  private List<NetworkAttachmentConfig> networks = new ArrayList<>();
  private EndpointSpec endpointSpec;

  /**
   * Name of the service.
   **/
  public ServiceSpec name(String name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }/**
   * User-defined key/value metadata.
   **/
  public ServiceSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  

  
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }/**
   **/
  public ServiceSpec taskTemplate(TaskSpec taskTemplate) {
    this.taskTemplate = taskTemplate;
    return this;
  }

  

  
  @JsonProperty("TaskTemplate")
  public TaskSpec getTaskTemplate() {
    return taskTemplate;
  }

  public void setTaskTemplate(TaskSpec taskTemplate) {
    this.taskTemplate = taskTemplate;
  }/**
   **/
  public ServiceSpec mode(ServiceSpecMode mode) {
    this.mode = mode;
    return this;
  }

  

  
  @JsonProperty("Mode")
  public ServiceSpecMode getMode() {
    return mode;
  }

  public void setMode(ServiceSpecMode mode) {
    this.mode = mode;
  }/**
   **/
  public ServiceSpec updateConfig(ServiceSpecUpdateConfig updateConfig) {
    this.updateConfig = updateConfig;
    return this;
  }

  

  
  @JsonProperty("UpdateConfig")
  public ServiceSpecUpdateConfig getUpdateConfig() {
    return updateConfig;
  }

  public void setUpdateConfig(ServiceSpecUpdateConfig updateConfig) {
    this.updateConfig = updateConfig;
  }/**
   **/
  public ServiceSpec rollbackConfig(ServiceSpecRollbackConfig rollbackConfig) {
    this.rollbackConfig = rollbackConfig;
    return this;
  }

  

  
  @JsonProperty("RollbackConfig")
  public ServiceSpecRollbackConfig getRollbackConfig() {
    return rollbackConfig;
  }

  public void setRollbackConfig(ServiceSpecRollbackConfig rollbackConfig) {
    this.rollbackConfig = rollbackConfig;
  }/**
   * Specifies which networks the service should attach to.
   **/
  public ServiceSpec networks(List<NetworkAttachmentConfig> networks) {
    this.networks = networks;
    return this;
  }

  

  
  @JsonProperty("Networks")
  public List<NetworkAttachmentConfig> getNetworks() {
    return networks;
  }

  public void setNetworks(List<NetworkAttachmentConfig> networks) {
    this.networks = networks;
  }/**
   **/
  public ServiceSpec endpointSpec(EndpointSpec endpointSpec) {
    this.endpointSpec = endpointSpec;
    return this;
  }

  

  
  @JsonProperty("EndpointSpec")
  public EndpointSpec getEndpointSpec() {
    return endpointSpec;
  }

  public void setEndpointSpec(EndpointSpec endpointSpec) {
    this.endpointSpec = endpointSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceSpec = (ServiceSpec) o;
    return Objects.equals(this.name, serviceSpec.name) &&
        Objects.equals(this.labels, serviceSpec.labels) &&
        Objects.equals(this.taskTemplate, serviceSpec.taskTemplate) &&
        Objects.equals(this.mode, serviceSpec.mode) &&
        Objects.equals(this.updateConfig, serviceSpec.updateConfig) &&
        Objects.equals(this.rollbackConfig, serviceSpec.rollbackConfig) &&
        Objects.equals(this.networks, serviceSpec.networks) &&
        Objects.equals(this.endpointSpec, serviceSpec.endpointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, taskTemplate, mode, updateConfig, rollbackConfig, networks, endpointSpec);
  }

  @Override
  public String toString() {

    return "class ServiceSpec {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    labels: " + toIndentedString(labels) + "\n" +
                          "    taskTemplate: " + toIndentedString(taskTemplate) + "\n" +
                          "    mode: " + toIndentedString(mode) + "\n" +
                          "    updateConfig: " + toIndentedString(updateConfig) + "\n" +
                          "    rollbackConfig: " + toIndentedString(rollbackConfig) + "\n" +
                          "    networks: " + toIndentedString(networks) + "\n" +
                          "    endpointSpec: " + toIndentedString(endpointSpec) + "\n" +
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


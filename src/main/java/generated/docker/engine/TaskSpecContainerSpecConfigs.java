package generated.docker.engine;

import generated.docker.engine.TaskSpecContainerSpecFile1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskSpecContainerSpecConfigs   {
  
  private TaskSpecContainerSpecFile1 file;
  private Object runtime;
  private String configID;
  private String configName;

  /**
   **/
  public TaskSpecContainerSpecConfigs file(TaskSpecContainerSpecFile1 file) {
    this.file = file;
    return this;
  }

  

  
  @JsonProperty("File")
  public TaskSpecContainerSpecFile1 getFile() {
    return file;
  }

  public void setFile(TaskSpecContainerSpecFile1 file) {
    this.file = file;
  }/**
   * Runtime represents a target that is not mounted into the container but is used by the task  &lt;p&gt;&lt;br /&gt;&lt;p&gt;  &gt; **Note**: &#x60;Configs.File&#x60; and &#x60;Configs.Runtime&#x60; are mutually &gt; exclusive 
   **/
  public TaskSpecContainerSpecConfigs runtime(Object runtime) {
    this.runtime = runtime;
    return this;
  }

  

  
  @JsonProperty("Runtime")
  public Object getRuntime() {
    return runtime;
  }

  public void setRuntime(Object runtime) {
    this.runtime = runtime;
  }/**
   * ConfigID represents the ID of the specific config that we&#39;re referencing. 
   **/
  public TaskSpecContainerSpecConfigs configID(String configID) {
    this.configID = configID;
    return this;
  }

  

  
  @JsonProperty("ConfigID")
  public String getConfigID() {
    return configID;
  }

  public void setConfigID(String configID) {
    this.configID = configID;
  }/**
   * ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID. 
   **/
  public TaskSpecContainerSpecConfigs configName(String configName) {
    this.configName = configName;
    return this;
  }

  

  
  @JsonProperty("ConfigName")
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecConfigs = (TaskSpecContainerSpecConfigs) o;
    return Objects.equals(this.file, taskSpecContainerSpecConfigs.file) &&
        Objects.equals(this.runtime, taskSpecContainerSpecConfigs.runtime) &&
        Objects.equals(this.configID, taskSpecContainerSpecConfigs.configID) &&
        Objects.equals(this.configName, taskSpecContainerSpecConfigs.configName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, runtime, configID, configName);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecConfigs {\n" +
                          "    file: " + toIndentedString(file) + "\n" +
                          "    runtime: " + toIndentedString(runtime) + "\n" +
                          "    configID: " + toIndentedString(configID) + "\n" +
                          "    configName: " + toIndentedString(configName) + "\n" +
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


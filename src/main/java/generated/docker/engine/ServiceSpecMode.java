package generated.docker.engine;

import generated.docker.engine.ServiceSpecModeReplicated;
import generated.docker.engine.ServiceSpecModeReplicatedJob;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scheduling mode for the service.
 **/

public class ServiceSpecMode   {
  
  private ServiceSpecModeReplicated replicated;
  private Object global;
  private ServiceSpecModeReplicatedJob replicatedJob;
  private Object globalJob;

  /**
   **/
  public ServiceSpecMode replicated(ServiceSpecModeReplicated replicated) {
    this.replicated = replicated;
    return this;
  }

  

  
  @JsonProperty("Replicated")
  public ServiceSpecModeReplicated getReplicated() {
    return replicated;
  }

  public void setReplicated(ServiceSpecModeReplicated replicated) {
    this.replicated = replicated;
  }/**
   **/
  public ServiceSpecMode global(Object global) {
    this.global = global;
    return this;
  }

  

  
  @JsonProperty("Global")
  public Object getGlobal() {
    return global;
  }

  public void setGlobal(Object global) {
    this.global = global;
  }/**
   **/
  public ServiceSpecMode replicatedJob(ServiceSpecModeReplicatedJob replicatedJob) {
    this.replicatedJob = replicatedJob;
    return this;
  }

  

  
  @JsonProperty("ReplicatedJob")
  public ServiceSpecModeReplicatedJob getReplicatedJob() {
    return replicatedJob;
  }

  public void setReplicatedJob(ServiceSpecModeReplicatedJob replicatedJob) {
    this.replicatedJob = replicatedJob;
  }/**
   * The mode used for services which run a task to the completed state on each valid node. 
   **/
  public ServiceSpecMode globalJob(Object globalJob) {
    this.globalJob = globalJob;
    return this;
  }

  

  
  @JsonProperty("GlobalJob")
  public Object getGlobalJob() {
    return globalJob;
  }

  public void setGlobalJob(Object globalJob) {
    this.globalJob = globalJob;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceSpecMode = (ServiceSpecMode) o;
    return Objects.equals(this.replicated, serviceSpecMode.replicated) &&
        Objects.equals(this.global, serviceSpecMode.global) &&
        Objects.equals(this.replicatedJob, serviceSpecMode.replicatedJob) &&
        Objects.equals(this.globalJob, serviceSpecMode.globalJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicated, global, replicatedJob, globalJob);
  }

  @Override
  public String toString() {

    return "class ServiceSpecMode {\n" +
                          "    replicated: " + toIndentedString(replicated) + "\n" +
                          "    global: " + toIndentedString(global) + "\n" +
                          "    replicatedJob: " + toIndentedString(replicatedJob) + "\n" +
                          "    globalJob: " + toIndentedString(globalJob) + "\n" +
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


package generated.docker.engine;

import generated.docker.engine.ObjectVersion;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of the service when it is in one of ReplicatedJob or GlobalJob modes. Absent on Replicated and Global mode services. The JobIteration is an ObjectVersion, but unlike the Service&#39;s version, does not need to be sent with an update request. 
 **/

public class ServiceJobStatus   {
  
  private ObjectVersion jobIteration;
  private String lastExecution;

  /**
   **/
  public ServiceJobStatus jobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
    return this;
  }

  

  
  @JsonProperty("JobIteration")
  public ObjectVersion getJobIteration() {
    return jobIteration;
  }

  public void setJobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
  }/**
   * The last time, as observed by the server, that this job was started. 
   **/
  public ServiceJobStatus lastExecution(String lastExecution) {
    this.lastExecution = lastExecution;
    return this;
  }

  

  
  @JsonProperty("LastExecution")
  public String getLastExecution() {
    return lastExecution;
  }

  public void setLastExecution(String lastExecution) {
    this.lastExecution = lastExecution;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceJobStatus = (ServiceJobStatus) o;
    return Objects.equals(this.jobIteration, serviceJobStatus.jobIteration) &&
        Objects.equals(this.lastExecution, serviceJobStatus.lastExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobIteration, lastExecution);
  }

  @Override
  public String toString() {

    return "class ServiceJobStatus {\n" +
                          "    jobIteration: " + toIndentedString(jobIteration) + "\n" +
                          "    lastExecution: " + toIndentedString(lastExecution) + "\n" +
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


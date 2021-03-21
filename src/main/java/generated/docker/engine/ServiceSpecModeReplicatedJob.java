package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The mode used for services with a finite number of tasks that run to a completed state. 
 **/

public class ServiceSpecModeReplicatedJob   {
  
  private Long maxConcurrent = 1l;
  private Long totalCompletions;

  /**
   * The maximum number of replicas to run simultaneously. 
   **/
  public ServiceSpecModeReplicatedJob maxConcurrent(Long maxConcurrent) {
    this.maxConcurrent = maxConcurrent;
    return this;
  }

  

  
  @JsonProperty("MaxConcurrent")
  public Long getMaxConcurrent() {
    return maxConcurrent;
  }

  public void setMaxConcurrent(Long maxConcurrent) {
    this.maxConcurrent = maxConcurrent;
  }/**
   * The total number of replicas desired to reach the Completed state. If unset, will default to the value of &#x60;MaxConcurrent&#x60; 
   **/
  public ServiceSpecModeReplicatedJob totalCompletions(Long totalCompletions) {
    this.totalCompletions = totalCompletions;
    return this;
  }

  

  
  @JsonProperty("TotalCompletions")
  public Long getTotalCompletions() {
    return totalCompletions;
  }

  public void setTotalCompletions(Long totalCompletions) {
    this.totalCompletions = totalCompletions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceSpecModeReplicatedJob = (ServiceSpecModeReplicatedJob) o;
    return Objects.equals(this.maxConcurrent, serviceSpecModeReplicatedJob.maxConcurrent) &&
        Objects.equals(this.totalCompletions, serviceSpecModeReplicatedJob.totalCompletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConcurrent, totalCompletions);
  }

  @Override
  public String toString() {

    return "class ServiceSpecModeReplicatedJob {\n" +
                          "    maxConcurrent: " + toIndentedString(maxConcurrent) + "\n" +
                          "    totalCompletions: " + toIndentedString(totalCompletions) + "\n" +
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


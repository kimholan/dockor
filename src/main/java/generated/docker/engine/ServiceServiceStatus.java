package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of the service&#39;s tasks. Provided only when requested as part of a ServiceList operation. 
 **/

public class ServiceServiceStatus   {
  
  private Integer runningTasks;
  private Integer desiredTasks;
  private Integer completedTasks;

  /**
   * The number of tasks for the service currently in the Running state. 
   **/
  public ServiceServiceStatus runningTasks(Integer runningTasks) {
    this.runningTasks = runningTasks;
    return this;
  }

  

  
  @JsonProperty("RunningTasks")
  public Integer getRunningTasks() {
    return runningTasks;
  }

  public void setRunningTasks(Integer runningTasks) {
    this.runningTasks = runningTasks;
  }/**
   * The number of tasks for the service desired to be running. For replicated services, this is the replica count from the service spec. For global services, this is computed by taking count of all tasks for the service with a Desired State other than Shutdown. 
   **/
  public ServiceServiceStatus desiredTasks(Integer desiredTasks) {
    this.desiredTasks = desiredTasks;
    return this;
  }

  

  
  @JsonProperty("DesiredTasks")
  public Integer getDesiredTasks() {
    return desiredTasks;
  }

  public void setDesiredTasks(Integer desiredTasks) {
    this.desiredTasks = desiredTasks;
  }/**
   * The number of tasks for a job that are in the Completed state. This field must be cross-referenced with the service type, as the value of 0 may mean the service is not in a job mode, or it may mean the job-mode service has no tasks yet Completed. 
   **/
  public ServiceServiceStatus completedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
    return this;
  }

  

  
  @JsonProperty("CompletedTasks")
  public Integer getCompletedTasks() {
    return completedTasks;
  }

  public void setCompletedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceServiceStatus = (ServiceServiceStatus) o;
    return Objects.equals(this.runningTasks, serviceServiceStatus.runningTasks) &&
        Objects.equals(this.desiredTasks, serviceServiceStatus.desiredTasks) &&
        Objects.equals(this.completedTasks, serviceServiceStatus.completedTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runningTasks, desiredTasks, completedTasks);
  }

  @Override
  public String toString() {

    return "class ServiceServiceStatus {\n" +
                          "    runningTasks: " + toIndentedString(runningTasks) + "\n" +
                          "    desiredTasks: " + toIndentedString(desiredTasks) + "\n" +
                          "    completedTasks: " + toIndentedString(completedTasks) + "\n" +
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


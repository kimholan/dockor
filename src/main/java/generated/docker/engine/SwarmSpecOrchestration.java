package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Orchestration configuration.
 **/

public class SwarmSpecOrchestration   {
  
  private Long taskHistoryRetentionLimit;

  /**
   * The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks. 
   **/
  public SwarmSpecOrchestration taskHistoryRetentionLimit(Long taskHistoryRetentionLimit) {
    this.taskHistoryRetentionLimit = taskHistoryRetentionLimit;
    return this;
  }

  

  
  @JsonProperty("TaskHistoryRetentionLimit")
  public Long getTaskHistoryRetentionLimit() {
    return taskHistoryRetentionLimit;
  }

  public void setTaskHistoryRetentionLimit(Long taskHistoryRetentionLimit) {
    this.taskHistoryRetentionLimit = taskHistoryRetentionLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmSpecOrchestration = (SwarmSpecOrchestration) o;
    return Objects.equals(this.taskHistoryRetentionLimit, swarmSpecOrchestration.taskHistoryRetentionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskHistoryRetentionLimit);
  }

  @Override
  public String toString() {

    return "class SwarmSpecOrchestration {\n" +
                          "    taskHistoryRetentionLimit: " + toIndentedString(taskHistoryRetentionLimit) + "\n" +
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


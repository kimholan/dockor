package generated.docker.engine;

import generated.docker.engine.TaskState;
import generated.docker.engine.TaskStatusContainerStatus;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskStatus   {
  
  private String timestamp;
  private TaskState state;
  private String message;
  private String err;
  private TaskStatusContainerStatus containerStatus;

  /**
   **/
  public TaskStatus timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  

  
  @JsonProperty("Timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }/**
   **/
  public TaskStatus state(TaskState state) {
    this.state = state;
    return this;
  }

  

  
  @JsonProperty("State")
  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }/**
   **/
  public TaskStatus message(String message) {
    this.message = message;
    return this;
  }

  

  
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }/**
   **/
  public TaskStatus err(String err) {
    this.err = err;
    return this;
  }

  

  
  @JsonProperty("Err")
  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }/**
   **/
  public TaskStatus containerStatus(TaskStatusContainerStatus containerStatus) {
    this.containerStatus = containerStatus;
    return this;
  }

  

  
  @JsonProperty("ContainerStatus")
  public TaskStatusContainerStatus getContainerStatus() {
    return containerStatus;
  }

  public void setContainerStatus(TaskStatusContainerStatus containerStatus) {
    this.containerStatus = containerStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskStatus = (TaskStatus) o;
    return Objects.equals(this.timestamp, taskStatus.timestamp) &&
        Objects.equals(this.state, taskStatus.state) &&
        Objects.equals(this.message, taskStatus.message) &&
        Objects.equals(this.err, taskStatus.err) &&
        Objects.equals(this.containerStatus, taskStatus.containerStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, state, message, err, containerStatus);
  }

  @Override
  public String toString() {

    return "class TaskStatus {\n" +
                          "    timestamp: " + toIndentedString(timestamp) + "\n" +
                          "    state: " + toIndentedString(state) + "\n" +
                          "    message: " + toIndentedString(message) + "\n" +
                          "    err: " + toIndentedString(err) + "\n" +
                          "    containerStatus: " + toIndentedString(containerStatus) + "\n" +
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


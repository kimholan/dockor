package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of a service update.
 **/

public class ServiceUpdateStatus   {
  

public enum StateEnum {

    UPDATING(String.valueOf("updating")), PAUSED(String.valueOf("paused")), COMPLETED(String.valueOf("completed"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
        for (var b : StateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StateEnum state;
  private String startedAt;
  private String completedAt;
  private String message;

  /**
   **/
  public ServiceUpdateStatus state(StateEnum state) {
    this.state = state;
    return this;
  }

  

  
  @JsonProperty("State")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }/**
   **/
  public ServiceUpdateStatus startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  

  
  @JsonProperty("StartedAt")
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }/**
   **/
  public ServiceUpdateStatus completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  

  
  @JsonProperty("CompletedAt")
  public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }/**
   **/
  public ServiceUpdateStatus message(String message) {
    this.message = message;
    return this;
  }

  

  
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
      var serviceUpdateStatus = (ServiceUpdateStatus) o;
    return Objects.equals(this.state, serviceUpdateStatus.state) &&
        Objects.equals(this.startedAt, serviceUpdateStatus.startedAt) &&
        Objects.equals(this.completedAt, serviceUpdateStatus.completedAt) &&
        Objects.equals(this.message, serviceUpdateStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, startedAt, completedAt, message);
  }

  @Override
  public String toString() {

      return "class ServiceUpdateStatus {\n" +
                          "    state: " + toIndentedString(state) + "\n" +
                          "    startedAt: " + toIndentedString(startedAt) + "\n" +
                          "    completedAt: " + toIndentedString(completedAt) + "\n" +
                          "    message: " + toIndentedString(message) + "\n" +
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


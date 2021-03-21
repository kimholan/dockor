package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specification for the restart policy which applies to containers created as part of this service. 
 **/

public class TaskSpecRestartPolicy   {
  

public enum ConditionEnum {

    NONE(String.valueOf("none")), ON_FAILURE(String.valueOf("on-failure")), ANY(String.valueOf("any"));


    private String value;

    ConditionEnum (String v) {
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
    public static ConditionEnum fromValue(String value) {
        for (var b : ConditionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ConditionEnum condition;
  private Long delay;
  private Long maxAttempts = 0l;
  private Long window = 0l;

  /**
   * Condition for restart.
   **/
  public TaskSpecRestartPolicy condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  

  
  @JsonProperty("Condition")
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }/**
   * Delay between restart attempts.
   **/
  public TaskSpecRestartPolicy delay(Long delay) {
    this.delay = delay;
    return this;
  }

  

  
  @JsonProperty("Delay")
  public Long getDelay() {
    return delay;
  }

  public void setDelay(Long delay) {
    this.delay = delay;
  }/**
   * Maximum attempts to restart a given container before giving up (default value is 0, which is ignored). 
   **/
  public TaskSpecRestartPolicy maxAttempts(Long maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

  

  
  @JsonProperty("MaxAttempts")
  public Long getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(Long maxAttempts) {
    this.maxAttempts = maxAttempts;
  }/**
   * Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded). 
   **/
  public TaskSpecRestartPolicy window(Long window) {
    this.window = window;
    return this;
  }

  

  
  @JsonProperty("Window")
  public Long getWindow() {
    return window;
  }

  public void setWindow(Long window) {
    this.window = window;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
      var taskSpecRestartPolicy = (TaskSpecRestartPolicy) o;
    return Objects.equals(this.condition, taskSpecRestartPolicy.condition) &&
        Objects.equals(this.delay, taskSpecRestartPolicy.delay) &&
        Objects.equals(this.maxAttempts, taskSpecRestartPolicy.maxAttempts) &&
        Objects.equals(this.window, taskSpecRestartPolicy.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, delay, maxAttempts, window);
  }

  @Override
  public String toString() {

      return "class TaskSpecRestartPolicy {\n" +
                          "    condition: " + toIndentedString(condition) + "\n" +
                          "    delay: " + toIndentedString(delay) + "\n" +
                          "    maxAttempts: " + toIndentedString(maxAttempts) + "\n" +
                          "    window: " + toIndentedString(window) + "\n" +
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


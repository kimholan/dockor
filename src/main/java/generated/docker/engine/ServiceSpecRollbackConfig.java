package generated.docker.engine;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.BigDecimal;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specification for the rollback strategy of the service.
 **/

public class ServiceSpecRollbackConfig   {
  
  private Long parallelism;
  private Long delay;

public enum FailureActionEnum {

    CONTINUE(String.valueOf("continue")), PAUSE(String.valueOf("pause"));


    private String value;

    FailureActionEnum (String v) {
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
    public static FailureActionEnum fromValue(String value) {
        for (var b : FailureActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private FailureActionEnum failureAction;
  private Long monitor;
  private BigDecimal maxFailureRatio;

public enum OrderEnum {

    STOP_FIRST(String.valueOf("stop-first")), START_FIRST(String.valueOf("start-first"));


    private String value;

    OrderEnum (String v) {
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
    public static OrderEnum fromValue(String value) {
        for (var b : OrderEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private OrderEnum order;

  /**
   * Maximum number of tasks to be rolled back in one iteration (0 means unlimited parallelism). 
   **/
  public ServiceSpecRollbackConfig parallelism(Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  

  
  @JsonProperty("Parallelism")
  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }/**
   * Amount of time between rollback iterations, in nanoseconds. 
   **/
  public ServiceSpecRollbackConfig delay(Long delay) {
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
   * Action to take if an rolled back task fails to run, or stops running during the rollback. 
   **/
  public ServiceSpecRollbackConfig failureAction(FailureActionEnum failureAction) {
    this.failureAction = failureAction;
    return this;
  }

  

  
  @JsonProperty("FailureAction")
  public FailureActionEnum getFailureAction() {
    return failureAction;
  }

  public void setFailureAction(FailureActionEnum failureAction) {
    this.failureAction = failureAction;
  }/**
   * Amount of time to monitor each rolled back task for failures, in nanoseconds. 
   **/
  public ServiceSpecRollbackConfig monitor(Long monitor) {
    this.monitor = monitor;
    return this;
  }

  

  
  @JsonProperty("Monitor")
  public Long getMonitor() {
    return monitor;
  }

  public void setMonitor(Long monitor) {
    this.monitor = monitor;
  }/**
   * The fraction of tasks that may fail during a rollback before the failure action is invoked, specified as a floating point number between 0 and 1. 
   **/
  public ServiceSpecRollbackConfig maxFailureRatio(BigDecimal maxFailureRatio) {
    this.maxFailureRatio = maxFailureRatio;
    return this;
  }

  

  @JsonSerialize(using = ToStringSerializer.class)
  @JsonProperty("MaxFailureRatio")
  public BigDecimal getMaxFailureRatio() {
    return maxFailureRatio;
  }

  public void setMaxFailureRatio(BigDecimal maxFailureRatio) {
    this.maxFailureRatio = maxFailureRatio;
  }/**
   * The order of operations when rolling back a task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down. 
   **/
  public ServiceSpecRollbackConfig order(OrderEnum order) {
    this.order = order;
    return this;
  }

  

  
  @JsonProperty("Order")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
      var serviceSpecRollbackConfig = (ServiceSpecRollbackConfig) o;
    return Objects.equals(this.parallelism, serviceSpecRollbackConfig.parallelism) &&
        Objects.equals(this.delay, serviceSpecRollbackConfig.delay) &&
        Objects.equals(this.failureAction, serviceSpecRollbackConfig.failureAction) &&
        Objects.equals(this.monitor, serviceSpecRollbackConfig.monitor) &&
        Objects.equals(this.maxFailureRatio, serviceSpecRollbackConfig.maxFailureRatio) &&
        Objects.equals(this.order, serviceSpecRollbackConfig.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parallelism, delay, failureAction, monitor, maxFailureRatio, order);
  }

  @Override
  public String toString() {

      return "class ServiceSpecRollbackConfig {\n" +
                          "    parallelism: " + toIndentedString(parallelism) + "\n" +
                          "    delay: " + toIndentedString(delay) + "\n" +
                          "    failureAction: " + toIndentedString(failureAction) + "\n" +
                          "    monitor: " + toIndentedString(monitor) + "\n" +
                          "    maxFailureRatio: " + toIndentedString(maxFailureRatio) + "\n" +
                          "    order: " + toIndentedString(order) + "\n" +
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


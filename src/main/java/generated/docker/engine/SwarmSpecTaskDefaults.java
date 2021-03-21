package generated.docker.engine;

import generated.docker.engine.SwarmSpecTaskDefaultsLogDriver;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defaults for creating tasks in this cluster.
 **/

public class SwarmSpecTaskDefaults   {
  
  private SwarmSpecTaskDefaultsLogDriver logDriver;

  /**
   **/
  public SwarmSpecTaskDefaults logDriver(SwarmSpecTaskDefaultsLogDriver logDriver) {
    this.logDriver = logDriver;
    return this;
  }

  

  
  @JsonProperty("LogDriver")
  public SwarmSpecTaskDefaultsLogDriver getLogDriver() {
    return logDriver;
  }

  public void setLogDriver(SwarmSpecTaskDefaultsLogDriver logDriver) {
    this.logDriver = logDriver;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmSpecTaskDefaults = (SwarmSpecTaskDefaults) o;
    return Objects.equals(this.logDriver, swarmSpecTaskDefaults.logDriver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDriver);
  }

  @Override
  public String toString() {

    return "class SwarmSpecTaskDefaults {\n" +
                          "    logDriver: " + toIndentedString(logDriver) + "\n" +
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


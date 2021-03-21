package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dispatcher configuration.
 **/

public class SwarmSpecDispatcher   {
  
  private Long heartbeatPeriod;

  /**
   * The delay for an agent to send a heartbeat to the dispatcher. 
   **/
  public SwarmSpecDispatcher heartbeatPeriod(Long heartbeatPeriod) {
    this.heartbeatPeriod = heartbeatPeriod;
    return this;
  }

  

  
  @JsonProperty("HeartbeatPeriod")
  public Long getHeartbeatPeriod() {
    return heartbeatPeriod;
  }

  public void setHeartbeatPeriod(Long heartbeatPeriod) {
    this.heartbeatPeriod = heartbeatPeriod;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmSpecDispatcher = (SwarmSpecDispatcher) o;
    return Objects.equals(this.heartbeatPeriod, swarmSpecDispatcher.heartbeatPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartbeatPeriod);
  }

  @Override
  public String toString() {

    return "class SwarmSpecDispatcher {\n" +
                          "    heartbeatPeriod: " + toIndentedString(heartbeatPeriod) + "\n" +
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


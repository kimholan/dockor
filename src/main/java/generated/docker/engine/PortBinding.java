package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortBinding represents a binding between a host IP address and a host port. 
 **/

public class PortBinding   {
  
  private String hostIp;
  private String hostPort;

  /**
   * Host IP address that the container&#39;s port is mapped to.
   **/
  public PortBinding hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

  

  
  @JsonProperty("HostIp")
  public String getHostIp() {
    return hostIp;
  }

  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }/**
   * Host port number that the container&#39;s port is mapped to.
   **/
  public PortBinding hostPort(String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  

  
  @JsonProperty("HostPort")
  public String getHostPort() {
    return hostPort;
  }

  public void setHostPort(String hostPort) {
    this.hostPort = hostPort;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var portBinding = (PortBinding) o;
    return Objects.equals(this.hostIp, portBinding.hostIp) &&
        Objects.equals(this.hostPort, portBinding.hostPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostIp, hostPort);
  }

  @Override
  public String toString() {

    return "class PortBinding {\n" +
                          "    hostIp: " + toIndentedString(hostIp) + "\n" +
                          "    hostPort: " + toIndentedString(hostPort) + "\n" +
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


package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceEndpointVirtualIPs   {
  
  private String networkID;
  private String addr;

  /**
   **/
  public ServiceEndpointVirtualIPs networkID(String networkID) {
    this.networkID = networkID;
    return this;
  }

  

  
  @JsonProperty("NetworkID")
  public String getNetworkID() {
    return networkID;
  }

  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }/**
   **/
  public ServiceEndpointVirtualIPs addr(String addr) {
    this.addr = addr;
    return this;
  }

  

  
  @JsonProperty("Addr")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceEndpointVirtualIPs = (ServiceEndpointVirtualIPs) o;
    return Objects.equals(this.networkID, serviceEndpointVirtualIPs.networkID) &&
        Objects.equals(this.addr, serviceEndpointVirtualIPs.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkID, addr);
  }

  @Override
  public String toString() {

    return "class ServiceEndpointVirtualIPs {\n" +
                          "    networkID: " + toIndentedString(networkID) + "\n" +
                          "    addr: " + toIndentedString(addr) + "\n" +
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


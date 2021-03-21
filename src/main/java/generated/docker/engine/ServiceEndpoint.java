package generated.docker.engine;

import generated.docker.engine.EndpointPortConfig;
import generated.docker.engine.EndpointSpec;
import generated.docker.engine.ServiceEndpointVirtualIPs;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceEndpoint   {
  
  private EndpointSpec spec;
  private List<EndpointPortConfig> ports = new ArrayList<>();
  private List<ServiceEndpointVirtualIPs> virtualIPs = new ArrayList<>();

  /**
   **/
  public ServiceEndpoint spec(EndpointSpec spec) {
    this.spec = spec;
    return this;
  }

  

  
  @JsonProperty("Spec")
  public EndpointSpec getSpec() {
    return spec;
  }

  public void setSpec(EndpointSpec spec) {
    this.spec = spec;
  }/**
   **/
  public ServiceEndpoint ports(List<EndpointPortConfig> ports) {
    this.ports = ports;
    return this;
  }

  

  
  @JsonProperty("Ports")
  public List<EndpointPortConfig> getPorts() {
    return ports;
  }

  public void setPorts(List<EndpointPortConfig> ports) {
    this.ports = ports;
  }/**
   **/
  public ServiceEndpoint virtualIPs(List<ServiceEndpointVirtualIPs> virtualIPs) {
    this.virtualIPs = virtualIPs;
    return this;
  }

  

  
  @JsonProperty("VirtualIPs")
  public List<ServiceEndpointVirtualIPs> getVirtualIPs() {
    return virtualIPs;
  }

  public void setVirtualIPs(List<ServiceEndpointVirtualIPs> virtualIPs) {
    this.virtualIPs = virtualIPs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceEndpoint = (ServiceEndpoint) o;
    return Objects.equals(this.spec, serviceEndpoint.spec) &&
        Objects.equals(this.ports, serviceEndpoint.ports) &&
        Objects.equals(this.virtualIPs, serviceEndpoint.virtualIPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec, ports, virtualIPs);
  }

  @Override
  public String toString() {

    return "class ServiceEndpoint {\n" +
                          "    spec: " + toIndentedString(spec) + "\n" +
                          "    ports: " + toIndentedString(ports) + "\n" +
                          "    virtualIPs: " + toIndentedString(virtualIPs) + "\n" +
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


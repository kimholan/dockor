package generated.docker.engine;

import generated.docker.engine.PluginDevice;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginConfigLinux   {
  
  private List<String> capabilities = new ArrayList<>();
  private Boolean allowAllDevices;
  private List<PluginDevice> devices = new ArrayList<>();

  /**
   **/
  public PluginConfigLinux capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  

  
  @JsonProperty("Capabilities")
  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }/**
   **/
  public PluginConfigLinux allowAllDevices(Boolean allowAllDevices) {
    this.allowAllDevices = allowAllDevices;
    return this;
  }

  

  
  @JsonProperty("AllowAllDevices")
  public Boolean getAllowAllDevices() {
    return allowAllDevices;
  }

  public void setAllowAllDevices(Boolean allowAllDevices) {
    this.allowAllDevices = allowAllDevices;
  }/**
   **/
  public PluginConfigLinux devices(List<PluginDevice> devices) {
    this.devices = devices;
    return this;
  }

  

  
  @JsonProperty("Devices")
  public List<PluginDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<PluginDevice> devices) {
    this.devices = devices;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginConfigLinux = (PluginConfigLinux) o;
    return Objects.equals(this.capabilities, pluginConfigLinux.capabilities) &&
        Objects.equals(this.allowAllDevices, pluginConfigLinux.allowAllDevices) &&
        Objects.equals(this.devices, pluginConfigLinux.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, allowAllDevices, devices);
  }

  @Override
  public String toString() {

    return "class PluginConfigLinux {\n" +
                          "    capabilities: " + toIndentedString(capabilities) + "\n" +
                          "    allowAllDevices: " + toIndentedString(allowAllDevices) + "\n" +
                          "    devices: " + toIndentedString(devices) + "\n" +
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


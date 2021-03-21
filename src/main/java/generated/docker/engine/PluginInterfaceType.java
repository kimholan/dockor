package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginInterfaceType   {
  
  private String prefix;
  private String capability;
  private String version;

  /**
   **/
  public PluginInterfaceType prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  

  
  @JsonProperty("Prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }/**
   **/
  public PluginInterfaceType capability(String capability) {
    this.capability = capability;
    return this;
  }

  

  
  @JsonProperty("Capability")
  public String getCapability() {
    return capability;
  }

  public void setCapability(String capability) {
    this.capability = capability;
  }/**
   **/
  public PluginInterfaceType version(String version) {
    this.version = version;
    return this;
  }

  

  
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginInterfaceType = (PluginInterfaceType) o;
    return Objects.equals(this.prefix, pluginInterfaceType.prefix) &&
        Objects.equals(this.capability, pluginInterfaceType.capability) &&
        Objects.equals(this.version, pluginInterfaceType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, capability, version);
  }

  @Override
  public String toString() {

    return "class PluginInterfaceType {\n" +
                          "    prefix: " + toIndentedString(prefix) + "\n" +
                          "    capability: " + toIndentedString(capability) + "\n" +
                          "    version: " + toIndentedString(version) + "\n" +
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


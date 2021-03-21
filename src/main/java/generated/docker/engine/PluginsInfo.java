package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available plugins per type.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: Only unmanaged (V1) plugins are included in this list. &gt; V1 plugins are \&quot;lazily\&quot; loaded, and are not returned in this list &gt; if there is no resource using the plugin. 
 **/

public class PluginsInfo   {
  
  private List<String> volume = new ArrayList<>();
  private List<String> network = new ArrayList<>();
  private List<String> authorization = new ArrayList<>();
  private List<String> log = new ArrayList<>();

  /**
   * Names of available volume-drivers, and network-driver plugins.
   **/
  public PluginsInfo volume(List<String> volume) {
    this.volume = volume;
    return this;
  }

  

  
  @JsonProperty("Volume")
  public List<String> getVolume() {
    return volume;
  }

  public void setVolume(List<String> volume) {
    this.volume = volume;
  }/**
   * Names of available network-drivers, and network-driver plugins.
   **/
  public PluginsInfo network(List<String> network) {
    this.network = network;
    return this;
  }

  

  
  @JsonProperty("Network")
  public List<String> getNetwork() {
    return network;
  }

  public void setNetwork(List<String> network) {
    this.network = network;
  }/**
   * Names of available authorization plugins.
   **/
  public PluginsInfo authorization(List<String> authorization) {
    this.authorization = authorization;
    return this;
  }

  

  
  @JsonProperty("Authorization")
  public List<String> getAuthorization() {
    return authorization;
  }

  public void setAuthorization(List<String> authorization) {
    this.authorization = authorization;
  }/**
   * Names of available logging-drivers, and logging-driver plugins.
   **/
  public PluginsInfo log(List<String> log) {
    this.log = log;
    return this;
  }

  

  
  @JsonProperty("Log")
  public List<String> getLog() {
    return log;
  }

  public void setLog(List<String> log) {
    this.log = log;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginsInfo = (PluginsInfo) o;
    return Objects.equals(this.volume, pluginsInfo.volume) &&
        Objects.equals(this.network, pluginsInfo.network) &&
        Objects.equals(this.authorization, pluginsInfo.authorization) &&
        Objects.equals(this.log, pluginsInfo.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, network, authorization, log);
  }

  @Override
  public String toString() {

    return "class PluginsInfo {\n" +
                          "    volume: " + toIndentedString(volume) + "\n" +
                          "    network: " + toIndentedString(network) + "\n" +
                          "    authorization: " + toIndentedString(authorization) + "\n" +
                          "    log: " + toIndentedString(log) + "\n" +
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


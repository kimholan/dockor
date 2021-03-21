package generated.docker.engine;

import generated.docker.engine.PluginDevice;
import generated.docker.engine.PluginMount;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings that can be modified by users.
 **/

public class PluginSettings   {
  
  private List<PluginMount> mounts = new ArrayList<>();
  private List<String> env = new ArrayList<>();
  private List<String> args = new ArrayList<>();
  private List<PluginDevice> devices = new ArrayList<>();

  /**
   **/
  public PluginSettings mounts(List<PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  

  
  @JsonProperty("Mounts")
  public List<PluginMount> getMounts() {
    return mounts;
  }

  public void setMounts(List<PluginMount> mounts) {
    this.mounts = mounts;
  }/**
   **/
  public PluginSettings env(List<String> env) {
    this.env = env;
    return this;
  }

  

  
  @JsonProperty("Env")
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }/**
   **/
  public PluginSettings args(List<String> args) {
    this.args = args;
    return this;
  }

  

  
  @JsonProperty("Args")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }/**
   **/
  public PluginSettings devices(List<PluginDevice> devices) {
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
    var pluginSettings = (PluginSettings) o;
    return Objects.equals(this.mounts, pluginSettings.mounts) &&
        Objects.equals(this.env, pluginSettings.env) &&
        Objects.equals(this.args, pluginSettings.args) &&
        Objects.equals(this.devices, pluginSettings.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mounts, env, args, devices);
  }

  @Override
  public String toString() {

    return "class PluginSettings {\n" +
                          "    mounts: " + toIndentedString(mounts) + "\n" +
                          "    env: " + toIndentedString(env) + "\n" +
                          "    args: " + toIndentedString(args) + "\n" +
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


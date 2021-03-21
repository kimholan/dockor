package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginDevice   {
  
  private String name;
  private String description;
  private List<String> settable = new ArrayList<>();
  private String path;

  /**
   **/
  public PluginDevice name(String name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }/**
   **/
  public PluginDevice description(String description) {
    this.description = description;
    return this;
  }

  

  
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }/**
   **/
  public PluginDevice settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  

  
  @JsonProperty("Settable")
  public List<String> getSettable() {
    return settable;
  }

  public void setSettable(List<String> settable) {
    this.settable = settable;
  }/**
   **/
  public PluginDevice path(String path) {
    this.path = path;
    return this;
  }

  

  
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginDevice = (PluginDevice) o;
    return Objects.equals(this.name, pluginDevice.name) &&
        Objects.equals(this.description, pluginDevice.description) &&
        Objects.equals(this.settable, pluginDevice.settable) &&
        Objects.equals(this.path, pluginDevice.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, settable, path);
  }

  @Override
  public String toString() {

    return "class PluginDevice {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    description: " + toIndentedString(description) + "\n" +
                          "    settable: " + toIndentedString(settable) + "\n" +
                          "    path: " + toIndentedString(path) + "\n" +
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


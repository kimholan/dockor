package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginMount   {
  
  private String name;
  private String description;
  private List<String> settable = new ArrayList<>();
  private String source;
  private String destination;
  private String type;
  private List<String> options = new ArrayList<>();

  /**
   **/
  public PluginMount name(String name) {
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
  public PluginMount description(String description) {
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
  public PluginMount settable(List<String> settable) {
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
  public PluginMount source(String source) {
    this.source = source;
    return this;
  }

  

  
  @JsonProperty("Source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }/**
   **/
  public PluginMount destination(String destination) {
    this.destination = destination;
    return this;
  }

  

  
  @JsonProperty("Destination")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }/**
   **/
  public PluginMount type(String type) {
    this.type = type;
    return this;
  }

  

  
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }/**
   **/
  public PluginMount options(List<String> options) {
    this.options = options;
    return this;
  }

  

  
  @JsonProperty("Options")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginMount = (PluginMount) o;
    return Objects.equals(this.name, pluginMount.name) &&
        Objects.equals(this.description, pluginMount.description) &&
        Objects.equals(this.settable, pluginMount.settable) &&
        Objects.equals(this.source, pluginMount.source) &&
        Objects.equals(this.destination, pluginMount.destination) &&
        Objects.equals(this.type, pluginMount.type) &&
        Objects.equals(this.options, pluginMount.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, settable, source, destination, type, options);
  }

  @Override
  public String toString() {

    return "class PluginMount {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    description: " + toIndentedString(description) + "\n" +
                          "    settable: " + toIndentedString(settable) + "\n" +
                          "    source: " + toIndentedString(source) + "\n" +
                          "    destination: " + toIndentedString(destination) + "\n" +
                          "    type: " + toIndentedString(type) + "\n" +
                          "    options: " + toIndentedString(options) + "\n" +
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


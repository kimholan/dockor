package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a permission the user has to accept upon installing the plugin. 
 **/

public class PluginPrivilegeItem   {
  
  private String name;
  private String description;
  private List<String> value = new ArrayList<>();

  /**
   **/
  public PluginPrivilegeItem name(String name) {
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
  public PluginPrivilegeItem description(String description) {
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
  public PluginPrivilegeItem value(List<String> value) {
    this.value = value;
    return this;
  }

  

  
  @JsonProperty("Value")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginPrivilegeItem = (PluginPrivilegeItem) o;
    return Objects.equals(this.name, pluginPrivilegeItem.name) &&
        Objects.equals(this.description, pluginPrivilegeItem.description) &&
        Objects.equals(this.value, pluginPrivilegeItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, value);
  }

  @Override
  public String toString() {

    return "class PluginPrivilegeItem {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    description: " + toIndentedString(description) + "\n" +
                          "    value: " + toIndentedString(value) + "\n" +
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


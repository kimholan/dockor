package generated.docker.engine;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the log driver to use for tasks created from this spec. If not present, the default one for the swarm will be used, finally falling back to the generated.docker.engine default if not specified.
 **/

public class TaskSpecLogDriver   {
  
  private String name;
  private Map<String, String> options = new HashMap<>();

  /**
   **/
  public TaskSpecLogDriver name(String name) {
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
  public TaskSpecLogDriver options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  

  
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
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
    var taskSpecLogDriver = (TaskSpecLogDriver) o;
    return Objects.equals(this.name, taskSpecLogDriver.name) &&
        Objects.equals(this.options, taskSpecLogDriver.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {

    return "class TaskSpecLogDriver {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
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


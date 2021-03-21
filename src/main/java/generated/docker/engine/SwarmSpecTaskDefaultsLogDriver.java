package generated.docker.engine;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The log driver to use for tasks created in the orchestrator if unspecified by a service.  Updating this value only affects new tasks. Existing tasks continue to use their previously configured log driver until recreated. 
 **/

public class SwarmSpecTaskDefaultsLogDriver   {
  
  private String name;
  private Map<String, String> options = new HashMap<>();

  /**
   * The log driver to use as a default for new tasks. 
   **/
  public SwarmSpecTaskDefaultsLogDriver name(String name) {
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
   * Driver-specific options for the selectd log driver, specified as key/value pairs. 
   **/
  public SwarmSpecTaskDefaultsLogDriver options(Map<String, String> options) {
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
    var swarmSpecTaskDefaultsLogDriver = (SwarmSpecTaskDefaultsLogDriver) o;
    return Objects.equals(this.name, swarmSpecTaskDefaultsLogDriver.name) &&
        Objects.equals(this.options, swarmSpecTaskDefaultsLogDriver.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {

    return "class SwarmSpecTaskDefaultsLogDriver {\n" +
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


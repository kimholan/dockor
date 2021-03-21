package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemVersionComponents   {
  
  private String name;
  private String version;
  private Object details;

  /**
   * Name of the component 
   **/
  public SystemVersionComponents name(String name) {
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
   * Version of the component 
   **/
  public SystemVersionComponents version(String version) {
    this.version = version;
    return this;
  }

  

  
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }/**
   * Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user. 
   **/
  public SystemVersionComponents details(Object details) {
    this.details = details;
    return this;
  }

  

  
  @JsonProperty("Details")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemVersionComponents = (SystemVersionComponents) o;
    return Objects.equals(this.name, systemVersionComponents.name) &&
        Objects.equals(this.version, systemVersionComponents.version) &&
        Objects.equals(this.details, systemVersionComponents.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, details);
  }

  @Override
  public String toString() {

    return "class SystemVersionComponents {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    version: " + toIndentedString(version) + "\n" +
                          "    details: " + toIndentedString(details) + "\n" +
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


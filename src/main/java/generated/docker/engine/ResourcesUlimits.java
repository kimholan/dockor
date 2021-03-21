package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourcesUlimits   {
  
  private String name;
  private Integer soft;
  private Integer hard;

  /**
   * Name of ulimit
   **/
  public ResourcesUlimits name(String name) {
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
   * Soft limit
   **/
  public ResourcesUlimits soft(Integer soft) {
    this.soft = soft;
    return this;
  }

  

  
  @JsonProperty("Soft")
  public Integer getSoft() {
    return soft;
  }

  public void setSoft(Integer soft) {
    this.soft = soft;
  }/**
   * Hard limit
   **/
  public ResourcesUlimits hard(Integer hard) {
    this.hard = hard;
    return this;
  }

  

  
  @JsonProperty("Hard")
  public Integer getHard() {
    return hard;
  }

  public void setHard(Integer hard) {
    this.hard = hard;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var resourcesUlimits = (ResourcesUlimits) o;
    return Objects.equals(this.name, resourcesUlimits.name) &&
        Objects.equals(this.soft, resourcesUlimits.soft) &&
        Objects.equals(this.hard, resourcesUlimits.hard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soft, hard);
  }

  @Override
  public String toString() {

    return "class ResourcesUlimits {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    soft: " + toIndentedString(soft) + "\n" +
                          "    hard: " + toIndentedString(hard) + "\n" +
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


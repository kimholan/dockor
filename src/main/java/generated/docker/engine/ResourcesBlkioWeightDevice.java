package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourcesBlkioWeightDevice   {
  
  private String path;
  private Integer weight;

  /**
   **/
  public ResourcesBlkioWeightDevice path(String path) {
    this.path = path;
    return this;
  }

  

  
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }/**
   * minimum: 0
   **/
  public ResourcesBlkioWeightDevice weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  

  
  @JsonProperty("Weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var resourcesBlkioWeightDevice = (ResourcesBlkioWeightDevice) o;
    return Objects.equals(this.path, resourcesBlkioWeightDevice.path) &&
        Objects.equals(this.weight, resourcesBlkioWeightDevice.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, weight);
  }

  @Override
  public String toString() {

    return "class ResourcesBlkioWeightDevice {\n" +
                          "    path: " + toIndentedString(path) + "\n" +
                          "    weight: " + toIndentedString(weight) + "\n" +
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


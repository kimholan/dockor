package generated.docker.engine;

import generated.docker.engine.GenericResources;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing the resources which can be advertised by a node and requested by a task. 
 **/

public class ResourceObject   {
  
  private Long nanoCPUs;
  private Long memoryBytes;
  private GenericResources genericResources = new GenericResources();

  /**
   **/
  public ResourceObject nanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
    return this;
  }

  

  
  @JsonProperty("NanoCPUs")
  public Long getNanoCPUs() {
    return nanoCPUs;
  }

  public void setNanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
  }/**
   **/
  public ResourceObject memoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
    return this;
  }

  

  
  @JsonProperty("MemoryBytes")
  public Long getMemoryBytes() {
    return memoryBytes;
  }

  public void setMemoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
  }/**
   **/
  public ResourceObject genericResources(GenericResources genericResources) {
    this.genericResources = genericResources;
    return this;
  }

  

  
  @JsonProperty("GenericResources")
  public GenericResources getGenericResources() {
    return genericResources;
  }

  public void setGenericResources(GenericResources genericResources) {
    this.genericResources = genericResources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var resourceObject = (ResourceObject) o;
    return Objects.equals(this.nanoCPUs, resourceObject.nanoCPUs) &&
        Objects.equals(this.memoryBytes, resourceObject.memoryBytes) &&
        Objects.equals(this.genericResources, resourceObject.genericResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanoCPUs, memoryBytes, genericResources);
  }

  @Override
  public String toString() {

    return "class ResourceObject {\n" +
                          "    nanoCPUs: " + toIndentedString(nanoCPUs) + "\n" +
                          "    memoryBytes: " + toIndentedString(memoryBytes) + "\n" +
                          "    genericResources: " + toIndentedString(genericResources) + "\n" +
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


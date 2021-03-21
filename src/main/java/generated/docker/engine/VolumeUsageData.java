package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Usage details about the volume. This information is used by the &#x60;GET /system/df&#x60; endpoint, and omitted in other endpoints. 
 **/

public class VolumeUsageData   {
  
  private Integer size;
  private Integer refCount;

  /**
   * Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the &#x60;\&quot;local\&quot;&#x60; volume driver. For volumes created with other volume drivers, this field is set to &#x60;-1&#x60; (\&quot;not available\&quot;) 
   **/
  public VolumeUsageData size(Integer size) {
    this.size = size;
    return this;
  }

  

  
  @JsonProperty("Size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }/**
   * The number of containers referencing this volume. This field is set to &#x60;-1&#x60; if the reference-count is not available. 
   **/
  public VolumeUsageData refCount(Integer refCount) {
    this.refCount = refCount;
    return this;
  }

  

  
  @JsonProperty("RefCount")
  public Integer getRefCount() {
    return refCount;
  }

  public void setRefCount(Integer refCount) {
    this.refCount = refCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var volumeUsageData = (VolumeUsageData) o;
    return Objects.equals(this.size, volumeUsageData.size) &&
        Objects.equals(this.refCount, volumeUsageData.refCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, refCount);
  }

  @Override
  public String toString() {

    return "class VolumeUsageData {\n" +
                          "    size: " + toIndentedString(size) + "\n" +
                          "    refCount: " + toIndentedString(refCount) + "\n" +
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


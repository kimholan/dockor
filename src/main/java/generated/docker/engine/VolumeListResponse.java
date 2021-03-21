package generated.docker.engine;

import generated.docker.engine.Volume;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume list response
 **/

public class VolumeListResponse   {
  
  private List<Volume> volumes = new ArrayList<>();
  private List<String> warnings = new ArrayList<>();

  /**
   * List of volumes
   **/
  public VolumeListResponse volumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  

  
  @JsonProperty("Volumes")
  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }/**
   * Warnings that occurred when fetching the list of volumes. 
   **/
  public VolumeListResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  

  
  @JsonProperty("Warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var volumeListResponse = (VolumeListResponse) o;
    return Objects.equals(this.volumes, volumeListResponse.volumes) &&
        Objects.equals(this.warnings, volumeListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumes, warnings);
  }

  @Override
  public String toString() {

    return "class VolumeListResponse {\n" +
                          "    volumes: " + toIndentedString(volumes) + "\n" +
                          "    warnings: " + toIndentedString(warnings) + "\n" +
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


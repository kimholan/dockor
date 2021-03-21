package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VolumePruneResponse   {
  
  private List<String> volumesDeleted = new ArrayList<>();
  private Long spaceReclaimed;

  /**
   * Volumes that were deleted
   **/
  public VolumePruneResponse volumesDeleted(List<String> volumesDeleted) {
    this.volumesDeleted = volumesDeleted;
    return this;
  }

  

  
  @JsonProperty("VolumesDeleted")
  public List<String> getVolumesDeleted() {
    return volumesDeleted;
  }

  public void setVolumesDeleted(List<String> volumesDeleted) {
    this.volumesDeleted = volumesDeleted;
  }/**
   * Disk space reclaimed in bytes
   **/
  public VolumePruneResponse spaceReclaimed(Long spaceReclaimed) {
    this.spaceReclaimed = spaceReclaimed;
    return this;
  }

  

  
  @JsonProperty("SpaceReclaimed")
  public Long getSpaceReclaimed() {
    return spaceReclaimed;
  }

  public void setSpaceReclaimed(Long spaceReclaimed) {
    this.spaceReclaimed = spaceReclaimed;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var volumePruneResponse = (VolumePruneResponse) o;
    return Objects.equals(this.volumesDeleted, volumePruneResponse.volumesDeleted) &&
        Objects.equals(this.spaceReclaimed, volumePruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {

    return "class VolumePruneResponse {\n" +
                          "    volumesDeleted: " + toIndentedString(volumesDeleted) + "\n" +
                          "    spaceReclaimed: " + toIndentedString(spaceReclaimed) + "\n" +
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


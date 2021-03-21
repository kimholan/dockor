package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * File represents a specific target that is backed by a file.  &lt;p&gt;&lt;br /&gt;&lt;p&gt;  &gt; **Note**: &#x60;Configs.File&#x60; and &#x60;Configs.Runtime&#x60; are mutually exclusive 
 **/

public class TaskSpecContainerSpecFile1   {
  
  private String name;
  private String UID;
  private String GID;
  private Integer mode;

  /**
   * Name represents the final filename in the filesystem. 
   **/
  public TaskSpecContainerSpecFile1 name(String name) {
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
   * UID represents the file UID.
   **/
  public TaskSpecContainerSpecFile1 UID(String UID) {
    this.UID = UID;
    return this;
  }

  

  
  @JsonProperty("UID")
  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }/**
   * GID represents the file GID.
   **/
  public TaskSpecContainerSpecFile1 GID(String GID) {
    this.GID = GID;
    return this;
  }

  

  
  @JsonProperty("GID")
  public String getGID() {
    return GID;
  }

  public void setGID(String GID) {
    this.GID = GID;
  }/**
   * Mode represents the FileMode of the file.
   **/
  public TaskSpecContainerSpecFile1 mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  

  
  @JsonProperty("Mode")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecFile1 = (TaskSpecContainerSpecFile1) o;
    return Objects.equals(this.name, taskSpecContainerSpecFile1.name) &&
        Objects.equals(this.UID, taskSpecContainerSpecFile1.UID) &&
        Objects.equals(this.GID, taskSpecContainerSpecFile1.GID) &&
        Objects.equals(this.mode, taskSpecContainerSpecFile1.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, UID, GID, mode);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecFile1 {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    UID: " + toIndentedString(UID) + "\n" +
                          "    GID: " + toIndentedString(GID) + "\n" +
                          "    mode: " + toIndentedString(mode) + "\n" +
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


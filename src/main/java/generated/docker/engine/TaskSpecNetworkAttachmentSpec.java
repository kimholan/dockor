package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Read-only spec type for non-swarm containers attached to swarm overlay networks.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 **/

public class TaskSpecNetworkAttachmentSpec   {
  
  private String containerID;

  /**
   * ID of the container represented by this task
   **/
  public TaskSpecNetworkAttachmentSpec containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  

  
  @JsonProperty("ContainerID")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecNetworkAttachmentSpec = (TaskSpecNetworkAttachmentSpec) o;
    return Objects.equals(this.containerID, taskSpecNetworkAttachmentSpec.containerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID);
  }

  @Override
  public String toString() {

    return "class TaskSpecNetworkAttachmentSpec {\n" +
                          "    containerID: " + toIndentedString(containerID) + "\n" +
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


package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskSpecPlacementSpread   {
  
  private String spreadDescriptor;

  /**
   * label descriptor, such as &#x60;generated.docker.engine.labels.az&#x60;.
   **/
  public TaskSpecPlacementSpread spreadDescriptor(String spreadDescriptor) {
    this.spreadDescriptor = spreadDescriptor;
    return this;
  }

  

  
  @JsonProperty("SpreadDescriptor")
  public String getSpreadDescriptor() {
    return spreadDescriptor;
  }

  public void setSpreadDescriptor(String spreadDescriptor) {
    this.spreadDescriptor = spreadDescriptor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecPlacementSpread = (TaskSpecPlacementSpread) o;
    return Objects.equals(this.spreadDescriptor, taskSpecPlacementSpread.spreadDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spreadDescriptor);
  }

  @Override
  public String toString() {

    return "class TaskSpecPlacementSpread {\n" +
                          "    spreadDescriptor: " + toIndentedString(spreadDescriptor) + "\n" +
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


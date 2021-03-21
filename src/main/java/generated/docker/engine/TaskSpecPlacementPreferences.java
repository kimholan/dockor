package generated.docker.engine;

import generated.docker.engine.TaskSpecPlacementSpread;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskSpecPlacementPreferences   {
  
  private TaskSpecPlacementSpread spread;

  /**
   **/
  public TaskSpecPlacementPreferences spread(TaskSpecPlacementSpread spread) {
    this.spread = spread;
    return this;
  }

  

  
  @JsonProperty("Spread")
  public TaskSpecPlacementSpread getSpread() {
    return spread;
  }

  public void setSpread(TaskSpecPlacementSpread spread) {
    this.spread = spread;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecPlacementPreferences = (TaskSpecPlacementPreferences) o;
    return Objects.equals(this.spread, taskSpecPlacementPreferences.spread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spread);
  }

  @Override
  public String toString() {

    return "class TaskSpecPlacementPreferences {\n" +
                          "    spread: " + toIndentedString(spread) + "\n" +
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


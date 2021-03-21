package generated.docker.engine;

import generated.docker.engine.Platform;
import generated.docker.engine.TaskSpecPlacementPreferences;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskSpecPlacement   {
  
  private List<String> constraints = new ArrayList<>();
  private List<TaskSpecPlacementPreferences> preferences = new ArrayList<>();
  private Long maxReplicas = 0l;
  private List<Platform> platforms = new ArrayList<>();

  /**
   * An array of constraint expressions to limit the set of nodes where a task can be scheduled. Constraint expressions can either use a _match_ (&#x60;&#x3D;&#x3D;&#x60;) or _exclude_ (&#x60;!&#x3D;&#x60;) rule. Multiple constraints find nodes that satisfy every expression (AND match). Constraints can match node or Docker Engine labels as follows:  node attribute       | matches                        | example ---------------------|--------------------------------|----------------------------------------------- &#x60;node.id&#x60;            | Node ID                        | &#x60;node.id&#x3D;&#x3D;2ivku8v2gvtg4&#x60; &#x60;node.hostname&#x60;      | Node hostname                  | &#x60;node.hostname!&#x3D;node-2&#x60; &#x60;node.role&#x60;          | Node role (&#x60;manager&#x60;/&#x60;worker&#x60;) | &#x60;node.role&#x3D;&#x3D;manager&#x60; &#x60;node.platform.os&#x60;   | Node operating system          | &#x60;node.platform.os&#x3D;&#x3D;windows&#x60; &#x60;node.platform.arch&#x60; | Node architecture              | &#x60;node.platform.arch&#x3D;&#x3D;x86_64&#x60; &#x60;node.labels&#x60;        | User-defined node labels       | &#x60;node.labels.security&#x3D;&#x3D;high&#x60; &#x60;generated.docker.engine.labels&#x60;      | Docker Engine&#39;s labels         | &#x60;generated.docker.engine.labels.operatingsystem&#x3D;&#x3D;ubuntu-14.04&#x60;  &#x60;generated.docker.engine.labels&#x60; apply to Docker Engine labels like operating system, drivers, etc. Swarm administrators add &#x60;node.labels&#x60; for operational purposes by using the [&#x60;node update endpoint&#x60;](#operation/NodeUpdate).
   **/
  public TaskSpecPlacement constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  

  
  @JsonProperty("Constraints")
  public List<String> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }/**
   * Preferences provide a way to make the scheduler aware of factors such as topology. They are provided in order from highest to lowest precedence. 
   **/
  public TaskSpecPlacement preferences(List<TaskSpecPlacementPreferences> preferences) {
    this.preferences = preferences;
    return this;
  }

  

  
  @JsonProperty("Preferences")
  public List<TaskSpecPlacementPreferences> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<TaskSpecPlacementPreferences> preferences) {
    this.preferences = preferences;
  }/**
   * Maximum number of replicas for per node (default value is 0, which is unlimited) 
   **/
  public TaskSpecPlacement maxReplicas(Long maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

  

  
  @JsonProperty("MaxReplicas")
  public Long getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Long maxReplicas) {
    this.maxReplicas = maxReplicas;
  }/**
   * Platforms stores all the platforms that the service&#39;s image can run on. This field is used in the platform filter for scheduling. If empty, then the platform filter is off, meaning there are no scheduling restrictions. 
   **/
  public TaskSpecPlacement platforms(List<Platform> platforms) {
    this.platforms = platforms;
    return this;
  }

  

  
  @JsonProperty("Platforms")
  public List<Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<Platform> platforms) {
    this.platforms = platforms;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecPlacement = (TaskSpecPlacement) o;
    return Objects.equals(this.constraints, taskSpecPlacement.constraints) &&
        Objects.equals(this.preferences, taskSpecPlacement.preferences) &&
        Objects.equals(this.maxReplicas, taskSpecPlacement.maxReplicas) &&
        Objects.equals(this.platforms, taskSpecPlacement.platforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, preferences, maxReplicas, platforms);
  }

  @Override
  public String toString() {

    return "class TaskSpecPlacement {\n" +
                          "    constraints: " + toIndentedString(constraints) + "\n" +
                          "    preferences: " + toIndentedString(preferences) + "\n" +
                          "    maxReplicas: " + toIndentedString(maxReplicas) + "\n" +
                          "    platforms: " + toIndentedString(platforms) + "\n" +
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


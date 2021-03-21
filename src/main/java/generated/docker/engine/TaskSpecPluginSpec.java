package generated.docker.engine;

import generated.docker.engine.InlineObject;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Plugin spec for the service.  *(Experimental release only.)*  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 **/

public class TaskSpecPluginSpec   {
  
  private String name;
  private String remote;
  private Boolean disabled;
  private List<InlineObject> pluginPrivilege = new ArrayList<>();

  /**
   * The name or &#39;alias&#39; to use for the plugin.
   **/
  public TaskSpecPluginSpec name(String name) {
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
   * The plugin image reference to use.
   **/
  public TaskSpecPluginSpec remote(String remote) {
    this.remote = remote;
    return this;
  }

  

  
  @JsonProperty("Remote")
  public String getRemote() {
    return remote;
  }

  public void setRemote(String remote) {
    this.remote = remote;
  }/**
   * Disable the plugin once scheduled.
   **/
  public TaskSpecPluginSpec disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  

  
  @JsonProperty("Disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }/**
   **/
  public TaskSpecPluginSpec pluginPrivilege(List<InlineObject> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
    return this;
  }

  

  
  @JsonProperty("PluginPrivilege")
  public List<InlineObject> getPluginPrivilege() {
    return pluginPrivilege;
  }

  public void setPluginPrivilege(List<InlineObject> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecPluginSpec = (TaskSpecPluginSpec) o;
    return Objects.equals(this.name, taskSpecPluginSpec.name) &&
        Objects.equals(this.remote, taskSpecPluginSpec.remote) &&
        Objects.equals(this.disabled, taskSpecPluginSpec.disabled) &&
        Objects.equals(this.pluginPrivilege, taskSpecPluginSpec.pluginPrivilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, remote, disabled, pluginPrivilege);
  }

  @Override
  public String toString() {

    return "class TaskSpecPluginSpec {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    remote: " + toIndentedString(remote) + "\n" +
                          "    disabled: " + toIndentedString(disabled) + "\n" +
                          "    pluginPrivilege: " + toIndentedString(pluginPrivilege) + "\n" +
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


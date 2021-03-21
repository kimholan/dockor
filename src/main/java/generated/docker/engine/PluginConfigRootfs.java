package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginConfigRootfs   {
  
  private String type;
  private List<String> diffIds = new ArrayList<>();

  /**
   **/
  public PluginConfigRootfs type(String type) {
    this.type = type;
    return this;
  }

  

  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }/**
   **/
  public PluginConfigRootfs diffIds(List<String> diffIds) {
    this.diffIds = diffIds;
    return this;
  }

  

  
  @JsonProperty("diff_ids")
  public List<String> getDiffIds() {
    return diffIds;
  }

  public void setDiffIds(List<String> diffIds) {
    this.diffIds = diffIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginConfigRootfs = (PluginConfigRootfs) o;
    return Objects.equals(this.type, pluginConfigRootfs.type) &&
        Objects.equals(this.diffIds, pluginConfigRootfs.diffIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, diffIds);
  }

  @Override
  public String toString() {

    return "class PluginConfigRootfs {\n" +
                          "    type: " + toIndentedString(type) + "\n" +
                          "    diffIds: " + toIndentedString(diffIds) + "\n" +
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


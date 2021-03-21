package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginConfigNetwork   {
  
  private String type;

  /**
   **/
  public PluginConfigNetwork type(String type) {
    this.type = type;
    return this;
  }

  

  
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginConfigNetwork = (PluginConfigNetwork) o;
    return Objects.equals(this.type, pluginConfigNetwork.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {

    return "class PluginConfigNetwork {\n" +
                          "    type: " + toIndentedString(type) + "\n" +
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


package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginConfigUser   {
  
  private Integer UID;
  private Integer GID;

  /**
   **/
  public PluginConfigUser UID(Integer UID) {
    this.UID = UID;
    return this;
  }

  

  
  @JsonProperty("UID")
  public Integer getUID() {
    return UID;
  }

  public void setUID(Integer UID) {
    this.UID = UID;
  }/**
   **/
  public PluginConfigUser GID(Integer GID) {
    this.GID = GID;
    return this;
  }

  

  
  @JsonProperty("GID")
  public Integer getGID() {
    return GID;
  }

  public void setGID(Integer GID) {
    this.GID = GID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pluginConfigUser = (PluginConfigUser) o;
    return Objects.equals(this.UID, pluginConfigUser.UID) &&
        Objects.equals(this.GID, pluginConfigUser.GID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UID, GID);
  }

  @Override
  public String toString() {

    return "class PluginConfigUser {\n" +
                          "    UID: " + toIndentedString(UID) + "\n" +
                          "    GID: " + toIndentedString(GID) + "\n" +
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


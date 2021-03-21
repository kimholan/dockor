package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters related to encryption-at-rest.
 **/

public class SwarmSpecEncryptionConfig   {
  
  private Boolean autoLockManagers;

  /**
   * If set, generate a key and use it to lock data stored on the managers. 
   **/
  public SwarmSpecEncryptionConfig autoLockManagers(Boolean autoLockManagers) {
    this.autoLockManagers = autoLockManagers;
    return this;
  }

  

  
  @JsonProperty("AutoLockManagers")
  public Boolean getAutoLockManagers() {
    return autoLockManagers;
  }

  public void setAutoLockManagers(Boolean autoLockManagers) {
    this.autoLockManagers = autoLockManagers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmSpecEncryptionConfig = (SwarmSpecEncryptionConfig) o;
    return Objects.equals(this.autoLockManagers, swarmSpecEncryptionConfig.autoLockManagers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoLockManagers);
  }

  @Override
  public String toString() {

    return "class SwarmSpecEncryptionConfig {\n" +
                          "    autoLockManagers: " + toIndentedString(autoLockManagers) + "\n" +
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


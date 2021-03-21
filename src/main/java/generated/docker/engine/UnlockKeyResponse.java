package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UnlockKeyResponse   {
  
  private String unlockKey;

  /**
   * The swarm&#39;s unlock key.
   **/
  public UnlockKeyResponse unlockKey(String unlockKey) {
    this.unlockKey = unlockKey;
    return this;
  }

  

  
  @JsonProperty("UnlockKey")
  public String getUnlockKey() {
    return unlockKey;
  }

  public void setUnlockKey(String unlockKey) {
    this.unlockKey = unlockKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var unlockKeyResponse = (UnlockKeyResponse) o;
    return Objects.equals(this.unlockKey, unlockKeyResponse.unlockKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unlockKey);
  }

  @Override
  public String toString() {

    return "class UnlockKeyResponse {\n" +
                          "    unlockKey: " + toIndentedString(unlockKey) + "\n" +
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


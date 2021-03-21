package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The behavior to apply when the container exits. The default is not to restart.  An ever increasing delay (double the previous delay, starting at 100ms) is added before each restart to prevent flooding the server. 
 **/

public class RestartPolicy   {
  

public enum NameEnum {

    EMPTY(String.valueOf("")), ALWAYS(String.valueOf("always")), UNLESS_STOPPED(String.valueOf("unless-stopped")), ON_FAILURE(String.valueOf("on-failure"));


    private String value;

    NameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String value) {
        for (var b : NameEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private NameEnum name;
  private Integer maximumRetryCount;

  /**
   * - Empty string means not to restart - &#x60;always&#x60; Always restart - &#x60;unless-stopped&#x60; Restart always except when the user has manually stopped the container - &#x60;on-failure&#x60; Restart only when the container exit code is non-zero 
   **/
  public RestartPolicy name(NameEnum name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("Name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }/**
   * If &#x60;on-failure&#x60; is used, the number of times to retry before giving up. 
   **/
  public RestartPolicy maximumRetryCount(Integer maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
    return this;
  }

  

  
  @JsonProperty("MaximumRetryCount")
  public Integer getMaximumRetryCount() {
    return maximumRetryCount;
  }

  public void setMaximumRetryCount(Integer maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
      var restartPolicy = (RestartPolicy) o;
    return Objects.equals(this.name, restartPolicy.name) &&
        Objects.equals(this.maximumRetryCount, restartPolicy.maximumRetryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maximumRetryCount);
  }

  @Override
  public String toString() {

      return "class RestartPolicy {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    maximumRetryCount: " + toIndentedString(maximumRetryCount) + "\n" +
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


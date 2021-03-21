package generated.docker.engine;

import generated.docker.engine.JoinTokens;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SwarmAllOf   {
  
  private JoinTokens joinTokens;

  /**
   **/
  public SwarmAllOf joinTokens(JoinTokens joinTokens) {
    this.joinTokens = joinTokens;
    return this;
  }

  

  
  @JsonProperty("JoinTokens")
  public JoinTokens getJoinTokens() {
    return joinTokens;
  }

  public void setJoinTokens(JoinTokens joinTokens) {
    this.joinTokens = joinTokens;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmAllOf = (SwarmAllOf) o;
    return Objects.equals(this.joinTokens, swarmAllOf.joinTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinTokens);
  }

  @Override
  public String toString() {

    return "class SwarmAllOf {\n" +
                          "    joinTokens: " + toIndentedString(joinTokens) + "\n" +
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


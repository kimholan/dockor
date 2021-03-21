package generated.docker.engine;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reachability represents the reachability of a node.
 */
public enum Reachability {
  
  UNKNOWN("unknown"),
  
  UNREACHABLE("unreachable"),
  
  REACHABLE("reachable");

  private String value;

  Reachability(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Reachability fromValue(String value) {
    for (var b : Reachability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}



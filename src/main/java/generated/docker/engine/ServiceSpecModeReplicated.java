package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceSpecModeReplicated   {
  
  private Long replicas;

  /**
   **/
  public ServiceSpecModeReplicated replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }

  

  
  @JsonProperty("Replicas")
  public Long getReplicas() {
    return replicas;
  }

  public void setReplicas(Long replicas) {
    this.replicas = replicas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceSpecModeReplicated = (ServiceSpecModeReplicated) o;
    return Objects.equals(this.replicas, serviceSpecModeReplicated.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas);
  }

  @Override
  public String toString() {

    return "class ServiceSpecModeReplicated {\n" +
                          "    replicas: " + toIndentedString(replicas) + "\n" +
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


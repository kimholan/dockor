package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceCreateResponse   {
  
  private String ID;
  private String warning;

  /**
   * The ID of the created service.
   **/
  public ServiceCreateResponse ID(String ID) {
    this.ID = ID;
    return this;
  }

  

  
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }/**
   * Optional warning message
   **/
  public ServiceCreateResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  

  
  @JsonProperty("Warning")
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var serviceCreateResponse = (ServiceCreateResponse) o;
    return Objects.equals(this.ID, serviceCreateResponse.ID) &&
        Objects.equals(this.warning, serviceCreateResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, warning);
  }

  @Override
  public String toString() {

    return "class ServiceCreateResponse {\n" +
                          "    ID: " + toIndentedString(ID) + "\n" +
                          "    warning: " + toIndentedString(warning) + "\n" +
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


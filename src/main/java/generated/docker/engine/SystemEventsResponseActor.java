package generated.docker.engine;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemEventsResponseActor   {
  
  private String ID;
  private Map<String, String> attributes = new HashMap<>();

  /**
   * The ID of the object emitting the event
   **/
  public SystemEventsResponseActor ID(String ID) {
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
   * Various key/value attributes of the object, depending on its type
   **/
  public SystemEventsResponseActor attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  

  
  @JsonProperty("Attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemEventsResponseActor = (SystemEventsResponseActor) o;
    return Objects.equals(this.ID, systemEventsResponseActor.ID) &&
        Objects.equals(this.attributes, systemEventsResponseActor.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, attributes);
  }

  @Override
  public String toString() {

    return "class SystemEventsResponseActor {\n" +
                          "    ID: " + toIndentedString(ID) + "\n" +
                          "    attributes: " + toIndentedString(attributes) + "\n" +
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


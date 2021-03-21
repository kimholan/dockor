package generated.docker.engine;

import generated.docker.engine.Limit;
import generated.docker.engine.ResourceObject;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource requirements which apply to each individual container created as part of the service. 
 **/

public class TaskSpecResources   {
  
  private Limit limits;
  private ResourceObject reservation;

  /**
   **/
  public TaskSpecResources limits(Limit limits) {
    this.limits = limits;
    return this;
  }

  

  
  @JsonProperty("Limits")
  public Limit getLimits() {
    return limits;
  }

  public void setLimits(Limit limits) {
    this.limits = limits;
  }/**
   **/
  public TaskSpecResources reservation(ResourceObject reservation) {
    this.reservation = reservation;
    return this;
  }

  

  
  @JsonProperty("Reservation")
  public ResourceObject getReservation() {
    return reservation;
  }

  public void setReservation(ResourceObject reservation) {
    this.reservation = reservation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecResources = (TaskSpecResources) o;
    return Objects.equals(this.limits, taskSpecResources.limits) &&
        Objects.equals(this.reservation, taskSpecResources.reservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, reservation);
  }

  @Override
  public String toString() {

    return "class TaskSpecResources {\n" +
                          "    limits: " + toIndentedString(limits) + "\n" +
                          "    reservation: " + toIndentedString(reservation) + "\n" +
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


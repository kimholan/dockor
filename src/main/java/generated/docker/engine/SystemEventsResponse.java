package generated.docker.engine;

import generated.docker.engine.SystemEventsResponseActor;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemEventsResponse   {
  
  private String type;
  private String action;
  private SystemEventsResponseActor actor;
  private Integer time;
  private Long timeNano;

  /**
   * The type of object emitting the event
   **/
  public SystemEventsResponse type(String type) {
    this.type = type;
    return this;
  }

  

  
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }/**
   * The type of event
   **/
  public SystemEventsResponse action(String action) {
    this.action = action;
    return this;
  }

  

  
  @JsonProperty("Action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }/**
   **/
  public SystemEventsResponse actor(SystemEventsResponseActor actor) {
    this.actor = actor;
    return this;
  }

  

  
  @JsonProperty("Actor")
  public SystemEventsResponseActor getActor() {
    return actor;
  }

  public void setActor(SystemEventsResponseActor actor) {
    this.actor = actor;
  }/**
   * Timestamp of event
   **/
  public SystemEventsResponse time(Integer time) {
    this.time = time;
    return this;
  }

  

  
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }/**
   * Timestamp of event, with nanosecond accuracy
   **/
  public SystemEventsResponse timeNano(Long timeNano) {
    this.timeNano = timeNano;
    return this;
  }

  

  
  @JsonProperty("timeNano")
  public Long getTimeNano() {
    return timeNano;
  }

  public void setTimeNano(Long timeNano) {
    this.timeNano = timeNano;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemEventsResponse = (SystemEventsResponse) o;
    return Objects.equals(this.type, systemEventsResponse.type) &&
        Objects.equals(this.action, systemEventsResponse.action) &&
        Objects.equals(this.actor, systemEventsResponse.actor) &&
        Objects.equals(this.time, systemEventsResponse.time) &&
        Objects.equals(this.timeNano, systemEventsResponse.timeNano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, actor, time, timeNano);
  }

  @Override
  public String toString() {

    return "class SystemEventsResponse {\n" +
                          "    type: " + toIndentedString(type) + "\n" +
                          "    action: " + toIndentedString(action) + "\n" +
                          "    actor: " + toIndentedString(actor) + "\n" +
                          "    time: " + toIndentedString(time) + "\n" +
                          "    timeNano: " + toIndentedString(timeNano) + "\n" +
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


package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProcessConfig   {
  
  private Boolean privileged;
  private String user;
  private Boolean tty;
  private String entrypoint;
  private List<String> arguments = new ArrayList<>();

  /**
   **/
  public ProcessConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  

  
  @JsonProperty("privileged")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }/**
   **/
  public ProcessConfig user(String user) {
    this.user = user;
    return this;
  }

  

  
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }/**
   **/
  public ProcessConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  

  
  @JsonProperty("tty")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }/**
   **/
  public ProcessConfig entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  

  
  @JsonProperty("entrypoint")
  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }/**
   **/
  public ProcessConfig arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  

  
  @JsonProperty("arguments")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var processConfig = (ProcessConfig) o;
    return Objects.equals(this.privileged, processConfig.privileged) &&
        Objects.equals(this.user, processConfig.user) &&
        Objects.equals(this.tty, processConfig.tty) &&
        Objects.equals(this.entrypoint, processConfig.entrypoint) &&
        Objects.equals(this.arguments, processConfig.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileged, user, tty, entrypoint, arguments);
  }

  @Override
  public String toString() {

    return "class ProcessConfig {\n" +
                          "    privileged: " + toIndentedString(privileged) + "\n" +
                          "    user: " + toIndentedString(user) + "\n" +
                          "    tty: " + toIndentedString(tty) + "\n" +
                          "    entrypoint: " + toIndentedString(entrypoint) + "\n" +
                          "    arguments: " + toIndentedString(arguments) + "\n" +
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


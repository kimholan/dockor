package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SELinux labels of the container
 **/

public class TaskSpecContainerSpecPrivilegesSELinuxContext   {
  
  private Boolean disable;
  private String user;
  private String role;
  private String type;
  private String level;

  /**
   * Disable SELinux
   **/
  public TaskSpecContainerSpecPrivilegesSELinuxContext disable(Boolean disable) {
    this.disable = disable;
    return this;
  }

  

  
  @JsonProperty("Disable")
  public Boolean getDisable() {
    return disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }/**
   * SELinux user label
   **/
  public TaskSpecContainerSpecPrivilegesSELinuxContext user(String user) {
    this.user = user;
    return this;
  }

  

  
  @JsonProperty("User")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }/**
   * SELinux role label
   **/
  public TaskSpecContainerSpecPrivilegesSELinuxContext role(String role) {
    this.role = role;
    return this;
  }

  

  
  @JsonProperty("Role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }/**
   * SELinux type label
   **/
  public TaskSpecContainerSpecPrivilegesSELinuxContext type(String type) {
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
   * SELinux level label
   **/
  public TaskSpecContainerSpecPrivilegesSELinuxContext level(String level) {
    this.level = level;
    return this;
  }

  

  
  @JsonProperty("Level")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecPrivilegesSELinuxContext = (TaskSpecContainerSpecPrivilegesSELinuxContext) o;
    return Objects.equals(this.disable, taskSpecContainerSpecPrivilegesSELinuxContext.disable) &&
        Objects.equals(this.user, taskSpecContainerSpecPrivilegesSELinuxContext.user) &&
        Objects.equals(this.role, taskSpecContainerSpecPrivilegesSELinuxContext.role) &&
        Objects.equals(this.type, taskSpecContainerSpecPrivilegesSELinuxContext.type) &&
        Objects.equals(this.level, taskSpecContainerSpecPrivilegesSELinuxContext.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disable, user, role, type, level);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecPrivilegesSELinuxContext {\n" +
                          "    disable: " + toIndentedString(disable) + "\n" +
                          "    user: " + toIndentedString(user) + "\n" +
                          "    role: " + toIndentedString(role) + "\n" +
                          "    type: " + toIndentedString(type) + "\n" +
                          "    level: " + toIndentedString(level) + "\n" +
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


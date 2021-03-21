package generated.docker.engine;

import generated.docker.engine.TaskSpecContainerSpecPrivilegesCredentialSpec;
import generated.docker.engine.TaskSpecContainerSpecPrivilegesSELinuxContext;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Security options for the container
 **/

public class TaskSpecContainerSpecPrivileges   {
  
  private TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec;
  private TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext;

  /**
   **/
  public TaskSpecContainerSpecPrivileges credentialSpec(TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
    this.credentialSpec = credentialSpec;
    return this;
  }

  

  
  @JsonProperty("CredentialSpec")
  public TaskSpecContainerSpecPrivilegesCredentialSpec getCredentialSpec() {
    return credentialSpec;
  }

  public void setCredentialSpec(TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
    this.credentialSpec = credentialSpec;
  }/**
   **/
  public TaskSpecContainerSpecPrivileges seLinuxContext(TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext) {
    this.seLinuxContext = seLinuxContext;
    return this;
  }

  

  
  @JsonProperty("SELinuxContext")
  public TaskSpecContainerSpecPrivilegesSELinuxContext getSeLinuxContext() {
    return seLinuxContext;
  }

  public void setSeLinuxContext(TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext) {
    this.seLinuxContext = seLinuxContext;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecPrivileges = (TaskSpecContainerSpecPrivileges) o;
    return Objects.equals(this.credentialSpec, taskSpecContainerSpecPrivileges.credentialSpec) &&
        Objects.equals(this.seLinuxContext, taskSpecContainerSpecPrivileges.seLinuxContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialSpec, seLinuxContext);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecPrivileges {\n" +
                          "    credentialSpec: " + toIndentedString(credentialSpec) + "\n" +
                          "    seLinuxContext: " + toIndentedString(seLinuxContext) + "\n" +
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


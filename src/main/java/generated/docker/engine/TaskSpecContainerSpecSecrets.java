package generated.docker.engine;

import generated.docker.engine.TaskSpecContainerSpecFile;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskSpecContainerSpecSecrets   {
  
  private TaskSpecContainerSpecFile file;
  private String secretID;
  private String secretName;

  /**
   **/
  public TaskSpecContainerSpecSecrets file(TaskSpecContainerSpecFile file) {
    this.file = file;
    return this;
  }

  

  
  @JsonProperty("File")
  public TaskSpecContainerSpecFile getFile() {
    return file;
  }

  public void setFile(TaskSpecContainerSpecFile file) {
    this.file = file;
  }/**
   * SecretID represents the ID of the specific secret that we&#39;re referencing. 
   **/
  public TaskSpecContainerSpecSecrets secretID(String secretID) {
    this.secretID = secretID;
    return this;
  }

  

  
  @JsonProperty("SecretID")
  public String getSecretID() {
    return secretID;
  }

  public void setSecretID(String secretID) {
    this.secretID = secretID;
  }/**
   * SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID. 
   **/
  public TaskSpecContainerSpecSecrets secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  

  
  @JsonProperty("SecretName")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecSecrets = (TaskSpecContainerSpecSecrets) o;
    return Objects.equals(this.file, taskSpecContainerSpecSecrets.file) &&
        Objects.equals(this.secretID, taskSpecContainerSpecSecrets.secretID) &&
        Objects.equals(this.secretName, taskSpecContainerSpecSecrets.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, secretID, secretName);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecSecrets {\n" +
                          "    file: " + toIndentedString(file) + "\n" +
                          "    secretID: " + toIndentedString(secretID) + "\n" +
                          "    secretName: " + toIndentedString(secretName) + "\n" +
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


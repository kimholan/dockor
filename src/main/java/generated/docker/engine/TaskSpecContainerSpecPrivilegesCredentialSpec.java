package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CredentialSpec for managed service account (Windows only)
 **/

public class TaskSpecContainerSpecPrivilegesCredentialSpec   {
  
  private String config;
  private String file;
  private String registry;

  /**
   * Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;   &gt; **Note**: &#x60;CredentialSpec.File&#x60;, &#x60;CredentialSpec.Registry&#x60;, &gt; and &#x60;CredentialSpec.Config&#x60; are mutually exclusive. 
   **/
  public TaskSpecContainerSpecPrivilegesCredentialSpec config(String config) {
    this.config = config;
    return this;
  }

  

  
  @JsonProperty("Config")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }/**
   * Load credential spec from this file. The file is read by the daemon, and must be present in the &#x60;CredentialSpecs&#x60; subdirectory in the docker data directory, which defaults to &#x60;C:\\ProgramData\\Docker\\&#x60; on Windows.  For example, specifying &#x60;spec.json&#x60; loads &#x60;C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json&#x60;.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: &#x60;CredentialSpec.File&#x60;, &#x60;CredentialSpec.Registry&#x60;, &gt; and &#x60;CredentialSpec.Config&#x60; are mutually exclusive. 
   **/
  public TaskSpecContainerSpecPrivilegesCredentialSpec file(String file) {
    this.file = file;
    return this;
  }

  

  
  @JsonProperty("File")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }/**
   * Load credential spec from this value in the Windows registry. The specified registry value must be located in:  &#x60;HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs&#x60;  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;   &gt; **Note**: &#x60;CredentialSpec.File&#x60;, &#x60;CredentialSpec.Registry&#x60;, &gt; and &#x60;CredentialSpec.Config&#x60; are mutually exclusive. 
   **/
  public TaskSpecContainerSpecPrivilegesCredentialSpec registry(String registry) {
    this.registry = registry;
    return this;
  }

  

  
  @JsonProperty("Registry")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecPrivilegesCredentialSpec = (TaskSpecContainerSpecPrivilegesCredentialSpec) o;
    return Objects.equals(this.config, taskSpecContainerSpecPrivilegesCredentialSpec.config) &&
        Objects.equals(this.file, taskSpecContainerSpecPrivilegesCredentialSpec.file) &&
        Objects.equals(this.registry, taskSpecContainerSpecPrivilegesCredentialSpec.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, file, registry);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecPrivilegesCredentialSpec {\n" +
                          "    config: " + toIndentedString(config) + "\n" +
                          "    file: " + toIndentedString(file) + "\n" +
                          "    registry: " + toIndentedString(registry) + "\n" +
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


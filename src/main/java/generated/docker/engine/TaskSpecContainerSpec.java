package generated.docker.engine;

import generated.docker.engine.HealthConfig;
import generated.docker.engine.Mount;
import generated.docker.engine.ResourcesUlimits;
import generated.docker.engine.TaskSpecContainerSpecConfigs;
import generated.docker.engine.TaskSpecContainerSpecDNSConfig;
import generated.docker.engine.TaskSpecContainerSpecPrivileges;
import generated.docker.engine.TaskSpecContainerSpecSecrets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Container spec for the service.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 **/

public class TaskSpecContainerSpec   {
  
  private String image;
  private Map<String, String> labels = new HashMap<>();
  private List<String> command = new ArrayList<>();
  private List<String> args = new ArrayList<>();
  private String hostname;
  private List<String> env = new ArrayList<>();
  private String dir;
  private String user;
  private List<String> groups = new ArrayList<>();
  private TaskSpecContainerSpecPrivileges privileges;
  private Boolean TTY;
  private Boolean openStdin;
  private Boolean readOnly;
  private List<Mount> mounts = new ArrayList<>();
  private String stopSignal;
  private Long stopGracePeriod;
  private HealthConfig healthCheck;
  private List<String> hosts = new ArrayList<>();
  private TaskSpecContainerSpecDNSConfig dnSConfig;
  private List<TaskSpecContainerSpecSecrets> secrets = new ArrayList<>();
  private List<TaskSpecContainerSpecConfigs> configs = new ArrayList<>();

public enum IsolationEnum {

    DEFAULT(String.valueOf("default")), PROCESS(String.valueOf("process")), HYPERV(String.valueOf("hyperv"));


    private String value;

    IsolationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static IsolationEnum fromValue(String value) {
        for (var b : IsolationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private IsolationEnum isolation;
  private Boolean init;
  private Map<String, String> sysctls = new HashMap<>();
  private List<String> capabilityAdd = new ArrayList<>();
  private List<String> capabilityDrop = new ArrayList<>();
  private List<ResourcesUlimits> ulimits = new ArrayList<>();

  /**
   * The image name to use for the container
   **/
  public TaskSpecContainerSpec image(String image) {
    this.image = image;
    return this;
  }

  

  
  @JsonProperty("Image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }/**
   * User-defined key/value data.
   **/
  public TaskSpecContainerSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  

  
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }/**
   * The command to be run in the image.
   **/
  public TaskSpecContainerSpec command(List<String> command) {
    this.command = command;
    return this;
  }

  

  
  @JsonProperty("Command")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }/**
   * Arguments to the command.
   **/
  public TaskSpecContainerSpec args(List<String> args) {
    this.args = args;
    return this;
  }

  

  
  @JsonProperty("Args")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }/**
   * The hostname to use for the container, as a valid [RFC 1123](https://tools.ietf.org/html/rfc1123) hostname. 
   **/
  public TaskSpecContainerSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  

  
  @JsonProperty("Hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }/**
   * A list of environment variables in the form &#x60;VAR&#x3D;value&#x60;. 
   **/
  public TaskSpecContainerSpec env(List<String> env) {
    this.env = env;
    return this;
  }

  

  
  @JsonProperty("Env")
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }/**
   * The working directory for commands to run in.
   **/
  public TaskSpecContainerSpec dir(String dir) {
    this.dir = dir;
    return this;
  }

  

  
  @JsonProperty("Dir")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }/**
   * The user inside the container.
   **/
  public TaskSpecContainerSpec user(String user) {
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
   * A list of additional groups that the container process will run as. 
   **/
  public TaskSpecContainerSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  

  
  @JsonProperty("Groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }/**
   **/
  public TaskSpecContainerSpec privileges(TaskSpecContainerSpecPrivileges privileges) {
    this.privileges = privileges;
    return this;
  }

  

  
  @JsonProperty("Privileges")
  public TaskSpecContainerSpecPrivileges getPrivileges() {
    return privileges;
  }

  public void setPrivileges(TaskSpecContainerSpecPrivileges privileges) {
    this.privileges = privileges;
  }/**
   * Whether a pseudo-TTY should be allocated.
   **/
  public TaskSpecContainerSpec TTY(Boolean TTY) {
    this.TTY = TTY;
    return this;
  }

  

  
  @JsonProperty("TTY")
  public Boolean getTTY() {
    return TTY;
  }

  public void setTTY(Boolean TTY) {
    this.TTY = TTY;
  }/**
   * Open &#x60;stdin&#x60;
   **/
  public TaskSpecContainerSpec openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  

  
  @JsonProperty("OpenStdin")
  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }/**
   * Mount the container&#39;s root filesystem as read only.
   **/
  public TaskSpecContainerSpec readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  

  
  @JsonProperty("ReadOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }/**
   * Specification for mounts to be added to containers created as part of the service. 
   **/
  public TaskSpecContainerSpec mounts(List<Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  

  
  @JsonProperty("Mounts")
  public List<Mount> getMounts() {
    return mounts;
  }

  public void setMounts(List<Mount> mounts) {
    this.mounts = mounts;
  }/**
   * Signal to stop the container.
   **/
  public TaskSpecContainerSpec stopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return this;
  }

  

  
  @JsonProperty("StopSignal")
  public String getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
  }/**
   * Amount of time to wait for the container to terminate before forcefully killing it. 
   **/
  public TaskSpecContainerSpec stopGracePeriod(Long stopGracePeriod) {
    this.stopGracePeriod = stopGracePeriod;
    return this;
  }

  

  
  @JsonProperty("StopGracePeriod")
  public Long getStopGracePeriod() {
    return stopGracePeriod;
  }

  public void setStopGracePeriod(Long stopGracePeriod) {
    this.stopGracePeriod = stopGracePeriod;
  }/**
   **/
  public TaskSpecContainerSpec healthCheck(HealthConfig healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

  

  
  @JsonProperty("HealthCheck")
  public HealthConfig getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthConfig healthCheck) {
    this.healthCheck = healthCheck;
  }/**
   * A list of hostname/IP mappings to add to the container&#39;s &#x60;hosts&#x60; file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases...] 
   **/
  public TaskSpecContainerSpec hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  

  
  @JsonProperty("Hosts")
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }/**
   **/
  public TaskSpecContainerSpec dnSConfig(TaskSpecContainerSpecDNSConfig dnSConfig) {
    this.dnSConfig = dnSConfig;
    return this;
  }

  

  
  @JsonProperty("DNSConfig")
  public TaskSpecContainerSpecDNSConfig getDnSConfig() {
    return dnSConfig;
  }

  public void setDnSConfig(TaskSpecContainerSpecDNSConfig dnSConfig) {
    this.dnSConfig = dnSConfig;
  }/**
   * Secrets contains references to zero or more secrets that will be exposed to the service. 
   **/
  public TaskSpecContainerSpec secrets(List<TaskSpecContainerSpecSecrets> secrets) {
    this.secrets = secrets;
    return this;
  }

  

  
  @JsonProperty("Secrets")
  public List<TaskSpecContainerSpecSecrets> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<TaskSpecContainerSpecSecrets> secrets) {
    this.secrets = secrets;
  }/**
   * Configs contains references to zero or more configs that will be exposed to the service. 
   **/
  public TaskSpecContainerSpec configs(List<TaskSpecContainerSpecConfigs> configs) {
    this.configs = configs;
    return this;
  }

  

  
  @JsonProperty("Configs")
  public List<TaskSpecContainerSpecConfigs> getConfigs() {
    return configs;
  }

  public void setConfigs(List<TaskSpecContainerSpecConfigs> configs) {
    this.configs = configs;
  }/**
   * Isolation technology of the containers running the service. (Windows only) 
   **/
  public TaskSpecContainerSpec isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  

  
  @JsonProperty("Isolation")
  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }/**
   * Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. 
   **/
  public TaskSpecContainerSpec init(Boolean init) {
    this.init = init;
    return this;
  }

  

  
  @JsonProperty("Init")
  public Boolean getInit() {
    return init;
  }

  public void setInit(Boolean init) {
    this.init = init;
  }/**
   * Set kernel namedspaced parameters (sysctls) in the container. The Sysctls option on services accepts the same sysctls as the are supported on containers. Note that while the same sysctls are supported, no guarantees or checks are made about their suitability for a clustered environment, and it&#39;s up to the user to determine whether a given sysctl will work properly in a Service. 
   **/
  public TaskSpecContainerSpec sysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  

  
  @JsonProperty("Sysctls")
  public Map<String, String> getSysctls() {
    return sysctls;
  }

  public void setSysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
  }/**
   * A list of kernel capabilities to add to the default set for the container. 
   **/
  public TaskSpecContainerSpec capabilityAdd(List<String> capabilityAdd) {
    this.capabilityAdd = capabilityAdd;
    return this;
  }

  

  
  @JsonProperty("CapabilityAdd")
  public List<String> getCapabilityAdd() {
    return capabilityAdd;
  }

  public void setCapabilityAdd(List<String> capabilityAdd) {
    this.capabilityAdd = capabilityAdd;
  }/**
   * A list of kernel capabilities to drop from the default set for the container. 
   **/
  public TaskSpecContainerSpec capabilityDrop(List<String> capabilityDrop) {
    this.capabilityDrop = capabilityDrop;
    return this;
  }

  

  
  @JsonProperty("CapabilityDrop")
  public List<String> getCapabilityDrop() {
    return capabilityDrop;
  }

  public void setCapabilityDrop(List<String> capabilityDrop) {
    this.capabilityDrop = capabilityDrop;
  }/**
   * A list of resource limits to set in the container. For example: &#x60;{\&quot;Name\&quot;: \&quot;nofile\&quot;, \&quot;Soft\&quot;: 1024, \&quot;Hard\&quot;: 2048}&#x60;\&quot; 
   **/
  public TaskSpecContainerSpec ulimits(List<ResourcesUlimits> ulimits) {
    this.ulimits = ulimits;
    return this;
  }

  

  
  @JsonProperty("Ulimits")
  public List<ResourcesUlimits> getUlimits() {
    return ulimits;
  }

  public void setUlimits(List<ResourcesUlimits> ulimits) {
    this.ulimits = ulimits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpec = (TaskSpecContainerSpec) o;
    return Objects.equals(this.image, taskSpecContainerSpec.image) &&
        Objects.equals(this.labels, taskSpecContainerSpec.labels) &&
        Objects.equals(this.command, taskSpecContainerSpec.command) &&
        Objects.equals(this.args, taskSpecContainerSpec.args) &&
        Objects.equals(this.hostname, taskSpecContainerSpec.hostname) &&
        Objects.equals(this.env, taskSpecContainerSpec.env) &&
        Objects.equals(this.dir, taskSpecContainerSpec.dir) &&
        Objects.equals(this.user, taskSpecContainerSpec.user) &&
        Objects.equals(this.groups, taskSpecContainerSpec.groups) &&
        Objects.equals(this.privileges, taskSpecContainerSpec.privileges) &&
        Objects.equals(this.TTY, taskSpecContainerSpec.TTY) &&
        Objects.equals(this.openStdin, taskSpecContainerSpec.openStdin) &&
        Objects.equals(this.readOnly, taskSpecContainerSpec.readOnly) &&
        Objects.equals(this.mounts, taskSpecContainerSpec.mounts) &&
        Objects.equals(this.stopSignal, taskSpecContainerSpec.stopSignal) &&
        Objects.equals(this.stopGracePeriod, taskSpecContainerSpec.stopGracePeriod) &&
        Objects.equals(this.healthCheck, taskSpecContainerSpec.healthCheck) &&
        Objects.equals(this.hosts, taskSpecContainerSpec.hosts) &&
        Objects.equals(this.dnSConfig, taskSpecContainerSpec.dnSConfig) &&
        Objects.equals(this.secrets, taskSpecContainerSpec.secrets) &&
        Objects.equals(this.configs, taskSpecContainerSpec.configs) &&
        Objects.equals(this.isolation, taskSpecContainerSpec.isolation) &&
        Objects.equals(this.init, taskSpecContainerSpec.init) &&
        Objects.equals(this.sysctls, taskSpecContainerSpec.sysctls) &&
        Objects.equals(this.capabilityAdd, taskSpecContainerSpec.capabilityAdd) &&
        Objects.equals(this.capabilityDrop, taskSpecContainerSpec.capabilityDrop) &&
        Objects.equals(this.ulimits, taskSpecContainerSpec.ulimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, labels, command, args, hostname, env, dir, user, groups, privileges, TTY, openStdin, readOnly, mounts, stopSignal, stopGracePeriod, healthCheck, hosts, dnSConfig, secrets, configs, isolation, init, sysctls, capabilityAdd, capabilityDrop, ulimits);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpec {\n" +
                          "    image: " + toIndentedString(image) + "\n" +
                          "    labels: " + toIndentedString(labels) + "\n" +
                          "    command: " + toIndentedString(command) + "\n" +
                          "    args: " + toIndentedString(args) + "\n" +
                          "    hostname: " + toIndentedString(hostname) + "\n" +
                          "    env: " + toIndentedString(env) + "\n" +
                          "    dir: " + toIndentedString(dir) + "\n" +
                          "    user: " + toIndentedString(user) + "\n" +
                          "    groups: " + toIndentedString(groups) + "\n" +
                          "    privileges: " + toIndentedString(privileges) + "\n" +
                          "    TTY: " + toIndentedString(TTY) + "\n" +
                          "    openStdin: " + toIndentedString(openStdin) + "\n" +
                          "    readOnly: " + toIndentedString(readOnly) + "\n" +
                          "    mounts: " + toIndentedString(mounts) + "\n" +
                          "    stopSignal: " + toIndentedString(stopSignal) + "\n" +
                          "    stopGracePeriod: " + toIndentedString(stopGracePeriod) + "\n" +
                          "    healthCheck: " + toIndentedString(healthCheck) + "\n" +
                          "    hosts: " + toIndentedString(hosts) + "\n" +
                          "    dnSConfig: " + toIndentedString(dnSConfig) + "\n" +
                          "    secrets: " + toIndentedString(secrets) + "\n" +
                          "    configs: " + toIndentedString(configs) + "\n" +
                          "    isolation: " + toIndentedString(isolation) + "\n" +
                          "    init: " + toIndentedString(init) + "\n" +
                          "    sysctls: " + toIndentedString(sysctls) + "\n" +
                          "    capabilityAdd: " + toIndentedString(capabilityAdd) + "\n" +
                          "    capabilityDrop: " + toIndentedString(capabilityDrop) + "\n" +
                          "    ulimits: " + toIndentedString(ulimits) + "\n" +
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


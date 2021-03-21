package generated.docker.engine;

import generated.docker.engine.SystemVersionComponents;
import generated.docker.engine.SystemVersionPlatform;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of Engine API: GET \&quot;/version\&quot; 
 **/

public class SystemVersion   {
  
  private SystemVersionPlatform platform;
  private List<SystemVersionComponents> components = new ArrayList<>();
  private String version;
  private String apiVersion;
  private String minAPIVersion;
  private String gitCommit;
  private String goVersion;
  private String os;
  private String arch;
  private String kernelVersion;
  private Boolean experimental;
  private String buildTime;

  /**
   **/
  public SystemVersion platform(SystemVersionPlatform platform) {
    this.platform = platform;
    return this;
  }

  

  
  @JsonProperty("Platform")
  public SystemVersionPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(SystemVersionPlatform platform) {
    this.platform = platform;
  }/**
   * Information about system components 
   **/
  public SystemVersion components(List<SystemVersionComponents> components) {
    this.components = components;
    return this;
  }

  

  
  @JsonProperty("Components")
  public List<SystemVersionComponents> getComponents() {
    return components;
  }

  public void setComponents(List<SystemVersionComponents> components) {
    this.components = components;
  }/**
   * The version of the daemon
   **/
  public SystemVersion version(String version) {
    this.version = version;
    return this;
  }

  

  
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }/**
   * The default (and highest) API version that is supported by the daemon 
   **/
  public SystemVersion apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  

  
  @JsonProperty("ApiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }/**
   * The minimum API version that is supported by the daemon 
   **/
  public SystemVersion minAPIVersion(String minAPIVersion) {
    this.minAPIVersion = minAPIVersion;
    return this;
  }

  

  
  @JsonProperty("MinAPIVersion")
  public String getMinAPIVersion() {
    return minAPIVersion;
  }

  public void setMinAPIVersion(String minAPIVersion) {
    this.minAPIVersion = minAPIVersion;
  }/**
   * The Git commit of the source code that was used to build the daemon 
   **/
  public SystemVersion gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  

  
  @JsonProperty("GitCommit")
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }/**
   * The version Go used to compile the daemon, and the version of the Go runtime in use. 
   **/
  public SystemVersion goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  

  
  @JsonProperty("GoVersion")
  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }/**
   * The operating system that the daemon is running on (\&quot;linux\&quot; or \&quot;windows\&quot;) 
   **/
  public SystemVersion os(String os) {
    this.os = os;
    return this;
  }

  

  
  @JsonProperty("Os")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }/**
   * The architecture that the daemon is running on 
   **/
  public SystemVersion arch(String arch) {
    this.arch = arch;
    return this;
  }

  

  
  @JsonProperty("Arch")
  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }/**
   * The kernel version (&#x60;uname -r&#x60;) that the daemon is running on.  This field is omitted when empty. 
   **/
  public SystemVersion kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  

  
  @JsonProperty("KernelVersion")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }/**
   * Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false. 
   **/
  public SystemVersion experimental(Boolean experimental) {
    this.experimental = experimental;
    return this;
  }

  

  
  @JsonProperty("Experimental")
  public Boolean getExperimental() {
    return experimental;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }/**
   * The date and time that the daemon was compiled. 
   **/
  public SystemVersion buildTime(String buildTime) {
    this.buildTime = buildTime;
    return this;
  }

  

  
  @JsonProperty("BuildTime")
  public String getBuildTime() {
    return buildTime;
  }

  public void setBuildTime(String buildTime) {
    this.buildTime = buildTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemVersion = (SystemVersion) o;
    return Objects.equals(this.platform, systemVersion.platform) &&
        Objects.equals(this.components, systemVersion.components) &&
        Objects.equals(this.version, systemVersion.version) &&
        Objects.equals(this.apiVersion, systemVersion.apiVersion) &&
        Objects.equals(this.minAPIVersion, systemVersion.minAPIVersion) &&
        Objects.equals(this.gitCommit, systemVersion.gitCommit) &&
        Objects.equals(this.goVersion, systemVersion.goVersion) &&
        Objects.equals(this.os, systemVersion.os) &&
        Objects.equals(this.arch, systemVersion.arch) &&
        Objects.equals(this.kernelVersion, systemVersion.kernelVersion) &&
        Objects.equals(this.experimental, systemVersion.experimental) &&
        Objects.equals(this.buildTime, systemVersion.buildTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, components, version, apiVersion, minAPIVersion, gitCommit, goVersion, os, arch, kernelVersion, experimental, buildTime);
  }

  @Override
  public String toString() {

    return "class SystemVersion {\n" +
                          "    platform: " + toIndentedString(platform) + "\n" +
                          "    components: " + toIndentedString(components) + "\n" +
                          "    version: " + toIndentedString(version) + "\n" +
                          "    apiVersion: " + toIndentedString(apiVersion) + "\n" +
                          "    minAPIVersion: " + toIndentedString(minAPIVersion) + "\n" +
                          "    gitCommit: " + toIndentedString(gitCommit) + "\n" +
                          "    goVersion: " + toIndentedString(goVersion) + "\n" +
                          "    os: " + toIndentedString(os) + "\n" +
                          "    arch: " + toIndentedString(arch) + "\n" +
                          "    kernelVersion: " + toIndentedString(kernelVersion) + "\n" +
                          "    experimental: " + toIndentedString(experimental) + "\n" +
                          "    buildTime: " + toIndentedString(buildTime) + "\n" +
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


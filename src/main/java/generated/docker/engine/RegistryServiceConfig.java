package generated.docker.engine;

import generated.docker.engine.IndexInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RegistryServiceConfig stores daemon registry services configuration. 
 **/

public class RegistryServiceConfig   {
  
  private List<String> allowNondistributableArtifactsCIDRs = new ArrayList<>();
  private List<String> allowNondistributableArtifactsHostnames = new ArrayList<>();
  private List<String> insecureRegistryCIDRs = new ArrayList<>();
  private Map<String, IndexInfo> indexConfigs = new HashMap<>();
  private List<String> mirrors = new ArrayList<>();

  /**
   * List of IP ranges to which nondistributable artifacts can be pushed, using the CIDR syntax [RFC 4632](https://tools.ietf.org/html/4632).  Some images (for example, Windows base images) contain artifacts whose distribution is restricted by license. When these images are pushed to a registry, restricted artifacts are not included.  This configuration override this behavior, and enables the daemon to push nondistributable artifacts to all registries whose resolved IP address is within the subnet described by the CIDR syntax.  This option is useful when pushing images containing nondistributable artifacts to a registry on an air-gapped network so hosts on that network can pull the images without connecting to another server.  &gt; **Warning**: Nondistributable artifacts typically have restrictions &gt; on how and where they can be distributed and shared. Only use this &gt; feature to push artifacts to private registries and ensure that you &gt; are in compliance with any terms that cover redistributing &gt; nondistributable artifacts. 
   **/
  public RegistryServiceConfig allowNondistributableArtifactsCIDRs(List<String> allowNondistributableArtifactsCIDRs) {
    this.allowNondistributableArtifactsCIDRs = allowNondistributableArtifactsCIDRs;
    return this;
  }

  

  
  @JsonProperty("AllowNondistributableArtifactsCIDRs")
  public List<String> getAllowNondistributableArtifactsCIDRs() {
    return allowNondistributableArtifactsCIDRs;
  }

  public void setAllowNondistributableArtifactsCIDRs(List<String> allowNondistributableArtifactsCIDRs) {
    this.allowNondistributableArtifactsCIDRs = allowNondistributableArtifactsCIDRs;
  }/**
   * List of registry hostnames to which nondistributable artifacts can be pushed, using the format &#x60;&lt;hostname&gt;[:&lt;port&gt;]&#x60; or &#x60;&lt;IP address&gt;[:&lt;port&gt;]&#x60;.  Some images (for example, Windows base images) contain artifacts whose distribution is restricted by license. When these images are pushed to a registry, restricted artifacts are not included.  This configuration override this behavior for the specified registries.  This option is useful when pushing images containing nondistributable artifacts to a registry on an air-gapped network so hosts on that network can pull the images without connecting to another server.  &gt; **Warning**: Nondistributable artifacts typically have restrictions &gt; on how and where they can be distributed and shared. Only use this &gt; feature to push artifacts to private registries and ensure that you &gt; are in compliance with any terms that cover redistributing &gt; nondistributable artifacts. 
   **/
  public RegistryServiceConfig allowNondistributableArtifactsHostnames(List<String> allowNondistributableArtifactsHostnames) {
    this.allowNondistributableArtifactsHostnames = allowNondistributableArtifactsHostnames;
    return this;
  }

  

  
  @JsonProperty("AllowNondistributableArtifactsHostnames")
  public List<String> getAllowNondistributableArtifactsHostnames() {
    return allowNondistributableArtifactsHostnames;
  }

  public void setAllowNondistributableArtifactsHostnames(List<String> allowNondistributableArtifactsHostnames) {
    this.allowNondistributableArtifactsHostnames = allowNondistributableArtifactsHostnames;
  }/**
   * List of IP ranges of insecure registries, using the CIDR syntax ([RFC 4632](https://tools.ietf.org/html/4632)). Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  By default, local registries (&#x60;127.0.0.0/8&#x60;) are configured as insecure. All other registries are secure. Communicating with an insecure registry is not possible if the daemon assumes that registry is secure.  This configuration override this behavior, insecure communication with registries whose resolved IP address is within the subnet described by the CIDR syntax.  Registries can also be marked insecure by hostname. Those registries are listed under &#x60;IndexConfigs&#x60; and have their &#x60;Secure&#x60; field set to &#x60;false&#x60;.  &gt; **Warning**: Using this option can be useful when running a local &gt; registry, but introduces security vulnerabilities. This option &gt; should therefore ONLY be used for testing purposes. For increased &gt; security, users should add their CA to their system&#39;s list of trusted &gt; CAs instead of enabling this option. 
   **/
  public RegistryServiceConfig insecureRegistryCIDRs(List<String> insecureRegistryCIDRs) {
    this.insecureRegistryCIDRs = insecureRegistryCIDRs;
    return this;
  }

  

  
  @JsonProperty("InsecureRegistryCIDRs")
  public List<String> getInsecureRegistryCIDRs() {
    return insecureRegistryCIDRs;
  }

  public void setInsecureRegistryCIDRs(List<String> insecureRegistryCIDRs) {
    this.insecureRegistryCIDRs = insecureRegistryCIDRs;
  }/**
   **/
  public RegistryServiceConfig indexConfigs(Map<String, IndexInfo> indexConfigs) {
    this.indexConfigs = indexConfigs;
    return this;
  }

  

  
  @JsonProperty("IndexConfigs")
  public Map<String, IndexInfo> getIndexConfigs() {
    return indexConfigs;
  }

  public void setIndexConfigs(Map<String, IndexInfo> indexConfigs) {
    this.indexConfigs = indexConfigs;
  }/**
   * List of registry URLs that act as a mirror for the official (&#x60;docker.io&#x60;) registry. 
   **/
  public RegistryServiceConfig mirrors(List<String> mirrors) {
    this.mirrors = mirrors;
    return this;
  }

  

  
  @JsonProperty("Mirrors")
  public List<String> getMirrors() {
    return mirrors;
  }

  public void setMirrors(List<String> mirrors) {
    this.mirrors = mirrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var registryServiceConfig = (RegistryServiceConfig) o;
    return Objects.equals(this.allowNondistributableArtifactsCIDRs, registryServiceConfig.allowNondistributableArtifactsCIDRs) &&
        Objects.equals(this.allowNondistributableArtifactsHostnames, registryServiceConfig.allowNondistributableArtifactsHostnames) &&
        Objects.equals(this.insecureRegistryCIDRs, registryServiceConfig.insecureRegistryCIDRs) &&
        Objects.equals(this.indexConfigs, registryServiceConfig.indexConfigs) &&
        Objects.equals(this.mirrors, registryServiceConfig.mirrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowNondistributableArtifactsCIDRs, allowNondistributableArtifactsHostnames, insecureRegistryCIDRs, indexConfigs, mirrors);
  }

  @Override
  public String toString() {

    return "class RegistryServiceConfig {\n" +
                          "    allowNondistributableArtifactsCIDRs: " + toIndentedString(allowNondistributableArtifactsCIDRs) + "\n" +
                          "    allowNondistributableArtifactsHostnames: " + toIndentedString(allowNondistributableArtifactsHostnames) + "\n" +
                          "    insecureRegistryCIDRs: " + toIndentedString(insecureRegistryCIDRs) + "\n" +
                          "    indexConfigs: " + toIndentedString(indexConfigs) + "\n" +
                          "    mirrors: " + toIndentedString(mirrors) + "\n" +
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


package generated.docker.engine;

import generated.docker.engine.SwarmSpecCAConfigExternalCAs;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CA configuration.
 **/

public class SwarmSpecCAConfig   {
  
  private Long nodeCertExpiry;
  private List<SwarmSpecCAConfigExternalCAs> externalCAs = new ArrayList<>();
  private String signingCACert;
  private String signingCAKey;
  private Integer forceRotate;

  /**
   * The duration node certificates are issued for.
   **/
  public SwarmSpecCAConfig nodeCertExpiry(Long nodeCertExpiry) {
    this.nodeCertExpiry = nodeCertExpiry;
    return this;
  }

  

  
  @JsonProperty("NodeCertExpiry")
  public Long getNodeCertExpiry() {
    return nodeCertExpiry;
  }

  public void setNodeCertExpiry(Long nodeCertExpiry) {
    this.nodeCertExpiry = nodeCertExpiry;
  }/**
   * Configuration for forwarding signing requests to an external certificate authority. 
   **/
  public SwarmSpecCAConfig externalCAs(List<SwarmSpecCAConfigExternalCAs> externalCAs) {
    this.externalCAs = externalCAs;
    return this;
  }

  

  
  @JsonProperty("ExternalCAs")
  public List<SwarmSpecCAConfigExternalCAs> getExternalCAs() {
    return externalCAs;
  }

  public void setExternalCAs(List<SwarmSpecCAConfigExternalCAs> externalCAs) {
    this.externalCAs = externalCAs;
  }/**
   * The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format. 
   **/
  public SwarmSpecCAConfig signingCACert(String signingCACert) {
    this.signingCACert = signingCACert;
    return this;
  }

  

  
  @JsonProperty("SigningCACert")
  public String getSigningCACert() {
    return signingCACert;
  }

  public void setSigningCACert(String signingCACert) {
    this.signingCACert = signingCACert;
  }/**
   * The desired signing CA key for all swarm node TLS leaf certificates, in PEM format. 
   **/
  public SwarmSpecCAConfig signingCAKey(String signingCAKey) {
    this.signingCAKey = signingCAKey;
    return this;
  }

  

  
  @JsonProperty("SigningCAKey")
  public String getSigningCAKey() {
    return signingCAKey;
  }

  public void setSigningCAKey(String signingCAKey) {
    this.signingCAKey = signingCAKey;
  }/**
   * An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in &#x60;SigningCACert&#x60; and &#x60;SigningCAKey&#x60; 
   **/
  public SwarmSpecCAConfig forceRotate(Integer forceRotate) {
    this.forceRotate = forceRotate;
    return this;
  }

  

  
  @JsonProperty("ForceRotate")
  public Integer getForceRotate() {
    return forceRotate;
  }

  public void setForceRotate(Integer forceRotate) {
    this.forceRotate = forceRotate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmSpecCAConfig = (SwarmSpecCAConfig) o;
    return Objects.equals(this.nodeCertExpiry, swarmSpecCAConfig.nodeCertExpiry) &&
        Objects.equals(this.externalCAs, swarmSpecCAConfig.externalCAs) &&
        Objects.equals(this.signingCACert, swarmSpecCAConfig.signingCACert) &&
        Objects.equals(this.signingCAKey, swarmSpecCAConfig.signingCAKey) &&
        Objects.equals(this.forceRotate, swarmSpecCAConfig.forceRotate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeCertExpiry, externalCAs, signingCACert, signingCAKey, forceRotate);
  }

  @Override
  public String toString() {

    return "class SwarmSpecCAConfig {\n" +
                          "    nodeCertExpiry: " + toIndentedString(nodeCertExpiry) + "\n" +
                          "    externalCAs: " + toIndentedString(externalCAs) + "\n" +
                          "    signingCACert: " + toIndentedString(signingCACert) + "\n" +
                          "    signingCAKey: " + toIndentedString(signingCAKey) + "\n" +
                          "    forceRotate: " + toIndentedString(forceRotate) + "\n" +
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


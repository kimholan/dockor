package generated.docker.engine;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class SwarmSpecCAConfigExternalCAs   {
  

public enum ProtocolEnum {

    CFSSL(String.valueOf("cfssl"));


    private String value;

    ProtocolEnum (String v) {
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
    public static ProtocolEnum fromValue(String value) {
        for (var b : ProtocolEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ProtocolEnum protocol = ProtocolEnum.CFSSL;
  private String URL;
  private Map<String, String> options = new HashMap<>();
  private String caCert;

  /**
   * Protocol for communication with the external CA (currently only &#x60;cfssl&#x60; is supported). 
   **/
  public SwarmSpecCAConfigExternalCAs protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  

  
  @JsonProperty("Protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }/**
   * URL where certificate signing requests should be sent. 
   **/
  public SwarmSpecCAConfigExternalCAs URL(String URL) {
    this.URL = URL;
    return this;
  }

  

  
  @JsonProperty("URL")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }/**
   * An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver. 
   **/
  public SwarmSpecCAConfigExternalCAs options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  

  
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }/**
   * The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided). 
   **/
  public SwarmSpecCAConfigExternalCAs caCert(String caCert) {
    this.caCert = caCert;
    return this;
  }

  

  
  @JsonProperty("CACert")
  public String getCaCert() {
    return caCert;
  }

  public void setCaCert(String caCert) {
    this.caCert = caCert;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
      var swarmSpecCAConfigExternalCAs = (SwarmSpecCAConfigExternalCAs) o;
    return Objects.equals(this.protocol, swarmSpecCAConfigExternalCAs.protocol) &&
        Objects.equals(this.URL, swarmSpecCAConfigExternalCAs.URL) &&
        Objects.equals(this.options, swarmSpecCAConfigExternalCAs.options) &&
        Objects.equals(this.caCert, swarmSpecCAConfigExternalCAs.caCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, URL, options, caCert);
  }

  @Override
  public String toString() {

      return "class SwarmSpecCAConfigExternalCAs {\n" +
                          "    protocol: " + toIndentedString(protocol) + "\n" +
                          "    URL: " + toIndentedString(URL) + "\n" +
                          "    options: " + toIndentedString(options) + "\n" +
                          "    caCert: " + toIndentedString(caCert) + "\n" +
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


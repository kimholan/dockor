package generated.docker.engine;

import generated.docker.engine.Driver;
import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecretSpec   {
  
  private String name;
  private Map<String, String> labels = new HashMap<>();
  private String data;
  private Driver driver;
  private Driver templating;

  /**
   * User-defined name of the secret.
   **/
  public SecretSpec name(String name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }/**
   * User-defined key/value metadata.
   **/
  public SecretSpec labels(Map<String, String> labels) {
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
   * Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. 
   **/
  public SecretSpec data(String data) {
    this.data = data;
    return this;
  }

  

  
  @JsonProperty("Data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }/**
   **/
  public SecretSpec driver(Driver driver) {
    this.driver = driver;
    return this;
  }

  

  
  @JsonProperty("Driver")
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }/**
   **/
  public SecretSpec templating(Driver templating) {
    this.templating = templating;
    return this;
  }

  

  
  @JsonProperty("Templating")
  public Driver getTemplating() {
    return templating;
  }

  public void setTemplating(Driver templating) {
    this.templating = templating;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var secretSpec = (SecretSpec) o;
    return Objects.equals(this.name, secretSpec.name) &&
        Objects.equals(this.labels, secretSpec.labels) &&
        Objects.equals(this.data, secretSpec.data) &&
        Objects.equals(this.driver, secretSpec.driver) &&
        Objects.equals(this.templating, secretSpec.templating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, data, driver, templating);
  }

  @Override
  public String toString() {

    return "class SecretSpec {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    labels: " + toIndentedString(labels) + "\n" +
                          "    data: " + toIndentedString(data) + "\n" +
                          "    driver: " + toIndentedString(driver) + "\n" +
                          "    templating: " + toIndentedString(templating) + "\n" +
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


package generated.docker.engine;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume configuration
 **/

public class VolumeConfig   {
  
  private String name;
  private String driver = "local";
  private Map<String, String> driverOpts = new HashMap<>();
  private Map<String, String> labels = new HashMap<>();

  /**
   * The new volume&#39;s name. If not specified, Docker generates a name. 
   **/
  public VolumeConfig name(String name) {
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
   * Name of the volume driver to use.
   **/
  public VolumeConfig driver(String driver) {
    this.driver = driver;
    return this;
  }

  

  
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }/**
   * A mapping of driver options and values. These options are passed directly to the driver and are driver specific. 
   **/
  public VolumeConfig driverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
    return this;
  }

  

  
  @JsonProperty("DriverOpts")
  public Map<String, String> getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
  }/**
   * User-defined key/value metadata.
   **/
  public VolumeConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  

  
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var volumeConfig = (VolumeConfig) o;
    return Objects.equals(this.name, volumeConfig.name) &&
        Objects.equals(this.driver, volumeConfig.driver) &&
        Objects.equals(this.driverOpts, volumeConfig.driverOpts) &&
        Objects.equals(this.labels, volumeConfig.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, driver, driverOpts, labels);
  }

  @Override
  public String toString() {

    return "class VolumeConfig {\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    driver: " + toIndentedString(driver) + "\n" +
                          "    driverOpts: " + toIndentedString(driverOpts) + "\n" +
                          "    labels: " + toIndentedString(labels) + "\n" +
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


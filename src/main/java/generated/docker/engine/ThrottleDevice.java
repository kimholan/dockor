package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ThrottleDevice   {
  
  private String path;
  private Long rate;

  /**
   * Device path
   **/
  public ThrottleDevice path(String path) {
    this.path = path;
    return this;
  }

  

  
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }/**
   * Rate
   * minimum: 0
   **/
  public ThrottleDevice rate(Long rate) {
    this.rate = rate;
    return this;
  }

  

  
  @JsonProperty("Rate")
  public Long getRate() {
    return rate;
  }

  public void setRate(Long rate) {
    this.rate = rate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var throttleDevice = (ThrottleDevice) o;
    return Objects.equals(this.path, throttleDevice.path) &&
        Objects.equals(this.rate, throttleDevice.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, rate);
  }

  @Override
  public String toString() {

    return "class ThrottleDevice {\n" +
                          "    path: " + toIndentedString(path) + "\n" +
                          "    rate: " + toIndentedString(rate) + "\n" +
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


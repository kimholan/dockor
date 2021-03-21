package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemInfoDefaultAddressPools   {
  
  private String base;
  private Integer size;

  /**
   * The network address in CIDR format
   **/
  public SystemInfoDefaultAddressPools base(String base) {
    this.base = base;
    return this;
  }

  

  
  @JsonProperty("Base")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }/**
   * The network pool size
   **/
  public SystemInfoDefaultAddressPools size(Integer size) {
    this.size = size;
    return this;
  }

  

  
  @JsonProperty("Size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemInfoDefaultAddressPools = (SystemInfoDefaultAddressPools) o;
    return Objects.equals(this.base, systemInfoDefaultAddressPools.base) &&
        Objects.equals(this.size, systemInfoDefaultAddressPools.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, size);
  }

  @Override
  public String toString() {

    return "class SystemInfoDefaultAddressPools {\n" +
                          "    base: " + toIndentedString(base) + "\n" +
                          "    size: " + toIndentedString(size) + "\n" +
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


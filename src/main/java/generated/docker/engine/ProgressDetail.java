package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProgressDetail   {
  
  private Integer current;
  private Integer total;

  /**
   **/
  public ProgressDetail current(Integer current) {
    this.current = current;
    return this;
  }

  

  
  @JsonProperty("current")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }/**
   **/
  public ProgressDetail total(Integer total) {
    this.total = total;
    return this;
  }

  

  
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var progressDetail = (ProgressDetail) o;
    return Objects.equals(this.current, progressDetail.current) &&
        Objects.equals(this.total, progressDetail.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, total);
  }

  @Override
  public String toString() {

    return "class ProgressDetail {\n" +
                          "    current: " + toIndentedString(current) + "\n" +
                          "    total: " + toIndentedString(total) + "\n" +
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


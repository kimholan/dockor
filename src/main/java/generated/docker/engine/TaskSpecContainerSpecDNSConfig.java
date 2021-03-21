package generated.docker.engine;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification for DNS related configurations in resolver configuration file (&#x60;resolv.conf&#x60;). 
 **/

public class TaskSpecContainerSpecDNSConfig   {
  
  private List<String> nameservers = new ArrayList<>();
  private List<String> search = new ArrayList<>();
  private List<String> options = new ArrayList<>();

  /**
   * The IP addresses of the name servers.
   **/
  public TaskSpecContainerSpecDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  

  
  @JsonProperty("Nameservers")
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }/**
   * A search list for host-name lookup.
   **/
  public TaskSpecContainerSpecDNSConfig search(List<String> search) {
    this.search = search;
    return this;
  }

  

  
  @JsonProperty("Search")
  public List<String> getSearch() {
    return search;
  }

  public void setSearch(List<String> search) {
    this.search = search;
  }/**
   * A list of internal resolver variables to be modified (e.g., &#x60;debug&#x60;, &#x60;ndots:3&#x60;, etc.). 
   **/
  public TaskSpecContainerSpecDNSConfig options(List<String> options) {
    this.options = options;
    return this;
  }

  

  
  @JsonProperty("Options")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var taskSpecContainerSpecDNSConfig = (TaskSpecContainerSpecDNSConfig) o;
    return Objects.equals(this.nameservers, taskSpecContainerSpecDNSConfig.nameservers) &&
        Objects.equals(this.search, taskSpecContainerSpecDNSConfig.search) &&
        Objects.equals(this.options, taskSpecContainerSpecDNSConfig.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, search, options);
  }

  @Override
  public String toString() {

    return "class TaskSpecContainerSpecDNSConfig {\n" +
                          "    nameservers: " + toIndentedString(nameservers) + "\n" +
                          "    search: " + toIndentedString(search) + "\n" +
                          "    options: " + toIndentedString(options) + "\n" +
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


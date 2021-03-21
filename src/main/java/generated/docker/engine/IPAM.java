package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class IPAM {

    private String driver = "default";

    private List<Map<String, String>> config = new ArrayList<>();

    private Map<String, String> options = new HashMap<>();

    /**
     * Name of the IPAM driver to use.
     **/
    public IPAM driver(String driver) {
        this.driver = driver;
        return this;
    }

    @JsonProperty("Driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * List of IPAM configuration options, specified as a map:  &#x60;&#x60;&#x60; {\&quot;Subnet\&quot;: &lt;CIDR&gt;, \&quot;IPRange\&quot;: &lt;CIDR&gt;, \&quot;Gateway\&quot;: &lt;IP address&gt;, \&quot;AuxAddress\&quot;: &lt;device_name:IP address&gt;} &#x60;&#x60;&#x60;
     **/
    public IPAM config(List<Map<String, String>> config) {
        this.config = config;
        return this;
    }

    @JsonProperty("Config")
    public List<Map<String, String>> getConfig() {
        return config;
    }

    public void setConfig(List<Map<String, String>> config) {
        this.config = config;
    }

    /**
     * Driver-specific options, specified as a map.
     **/
    public IPAM options(Map<String, String> options) {
        this.options = options;
        return this;
    }

    @JsonProperty("Options")
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
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
        var IPAM = (IPAM) o;
        return Objects.equals(this.driver, IPAM.driver) &&
                       Objects.equals(this.config, IPAM.config) &&
                       Objects.equals(this.options, IPAM.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, config, options);
    }

    @Override
    public String toString() {
        return "class IPAM {\n" +
                       "    driver: " + toIndentedString(driver) + "\n" +
                       "    config: " + toIndentedString(config) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A request for devices to be sent to device drivers
 **/

public class DeviceRequest {

    private String driver;

    private Integer count;

    private List<String> deviceIDs = new ArrayList<>();

    private List<List<String>> capabilities = new ArrayList<>();

    private Map<String, String> options = new HashMap<>();

    /**
     *
     **/
    public DeviceRequest driver(String driver) {
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
     *
     **/
    public DeviceRequest count(Integer count) {
        this.count = count;
        return this;
    }

    @JsonProperty("Count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     **/
    public DeviceRequest deviceIDs(List<String> deviceIDs) {
        this.deviceIDs = deviceIDs;
        return this;
    }

    @JsonProperty("DeviceIDs")
    public List<String> getDeviceIDs() {
        return deviceIDs;
    }

    public void setDeviceIDs(List<String> deviceIDs) {
        this.deviceIDs = deviceIDs;
    }

    /**
     * A list of capabilities; an OR list of AND lists of capabilities.
     **/
    public DeviceRequest capabilities(List<List<String>> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    @JsonProperty("Capabilities")
    public List<List<String>> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<List<String>> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Driver-specific options, specified as a key/value pairs. These options are passed directly to the driver.
     **/
    public DeviceRequest options(Map<String, String> options) {
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
        var deviceRequest = (DeviceRequest) o;
        return Objects.equals(this.driver, deviceRequest.driver) &&
                       Objects.equals(this.count, deviceRequest.count) &&
                       Objects.equals(this.deviceIDs, deviceRequest.deviceIDs) &&
                       Objects.equals(this.capabilities, deviceRequest.capabilities) &&
                       Objects.equals(this.options, deviceRequest.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, count, deviceIDs, capabilities, options);
    }

    @Override
    public String toString() {

        return "class DeviceRequest {\n" +
                            "    driver: " + toIndentedString(driver) + "\n" +
                            "    count: " + toIndentedString(count) + "\n" +
                            "    deviceIDs: " + toIndentedString(deviceIDs) + "\n" +
                            "    capabilities: " + toIndentedString(capabilities) + "\n" +
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


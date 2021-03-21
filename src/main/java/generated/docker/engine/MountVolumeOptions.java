package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Optional configuration for the &#x60;volume&#x60; type.
 **/

public class MountVolumeOptions {

    private Boolean noCopy = false;

    private Map<String, String> labels = new HashMap<>();

    private MountVolumeOptionsDriverConfig driverConfig;

    /**
     * Populate volume with data from the target.
     **/
    public MountVolumeOptions noCopy(Boolean noCopy) {
        this.noCopy = noCopy;
        return this;
    }

    @JsonProperty("NoCopy")
    public Boolean getNoCopy() {
        return noCopy;
    }

    public void setNoCopy(Boolean noCopy) {
        this.noCopy = noCopy;
    }

    /**
     * User-defined key/value metadata.
     **/
    public MountVolumeOptions labels(Map<String, String> labels) {
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

    /**
     *
     **/
    public MountVolumeOptions driverConfig(MountVolumeOptionsDriverConfig driverConfig) {
        this.driverConfig = driverConfig;
        return this;
    }

    @JsonProperty("DriverConfig")
    public MountVolumeOptionsDriverConfig getDriverConfig() {
        return driverConfig;
    }

    public void setDriverConfig(MountVolumeOptionsDriverConfig driverConfig) {
        this.driverConfig = driverConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var mountVolumeOptions = (MountVolumeOptions) o;
        return Objects.equals(this.noCopy, mountVolumeOptions.noCopy) &&
                       Objects.equals(this.labels, mountVolumeOptions.labels) &&
                       Objects.equals(this.driverConfig, mountVolumeOptions.driverConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noCopy, labels, driverConfig);
    }

    @Override
    public String toString() {

        return "class MountVolumeOptions {\n" +
                            "    noCopy: " + toIndentedString(noCopy) + "\n" +
                            "    labels: " + toIndentedString(labels) + "\n" +
                            "    driverConfig: " + toIndentedString(driverConfig) + "\n" +
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


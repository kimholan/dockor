package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DistributionInspectResponsePlatforms {

    private String architecture;

    private String OS;

    private String osVersion;

    private List<String> osFeatures = new ArrayList<>();

    private String variant;

    private List<String> features = new ArrayList<>();

    /**
     *
     **/
    public DistributionInspectResponsePlatforms architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    @JsonProperty("Architecture")
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     *
     **/
    public DistributionInspectResponsePlatforms OS(String OS) {
        this.OS = OS;
        return this;
    }

    @JsonProperty("OS")
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     *
     **/
    public DistributionInspectResponsePlatforms osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    @JsonProperty("OSVersion")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     *
     **/
    public DistributionInspectResponsePlatforms osFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
        return this;
    }

    @JsonProperty("OSFeatures")
    public List<String> getOsFeatures() {
        return osFeatures;
    }

    public void setOsFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
    }

    /**
     *
     **/
    public DistributionInspectResponsePlatforms variant(String variant) {
        this.variant = variant;
        return this;
    }

    @JsonProperty("Variant")
    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     *
     **/
    public DistributionInspectResponsePlatforms features(List<String> features) {
        this.features = features;
        return this;
    }

    @JsonProperty("Features")
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var distributionInspectResponsePlatforms = (DistributionInspectResponsePlatforms) o;
        return Objects.equals(this.architecture, distributionInspectResponsePlatforms.architecture) &&
                       Objects.equals(this.OS, distributionInspectResponsePlatforms.OS) &&
                       Objects.equals(this.osVersion, distributionInspectResponsePlatforms.osVersion) &&
                       Objects.equals(this.osFeatures, distributionInspectResponsePlatforms.osFeatures) &&
                       Objects.equals(this.variant, distributionInspectResponsePlatforms.variant) &&
                       Objects.equals(this.features, distributionInspectResponsePlatforms.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architecture, OS, osVersion, osFeatures, variant, features);
    }

    @Override
    public String toString() {

        return "class DistributionInspectResponsePlatforms {\n" +
                            "    architecture: " + toIndentedString(architecture) + "\n" +
                            "    OS: " + toIndentedString(OS) + "\n" +
                            "    osVersion: " + toIndentedString(osVersion) + "\n" +
                            "    osFeatures: " + toIndentedString(osFeatures) + "\n" +
                            "    variant: " + toIndentedString(variant) + "\n" +
                            "    features: " + toIndentedString(features) + "\n" +
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


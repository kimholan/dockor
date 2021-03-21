package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DistributionInspectResponse {

    private DistributionInspectResponseDescriptor descriptor;

    private List<DistributionInspectResponsePlatforms> platforms = new ArrayList<>();

    /**
     *
     **/
    public DistributionInspectResponse descriptor(DistributionInspectResponseDescriptor descriptor) {
        this.descriptor = descriptor;
        return this;
    }

    @JsonProperty("Descriptor")
    public DistributionInspectResponseDescriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(DistributionInspectResponseDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * An array containing all platforms supported by the image.
     **/
    public DistributionInspectResponse platforms(List<DistributionInspectResponsePlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }

    @JsonProperty("Platforms")
    public List<DistributionInspectResponsePlatforms> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<DistributionInspectResponsePlatforms> platforms) {
        this.platforms = platforms;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var distributionInspectResponse = (DistributionInspectResponse) o;
        return Objects.equals(this.descriptor, distributionInspectResponse.descriptor) &&
                       Objects.equals(this.platforms, distributionInspectResponse.platforms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descriptor, platforms);
    }

    @Override
    public String toString() {

        return "class DistributionInspectResponse {\n" +
                            "    descriptor: " + toIndentedString(descriptor) + "\n" +
                            "    platforms: " + toIndentedString(platforms) + "\n" +
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


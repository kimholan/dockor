package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A descriptor struct containing digest, media type, and size.
 **/

public class DistributionInspectResponseDescriptor {

    private String mediaType;

    private Long size;

    private String digest;

    private List<String> urLs = new ArrayList<>();

    /**
     *
     **/
    public DistributionInspectResponseDescriptor mediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @JsonProperty("MediaType")
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     *
     **/
    public DistributionInspectResponseDescriptor size(Long size) {
        this.size = size;
        return this;
    }

    @JsonProperty("Size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     *
     **/
    public DistributionInspectResponseDescriptor digest(String digest) {
        this.digest = digest;
        return this;
    }

    @JsonProperty("Digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     *
     **/
    public DistributionInspectResponseDescriptor urLs(List<String> urLs) {
        this.urLs = urLs;
        return this;
    }

    @JsonProperty("URLs")
    public List<String> getUrLs() {
        return urLs;
    }

    public void setUrLs(List<String> urLs) {
        this.urLs = urLs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var distributionInspectResponseDescriptor = (DistributionInspectResponseDescriptor) o;
        return Objects.equals(this.mediaType, distributionInspectResponseDescriptor.mediaType) &&
                       Objects.equals(this.size, distributionInspectResponseDescriptor.size) &&
                       Objects.equals(this.digest, distributionInspectResponseDescriptor.digest) &&
                       Objects.equals(this.urLs, distributionInspectResponseDescriptor.urLs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaType, size, digest, urLs);
    }

    @Override
    public String toString() {

        return "class DistributionInspectResponseDescriptor {\n" +
                            "    mediaType: " + toIndentedString(mediaType) + "\n" +
                            "    size: " + toIndentedString(size) + "\n" +
                            "    digest: " + toIndentedString(digest) + "\n" +
                            "    urLs: " + toIndentedString(urLs) + "\n" +
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


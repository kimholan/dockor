package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Optional configuration for the &#x60;tmpfs&#x60; type.
 **/

public class MountTmpfsOptions {

    private Long sizeBytes;

    private Integer mode;

    /**
     * The size for the tmpfs mount in bytes.
     **/
    public MountTmpfsOptions sizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    @JsonProperty("SizeBytes")
    public Long getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    /**
     * The permission mode for the tmpfs mount in an integer.
     **/
    public MountTmpfsOptions mode(Integer mode) {
        this.mode = mode;
        return this;
    }

    @JsonProperty("Mode")
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var mountTmpfsOptions = (MountTmpfsOptions) o;
        return Objects.equals(this.sizeBytes, mountTmpfsOptions.sizeBytes) &&
                       Objects.equals(this.mode, mountTmpfsOptions.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeBytes, mode);
    }

    @Override
    public String toString() {

        return "class MountTmpfsOptions {\n" +
                            "    sizeBytes: " + toIndentedString(sizeBytes) + "\n" +
                            "    mode: " + toIndentedString(mode) + "\n" +
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


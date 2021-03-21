package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ImageMetadata {

    private String lastTagTime;

    /**
     *
     **/
    public ImageMetadata lastTagTime(String lastTagTime) {
        this.lastTagTime = lastTagTime;
        return this;
    }

    @JsonProperty("LastTagTime")
    public String getLastTagTime() {
        return lastTagTime;
    }

    public void setLastTagTime(String lastTagTime) {
        this.lastTagTime = lastTagTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var imageMetadata = (ImageMetadata) o;
        return Objects.equals(this.lastTagTime, imageMetadata.lastTagTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastTagTime);
    }

    @Override
    public String toString() {

        return "class ImageMetadata {\n" +
                            "    lastTagTime: " + toIndentedString(lastTagTime) + "\n" +
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


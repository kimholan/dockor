package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImagePruneResponse {

    private List<ImageDeleteResponseItem> imagesDeleted = new ArrayList<>();

    private Long spaceReclaimed;

    /**
     * Images that were deleted
     **/
    public ImagePruneResponse imagesDeleted(List<ImageDeleteResponseItem> imagesDeleted) {
        this.imagesDeleted = imagesDeleted;
        return this;
    }

    @JsonProperty("ImagesDeleted")
    public List<ImageDeleteResponseItem> getImagesDeleted() {
        return imagesDeleted;
    }

    public void setImagesDeleted(List<ImageDeleteResponseItem> imagesDeleted) {
        this.imagesDeleted = imagesDeleted;
    }

    /**
     * Disk space reclaimed in bytes
     **/
    public ImagePruneResponse spaceReclaimed(Long spaceReclaimed) {
        this.spaceReclaimed = spaceReclaimed;
        return this;
    }

    @JsonProperty("SpaceReclaimed")
    public Long getSpaceReclaimed() {
        return spaceReclaimed;
    }

    public void setSpaceReclaimed(Long spaceReclaimed) {
        this.spaceReclaimed = spaceReclaimed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var imagePruneResponse = (ImagePruneResponse) o;
        return Objects.equals(this.imagesDeleted, imagePruneResponse.imagesDeleted) &&
                       Objects.equals(this.spaceReclaimed, imagePruneResponse.spaceReclaimed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagesDeleted, spaceReclaimed);
    }

    @Override
    public String toString() {

        return "class ImagePruneResponse {\n" +
                            "    imagesDeleted: " + toIndentedString(imagesDeleted) + "\n" +
                            "    spaceReclaimed: " + toIndentedString(spaceReclaimed) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ImageDeleteResponseItem {

    private String untagged;

    private String deleted;

    /**
     * The image ID of an image that was untagged
     **/
    public ImageDeleteResponseItem untagged(String untagged) {
        this.untagged = untagged;
        return this;
    }

    @JsonProperty("Untagged")
    public String getUntagged() {
        return untagged;
    }

    public void setUntagged(String untagged) {
        this.untagged = untagged;
    }

    /**
     * The image ID of an image that was deleted
     **/
    public ImageDeleteResponseItem deleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    @JsonProperty("Deleted")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var imageDeleteResponseItem = (ImageDeleteResponseItem) o;
        return Objects.equals(this.untagged, imageDeleteResponseItem.untagged) &&
                       Objects.equals(this.deleted, imageDeleteResponseItem.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(untagged, deleted);
    }

    @Override
    public String toString() {

        return "class ImageDeleteResponseItem {\n" +
                            "    untagged: " + toIndentedString(untagged) + "\n" +
                            "    deleted: " + toIndentedString(deleted) + "\n" +
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


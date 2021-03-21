package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * individual image layer information in response to ImageHistory operation
 **/

public class HistoryResponseItem {

    private String id;

    private Long created;

    private String createdBy;

    private List<String> tags = new ArrayList<>();

    private Long size;

    private String comment;

    /**
     *
     **/
    public HistoryResponseItem id(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     **/
    public HistoryResponseItem created(Long created) {
        this.created = created;
        return this;
    }

    @JsonProperty("Created")
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    /**
     *
     **/
    public HistoryResponseItem createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @JsonProperty("CreatedBy")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     *
     **/
    public HistoryResponseItem tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("Tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     *
     **/
    public HistoryResponseItem size(Long size) {
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
    public HistoryResponseItem comment(String comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var historyResponseItem = (HistoryResponseItem) o;
        return Objects.equals(this.id, historyResponseItem.id) &&
                       Objects.equals(this.created, historyResponseItem.created) &&
                       Objects.equals(this.createdBy, historyResponseItem.createdBy) &&
                       Objects.equals(this.tags, historyResponseItem.tags) &&
                       Objects.equals(this.size, historyResponseItem.size) &&
                       Objects.equals(this.comment, historyResponseItem.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, createdBy, tags, size, comment);
    }

    @Override
    public String toString() {

        return "class HistoryResponseItem {\n" +
                            "    id: " + toIndentedString(id) + "\n" +
                            "    created: " + toIndentedString(created) + "\n" +
                            "    createdBy: " + toIndentedString(createdBy) + "\n" +
                            "    tags: " + toIndentedString(tags) + "\n" +
                            "    size: " + toIndentedString(size) + "\n" +
                            "    comment: " + toIndentedString(comment) + "\n" +
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


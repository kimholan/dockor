package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ImageSummary {

    private String id;

    private String parentId;

    private List<String> repoTags = new ArrayList<>();

    private List<String> repoDigests = new ArrayList<>();

    private Integer created;

    private Integer size;

    private Integer sharedSize;

    private Integer virtualSize;

    private Map<String, String> labels = new HashMap<>();

    private Integer containers;

    /**
     *
     **/
    public ImageSummary id(String id) {
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
    public ImageSummary parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    @JsonProperty("ParentId")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     *
     **/
    public ImageSummary repoTags(List<String> repoTags) {
        this.repoTags = repoTags;
        return this;
    }

    @JsonProperty("RepoTags")
    public List<String> getRepoTags() {
        return repoTags;
    }

    public void setRepoTags(List<String> repoTags) {
        this.repoTags = repoTags;
    }

    /**
     *
     **/
    public ImageSummary repoDigests(List<String> repoDigests) {
        this.repoDigests = repoDigests;
        return this;
    }

    @JsonProperty("RepoDigests")
    public List<String> getRepoDigests() {
        return repoDigests;
    }

    public void setRepoDigests(List<String> repoDigests) {
        this.repoDigests = repoDigests;
    }

    /**
     *
     **/
    public ImageSummary created(Integer created) {
        this.created = created;
        return this;
    }

    @JsonProperty("Created")
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     *
     **/
    public ImageSummary size(Integer size) {
        this.size = size;
        return this;
    }

    @JsonProperty("Size")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     *
     **/
    public ImageSummary sharedSize(Integer sharedSize) {
        this.sharedSize = sharedSize;
        return this;
    }

    @JsonProperty("SharedSize")
    public Integer getSharedSize() {
        return sharedSize;
    }

    public void setSharedSize(Integer sharedSize) {
        this.sharedSize = sharedSize;
    }

    /**
     *
     **/
    public ImageSummary virtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
        return this;
    }

    @JsonProperty("VirtualSize")
    public Integer getVirtualSize() {
        return virtualSize;
    }

    public void setVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
    }

    /**
     *
     **/
    public ImageSummary labels(Map<String, String> labels) {
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
    public ImageSummary containers(Integer containers) {
        this.containers = containers;
        return this;
    }

    @JsonProperty("Containers")
    public Integer getContainers() {
        return containers;
    }

    public void setContainers(Integer containers) {
        this.containers = containers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var imageSummary = (ImageSummary) o;
        return Objects.equals(this.id, imageSummary.id) &&
                       Objects.equals(this.parentId, imageSummary.parentId) &&
                       Objects.equals(this.repoTags, imageSummary.repoTags) &&
                       Objects.equals(this.repoDigests, imageSummary.repoDigests) &&
                       Objects.equals(this.created, imageSummary.created) &&
                       Objects.equals(this.size, imageSummary.size) &&
                       Objects.equals(this.sharedSize, imageSummary.sharedSize) &&
                       Objects.equals(this.virtualSize, imageSummary.virtualSize) &&
                       Objects.equals(this.labels, imageSummary.labels) &&
                       Objects.equals(this.containers, imageSummary.containers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, repoTags, repoDigests, created, size, sharedSize, virtualSize, labels, containers);
    }

    @Override
    public String toString() {

        return "class ImageSummary {\n" +
                            "    id: " + toIndentedString(id) + "\n" +
                            "    parentId: " + toIndentedString(parentId) + "\n" +
                            "    repoTags: " + toIndentedString(repoTags) + "\n" +
                            "    repoDigests: " + toIndentedString(repoDigests) + "\n" +
                            "    created: " + toIndentedString(created) + "\n" +
                            "    size: " + toIndentedString(size) + "\n" +
                            "    sharedSize: " + toIndentedString(sharedSize) + "\n" +
                            "    virtualSize: " + toIndentedString(virtualSize) + "\n" +
                            "    labels: " + toIndentedString(labels) + "\n" +
                            "    containers: " + toIndentedString(containers) + "\n" +
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


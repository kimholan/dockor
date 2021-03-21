package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BuildCache {

    private String ID;

    private String parent;

    private String type;

    private String description;

    private Boolean inUse;

    private Boolean shared;

    private Integer size;

    private String createdAt;

    private String lastUsedAt;

    private Integer usageCount;

    /**
     *
     **/
    public BuildCache ID(String ID) {
        this.ID = ID;
        return this;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     **/
    public BuildCache parent(String parent) {
        this.parent = parent;
        return this;
    }

    @JsonProperty("Parent")
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     *
     **/
    public BuildCache type(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/
    public BuildCache description(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     **/
    public BuildCache inUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }

    @JsonProperty("InUse")
    public Boolean getInUse() {
        return inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    /**
     *
     **/
    public BuildCache shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    @JsonProperty("Shared")
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    /**
     * Amount of disk space used by the build cache (in bytes).
     **/
    public BuildCache size(Integer size) {
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
     * Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public BuildCache createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("CreatedAt")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public BuildCache lastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    @JsonProperty("LastUsedAt")
    public String getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    /**
     *
     **/
    public BuildCache usageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    @JsonProperty("UsageCount")
    public Integer getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var buildCache = (BuildCache) o;
        return Objects.equals(this.ID, buildCache.ID) &&
                       Objects.equals(this.parent, buildCache.parent) &&
                       Objects.equals(this.type, buildCache.type) &&
                       Objects.equals(this.description, buildCache.description) &&
                       Objects.equals(this.inUse, buildCache.inUse) &&
                       Objects.equals(this.shared, buildCache.shared) &&
                       Objects.equals(this.size, buildCache.size) &&
                       Objects.equals(this.createdAt, buildCache.createdAt) &&
                       Objects.equals(this.lastUsedAt, buildCache.lastUsedAt) &&
                       Objects.equals(this.usageCount, buildCache.usageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, parent, type, description, inUse, shared, size, createdAt, lastUsedAt, usageCount);
    }

    @Override
    public String toString() {

        return "class BuildCache {\n" +
                            "    ID: " + toIndentedString(ID) + "\n" +
                            "    parent: " + toIndentedString(parent) + "\n" +
                            "    type: " + toIndentedString(type) + "\n" +
                            "    description: " + toIndentedString(description) + "\n" +
                            "    inUse: " + toIndentedString(inUse) + "\n" +
                            "    shared: " + toIndentedString(shared) + "\n" +
                            "    size: " + toIndentedString(size) + "\n" +
                            "    createdAt: " + toIndentedString(createdAt) + "\n" +
                            "    lastUsedAt: " + toIndentedString(lastUsedAt) + "\n" +
                            "    usageCount: " + toIndentedString(usageCount) + "\n" +
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


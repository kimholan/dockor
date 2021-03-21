package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Image {

    private String id;

    private List<String> repoTags = new ArrayList<>();

    private List<String> repoDigests = new ArrayList<>();

    private String parent;

    private String comment;

    private String created;

    private String container;

    private ContainerConfig containerConfig;

    private String dockerVersion;

    private String author;

    private ContainerConfig config;

    private String architecture;

    private String os;

    private String osVersion;

    private Long size;

    private Long virtualSize;

    private GraphDriverData graphDriver;

    private ImageRootFS rootFS;

    private ImageMetadata metadata;

    /**
     *
     **/
    public Image id(String id) {
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
    public Image repoTags(List<String> repoTags) {
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
    public Image repoDigests(List<String> repoDigests) {
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
    public Image parent(String parent) {
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
    public Image comment(String comment) {
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

    /**
     *
     **/
    public Image created(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("Created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     **/
    public Image container(String container) {
        this.container = container;
        return this;
    }

    @JsonProperty("Container")
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     *
     **/
    public Image containerConfig(ContainerConfig containerConfig) {
        this.containerConfig = containerConfig;
        return this;
    }

    @JsonProperty("ContainerConfig")
    public ContainerConfig getContainerConfig() {
        return containerConfig;
    }

    public void setContainerConfig(ContainerConfig containerConfig) {
        this.containerConfig = containerConfig;
    }

    /**
     *
     **/
    public Image dockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }

    @JsonProperty("DockerVersion")
    public String getDockerVersion() {
        return dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
    }

    /**
     *
     **/
    public Image author(String author) {
        this.author = author;
        return this;
    }

    @JsonProperty("Author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     **/
    public Image config(ContainerConfig config) {
        this.config = config;
        return this;
    }

    @JsonProperty("Config")
    public ContainerConfig getConfig() {
        return config;
    }

    public void setConfig(ContainerConfig config) {
        this.config = config;
    }

    /**
     *
     **/
    public Image architecture(String architecture) {
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
    public Image os(String os) {
        this.os = os;
        return this;
    }

    @JsonProperty("Os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    /**
     *
     **/
    public Image osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    @JsonProperty("OsVersion")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     *
     **/
    public Image size(Long size) {
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
    public Image virtualSize(Long virtualSize) {
        this.virtualSize = virtualSize;
        return this;
    }

    @JsonProperty("VirtualSize")
    public Long getVirtualSize() {
        return virtualSize;
    }

    public void setVirtualSize(Long virtualSize) {
        this.virtualSize = virtualSize;
    }

    /**
     *
     **/
    public Image graphDriver(GraphDriverData graphDriver) {
        this.graphDriver = graphDriver;
        return this;
    }

    @JsonProperty("GraphDriver")
    public GraphDriverData getGraphDriver() {
        return graphDriver;
    }

    public void setGraphDriver(GraphDriverData graphDriver) {
        this.graphDriver = graphDriver;
    }

    /**
     *
     **/
    public Image rootFS(ImageRootFS rootFS) {
        this.rootFS = rootFS;
        return this;
    }

    @JsonProperty("RootFS")
    public ImageRootFS getRootFS() {
        return rootFS;
    }

    public void setRootFS(ImageRootFS rootFS) {
        this.rootFS = rootFS;
    }

    /**
     *
     **/
    public Image metadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("Metadata")
    public ImageMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var image = (Image) o;
        return Objects.equals(this.id, image.id) &&
                       Objects.equals(this.repoTags, image.repoTags) &&
                       Objects.equals(this.repoDigests, image.repoDigests) &&
                       Objects.equals(this.parent, image.parent) &&
                       Objects.equals(this.comment, image.comment) &&
                       Objects.equals(this.created, image.created) &&
                       Objects.equals(this.container, image.container) &&
                       Objects.equals(this.containerConfig, image.containerConfig) &&
                       Objects.equals(this.dockerVersion, image.dockerVersion) &&
                       Objects.equals(this.author, image.author) &&
                       Objects.equals(this.config, image.config) &&
                       Objects.equals(this.architecture, image.architecture) &&
                       Objects.equals(this.os, image.os) &&
                       Objects.equals(this.osVersion, image.osVersion) &&
                       Objects.equals(this.size, image.size) &&
                       Objects.equals(this.virtualSize, image.virtualSize) &&
                       Objects.equals(this.graphDriver, image.graphDriver) &&
                       Objects.equals(this.rootFS, image.rootFS) &&
                       Objects.equals(this.metadata, image.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repoTags, repoDigests, parent, comment, created, container, containerConfig, dockerVersion, author, config, architecture, os, osVersion, size, virtualSize, graphDriver, rootFS, metadata);
    }

    @Override
    public String toString() {
        return "class Image {\n" +
                       "    id: " + toIndentedString(id) + "\n" +
                       "    repoTags: " + toIndentedString(repoTags) + "\n" +
                       "    repoDigests: " + toIndentedString(repoDigests) + "\n" +
                       "    parent: " + toIndentedString(parent) + "\n" +
                       "    comment: " + toIndentedString(comment) + "\n" +
                       "    created: " + toIndentedString(created) + "\n" +
                       "    container: " + toIndentedString(container) + "\n" +
                       "    containerConfig: " + toIndentedString(containerConfig) + "\n" +
                       "    dockerVersion: " + toIndentedString(dockerVersion) + "\n" +
                       "    author: " + toIndentedString(author) + "\n" +
                       "    config: " + toIndentedString(config) + "\n" +
                       "    architecture: " + toIndentedString(architecture) + "\n" +
                       "    os: " + toIndentedString(os) + "\n" +
                       "    osVersion: " + toIndentedString(osVersion) + "\n" +
                       "    size: " + toIndentedString(size) + "\n" +
                       "    virtualSize: " + toIndentedString(virtualSize) + "\n" +
                       "    graphDriver: " + toIndentedString(graphDriver) + "\n" +
                       "    rootFS: " + toIndentedString(rootFS) + "\n" +
                       "    metadata: " + toIndentedString(metadata) + "\n" +
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


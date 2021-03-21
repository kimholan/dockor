package generated.docker.engine;

import generated.docker.engine.BuildCache;
import generated.docker.engine.ContainerSummary;
import generated.docker.engine.ImageSummary;
import generated.docker.engine.Volume;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemDataUsageResponse   {
  
  private Long layersSize;
  private List<ImageSummary> images = new ArrayList<>();
  private List<ContainerSummary> containers = new ArrayList<>();
  private List<Volume> volumes = new ArrayList<>();
  private List<BuildCache> buildCache = new ArrayList<>();

  /**
   **/
  public SystemDataUsageResponse layersSize(Long layersSize) {
    this.layersSize = layersSize;
    return this;
  }

  

  
  @JsonProperty("LayersSize")
  public Long getLayersSize() {
    return layersSize;
  }

  public void setLayersSize(Long layersSize) {
    this.layersSize = layersSize;
  }/**
   **/
  public SystemDataUsageResponse images(List<ImageSummary> images) {
    this.images = images;
    return this;
  }

  

  
  @JsonProperty("Images")
  public List<ImageSummary> getImages() {
    return images;
  }

  public void setImages(List<ImageSummary> images) {
    this.images = images;
  }/**
   **/
  public SystemDataUsageResponse containers(List<ContainerSummary> containers) {
    this.containers = containers;
    return this;
  }

  

  
  @JsonProperty("Containers")
  public List<ContainerSummary> getContainers() {
    return containers;
  }

  public void setContainers(List<ContainerSummary> containers) {
    this.containers = containers;
  }/**
   **/
  public SystemDataUsageResponse volumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  

  
  @JsonProperty("Volumes")
  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }/**
   **/
  public SystemDataUsageResponse buildCache(List<BuildCache> buildCache) {
    this.buildCache = buildCache;
    return this;
  }

  

  
  @JsonProperty("BuildCache")
  public List<BuildCache> getBuildCache() {
    return buildCache;
  }

  public void setBuildCache(List<BuildCache> buildCache) {
    this.buildCache = buildCache;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemDataUsageResponse = (SystemDataUsageResponse) o;
    return Objects.equals(this.layersSize, systemDataUsageResponse.layersSize) &&
        Objects.equals(this.images, systemDataUsageResponse.images) &&
        Objects.equals(this.containers, systemDataUsageResponse.containers) &&
        Objects.equals(this.volumes, systemDataUsageResponse.volumes) &&
        Objects.equals(this.buildCache, systemDataUsageResponse.buildCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layersSize, images, containers, volumes, buildCache);
  }

  @Override
  public String toString() {

    return "class SystemDataUsageResponse {\n" +
                          "    layersSize: " + toIndentedString(layersSize) + "\n" +
                          "    images: " + toIndentedString(images) + "\n" +
                          "    containers: " + toIndentedString(containers) + "\n" +
                          "    volumes: " + toIndentedString(volumes) + "\n" +
                          "    buildCache: " + toIndentedString(buildCache) + "\n" +
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


package generated.docker.engine;

import generated.docker.engine.ProgressDetail;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PushImageInfo   {
  
  private String error;
  private String status;
  private String progress;
  private ProgressDetail progressDetail;

  /**
   **/
  public PushImageInfo error(String error) {
    this.error = error;
    return this;
  }

  

  
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }/**
   **/
  public PushImageInfo status(String status) {
    this.status = status;
    return this;
  }

  

  
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }/**
   **/
  public PushImageInfo progress(String progress) {
    this.progress = progress;
    return this;
  }

  

  
  @JsonProperty("progress")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }/**
   **/
  public PushImageInfo progressDetail(ProgressDetail progressDetail) {
    this.progressDetail = progressDetail;
    return this;
  }

  

  
  @JsonProperty("progressDetail")
  public ProgressDetail getProgressDetail() {
    return progressDetail;
  }

  public void setProgressDetail(ProgressDetail progressDetail) {
    this.progressDetail = progressDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var pushImageInfo = (PushImageInfo) o;
    return Objects.equals(this.error, pushImageInfo.error) &&
        Objects.equals(this.status, pushImageInfo.status) &&
        Objects.equals(this.progress, pushImageInfo.progress) &&
        Objects.equals(this.progressDetail, pushImageInfo.progressDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, status, progress, progressDetail);
  }

  @Override
  public String toString() {

    return "class PushImageInfo {\n" +
                          "    error: " + toIndentedString(error) + "\n" +
                          "    status: " + toIndentedString(status) + "\n" +
                          "    progress: " + toIndentedString(progress) + "\n" +
                          "    progressDetail: " + toIndentedString(progressDetail) + "\n" +
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


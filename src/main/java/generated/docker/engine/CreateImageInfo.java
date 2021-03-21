package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CreateImageInfo {

    private String id;

    private String error;

    private String status;

    private String progress;

    private ProgressDetail progressDetail;

    /**
     *
     **/
    public CreateImageInfo id(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     **/
    public CreateImageInfo error(String error) {
        this.error = error;
        return this;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     *
     **/
    public CreateImageInfo status(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     **/
    public CreateImageInfo progress(String progress) {
        this.progress = progress;
        return this;
    }

    @JsonProperty("progress")
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     *
     **/
    public CreateImageInfo progressDetail(ProgressDetail progressDetail) {
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
        var createImageInfo = (CreateImageInfo) o;
        return Objects.equals(this.id, createImageInfo.id) &&
                       Objects.equals(this.error, createImageInfo.error) &&
                       Objects.equals(this.status, createImageInfo.status) &&
                       Objects.equals(this.progress, createImageInfo.progress) &&
                       Objects.equals(this.progressDetail, createImageInfo.progressDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, error, status, progress, progressDetail);
    }

    @Override
    public String toString() {

        return "class CreateImageInfo {\n" +
                            "    id: " + toIndentedString(id) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BuildInfo {

    private String id;

    private String stream;

    private String error;

    private ErrorDetail errorDetail;

    private String status;

    private String progress;

    private ProgressDetail progressDetail;

    private ImageID aux;

    /**
     *
     **/
    public BuildInfo id(String id) {
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
    public BuildInfo stream(String stream) {
        this.stream = stream;
        return this;
    }

    @JsonProperty("stream")
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     *
     **/
    public BuildInfo error(String error) {
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
    public BuildInfo errorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    @JsonProperty("errorDetail")
    public ErrorDetail getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     *
     **/
    public BuildInfo status(String status) {
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
    public BuildInfo progress(String progress) {
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
    public BuildInfo progressDetail(ProgressDetail progressDetail) {
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

    /**
     *
     **/
    public BuildInfo aux(ImageID aux) {
        this.aux = aux;
        return this;
    }

    @JsonProperty("aux")
    public ImageID getAux() {
        return aux;
    }

    public void setAux(ImageID aux) {
        this.aux = aux;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var buildInfo = (BuildInfo) o;
        return Objects.equals(this.id, buildInfo.id) &&
                       Objects.equals(this.stream, buildInfo.stream) &&
                       Objects.equals(this.error, buildInfo.error) &&
                       Objects.equals(this.errorDetail, buildInfo.errorDetail) &&
                       Objects.equals(this.status, buildInfo.status) &&
                       Objects.equals(this.progress, buildInfo.progress) &&
                       Objects.equals(this.progressDetail, buildInfo.progressDetail) &&
                       Objects.equals(this.aux, buildInfo.aux);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stream, error, errorDetail, status, progress, progressDetail, aux);
    }

    @Override
    public String toString() {
        return "class BuildInfo {\n" +
                       "    id: " + toIndentedString(id) + "\n" +
                       "    stream: " + toIndentedString(stream) + "\n" +
                       "    error: " + toIndentedString(error) + "\n" +
                       "    errorDetail: " + toIndentedString(errorDetail) + "\n" +
                       "    status: " + toIndentedString(status) + "\n" +
                       "    progress: " + toIndentedString(progress) + "\n" +
                       "    progressDetail: " + toIndentedString(progressDetail) + "\n" +
                       "    aux: " + toIndentedString(aux) + "\n" +
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


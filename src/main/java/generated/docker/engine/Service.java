package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Service {

    private String ID;

    private ObjectVersion version;

    private String createdAt;

    private String updatedAt;

    private ServiceSpec spec;

    private ServiceEndpoint endpoint;

    private ServiceUpdateStatus updateStatus;

    private ServiceServiceStatus serviceStatus;

    private ServiceJobStatus jobStatus;

    /**
     *
     **/
    public Service ID(String ID) {
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
    public Service version(ObjectVersion version) {
        this.version = version;
        return this;
    }

    @JsonProperty("Version")
    public ObjectVersion getVersion() {
        return version;
    }

    public void setVersion(ObjectVersion version) {
        this.version = version;
    }

    /**
     *
     **/
    public Service createdAt(String createdAt) {
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
     *
     **/
    public Service updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("UpdatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     **/
    public Service spec(ServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    @JsonProperty("Spec")
    public ServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(ServiceSpec spec) {
        this.spec = spec;
    }

    /**
     *
     **/
    public Service endpoint(ServiceEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @JsonProperty("Endpoint")
    public ServiceEndpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(ServiceEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     *
     **/
    public Service updateStatus(ServiceUpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    @JsonProperty("UpdateStatus")
    public ServiceUpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(ServiceUpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     *
     **/
    public Service serviceStatus(ServiceServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    @JsonProperty("ServiceStatus")
    public ServiceServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     *
     **/
    public Service jobStatus(ServiceJobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    @JsonProperty("JobStatus")
    public ServiceJobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(ServiceJobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var service = (Service) o;
        return Objects.equals(this.ID, service.ID) &&
                       Objects.equals(this.version, service.version) &&
                       Objects.equals(this.createdAt, service.createdAt) &&
                       Objects.equals(this.updatedAt, service.updatedAt) &&
                       Objects.equals(this.spec, service.spec) &&
                       Objects.equals(this.endpoint, service.endpoint) &&
                       Objects.equals(this.updateStatus, service.updateStatus) &&
                       Objects.equals(this.serviceStatus, service.serviceStatus) &&
                       Objects.equals(this.jobStatus, service.jobStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, version, createdAt, updatedAt, spec, endpoint, updateStatus, serviceStatus, jobStatus);
    }

    @Override
    public String toString() {
        return "class Service {\n" +
                       "    ID: " + toIndentedString(ID) + "\n" +
                       "    version: " + toIndentedString(version) + "\n" +
                       "    createdAt: " + toIndentedString(createdAt) + "\n" +
                       "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
                       "    spec: " + toIndentedString(spec) + "\n" +
                       "    endpoint: " + toIndentedString(endpoint) + "\n" +
                       "    updateStatus: " + toIndentedString(updateStatus) + "\n" +
                       "    serviceStatus: " + toIndentedString(serviceStatus) + "\n" +
                       "    jobStatus: " + toIndentedString(jobStatus) + "\n" +
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


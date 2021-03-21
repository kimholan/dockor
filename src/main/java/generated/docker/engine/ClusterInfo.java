package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClusterInfo represents information about the swarm as is returned by the \&quot;/info\&quot; endpoint. Join-tokens are not included.
 **/

public class ClusterInfo {

    private String ID;

    private ObjectVersion version;

    private String createdAt;

    private String updatedAt;

    private SwarmSpec spec;

    private TLSInfo tlSInfo;

    private Boolean rootRotationInProgress;

    private Integer dataPathPort;

    private List<String> defaultAddrPool = new ArrayList<>();

    private Integer subnetSize;

    /**
     * The ID of the swarm.
     **/
    public ClusterInfo ID(String ID) {
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
    public ClusterInfo version(ObjectVersion version) {
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
     * Date and time at which the swarm was initialised in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public ClusterInfo createdAt(String createdAt) {
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
     * Date and time at which the swarm was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
     **/
    public ClusterInfo updatedAt(String updatedAt) {
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
    public ClusterInfo spec(SwarmSpec spec) {
        this.spec = spec;
        return this;
    }

    @JsonProperty("Spec")
    public SwarmSpec getSpec() {
        return spec;
    }

    public void setSpec(SwarmSpec spec) {
        this.spec = spec;
    }

    /**
     *
     **/
    public ClusterInfo tlSInfo(TLSInfo tlSInfo) {
        this.tlSInfo = tlSInfo;
        return this;
    }

    @JsonProperty("TLSInfo")
    public TLSInfo getTlSInfo() {
        return tlSInfo;
    }

    public void setTlSInfo(TLSInfo tlSInfo) {
        this.tlSInfo = tlSInfo;
    }

    /**
     * Whether there is currently a root CA rotation in progress for the swarm
     **/
    public ClusterInfo rootRotationInProgress(Boolean rootRotationInProgress) {
        this.rootRotationInProgress = rootRotationInProgress;
        return this;
    }

    @JsonProperty("RootRotationInProgress")
    public Boolean getRootRotationInProgress() {
        return rootRotationInProgress;
    }

    public void setRootRotationInProgress(Boolean rootRotationInProgress) {
        this.rootRotationInProgress = rootRotationInProgress;
    }

    /**
     * DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. If no port is set or is set to 0, the default port (4789) is used.
     **/
    public ClusterInfo dataPathPort(Integer dataPathPort) {
        this.dataPathPort = dataPathPort;
        return this;
    }

    @JsonProperty("DataPathPort")
    public Integer getDataPathPort() {
        return dataPathPort;
    }

    public void setDataPathPort(Integer dataPathPort) {
        this.dataPathPort = dataPathPort;
    }

    /**
     * Default Address Pool specifies default subnet pools for global scope networks.
     **/
    public ClusterInfo defaultAddrPool(List<String> defaultAddrPool) {
        this.defaultAddrPool = defaultAddrPool;
        return this;
    }

    @JsonProperty("DefaultAddrPool")
    public List<String> getDefaultAddrPool() {
        return defaultAddrPool;
    }

    public void setDefaultAddrPool(List<String> defaultAddrPool) {
        this.defaultAddrPool = defaultAddrPool;
    }

    /**
     * SubnetSize specifies the subnet size of the networks created from the default subnet pool.
     * maximum: 29
     **/
    public ClusterInfo subnetSize(Integer subnetSize) {
        this.subnetSize = subnetSize;
        return this;
    }

    @JsonProperty("SubnetSize")
    public Integer getSubnetSize() {
        return subnetSize;
    }

    public void setSubnetSize(Integer subnetSize) {
        this.subnetSize = subnetSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var clusterInfo = (ClusterInfo) o;
        return Objects.equals(this.ID, clusterInfo.ID) &&
                       Objects.equals(this.version, clusterInfo.version) &&
                       Objects.equals(this.createdAt, clusterInfo.createdAt) &&
                       Objects.equals(this.updatedAt, clusterInfo.updatedAt) &&
                       Objects.equals(this.spec, clusterInfo.spec) &&
                       Objects.equals(this.tlSInfo, clusterInfo.tlSInfo) &&
                       Objects.equals(this.rootRotationInProgress, clusterInfo.rootRotationInProgress) &&
                       Objects.equals(this.dataPathPort, clusterInfo.dataPathPort) &&
                       Objects.equals(this.defaultAddrPool, clusterInfo.defaultAddrPool) &&
                       Objects.equals(this.subnetSize, clusterInfo.subnetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, version, createdAt, updatedAt, spec, tlSInfo, rootRotationInProgress, dataPathPort, defaultAddrPool, subnetSize);
    }

    @Override
    public String toString() {

        return "class ClusterInfo {\n" +
                            "    ID: " + toIndentedString(ID) + "\n" +
                            "    version: " + toIndentedString(version) + "\n" +
                            "    createdAt: " + toIndentedString(createdAt) + "\n" +
                            "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
                            "    spec: " + toIndentedString(spec) + "\n" +
                            "    tlSInfo: " + toIndentedString(tlSInfo) + "\n" +
                            "    rootRotationInProgress: " + toIndentedString(rootRotationInProgress) + "\n" +
                            "    dataPathPort: " + toIndentedString(dataPathPort) + "\n" +
                            "    defaultAddrPool: " + toIndentedString(defaultAddrPool) + "\n" +
                            "    subnetSize: " + toIndentedString(subnetSize) + "\n" +
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


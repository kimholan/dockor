package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Swarm {

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

    private JoinTokens joinTokens;

    /**
     * The ID of the swarm.
     **/
    public Swarm ID(String ID) {
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
    public Swarm version(ObjectVersion version) {
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
    public Swarm createdAt(String createdAt) {
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
    public Swarm updatedAt(String updatedAt) {
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
    public Swarm spec(SwarmSpec spec) {
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
    public Swarm tlSInfo(TLSInfo tlSInfo) {
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
    public Swarm rootRotationInProgress(Boolean rootRotationInProgress) {
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
    public Swarm dataPathPort(Integer dataPathPort) {
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
    public Swarm defaultAddrPool(List<String> defaultAddrPool) {
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
    public Swarm subnetSize(Integer subnetSize) {
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

    /**
     *
     **/
    public Swarm joinTokens(JoinTokens joinTokens) {
        this.joinTokens = joinTokens;
        return this;
    }

    @JsonProperty("JoinTokens")
    public JoinTokens getJoinTokens() {
        return joinTokens;
    }

    public void setJoinTokens(JoinTokens joinTokens) {
        this.joinTokens = joinTokens;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var swarm = (Swarm) o;
        return Objects.equals(this.ID, swarm.ID) &&
                       Objects.equals(this.version, swarm.version) &&
                       Objects.equals(this.createdAt, swarm.createdAt) &&
                       Objects.equals(this.updatedAt, swarm.updatedAt) &&
                       Objects.equals(this.spec, swarm.spec) &&
                       Objects.equals(this.tlSInfo, swarm.tlSInfo) &&
                       Objects.equals(this.rootRotationInProgress, swarm.rootRotationInProgress) &&
                       Objects.equals(this.dataPathPort, swarm.dataPathPort) &&
                       Objects.equals(this.defaultAddrPool, swarm.defaultAddrPool) &&
                       Objects.equals(this.subnetSize, swarm.subnetSize) &&
                       Objects.equals(this.joinTokens, swarm.joinTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, version, createdAt, updatedAt, spec, tlSInfo, rootRotationInProgress, dataPathPort, defaultAddrPool, subnetSize, joinTokens);
    }

    @Override
    public String toString() {
        return "class Swarm {\n" +
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
                       "    joinTokens: " + toIndentedString(joinTokens) + "\n" +
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


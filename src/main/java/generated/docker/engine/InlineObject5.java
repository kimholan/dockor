package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InlineObject5 {

    private String listenAddr;

    private String advertiseAddr;

    private String dataPathAddr;

    private Integer dataPathPort;

    private List<String> defaultAddrPool = new ArrayList<>();

    private Boolean forceNewCluster;

    private Integer subnetSize;

    private SwarmSpec spec;

    /**
     * Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form &#x60;192.168.1.1:4567&#x60;, or an interface followed by a port number, like &#x60;eth0:4567&#x60;. If the port number is omitted, the default swarm listening port is used.
     **/
    public InlineObject5 listenAddr(String listenAddr) {
        this.listenAddr = listenAddr;
        return this;
    }

    @JsonProperty("ListenAddr")
    public String getListenAddr() {
        return listenAddr;
    }

    public void setListenAddr(String listenAddr) {
        this.listenAddr = listenAddr;
    }

    /**
     * Externally reachable address advertised to other nodes. This can either be an address/port combination in the form &#x60;192.168.1.1:4567&#x60;, or an interface followed by a port number, like &#x60;eth0:4567&#x60;. If the port number is omitted, the port number from the listen address is used. If &#x60;AdvertiseAddr&#x60; is not specified, it will be automatically detected when possible.
     **/
    public InlineObject5 advertiseAddr(String advertiseAddr) {
        this.advertiseAddr = advertiseAddr;
        return this;
    }

    @JsonProperty("AdvertiseAddr")
    public String getAdvertiseAddr() {
        return advertiseAddr;
    }

    public void setAdvertiseAddr(String advertiseAddr) {
        this.advertiseAddr = advertiseAddr;
    }

    /**
     * Address or interface to use for data path traffic (format: &#x60;&lt;ip|interface&gt;&#x60;), for example,  &#x60;192.168.1.1&#x60;, or an interface, like &#x60;eth0&#x60;. If &#x60;DataPathAddr&#x60; is unspecified, the same address as &#x60;AdvertiseAddr&#x60; is used.  The &#x60;DataPathAddr&#x60; specifies the address that global scope network drivers will publish towards other  nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster.
     **/
    public InlineObject5 dataPathAddr(String dataPathAddr) {
        this.dataPathAddr = dataPathAddr;
        return this;
    }

    @JsonProperty("DataPathAddr")
    public String getDataPathAddr() {
        return dataPathAddr;
    }

    public void setDataPathAddr(String dataPathAddr) {
        this.dataPathAddr = dataPathAddr;
    }

    /**
     * DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. if no port is set or is set to 0, default port 4789 will be used.
     **/
    public InlineObject5 dataPathPort(Integer dataPathPort) {
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
    public InlineObject5 defaultAddrPool(List<String> defaultAddrPool) {
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
     * Force creation of a new swarm.
     **/
    public InlineObject5 forceNewCluster(Boolean forceNewCluster) {
        this.forceNewCluster = forceNewCluster;
        return this;
    }

    @JsonProperty("ForceNewCluster")
    public Boolean getForceNewCluster() {
        return forceNewCluster;
    }

    public void setForceNewCluster(Boolean forceNewCluster) {
        this.forceNewCluster = forceNewCluster;
    }

    /**
     * SubnetSize specifies the subnet size of the networks created from the default subnet pool.
     **/
    public InlineObject5 subnetSize(Integer subnetSize) {
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
    public InlineObject5 spec(SwarmSpec spec) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var inlineObject5 = (InlineObject5) o;
        return Objects.equals(this.listenAddr, inlineObject5.listenAddr) &&
                       Objects.equals(this.advertiseAddr, inlineObject5.advertiseAddr) &&
                       Objects.equals(this.dataPathAddr, inlineObject5.dataPathAddr) &&
                       Objects.equals(this.dataPathPort, inlineObject5.dataPathPort) &&
                       Objects.equals(this.defaultAddrPool, inlineObject5.defaultAddrPool) &&
                       Objects.equals(this.forceNewCluster, inlineObject5.forceNewCluster) &&
                       Objects.equals(this.subnetSize, inlineObject5.subnetSize) &&
                       Objects.equals(this.spec, inlineObject5.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, dataPathPort, defaultAddrPool, forceNewCluster, subnetSize, spec);
    }

    @Override
    public String toString() {

        return "class InlineObject5 {\n" +
                            "    listenAddr: " + toIndentedString(listenAddr) + "\n" +
                            "    advertiseAddr: " + toIndentedString(advertiseAddr) + "\n" +
                            "    dataPathAddr: " + toIndentedString(dataPathAddr) + "\n" +
                            "    dataPathPort: " + toIndentedString(dataPathPort) + "\n" +
                            "    defaultAddrPool: " + toIndentedString(defaultAddrPool) + "\n" +
                            "    forceNewCluster: " + toIndentedString(forceNewCluster) + "\n" +
                            "    subnetSize: " + toIndentedString(subnetSize) + "\n" +
                            "    spec: " + toIndentedString(spec) + "\n" +
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


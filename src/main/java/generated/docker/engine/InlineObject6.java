package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InlineObject6 {

    private String listenAddr;

    private String advertiseAddr;

    private String dataPathAddr;

    private List<String> remoteAddrs = new ArrayList<>();

    private String joinToken;

    /**
     * Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP).
     **/
    public InlineObject6 listenAddr(String listenAddr) {
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
    public InlineObject6 advertiseAddr(String advertiseAddr) {
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
     * Address or interface to use for data path traffic (format: &#x60;&lt;ip|interface&gt;&#x60;), for example,  &#x60;192.168.1.1&#x60;, or an interface, like &#x60;eth0&#x60;. If &#x60;DataPathAddr&#x60; is unspecified, the same addres as &#x60;AdvertiseAddr&#x60; is used.  The &#x60;DataPathAddr&#x60; specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster.
     **/
    public InlineObject6 dataPathAddr(String dataPathAddr) {
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
     * Addresses of manager nodes already participating in the swarm.
     **/
    public InlineObject6 remoteAddrs(List<String> remoteAddrs) {
        this.remoteAddrs = remoteAddrs;
        return this;
    }

    @JsonProperty("RemoteAddrs")
    public List<String> getRemoteAddrs() {
        return remoteAddrs;
    }

    public void setRemoteAddrs(List<String> remoteAddrs) {
        this.remoteAddrs = remoteAddrs;
    }

    /**
     * Secret token for joining this swarm.
     **/
    public InlineObject6 joinToken(String joinToken) {
        this.joinToken = joinToken;
        return this;
    }

    @JsonProperty("JoinToken")
    public String getJoinToken() {
        return joinToken;
    }

    public void setJoinToken(String joinToken) {
        this.joinToken = joinToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var inlineObject6 = (InlineObject6) o;
        return Objects.equals(this.listenAddr, inlineObject6.listenAddr) &&
                       Objects.equals(this.advertiseAddr, inlineObject6.advertiseAddr) &&
                       Objects.equals(this.dataPathAddr, inlineObject6.dataPathAddr) &&
                       Objects.equals(this.remoteAddrs, inlineObject6.remoteAddrs) &&
                       Objects.equals(this.joinToken, inlineObject6.joinToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, remoteAddrs, joinToken);
    }

    @Override
    public String toString() {

        return "class InlineObject6 {\n" +
                            "    listenAddr: " + toIndentedString(listenAddr) + "\n" +
                            "    advertiseAddr: " + toIndentedString(advertiseAddr) + "\n" +
                            "    dataPathAddr: " + toIndentedString(dataPathAddr) + "\n" +
                            "    remoteAddrs: " + toIndentedString(remoteAddrs) + "\n" +
                            "    joinToken: " + toIndentedString(joinToken) + "\n" +
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


package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents a peer-node in the swarm
 **/

public class PeerNode {

    private String nodeID;

    private String addr;

    /**
     * Unique identifier of for this node in the swarm.
     **/
    public PeerNode nodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    @JsonProperty("NodeID")
    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    /**
     * IP address and ports at which this node can be reached.
     **/
    public PeerNode addr(String addr) {
        this.addr = addr;
        return this;
    }

    @JsonProperty("Addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var peerNode = (PeerNode) o;
        return Objects.equals(this.nodeID, peerNode.nodeID) &&
                       Objects.equals(this.addr, peerNode.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeID, addr);
    }

    @Override
    public String toString() {
        return "class PeerNode {\n" +
                       "    nodeID: " + toIndentedString(nodeID) + "\n" +
                       "    addr: " + toIndentedString(addr) + "\n" +
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


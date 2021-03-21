package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents generic information about swarm.
 **/

public class SwarmInfo {

    private String nodeID = "";

    private String nodeAddr = "";

    private LocalNodeState localNodeState = LocalNodeState.EMPTY;

    private Boolean controlAvailable = false;

    private String error = "";

    private List<PeerNode> remoteManagers = new ArrayList<>();

    private Integer nodes;

    private Integer managers;

    private ClusterInfo cluster;

    /**
     * Unique identifier of for this node in the swarm.
     **/
    public SwarmInfo nodeID(String nodeID) {
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
     * IP address at which this node can be reached by other nodes in the swarm.
     **/
    public SwarmInfo nodeAddr(String nodeAddr) {
        this.nodeAddr = nodeAddr;
        return this;
    }

    @JsonProperty("NodeAddr")
    public String getNodeAddr() {
        return nodeAddr;
    }

    public void setNodeAddr(String nodeAddr) {
        this.nodeAddr = nodeAddr;
    }

    /**
     *
     **/
    public SwarmInfo localNodeState(LocalNodeState localNodeState) {
        this.localNodeState = localNodeState;
        return this;
    }

    @JsonProperty("LocalNodeState")
    public LocalNodeState getLocalNodeState() {
        return localNodeState;
    }

    public void setLocalNodeState(LocalNodeState localNodeState) {
        this.localNodeState = localNodeState;
    }

    /**
     *
     **/
    public SwarmInfo controlAvailable(Boolean controlAvailable) {
        this.controlAvailable = controlAvailable;
        return this;
    }

    @JsonProperty("ControlAvailable")
    public Boolean getControlAvailable() {
        return controlAvailable;
    }

    public void setControlAvailable(Boolean controlAvailable) {
        this.controlAvailable = controlAvailable;
    }

    /**
     *
     **/
    public SwarmInfo error(String error) {
        this.error = error;
        return this;
    }

    @JsonProperty("Error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     * List of ID&#39;s and addresses of other managers in the swarm.
     **/
    public SwarmInfo remoteManagers(List<PeerNode> remoteManagers) {
        this.remoteManagers = remoteManagers;
        return this;
    }

    @JsonProperty("RemoteManagers")
    public List<PeerNode> getRemoteManagers() {
        return remoteManagers;
    }

    public void setRemoteManagers(List<PeerNode> remoteManagers) {
        this.remoteManagers = remoteManagers;
    }

    /**
     * Total number of nodes in the swarm.
     **/
    public SwarmInfo nodes(Integer nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("Nodes")
    public Integer getNodes() {
        return nodes;
    }

    public void setNodes(Integer nodes) {
        this.nodes = nodes;
    }

    /**
     * Total number of managers in the swarm.
     **/
    public SwarmInfo managers(Integer managers) {
        this.managers = managers;
        return this;
    }

    @JsonProperty("Managers")
    public Integer getManagers() {
        return managers;
    }

    public void setManagers(Integer managers) {
        this.managers = managers;
    }

    /**
     *
     **/
    public SwarmInfo cluster(ClusterInfo cluster) {
        this.cluster = cluster;
        return this;
    }

    @JsonProperty("Cluster")
    public ClusterInfo getCluster() {
        return cluster;
    }

    public void setCluster(ClusterInfo cluster) {
        this.cluster = cluster;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var swarmInfo = (SwarmInfo) o;
        return Objects.equals(this.nodeID, swarmInfo.nodeID) &&
                       Objects.equals(this.nodeAddr, swarmInfo.nodeAddr) &&
                       Objects.equals(this.localNodeState, swarmInfo.localNodeState) &&
                       Objects.equals(this.controlAvailable, swarmInfo.controlAvailable) &&
                       Objects.equals(this.error, swarmInfo.error) &&
                       Objects.equals(this.remoteManagers, swarmInfo.remoteManagers) &&
                       Objects.equals(this.nodes, swarmInfo.nodes) &&
                       Objects.equals(this.managers, swarmInfo.managers) &&
                       Objects.equals(this.cluster, swarmInfo.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeID, nodeAddr, localNodeState, controlAvailable, error, remoteManagers, nodes, managers, cluster);
    }

    @Override
    public String toString() {
        return "class SwarmInfo {\n" +
                       "    nodeID: " + toIndentedString(nodeID) + "\n" +
                       "    nodeAddr: " + toIndentedString(nodeAddr) + "\n" +
                       "    localNodeState: " + toIndentedString(localNodeState) + "\n" +
                       "    controlAvailable: " + toIndentedString(controlAvailable) + "\n" +
                       "    error: " + toIndentedString(error) + "\n" +
                       "    remoteManagers: " + toIndentedString(remoteManagers) + "\n" +
                       "    nodes: " + toIndentedString(nodes) + "\n" +
                       "    managers: " + toIndentedString(managers) + "\n" +
                       "    cluster: " + toIndentedString(cluster) + "\n" +
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


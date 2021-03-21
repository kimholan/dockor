package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeStatus represents the status of a node.  It provides the current status of the node, as seen by the manager.
 **/

public class NodeStatus {

    private NodeState state;

    private String message;

    private String addr;

    /**
     *
     **/
    public NodeStatus state(NodeState state) {
        this.state = state;
        return this;
    }

    @JsonProperty("State")
    public NodeState getState() {
        return state;
    }

    public void setState(NodeState state) {
        this.state = state;
    }

    /**
     *
     **/
    public NodeStatus message(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * IP address of the node.
     **/
    public NodeStatus addr(String addr) {
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
        var nodeStatus = (NodeStatus) o;
        return Objects.equals(this.state, nodeStatus.state) &&
                       Objects.equals(this.message, nodeStatus.message) &&
                       Objects.equals(this.addr, nodeStatus.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, message, addr);
    }

    @Override
    public String toString() {

        return "class NodeStatus {\n" +
                            "    state: " + toIndentedString(state) + "\n" +
                            "    message: " + toIndentedString(message) + "\n" +
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


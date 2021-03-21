package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ManagerStatus represents the status of a manager.  It provides the current status of a node&#39;s manager component, if the node is a manager.
 **/

public class ManagerStatus {

    private Boolean leader = false;

    private Reachability reachability;

    private String addr;

    /**
     *
     **/
    public ManagerStatus leader(Boolean leader) {
        this.leader = leader;
        return this;
    }

    @JsonProperty("Leader")
    public Boolean getLeader() {
        return leader;
    }

    public void setLeader(Boolean leader) {
        this.leader = leader;
    }

    /**
     *
     **/
    public ManagerStatus reachability(Reachability reachability) {
        this.reachability = reachability;
        return this;
    }

    @JsonProperty("Reachability")
    public Reachability getReachability() {
        return reachability;
    }

    public void setReachability(Reachability reachability) {
        this.reachability = reachability;
    }

    /**
     * The IP address and port at which the manager is reachable.
     **/
    public ManagerStatus addr(String addr) {
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
        var managerStatus = (ManagerStatus) o;
        return Objects.equals(this.leader, managerStatus.leader) &&
                       Objects.equals(this.reachability, managerStatus.reachability) &&
                       Objects.equals(this.addr, managerStatus.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leader, reachability, addr);
    }

    @Override
    public String toString() {

        return "class ManagerStatus {\n" +
                            "    leader: " + toIndentedString(leader) + "\n" +
                            "    reachability: " + toIndentedString(reachability) + "\n" +
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


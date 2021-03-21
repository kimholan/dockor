package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JoinTokens contains the tokens workers and managers need to join the swarm.
 **/

public class JoinTokens {

    private String worker;

    private String manager;

    /**
     * The token workers can use to join the swarm.
     **/
    public JoinTokens worker(String worker) {
        this.worker = worker;
        return this;
    }

    @JsonProperty("Worker")
    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    /**
     * The token managers can use to join the swarm.
     **/
    public JoinTokens manager(String manager) {
        this.manager = manager;
        return this;
    }

    @JsonProperty("Manager")
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var joinTokens = (JoinTokens) o;
        return Objects.equals(this.worker, joinTokens.worker) &&
                       Objects.equals(this.manager, joinTokens.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, manager);
    }

    @Override
    public String toString() {

        return "class JoinTokens {\n" +
                            "    worker: " + toIndentedString(worker) + "\n" +
                            "    manager: " + toIndentedString(manager) + "\n" +
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


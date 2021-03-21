package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * ContainerState stores container&#39;s running state. It&#39;s part of ContainerJSONBase and will be returned by the \&quot;inspect\&quot; command.
 **/

public class ContainerState {

    private StatusEnum status;

    private Boolean running;

    private Boolean paused;

    private Boolean restarting;

    private Boolean ooMKilled;

    private Boolean dead;

    private Integer pid;

    private Integer exitCode;

    private String error;

    private String startedAt;

    private String finishedAt;

    private Health health;

    /**
     * String representation of the container state. Can be one of \&quot;created\&quot;, \&quot;running\&quot;, \&quot;paused\&quot;, \&quot;restarting\&quot;, \&quot;removing\&quot;, \&quot;exited\&quot;, or \&quot;dead\&quot;.
     **/
    public ContainerState status(StatusEnum status) {
        this.status = status;
        return this;
    }

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Whether this container is running.  Note that a running container can be _paused_. The &#x60;Running&#x60; and &#x60;Paused&#x60; booleans are not mutually exclusive:  When pausing a container (on Linux), the freezer cgroup is used to suspend all processes in the container. Freezing the process requires the process to be running. As a result, paused containers are both &#x60;Running&#x60; _and_ &#x60;Paused&#x60;.  Use the &#x60;Status&#x60; field instead to determine if a container&#39;s state is \&quot;running\&quot;.
     **/
    public ContainerState running(Boolean running) {
        this.running = running;
        return this;
    }

    @JsonProperty("Running")
    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    /**
     * Whether this container is paused.
     **/
    public ContainerState paused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    @JsonProperty("Paused")
    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    /**
     * Whether this container is restarting.
     **/
    public ContainerState restarting(Boolean restarting) {
        this.restarting = restarting;
        return this;
    }

    @JsonProperty("Restarting")
    public Boolean getRestarting() {
        return restarting;
    }

    public void setRestarting(Boolean restarting) {
        this.restarting = restarting;
    }

    /**
     * Whether this container has been killed because it ran out of memory.
     **/
    public ContainerState ooMKilled(Boolean ooMKilled) {
        this.ooMKilled = ooMKilled;
        return this;
    }

    @JsonProperty("OOMKilled")
    public Boolean getOoMKilled() {
        return ooMKilled;
    }

    public void setOoMKilled(Boolean ooMKilled) {
        this.ooMKilled = ooMKilled;
    }

    /**
     *
     **/
    public ContainerState dead(Boolean dead) {
        this.dead = dead;
        return this;
    }

    @JsonProperty("Dead")
    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    /**
     * The process ID of this container
     **/
    public ContainerState pid(Integer pid) {
        this.pid = pid;
        return this;
    }

    @JsonProperty("Pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * The last exit code of this container
     **/
    public ContainerState exitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    @JsonProperty("ExitCode")
    public Integer getExitCode() {
        return exitCode;
    }

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     *
     **/
    public ContainerState error(String error) {
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
     * The time when this container was last started.
     **/
    public ContainerState startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    @JsonProperty("StartedAt")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * The time when this container last exited.
     **/
    public ContainerState finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    @JsonProperty("FinishedAt")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     *
     **/
    public ContainerState health(Health health) {
        this.health = health;
        return this;
    }

    @JsonProperty("Health")
    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerState = (ContainerState) o;
        return Objects.equals(this.status, containerState.status) &&
                       Objects.equals(this.running, containerState.running) &&
                       Objects.equals(this.paused, containerState.paused) &&
                       Objects.equals(this.restarting, containerState.restarting) &&
                       Objects.equals(this.ooMKilled, containerState.ooMKilled) &&
                       Objects.equals(this.dead, containerState.dead) &&
                       Objects.equals(this.pid, containerState.pid) &&
                       Objects.equals(this.exitCode, containerState.exitCode) &&
                       Objects.equals(this.error, containerState.error) &&
                       Objects.equals(this.startedAt, containerState.startedAt) &&
                       Objects.equals(this.finishedAt, containerState.finishedAt) &&
                       Objects.equals(this.health, containerState.health);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, running, paused, restarting, ooMKilled, dead, pid, exitCode, error, startedAt, finishedAt, health);
    }

    @Override
    public String toString() {

        return "class ContainerState {\n" +
                            "    status: " + toIndentedString(status) + "\n" +
                            "    running: " + toIndentedString(running) + "\n" +
                            "    paused: " + toIndentedString(paused) + "\n" +
                            "    restarting: " + toIndentedString(restarting) + "\n" +
                            "    ooMKilled: " + toIndentedString(ooMKilled) + "\n" +
                            "    dead: " + toIndentedString(dead) + "\n" +
                            "    pid: " + toIndentedString(pid) + "\n" +
                            "    exitCode: " + toIndentedString(exitCode) + "\n" +
                            "    error: " + toIndentedString(error) + "\n" +
                            "    startedAt: " + toIndentedString(startedAt) + "\n" +
                            "    finishedAt: " + toIndentedString(finishedAt) + "\n" +
                            "    health: " + toIndentedString(health) + "\n" +
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

    public enum StatusEnum {

        CREATED("created"), RUNNING("running"), PAUSED("paused"), RESTARTING("restarting"), REMOVING("removing"), EXITED("exited"), DEAD("dead");

        private final String value;

        StatusEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (var b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

}


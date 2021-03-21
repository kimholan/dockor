package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ExecInspectResponse {

    private Boolean canRemove;

    private String detachKeys;

    private String ID;

    private Boolean running;

    private Integer exitCode;

    private ProcessConfig processConfig;

    private Boolean openStdin;

    private Boolean openStderr;

    private Boolean openStdout;

    private String containerID;

    private Integer pid;

    /**
     *
     **/
    public ExecInspectResponse canRemove(Boolean canRemove) {
        this.canRemove = canRemove;
        return this;
    }

    @JsonProperty("CanRemove")
    public Boolean getCanRemove() {
        return canRemove;
    }

    public void setCanRemove(Boolean canRemove) {
        this.canRemove = canRemove;
    }

    /**
     *
     **/
    public ExecInspectResponse detachKeys(String detachKeys) {
        this.detachKeys = detachKeys;
        return this;
    }

    @JsonProperty("DetachKeys")
    public String getDetachKeys() {
        return detachKeys;
    }

    public void setDetachKeys(String detachKeys) {
        this.detachKeys = detachKeys;
    }

    /**
     *
     **/
    public ExecInspectResponse ID(String ID) {
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
    public ExecInspectResponse running(Boolean running) {
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
     *
     **/
    public ExecInspectResponse exitCode(Integer exitCode) {
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
    public ExecInspectResponse processConfig(ProcessConfig processConfig) {
        this.processConfig = processConfig;
        return this;
    }

    @JsonProperty("ProcessConfig")
    public ProcessConfig getProcessConfig() {
        return processConfig;
    }

    public void setProcessConfig(ProcessConfig processConfig) {
        this.processConfig = processConfig;
    }

    /**
     *
     **/
    public ExecInspectResponse openStdin(Boolean openStdin) {
        this.openStdin = openStdin;
        return this;
    }

    @JsonProperty("OpenStdin")
    public Boolean getOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(Boolean openStdin) {
        this.openStdin = openStdin;
    }

    /**
     *
     **/
    public ExecInspectResponse openStderr(Boolean openStderr) {
        this.openStderr = openStderr;
        return this;
    }

    @JsonProperty("OpenStderr")
    public Boolean getOpenStderr() {
        return openStderr;
    }

    public void setOpenStderr(Boolean openStderr) {
        this.openStderr = openStderr;
    }

    /**
     *
     **/
    public ExecInspectResponse openStdout(Boolean openStdout) {
        this.openStdout = openStdout;
        return this;
    }

    @JsonProperty("OpenStdout")
    public Boolean getOpenStdout() {
        return openStdout;
    }

    public void setOpenStdout(Boolean openStdout) {
        this.openStdout = openStdout;
    }

    /**
     *
     **/
    public ExecInspectResponse containerID(String containerID) {
        this.containerID = containerID;
        return this;
    }

    @JsonProperty("ContainerID")
    public String getContainerID() {
        return containerID;
    }

    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /**
     * The system process ID for the exec process.
     **/
    public ExecInspectResponse pid(Integer pid) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var execInspectResponse = (ExecInspectResponse) o;
        return Objects.equals(this.canRemove, execInspectResponse.canRemove) &&
                       Objects.equals(this.detachKeys, execInspectResponse.detachKeys) &&
                       Objects.equals(this.ID, execInspectResponse.ID) &&
                       Objects.equals(this.running, execInspectResponse.running) &&
                       Objects.equals(this.exitCode, execInspectResponse.exitCode) &&
                       Objects.equals(this.processConfig, execInspectResponse.processConfig) &&
                       Objects.equals(this.openStdin, execInspectResponse.openStdin) &&
                       Objects.equals(this.openStderr, execInspectResponse.openStderr) &&
                       Objects.equals(this.openStdout, execInspectResponse.openStdout) &&
                       Objects.equals(this.containerID, execInspectResponse.containerID) &&
                       Objects.equals(this.pid, execInspectResponse.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canRemove, detachKeys, ID, running, exitCode, processConfig, openStdin, openStderr, openStdout, containerID, pid);
    }

    @Override
    public String toString() {

        return "class ExecInspectResponse {\n" +
                            "    canRemove: " + toIndentedString(canRemove) + "\n" +
                            "    detachKeys: " + toIndentedString(detachKeys) + "\n" +
                            "    ID: " + toIndentedString(ID) + "\n" +
                            "    running: " + toIndentedString(running) + "\n" +
                            "    exitCode: " + toIndentedString(exitCode) + "\n" +
                            "    processConfig: " + toIndentedString(processConfig) + "\n" +
                            "    openStdin: " + toIndentedString(openStdin) + "\n" +
                            "    openStderr: " + toIndentedString(openStderr) + "\n" +
                            "    openStdout: " + toIndentedString(openStdout) + "\n" +
                            "    containerID: " + toIndentedString(containerID) + "\n" +
                            "    pid: " + toIndentedString(pid) + "\n" +
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


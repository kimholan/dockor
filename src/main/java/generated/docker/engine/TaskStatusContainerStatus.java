package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class TaskStatusContainerStatus {

    private String containerID;

    private Integer PID;

    private Integer exitCode;

    /**
     *
     **/
    public TaskStatusContainerStatus containerID(String containerID) {
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
     *
     **/
    public TaskStatusContainerStatus PID(Integer PID) {
        this.PID = PID;
        return this;
    }

    @JsonProperty("PID")
    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    /**
     *
     **/
    public TaskStatusContainerStatus exitCode(Integer exitCode) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var taskStatusContainerStatus = (TaskStatusContainerStatus) o;
        return Objects.equals(this.containerID, taskStatusContainerStatus.containerID) &&
                       Objects.equals(this.PID, taskStatusContainerStatus.PID) &&
                       Objects.equals(this.exitCode, taskStatusContainerStatus.exitCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerID, PID, exitCode);
    }

    @Override
    public String toString() {

        return "class TaskStatusContainerStatus {\n" +
                            "    containerID: " + toIndentedString(containerID) + "\n" +
                            "    PID: " + toIndentedString(PID) + "\n" +
                            "    exitCode: " + toIndentedString(exitCode) + "\n" +
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


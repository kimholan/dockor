package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * A device mapping between the host and container
 **/

public class DeviceMapping {

    private String pathOnHost;

    private String pathInContainer;

    private String cgroupPermissions;

    /**
     *
     **/
    public DeviceMapping pathOnHost(String pathOnHost) {
        this.pathOnHost = pathOnHost;
        return this;
    }

    @JsonProperty("PathOnHost")
    public String getPathOnHost() {
        return pathOnHost;
    }

    public void setPathOnHost(String pathOnHost) {
        this.pathOnHost = pathOnHost;
    }

    /**
     *
     **/
    public DeviceMapping pathInContainer(String pathInContainer) {
        this.pathInContainer = pathInContainer;
        return this;
    }

    @JsonProperty("PathInContainer")
    public String getPathInContainer() {
        return pathInContainer;
    }

    public void setPathInContainer(String pathInContainer) {
        this.pathInContainer = pathInContainer;
    }

    /**
     *
     **/
    public DeviceMapping cgroupPermissions(String cgroupPermissions) {
        this.cgroupPermissions = cgroupPermissions;
        return this;
    }

    @JsonProperty("CgroupPermissions")
    public String getCgroupPermissions() {
        return cgroupPermissions;
    }

    public void setCgroupPermissions(String cgroupPermissions) {
        this.cgroupPermissions = cgroupPermissions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var deviceMapping = (DeviceMapping) o;
        return Objects.equals(this.pathOnHost, deviceMapping.pathOnHost) &&
                       Objects.equals(this.pathInContainer, deviceMapping.pathInContainer) &&
                       Objects.equals(this.cgroupPermissions, deviceMapping.cgroupPermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathOnHost, pathInContainer, cgroupPermissions);
    }

    @Override
    public String toString() {

        return "class DeviceMapping {\n" +
                            "    pathOnHost: " + toIndentedString(pathOnHost) + "\n" +
                            "    pathInContainer: " + toIndentedString(pathInContainer) + "\n" +
                            "    cgroupPermissions: " + toIndentedString(cgroupPermissions) + "\n" +
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


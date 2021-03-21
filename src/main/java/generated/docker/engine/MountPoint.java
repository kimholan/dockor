package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * A mount point inside a container
 **/

public class MountPoint {

    private String type;

    private String name;

    private String source;

    private String destination;

    private String driver;

    private String mode;

    private Boolean RW;

    private String propagation;

    /**
     *
     **/
    public MountPoint type(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/
    public MountPoint name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/
    public MountPoint source(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     **/
    public MountPoint destination(String destination) {
        this.destination = destination;
        return this;
    }

    @JsonProperty("Destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     *
     **/
    public MountPoint driver(String driver) {
        this.driver = driver;
        return this;
    }

    @JsonProperty("Driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     *
     **/
    public MountPoint mode(String mode) {
        this.mode = mode;
        return this;
    }

    @JsonProperty("Mode")
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     *
     **/
    public MountPoint RW(Boolean RW) {
        this.RW = RW;
        return this;
    }

    @JsonProperty("RW")
    public Boolean getRW() {
        return RW;
    }

    public void setRW(Boolean RW) {
        this.RW = RW;
    }

    /**
     *
     **/
    public MountPoint propagation(String propagation) {
        this.propagation = propagation;
        return this;
    }

    @JsonProperty("Propagation")
    public String getPropagation() {
        return propagation;
    }

    public void setPropagation(String propagation) {
        this.propagation = propagation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var mountPoint = (MountPoint) o;
        return Objects.equals(this.type, mountPoint.type) &&
                       Objects.equals(this.name, mountPoint.name) &&
                       Objects.equals(this.source, mountPoint.source) &&
                       Objects.equals(this.destination, mountPoint.destination) &&
                       Objects.equals(this.driver, mountPoint.driver) &&
                       Objects.equals(this.mode, mountPoint.mode) &&
                       Objects.equals(this.RW, mountPoint.RW) &&
                       Objects.equals(this.propagation, mountPoint.propagation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, source, destination, driver, mode, RW, propagation);
    }

    @Override
    public String toString() {

        return "class MountPoint {\n" +
                            "    type: " + toIndentedString(type) + "\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    source: " + toIndentedString(source) + "\n" +
                            "    destination: " + toIndentedString(destination) + "\n" +
                            "    driver: " + toIndentedString(driver) + "\n" +
                            "    mode: " + toIndentedString(mode) + "\n" +
                            "    RW: " + toIndentedString(RW) + "\n" +
                            "    propagation: " + toIndentedString(propagation) + "\n" +
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


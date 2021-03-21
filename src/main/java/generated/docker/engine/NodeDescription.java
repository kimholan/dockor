package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeDescription encapsulates the properties of the Node as reported by the agent.
 **/

public class NodeDescription {

    private String hostname;

    private Platform platform;

    private ResourceObject resources;

    private EngineDescription engine;

    private TLSInfo tlSInfo;

    /**
     *
     **/
    public NodeDescription hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    @JsonProperty("Hostname")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     *
     **/
    public NodeDescription platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    @JsonProperty("Platform")
    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     *
     **/
    public NodeDescription resources(ResourceObject resources) {
        this.resources = resources;
        return this;
    }

    @JsonProperty("Resources")
    public ResourceObject getResources() {
        return resources;
    }

    public void setResources(ResourceObject resources) {
        this.resources = resources;
    }

    /**
     *
     **/
    public NodeDescription engine(EngineDescription engine) {
        this.engine = engine;
        return this;
    }

    @JsonProperty("Engine")
    public EngineDescription getEngine() {
        return engine;
    }

    public void setEngine(EngineDescription engine) {
        this.engine = engine;
    }

    /**
     *
     **/
    public NodeDescription tlSInfo(TLSInfo tlSInfo) {
        this.tlSInfo = tlSInfo;
        return this;
    }

    @JsonProperty("TLSInfo")
    public TLSInfo getTlSInfo() {
        return tlSInfo;
    }

    public void setTlSInfo(TLSInfo tlSInfo) {
        this.tlSInfo = tlSInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var nodeDescription = (NodeDescription) o;
        return Objects.equals(this.hostname, nodeDescription.hostname) &&
                       Objects.equals(this.platform, nodeDescription.platform) &&
                       Objects.equals(this.resources, nodeDescription.resources) &&
                       Objects.equals(this.engine, nodeDescription.engine) &&
                       Objects.equals(this.tlSInfo, nodeDescription.tlSInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, platform, resources, engine, tlSInfo);
    }

    @Override
    public String toString() {

        return "class NodeDescription {\n" +
                            "    hostname: " + toIndentedString(hostname) + "\n" +
                            "    platform: " + toIndentedString(platform) + "\n" +
                            "    resources: " + toIndentedString(resources) + "\n" +
                            "    generated.docker.engine: " + toIndentedString(engine) + "\n" +
                            "    tlSInfo: " + toIndentedString(tlSInfo) + "\n" +
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


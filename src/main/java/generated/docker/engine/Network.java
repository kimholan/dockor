package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Network {

    private String name;

    private String id;

    private String created;

    private String scope;

    private String driver;

    private Boolean enableIPv6;

    private IPAM IPAM;

    private Boolean internal;

    private Boolean attachable;

    private Boolean ingress;

    private Map<String, NetworkContainer> containers = new HashMap<>();

    private Map<String, String> options = new HashMap<>();

    private Map<String, String> labels = new HashMap<>();

    /**
     *
     **/
    public Network name(String name) {
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
    public Network id(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     **/
    public Network created(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("Created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     **/
    public Network scope(String scope) {
        this.scope = scope;
        return this;
    }

    @JsonProperty("Scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     *
     **/
    public Network driver(String driver) {
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
    public Network enableIPv6(Boolean enableIPv6) {
        this.enableIPv6 = enableIPv6;
        return this;
    }

    @JsonProperty("EnableIPv6")
    public Boolean getEnableIPv6() {
        return enableIPv6;
    }

    public void setEnableIPv6(Boolean enableIPv6) {
        this.enableIPv6 = enableIPv6;
    }

    /**
     *
     **/
    public Network IPAM(IPAM IPAM) {
        this.IPAM = IPAM;
        return this;
    }

    @JsonProperty("IPAM")
    public IPAM getIPAM() {
        return IPAM;
    }

    public void setIPAM(IPAM IPAM) {
        this.IPAM = IPAM;
    }

    /**
     *
     **/
    public Network internal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    @JsonProperty("Internal")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    /**
     *
     **/
    public Network attachable(Boolean attachable) {
        this.attachable = attachable;
        return this;
    }

    @JsonProperty("Attachable")
    public Boolean getAttachable() {
        return attachable;
    }

    public void setAttachable(Boolean attachable) {
        this.attachable = attachable;
    }

    /**
     *
     **/
    public Network ingress(Boolean ingress) {
        this.ingress = ingress;
        return this;
    }

    @JsonProperty("Ingress")
    public Boolean getIngress() {
        return ingress;
    }

    public void setIngress(Boolean ingress) {
        this.ingress = ingress;
    }

    /**
     *
     **/
    public Network containers(Map<String, NetworkContainer> containers) {
        this.containers = containers;
        return this;
    }

    @JsonProperty("Containers")
    public Map<String, NetworkContainer> getContainers() {
        return containers;
    }

    public void setContainers(Map<String, NetworkContainer> containers) {
        this.containers = containers;
    }

    /**
     *
     **/
    public Network options(Map<String, String> options) {
        this.options = options;
        return this;
    }

    @JsonProperty("Options")
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    /**
     *
     **/
    public Network labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("Labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var network = (Network) o;
        return Objects.equals(this.name, network.name) &&
                       Objects.equals(this.id, network.id) &&
                       Objects.equals(this.created, network.created) &&
                       Objects.equals(this.scope, network.scope) &&
                       Objects.equals(this.driver, network.driver) &&
                       Objects.equals(this.enableIPv6, network.enableIPv6) &&
                       Objects.equals(this.IPAM, network.IPAM) &&
                       Objects.equals(this.internal, network.internal) &&
                       Objects.equals(this.attachable, network.attachable) &&
                       Objects.equals(this.ingress, network.ingress) &&
                       Objects.equals(this.containers, network.containers) &&
                       Objects.equals(this.options, network.options) &&
                       Objects.equals(this.labels, network.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, created, scope, driver, enableIPv6, IPAM, internal, attachable, ingress, containers, options, labels);
    }

    @Override
    public String toString() {
        return "class Network {\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    id: " + toIndentedString(id) + "\n" +
                       "    created: " + toIndentedString(created) + "\n" +
                       "    scope: " + toIndentedString(scope) + "\n" +
                       "    driver: " + toIndentedString(driver) + "\n" +
                       "    enableIPv6: " + toIndentedString(enableIPv6) + "\n" +
                       "    IPAM: " + toIndentedString(IPAM) + "\n" +
                       "    internal: " + toIndentedString(internal) + "\n" +
                       "    attachable: " + toIndentedString(attachable) + "\n" +
                       "    ingress: " + toIndentedString(ingress) + "\n" +
                       "    containers: " + toIndentedString(containers) + "\n" +
                       "    options: " + toIndentedString(options) + "\n" +
                       "    labels: " + toIndentedString(labels) + "\n" +
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


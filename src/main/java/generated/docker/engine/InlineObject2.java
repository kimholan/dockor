package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InlineObject2 {

    private String name;

    private Boolean checkDuplicate;

    private String driver = "bridge";

    private Boolean internal;

    private Boolean attachable;

    private Boolean ingress;

    private IPAM IPAM;

    private Boolean enableIPv6;

    private Map<String, String> options = new HashMap<>();

    private Map<String, String> labels = new HashMap<>();

    /**
     * The network&#39;s name.
     **/
    public InlineObject2 name(String name) {
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
     * Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions.
     **/
    public InlineObject2 checkDuplicate(Boolean checkDuplicate) {
        this.checkDuplicate = checkDuplicate;
        return this;
    }

    @JsonProperty("CheckDuplicate")
    public Boolean getCheckDuplicate() {
        return checkDuplicate;
    }

    public void setCheckDuplicate(Boolean checkDuplicate) {
        this.checkDuplicate = checkDuplicate;
    }

    /**
     * Name of the network driver plugin to use.
     **/
    public InlineObject2 driver(String driver) {
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
     * Restrict external access to the network.
     **/
    public InlineObject2 internal(Boolean internal) {
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
     * Globally scoped network is manually attachable by regular containers from workers in swarm mode.
     **/
    public InlineObject2 attachable(Boolean attachable) {
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
     * Ingress network is the network which provides the routing-mesh in swarm mode.
     **/
    public InlineObject2 ingress(Boolean ingress) {
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
    public InlineObject2 IPAM(IPAM IPAM) {
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
     * Enable IPv6 on the network.
     **/
    public InlineObject2 enableIPv6(Boolean enableIPv6) {
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
     * Network specific options to be used by the drivers.
     **/
    public InlineObject2 options(Map<String, String> options) {
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
     * User-defined key/value metadata.
     **/
    public InlineObject2 labels(Map<String, String> labels) {
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
        var inlineObject2 = (InlineObject2) o;
        return Objects.equals(this.name, inlineObject2.name) &&
                       Objects.equals(this.checkDuplicate, inlineObject2.checkDuplicate) &&
                       Objects.equals(this.driver, inlineObject2.driver) &&
                       Objects.equals(this.internal, inlineObject2.internal) &&
                       Objects.equals(this.attachable, inlineObject2.attachable) &&
                       Objects.equals(this.ingress, inlineObject2.ingress) &&
                       Objects.equals(this.IPAM, inlineObject2.IPAM) &&
                       Objects.equals(this.enableIPv6, inlineObject2.enableIPv6) &&
                       Objects.equals(this.options, inlineObject2.options) &&
                       Objects.equals(this.labels, inlineObject2.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, checkDuplicate, driver, internal, attachable, ingress, IPAM, enableIPv6, options, labels);
    }

    @Override
    public String toString() {

        return "class InlineObject2 {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    checkDuplicate: " + toIndentedString(checkDuplicate) + "\n" +
                            "    driver: " + toIndentedString(driver) + "\n" +
                            "    internal: " + toIndentedString(internal) + "\n" +
                            "    attachable: " + toIndentedString(attachable) + "\n" +
                            "    ingress: " + toIndentedString(ingress) + "\n" +
                            "    IPAM: " + toIndentedString(IPAM) + "\n" +
                            "    enableIPv6: " + toIndentedString(enableIPv6) + "\n" +
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


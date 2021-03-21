package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Configuration for a network endpoint.
 **/

public class EndpointSettings {

    private EndpointIPAMConfig ipAMConfig;

    private List<String> links = new ArrayList<>();

    private List<String> aliases = new ArrayList<>();

    private String networkID;

    private String endpointID;

    private String gateway;

    private String ipAddress;

    private Integer ipPrefixLen;

    private String ipv6Gateway;

    private String globalIPv6Address;

    private Long globalIPv6PrefixLen;

    private String macAddress;

    private Map<String, String> driverOpts = new HashMap<>();

    /**
     *
     **/
    public EndpointSettings ipAMConfig(EndpointIPAMConfig ipAMConfig) {
        this.ipAMConfig = ipAMConfig;
        return this;
    }

    @JsonProperty("IPAMConfig")
    public EndpointIPAMConfig getIpAMConfig() {
        return ipAMConfig;
    }

    public void setIpAMConfig(EndpointIPAMConfig ipAMConfig) {
        this.ipAMConfig = ipAMConfig;
    }

    /**
     *
     **/
    public EndpointSettings links(List<String> links) {
        this.links = links;
        return this;
    }

    @JsonProperty("Links")
    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    /**
     *
     **/
    public EndpointSettings aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    @JsonProperty("Aliases")
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * Unique ID of the network.
     **/
    public EndpointSettings networkID(String networkID) {
        this.networkID = networkID;
        return this;
    }

    @JsonProperty("NetworkID")
    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    /**
     * Unique ID for the service endpoint in a Sandbox.
     **/
    public EndpointSettings endpointID(String endpointID) {
        this.endpointID = endpointID;
        return this;
    }

    @JsonProperty("EndpointID")
    public String getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(String endpointID) {
        this.endpointID = endpointID;
    }

    /**
     * Gateway address for this network.
     **/
    public EndpointSettings gateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    @JsonProperty("Gateway")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * IPv4 address.
     **/
    public EndpointSettings ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    @JsonProperty("IPAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Mask length of the IPv4 address.
     **/
    public EndpointSettings ipPrefixLen(Integer ipPrefixLen) {
        this.ipPrefixLen = ipPrefixLen;
        return this;
    }

    @JsonProperty("IPPrefixLen")
    public Integer getIpPrefixLen() {
        return ipPrefixLen;
    }

    public void setIpPrefixLen(Integer ipPrefixLen) {
        this.ipPrefixLen = ipPrefixLen;
    }

    /**
     * IPv6 gateway address.
     **/
    public EndpointSettings ipv6Gateway(String ipv6Gateway) {
        this.ipv6Gateway = ipv6Gateway;
        return this;
    }

    @JsonProperty("IPv6Gateway")
    public String getIpv6Gateway() {
        return ipv6Gateway;
    }

    public void setIpv6Gateway(String ipv6Gateway) {
        this.ipv6Gateway = ipv6Gateway;
    }

    /**
     * Global IPv6 address.
     **/
    public EndpointSettings globalIPv6Address(String globalIPv6Address) {
        this.globalIPv6Address = globalIPv6Address;
        return this;
    }

    @JsonProperty("GlobalIPv6Address")
    public String getGlobalIPv6Address() {
        return globalIPv6Address;
    }

    public void setGlobalIPv6Address(String globalIPv6Address) {
        this.globalIPv6Address = globalIPv6Address;
    }

    /**
     * Mask length of the global IPv6 address.
     **/
    public EndpointSettings globalIPv6PrefixLen(Long globalIPv6PrefixLen) {
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
        return this;
    }

    @JsonProperty("GlobalIPv6PrefixLen")
    public Long getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
    }

    public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    }

    /**
     * MAC address for the endpoint on this network.
     **/
    public EndpointSettings macAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    @JsonProperty("MacAddress")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * DriverOpts is a mapping of driver options and values. These options are passed directly to the driver and are driver specific.
     **/
    public EndpointSettings driverOpts(Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
        return this;
    }

    @JsonProperty("DriverOpts")
    public Map<String, String> getDriverOpts() {
        return driverOpts;
    }

    public void setDriverOpts(Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var endpointSettings = (EndpointSettings) o;
        return Objects.equals(this.ipAMConfig, endpointSettings.ipAMConfig) &&
                       Objects.equals(this.links, endpointSettings.links) &&
                       Objects.equals(this.aliases, endpointSettings.aliases) &&
                       Objects.equals(this.networkID, endpointSettings.networkID) &&
                       Objects.equals(this.endpointID, endpointSettings.endpointID) &&
                       Objects.equals(this.gateway, endpointSettings.gateway) &&
                       Objects.equals(this.ipAddress, endpointSettings.ipAddress) &&
                       Objects.equals(this.ipPrefixLen, endpointSettings.ipPrefixLen) &&
                       Objects.equals(this.ipv6Gateway, endpointSettings.ipv6Gateway) &&
                       Objects.equals(this.globalIPv6Address, endpointSettings.globalIPv6Address) &&
                       Objects.equals(this.globalIPv6PrefixLen, endpointSettings.globalIPv6PrefixLen) &&
                       Objects.equals(this.macAddress, endpointSettings.macAddress) &&
                       Objects.equals(this.driverOpts, endpointSettings.driverOpts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAMConfig, links, aliases, networkID, endpointID, gateway, ipAddress, ipPrefixLen, ipv6Gateway, globalIPv6Address, globalIPv6PrefixLen, macAddress, driverOpts);
    }

    @Override
    public String toString() {

        return "class EndpointSettings {\n" +
                            "    ipAMConfig: " + toIndentedString(ipAMConfig) + "\n" +
                            "    links: " + toIndentedString(links) + "\n" +
                            "    aliases: " + toIndentedString(aliases) + "\n" +
                            "    networkID: " + toIndentedString(networkID) + "\n" +
                            "    endpointID: " + toIndentedString(endpointID) + "\n" +
                            "    gateway: " + toIndentedString(gateway) + "\n" +
                            "    ipAddress: " + toIndentedString(ipAddress) + "\n" +
                            "    ipPrefixLen: " + toIndentedString(ipPrefixLen) + "\n" +
                            "    ipv6Gateway: " + toIndentedString(ipv6Gateway) + "\n" +
                            "    globalIPv6Address: " + toIndentedString(globalIPv6Address) + "\n" +
                            "    globalIPv6PrefixLen: " + toIndentedString(globalIPv6PrefixLen) + "\n" +
                            "    macAddress: " + toIndentedString(macAddress) + "\n" +
                            "    driverOpts: " + toIndentedString(driverOpts) + "\n" +
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


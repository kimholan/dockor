package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * NetworkSettings exposes the network settings in the API
 **/

public class NetworkSettings {

    private String bridge;

    private String sandboxID;

    private Boolean hairpinMode;

    private String linkLocalIPv6Address;

    private Integer linkLocalIPv6PrefixLen;

    private PortMap ports = new PortMap();

    private String sandboxKey;

    private List<Address> secondaryIPAddresses = new ArrayList<>();

    private List<Address> secondaryIPv6Addresses = new ArrayList<>();

    private String endpointID;

    private String gateway;

    private String globalIPv6Address;

    private Integer globalIPv6PrefixLen;

    private String ipAddress;

    private Integer ipPrefixLen;

    private String ipv6Gateway;

    private String macAddress;

    private Map<String, EndpointSettings> networks = new HashMap<>();

    /**
     * Name of the network&#39;a bridge (for example, &#x60;docker0&#x60;).
     **/
    public NetworkSettings bridge(String bridge) {
        this.bridge = bridge;
        return this;
    }

    @JsonProperty("Bridge")
    public String getBridge() {
        return bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge;
    }

    /**
     * SandboxID uniquely represents a container&#39;s network stack.
     **/
    public NetworkSettings sandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    @JsonProperty("SandboxID")
    public String getSandboxID() {
        return sandboxID;
    }

    public void setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
    }

    /**
     * Indicates if hairpin NAT should be enabled on the virtual interface.
     **/
    public NetworkSettings hairpinMode(Boolean hairpinMode) {
        this.hairpinMode = hairpinMode;
        return this;
    }

    @JsonProperty("HairpinMode")
    public Boolean getHairpinMode() {
        return hairpinMode;
    }

    public void setHairpinMode(Boolean hairpinMode) {
        this.hairpinMode = hairpinMode;
    }

    /**
     * IPv6 unicast address using the link-local prefix.
     **/
    public NetworkSettings linkLocalIPv6Address(String linkLocalIPv6Address) {
        this.linkLocalIPv6Address = linkLocalIPv6Address;
        return this;
    }

    @JsonProperty("LinkLocalIPv6Address")
    public String getLinkLocalIPv6Address() {
        return linkLocalIPv6Address;
    }

    public void setLinkLocalIPv6Address(String linkLocalIPv6Address) {
        this.linkLocalIPv6Address = linkLocalIPv6Address;
    }

    /**
     * Prefix length of the IPv6 unicast address.
     **/
    public NetworkSettings linkLocalIPv6PrefixLen(Integer linkLocalIPv6PrefixLen) {
        this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
        return this;
    }

    @JsonProperty("LinkLocalIPv6PrefixLen")
    public Integer getLinkLocalIPv6PrefixLen() {
        return linkLocalIPv6PrefixLen;
    }

    public void setLinkLocalIPv6PrefixLen(Integer linkLocalIPv6PrefixLen) {
        this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
    }

    /**
     *
     **/
    public NetworkSettings ports(PortMap ports) {
        this.ports = ports;
        return this;
    }

    @JsonProperty("Ports")
    public PortMap getPorts() {
        return ports;
    }

    public void setPorts(PortMap ports) {
        this.ports = ports;
    }

    /**
     * SandboxKey identifies the sandbox
     **/
    public NetworkSettings sandboxKey(String sandboxKey) {
        this.sandboxKey = sandboxKey;
        return this;
    }

    @JsonProperty("SandboxKey")
    public String getSandboxKey() {
        return sandboxKey;
    }

    public void setSandboxKey(String sandboxKey) {
        this.sandboxKey = sandboxKey;
    }

    /**
     *
     **/
    public NetworkSettings secondaryIPAddresses(List<Address> secondaryIPAddresses) {
        this.secondaryIPAddresses = secondaryIPAddresses;
        return this;
    }

    @JsonProperty("SecondaryIPAddresses")
    public List<Address> getSecondaryIPAddresses() {
        return secondaryIPAddresses;
    }

    public void setSecondaryIPAddresses(List<Address> secondaryIPAddresses) {
        this.secondaryIPAddresses = secondaryIPAddresses;
    }

    /**
     *
     **/
    public NetworkSettings secondaryIPv6Addresses(List<Address> secondaryIPv6Addresses) {
        this.secondaryIPv6Addresses = secondaryIPv6Addresses;
        return this;
    }

    @JsonProperty("SecondaryIPv6Addresses")
    public List<Address> getSecondaryIPv6Addresses() {
        return secondaryIPv6Addresses;
    }

    public void setSecondaryIPv6Addresses(List<Address> secondaryIPv6Addresses) {
        this.secondaryIPv6Addresses = secondaryIPv6Addresses;
    }

    /**
     * EndpointID uniquely represents a service endpoint in a Sandbox.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings endpointID(String endpointID) {
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
     * Gateway address for the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings gateway(String gateway) {
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
     * Global IPv6 address for the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings globalIPv6Address(String globalIPv6Address) {
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
     * Mask length of the global IPv6 address.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings globalIPv6PrefixLen(Integer globalIPv6PrefixLen) {
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
        return this;
    }

    @JsonProperty("GlobalIPv6PrefixLen")
    public Integer getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
    }

    public void setGlobalIPv6PrefixLen(Integer globalIPv6PrefixLen) {
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    }

    /**
     * IPv4 address for the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings ipAddress(String ipAddress) {
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
     * Mask length of the IPv4 address.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings ipPrefixLen(Integer ipPrefixLen) {
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
     * IPv6 gateway address for this network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings ipv6Gateway(String ipv6Gateway) {
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
     * MAC address for the container on the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0
     **/
    public NetworkSettings macAddress(String macAddress) {
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
     * Information about all networks that the container is connected to.
     **/
    public NetworkSettings networks(Map<String, EndpointSettings> networks) {
        this.networks = networks;
        return this;
    }

    @JsonProperty("Networks")
    public Map<String, EndpointSettings> getNetworks() {
        return networks;
    }

    public void setNetworks(Map<String, EndpointSettings> networks) {
        this.networks = networks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var networkSettings = (NetworkSettings) o;
        return Objects.equals(this.bridge, networkSettings.bridge) &&
                       Objects.equals(this.sandboxID, networkSettings.sandboxID) &&
                       Objects.equals(this.hairpinMode, networkSettings.hairpinMode) &&
                       Objects.equals(this.linkLocalIPv6Address, networkSettings.linkLocalIPv6Address) &&
                       Objects.equals(this.linkLocalIPv6PrefixLen, networkSettings.linkLocalIPv6PrefixLen) &&
                       Objects.equals(this.ports, networkSettings.ports) &&
                       Objects.equals(this.sandboxKey, networkSettings.sandboxKey) &&
                       Objects.equals(this.secondaryIPAddresses, networkSettings.secondaryIPAddresses) &&
                       Objects.equals(this.secondaryIPv6Addresses, networkSettings.secondaryIPv6Addresses) &&
                       Objects.equals(this.endpointID, networkSettings.endpointID) &&
                       Objects.equals(this.gateway, networkSettings.gateway) &&
                       Objects.equals(this.globalIPv6Address, networkSettings.globalIPv6Address) &&
                       Objects.equals(this.globalIPv6PrefixLen, networkSettings.globalIPv6PrefixLen) &&
                       Objects.equals(this.ipAddress, networkSettings.ipAddress) &&
                       Objects.equals(this.ipPrefixLen, networkSettings.ipPrefixLen) &&
                       Objects.equals(this.ipv6Gateway, networkSettings.ipv6Gateway) &&
                       Objects.equals(this.macAddress, networkSettings.macAddress) &&
                       Objects.equals(this.networks, networkSettings.networks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridge, sandboxID, hairpinMode, linkLocalIPv6Address, linkLocalIPv6PrefixLen, ports, sandboxKey, secondaryIPAddresses, secondaryIPv6Addresses, endpointID, gateway, globalIPv6Address, globalIPv6PrefixLen, ipAddress, ipPrefixLen, ipv6Gateway, macAddress, networks);
    }

    @Override
    public String toString() {

        return "class NetworkSettings {\n" +
                            "    bridge: " + toIndentedString(bridge) + "\n" +
                            "    sandboxID: " + toIndentedString(sandboxID) + "\n" +
                            "    hairpinMode: " + toIndentedString(hairpinMode) + "\n" +
                            "    linkLocalIPv6Address: " + toIndentedString(linkLocalIPv6Address) + "\n" +
                            "    linkLocalIPv6PrefixLen: " + toIndentedString(linkLocalIPv6PrefixLen) + "\n" +
                            "    ports: " + toIndentedString(ports) + "\n" +
                            "    sandboxKey: " + toIndentedString(sandboxKey) + "\n" +
                            "    secondaryIPAddresses: " + toIndentedString(secondaryIPAddresses) + "\n" +
                            "    secondaryIPv6Addresses: " + toIndentedString(secondaryIPv6Addresses) + "\n" +
                            "    endpointID: " + toIndentedString(endpointID) + "\n" +
                            "    gateway: " + toIndentedString(gateway) + "\n" +
                            "    globalIPv6Address: " + toIndentedString(globalIPv6Address) + "\n" +
                            "    globalIPv6PrefixLen: " + toIndentedString(globalIPv6PrefixLen) + "\n" +
                            "    ipAddress: " + toIndentedString(ipAddress) + "\n" +
                            "    ipPrefixLen: " + toIndentedString(ipPrefixLen) + "\n" +
                            "    ipv6Gateway: " + toIndentedString(ipv6Gateway) + "\n" +
                            "    macAddress: " + toIndentedString(macAddress) + "\n" +
                            "    networks: " + toIndentedString(networks) + "\n" +
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


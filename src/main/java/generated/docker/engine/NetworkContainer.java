package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class NetworkContainer {

    private String name;

    private String endpointID;

    private String macAddress;

    private String ipv4Address;

    private String ipv6Address;

    /**
     *
     **/
    public NetworkContainer name(String name) {
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
    public NetworkContainer endpointID(String endpointID) {
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
     *
     **/
    public NetworkContainer macAddress(String macAddress) {
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
     *
     **/
    public NetworkContainer ipv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

    @JsonProperty("IPv4Address")
    public String getIpv4Address() {
        return ipv4Address;
    }

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     *
     **/
    public NetworkContainer ipv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    @JsonProperty("IPv6Address")
    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var networkContainer = (NetworkContainer) o;
        return Objects.equals(this.name, networkContainer.name) &&
                       Objects.equals(this.endpointID, networkContainer.endpointID) &&
                       Objects.equals(this.macAddress, networkContainer.macAddress) &&
                       Objects.equals(this.ipv4Address, networkContainer.ipv4Address) &&
                       Objects.equals(this.ipv6Address, networkContainer.ipv6Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, endpointID, macAddress, ipv4Address, ipv6Address);
    }

    @Override
    public String toString() {

        return "class NetworkContainer {\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    endpointID: " + toIndentedString(endpointID) + "\n" +
                            "    macAddress: " + toIndentedString(macAddress) + "\n" +
                            "    ipv4Address: " + toIndentedString(ipv4Address) + "\n" +
                            "    ipv6Address: " + toIndentedString(ipv6Address) + "\n" +
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


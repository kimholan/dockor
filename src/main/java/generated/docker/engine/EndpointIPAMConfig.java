package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EndpointIPAMConfig represents an endpoint&#39;s IPAM configuration.
 **/

public class EndpointIPAMConfig {

    private String ipv4Address;

    private String ipv6Address;

    private List<String> linkLocalIPs = new ArrayList<>();

    /**
     *
     **/
    public EndpointIPAMConfig ipv4Address(String ipv4Address) {
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
    public EndpointIPAMConfig ipv6Address(String ipv6Address) {
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

    /**
     *
     **/
    public EndpointIPAMConfig linkLocalIPs(List<String> linkLocalIPs) {
        this.linkLocalIPs = linkLocalIPs;
        return this;
    }

    @JsonProperty("LinkLocalIPs")
    public List<String> getLinkLocalIPs() {
        return linkLocalIPs;
    }

    public void setLinkLocalIPs(List<String> linkLocalIPs) {
        this.linkLocalIPs = linkLocalIPs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var endpointIPAMConfig = (EndpointIPAMConfig) o;
        return Objects.equals(this.ipv4Address, endpointIPAMConfig.ipv4Address) &&
                       Objects.equals(this.ipv6Address, endpointIPAMConfig.ipv6Address) &&
                       Objects.equals(this.linkLocalIPs, endpointIPAMConfig.linkLocalIPs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipv4Address, ipv6Address, linkLocalIPs);
    }

    @Override
    public String toString() {

        return "class EndpointIPAMConfig {\n" +
                            "    ipv4Address: " + toIndentedString(ipv4Address) + "\n" +
                            "    ipv6Address: " + toIndentedString(ipv6Address) + "\n" +
                            "    linkLocalIPs: " + toIndentedString(linkLocalIPs) + "\n" +
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


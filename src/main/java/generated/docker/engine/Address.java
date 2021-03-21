package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Address represents an IPv4 or IPv6 IP address.
 **/

public class Address {

    private String addr;

    private Integer prefixLen;

    /**
     * IP address.
     **/
    public Address addr(String addr) {
        this.addr = addr;
        return this;
    }

    @JsonProperty("Addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * Mask length of the IP address.
     **/
    public Address prefixLen(Integer prefixLen) {
        this.prefixLen = prefixLen;
        return this;
    }

    @JsonProperty("PrefixLen")
    public Integer getPrefixLen() {
        return prefixLen;
    }

    public void setPrefixLen(Integer prefixLen) {
        this.prefixLen = prefixLen;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var address = (Address) o;
        return Objects.equals(this.addr, address.addr) &&
                       Objects.equals(this.prefixLen, address.prefixLen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, prefixLen);
    }

    @Override
    public String toString() {
        return "class Address {\n" +
                       "    addr: " + toIndentedString(addr) + "\n" +
                       "    prefixLen: " + toIndentedString(prefixLen) + "\n" +
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


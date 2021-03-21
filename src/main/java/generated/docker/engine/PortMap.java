package generated.docker.engine;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * PortMap describes the mapping of container ports to host ports, using the container&#39;s port-number and protocol as key in the format &#x60;&lt;port&gt;/&lt;protocol&gt;&#x60;, for example, &#x60;80/udp&#x60;.  If a container&#39;s port is mapped for multiple protocols, separate entries are added to the mapping table.
 **/

public class PortMap
        extends HashMap<String, List> {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "class PortMap {\n" +
                       "    " + toIndentedString(super.toString()) + "\n" +
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


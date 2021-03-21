package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Specifies how a service should be attached to a particular network.
 **/

public class NetworkAttachmentConfig {

    private String target;

    private List<String> aliases = new ArrayList<>();

    private Map<String, String> driverOpts = new HashMap<>();

    /**
     * The target network for attachment. Must be a network name or ID.
     **/
    public NetworkAttachmentConfig target(String target) {
        this.target = target;
        return this;
    }

    @JsonProperty("Target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Discoverable alternate names for the service on this network.
     **/
    public NetworkAttachmentConfig aliases(List<String> aliases) {
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
     * Driver attachment options for the network target.
     **/
    public NetworkAttachmentConfig driverOpts(Map<String, String> driverOpts) {
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
        var networkAttachmentConfig = (NetworkAttachmentConfig) o;
        return Objects.equals(this.target, networkAttachmentConfig.target) &&
                       Objects.equals(this.aliases, networkAttachmentConfig.aliases) &&
                       Objects.equals(this.driverOpts, networkAttachmentConfig.driverOpts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, aliases, driverOpts);
    }

    @Override
    public String toString() {

        return "class NetworkAttachmentConfig {\n" +
                            "    target: " + toIndentedString(target) + "\n" +
                            "    aliases: " + toIndentedString(aliases) + "\n" +
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


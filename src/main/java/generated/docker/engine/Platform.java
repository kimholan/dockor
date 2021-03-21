package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Platform represents the platform (Arch/OS).
 **/

public class Platform {

    private String architecture;

    private String OS;

    /**
     * Architecture represents the hardware architecture (for example, &#x60;x86_64&#x60;).
     **/
    public Platform architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    @JsonProperty("Architecture")
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * OS represents the Operating System (for example, &#x60;linux&#x60; or &#x60;windows&#x60;).
     **/
    public Platform OS(String OS) {
        this.OS = OS;
        return this;
    }

    @JsonProperty("OS")
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var platform = (Platform) o;
        return Objects.equals(this.architecture, platform.architecture) &&
                       Objects.equals(this.OS, platform.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architecture, OS);
    }

    @Override
    public String toString() {
        return "class Platform {\n" +
                       "    architecture: " + toIndentedString(architecture) + "\n" +
                       "    OS: " + toIndentedString(OS) + "\n" +
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


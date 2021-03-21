package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Runtime describes an [OCI compliant](https://github.com/opencontainers/runtime-spec) runtime.  The runtime is invoked by the daemon via the &#x60;containerd&#x60; daemon. OCI runtimes act as an interface to the Linux kernel namespaces, cgroups, and SELinux.
 **/

public class Runtime {

    private String path;

    private List<String> runtimeArgs = new ArrayList<>();

    /**
     * Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host&#39;s &#x60;$PATH&#x60; for the binary and uses the first result.
     **/
    public Runtime path(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * List of command-line arguments to pass to the runtime when invoked.
     **/
    public Runtime runtimeArgs(List<String> runtimeArgs) {
        this.runtimeArgs = runtimeArgs;
        return this;
    }

    @JsonProperty("runtimeArgs")
    public List<String> getRuntimeArgs() {
        return runtimeArgs;
    }

    public void setRuntimeArgs(List<String> runtimeArgs) {
        this.runtimeArgs = runtimeArgs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var runtime = (Runtime) o;
        return Objects.equals(this.path, runtime.path) &&
                       Objects.equals(this.runtimeArgs, runtime.runtimeArgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, runtimeArgs);
    }

    @Override
    public String toString() {
        return "class Runtime {\n" +
                       "    path: " + toIndentedString(path) + "\n" +
                       "    runtimeArgs: " + toIndentedString(runtimeArgs) + "\n" +
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


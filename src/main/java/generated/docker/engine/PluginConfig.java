package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The config of a plugin.
 **/

public class PluginConfig {

    private String dockerVersion;

    private String description;

    private String documentation;

    private PluginConfigInterface _interface;

    private List<String> entrypoint = new ArrayList<>();

    private String workDir;

    private PluginConfigUser user;

    private PluginConfigNetwork network;

    private PluginConfigLinux linux;

    private String propagatedMount;

    private Boolean ipcHost;

    private Boolean pidHost;

    private List<PluginMount> mounts = new ArrayList<>();

    private List<PluginEnv> env = new ArrayList<>();

    private PluginConfigArgs args;

    private PluginConfigRootfs rootfs;

    /**
     * Docker Version used to create the plugin
     **/
    public PluginConfig dockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }

    @JsonProperty("DockerVersion")
    public String getDockerVersion() {
        return dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
    }

    /**
     *
     **/
    public PluginConfig description(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     **/
    public PluginConfig documentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    @JsonProperty("Documentation")
    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     *
     **/
    public PluginConfig _interface(PluginConfigInterface _interface) {
        this._interface = _interface;
        return this;
    }

    @JsonProperty("Interface")
    public PluginConfigInterface getInterface() {
        return _interface;
    }

    public void setInterface(PluginConfigInterface _interface) {
        this._interface = _interface;
    }

    /**
     *
     **/
    public PluginConfig entrypoint(List<String> entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    @JsonProperty("Entrypoint")
    public List<String> getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(List<String> entrypoint) {
        this.entrypoint = entrypoint;
    }

    /**
     *
     **/
    public PluginConfig workDir(String workDir) {
        this.workDir = workDir;
        return this;
    }

    @JsonProperty("WorkDir")
    public String getWorkDir() {
        return workDir;
    }

    public void setWorkDir(String workDir) {
        this.workDir = workDir;
    }

    /**
     *
     **/
    public PluginConfig user(PluginConfigUser user) {
        this.user = user;
        return this;
    }

    @JsonProperty("User")
    public PluginConfigUser getUser() {
        return user;
    }

    public void setUser(PluginConfigUser user) {
        this.user = user;
    }

    /**
     *
     **/
    public PluginConfig network(PluginConfigNetwork network) {
        this.network = network;
        return this;
    }

    @JsonProperty("Network")
    public PluginConfigNetwork getNetwork() {
        return network;
    }

    public void setNetwork(PluginConfigNetwork network) {
        this.network = network;
    }

    /**
     *
     **/
    public PluginConfig linux(PluginConfigLinux linux) {
        this.linux = linux;
        return this;
    }

    @JsonProperty("Linux")
    public PluginConfigLinux getLinux() {
        return linux;
    }

    public void setLinux(PluginConfigLinux linux) {
        this.linux = linux;
    }

    /**
     *
     **/
    public PluginConfig propagatedMount(String propagatedMount) {
        this.propagatedMount = propagatedMount;
        return this;
    }

    @JsonProperty("PropagatedMount")
    public String getPropagatedMount() {
        return propagatedMount;
    }

    public void setPropagatedMount(String propagatedMount) {
        this.propagatedMount = propagatedMount;
    }

    /**
     *
     **/
    public PluginConfig ipcHost(Boolean ipcHost) {
        this.ipcHost = ipcHost;
        return this;
    }

    @JsonProperty("IpcHost")
    public Boolean getIpcHost() {
        return ipcHost;
    }

    public void setIpcHost(Boolean ipcHost) {
        this.ipcHost = ipcHost;
    }

    /**
     *
     **/
    public PluginConfig pidHost(Boolean pidHost) {
        this.pidHost = pidHost;
        return this;
    }

    @JsonProperty("PidHost")
    public Boolean getPidHost() {
        return pidHost;
    }

    public void setPidHost(Boolean pidHost) {
        this.pidHost = pidHost;
    }

    /**
     *
     **/
    public PluginConfig mounts(List<PluginMount> mounts) {
        this.mounts = mounts;
        return this;
    }

    @JsonProperty("Mounts")
    public List<PluginMount> getMounts() {
        return mounts;
    }

    public void setMounts(List<PluginMount> mounts) {
        this.mounts = mounts;
    }

    /**
     *
     **/
    public PluginConfig env(List<PluginEnv> env) {
        this.env = env;
        return this;
    }

    @JsonProperty("Env")
    public List<PluginEnv> getEnv() {
        return env;
    }

    public void setEnv(List<PluginEnv> env) {
        this.env = env;
    }

    /**
     *
     **/
    public PluginConfig args(PluginConfigArgs args) {
        this.args = args;
        return this;
    }

    @JsonProperty("Args")
    public PluginConfigArgs getArgs() {
        return args;
    }

    public void setArgs(PluginConfigArgs args) {
        this.args = args;
    }

    /**
     *
     **/
    public PluginConfig rootfs(PluginConfigRootfs rootfs) {
        this.rootfs = rootfs;
        return this;
    }

    @JsonProperty("rootfs")
    public PluginConfigRootfs getRootfs() {
        return rootfs;
    }

    public void setRootfs(PluginConfigRootfs rootfs) {
        this.rootfs = rootfs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var pluginConfig = (PluginConfig) o;
        return Objects.equals(this.dockerVersion, pluginConfig.dockerVersion) &&
                       Objects.equals(this.description, pluginConfig.description) &&
                       Objects.equals(this.documentation, pluginConfig.documentation) &&
                       Objects.equals(this._interface, pluginConfig._interface) &&
                       Objects.equals(this.entrypoint, pluginConfig.entrypoint) &&
                       Objects.equals(this.workDir, pluginConfig.workDir) &&
                       Objects.equals(this.user, pluginConfig.user) &&
                       Objects.equals(this.network, pluginConfig.network) &&
                       Objects.equals(this.linux, pluginConfig.linux) &&
                       Objects.equals(this.propagatedMount, pluginConfig.propagatedMount) &&
                       Objects.equals(this.ipcHost, pluginConfig.ipcHost) &&
                       Objects.equals(this.pidHost, pluginConfig.pidHost) &&
                       Objects.equals(this.mounts, pluginConfig.mounts) &&
                       Objects.equals(this.env, pluginConfig.env) &&
                       Objects.equals(this.args, pluginConfig.args) &&
                       Objects.equals(this.rootfs, pluginConfig.rootfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerVersion, description, documentation, _interface, entrypoint, workDir, user, network, linux, propagatedMount, ipcHost, pidHost, mounts, env, args, rootfs);
    }

    @Override
    public String toString() {

        return "class PluginConfig {\n" +
                            "    dockerVersion: " + toIndentedString(dockerVersion) + "\n" +
                            "    description: " + toIndentedString(description) + "\n" +
                            "    documentation: " + toIndentedString(documentation) + "\n" +
                            "    _interface: " + toIndentedString(_interface) + "\n" +
                            "    entrypoint: " + toIndentedString(entrypoint) + "\n" +
                            "    workDir: " + toIndentedString(workDir) + "\n" +
                            "    user: " + toIndentedString(user) + "\n" +
                            "    network: " + toIndentedString(network) + "\n" +
                            "    linux: " + toIndentedString(linux) + "\n" +
                            "    propagatedMount: " + toIndentedString(propagatedMount) + "\n" +
                            "    ipcHost: " + toIndentedString(ipcHost) + "\n" +
                            "    pidHost: " + toIndentedString(pidHost) + "\n" +
                            "    mounts: " + toIndentedString(mounts) + "\n" +
                            "    env: " + toIndentedString(env) + "\n" +
                            "    args: " + toIndentedString(args) + "\n" +
                            "    rootfs: " + toIndentedString(rootfs) + "\n" +
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


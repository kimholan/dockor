package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Configuration for a container that is portable between hosts
 **/

public class ContainerConfig {

    private String hostname;

    private String domainname;

    private String user;

    private Boolean attachStdin = false;

    private Boolean attachStdout = true;

    private Boolean attachStderr = true;

    private Map<String, Object> exposedPorts = new HashMap<>();

    private Boolean tty = false;

    private Boolean openStdin = false;

    private Boolean stdinOnce = false;

    private List<String> env = new ArrayList<>();

    private List<String> cmd = new ArrayList<>();

    private HealthConfig healthcheck;

    private Boolean argsEscaped;

    private String image;

    private Map<String, Object> volumes = new HashMap<>();

    private String workingDir;

    private List<String> entrypoint = new ArrayList<>();

    private Boolean networkDisabled;

    private String macAddress;

    private List<String> onBuild = new ArrayList<>();

    private Map<String, String> labels = new HashMap<>();

    private String stopSignal = "SIGTERM";

    private Integer stopTimeout;

    private List<String> shell = new ArrayList<>();

    /**
     * The hostname to use for the container, as a valid RFC 1123 hostname.
     **/
    public ContainerConfig hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    @JsonProperty("Hostname")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * The domain name to use for the container.
     **/
    public ContainerConfig domainname(String domainname) {
        this.domainname = domainname;
        return this;
    }

    @JsonProperty("Domainname")
    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    /**
     * The user that commands are run as inside the container.
     **/
    public ContainerConfig user(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("User")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Whether to attach to &#x60;stdin&#x60;.
     **/
    public ContainerConfig attachStdin(Boolean attachStdin) {
        this.attachStdin = attachStdin;
        return this;
    }

    @JsonProperty("AttachStdin")
    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public void setAttachStdin(Boolean attachStdin) {
        this.attachStdin = attachStdin;
    }

    /**
     * Whether to attach to &#x60;stdout&#x60;.
     **/
    public ContainerConfig attachStdout(Boolean attachStdout) {
        this.attachStdout = attachStdout;
        return this;
    }

    @JsonProperty("AttachStdout")
    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public void setAttachStdout(Boolean attachStdout) {
        this.attachStdout = attachStdout;
    }

    /**
     * Whether to attach to &#x60;stderr&#x60;.
     **/
    public ContainerConfig attachStderr(Boolean attachStderr) {
        this.attachStderr = attachStderr;
        return this;
    }

    @JsonProperty("AttachStderr")
    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public void setAttachStderr(Boolean attachStderr) {
        this.attachStderr = attachStderr;
    }

    /**
     * An object mapping ports to an empty object in the form:  &#x60;{\&quot;&lt;port&gt;/&lt;tcp|udp|sctp&gt;\&quot;: {}}&#x60;
     **/
    public ContainerConfig exposedPorts(Map<String, Object> exposedPorts) {
        this.exposedPorts = exposedPorts;
        return this;
    }

    @JsonProperty("ExposedPorts")
    public Map<String, Object> getExposedPorts() {
        return exposedPorts;
    }

    public void setExposedPorts(Map<String, Object> exposedPorts) {
        this.exposedPorts = exposedPorts;
    }

    /**
     * Attach standard streams to a TTY, including &#x60;stdin&#x60; if it is not closed.
     **/
    public ContainerConfig tty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    @JsonProperty("Tty")
    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * Open &#x60;stdin&#x60;
     **/
    public ContainerConfig openStdin(Boolean openStdin) {
        this.openStdin = openStdin;
        return this;
    }

    @JsonProperty("OpenStdin")
    public Boolean getOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(Boolean openStdin) {
        this.openStdin = openStdin;
    }

    /**
     * Close &#x60;stdin&#x60; after one attached client disconnects
     **/
    public ContainerConfig stdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    @JsonProperty("StdinOnce")
    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    /**
     * A list of environment variables to set inside the container in the form &#x60;[\&quot;VAR&#x3D;value\&quot;, ...]&#x60;. A variable without &#x60;&#x3D;&#x60; is removed from the environment, rather than to have an empty value.
     **/
    public ContainerConfig env(List<String> env) {
        this.env = env;
        return this;
    }

    @JsonProperty("Env")
    public List<String> getEnv() {
        return env;
    }

    public void setEnv(List<String> env) {
        this.env = env;
    }

    /**
     * Command to run specified as a string or an array of strings.
     **/
    public ContainerConfig cmd(List<String> cmd) {
        this.cmd = cmd;
        return this;
    }

    @JsonProperty("Cmd")
    public List<String> getCmd() {
        return cmd;
    }

    public void setCmd(List<String> cmd) {
        this.cmd = cmd;
    }

    /**
     *
     **/
    public ContainerConfig healthcheck(HealthConfig healthcheck) {
        this.healthcheck = healthcheck;
        return this;
    }

    @JsonProperty("Healthcheck")
    public HealthConfig getHealthcheck() {
        return healthcheck;
    }

    public void setHealthcheck(HealthConfig healthcheck) {
        this.healthcheck = healthcheck;
    }

    /**
     * Command is already escaped (Windows only)
     **/
    public ContainerConfig argsEscaped(Boolean argsEscaped) {
        this.argsEscaped = argsEscaped;
        return this;
    }

    @JsonProperty("ArgsEscaped")
    public Boolean getArgsEscaped() {
        return argsEscaped;
    }

    public void setArgsEscaped(Boolean argsEscaped) {
        this.argsEscaped = argsEscaped;
    }

    /**
     * The name of the image to use when creating the container/
     **/
    public ContainerConfig image(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("Image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * An object mapping mount point paths inside the container to empty objects.
     **/
    public ContainerConfig volumes(Map<String, Object> volumes) {
        this.volumes = volumes;
        return this;
    }

    @JsonProperty("Volumes")
    public Map<String, Object> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<String, Object> volumes) {
        this.volumes = volumes;
    }

    /**
     * The working directory for commands to run in.
     **/
    public ContainerConfig workingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    @JsonProperty("WorkingDir")
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    /**
     * The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (&#x60;[\&quot;\&quot;]&#x60;) then the entry point is reset to system default (i.e., the entry point used by docker when there is no &#x60;ENTRYPOINT&#x60; instruction in the &#x60;Dockerfile&#x60;).
     **/
    public ContainerConfig entrypoint(List<String> entrypoint) {
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
     * Disable networking for the container.
     **/
    public ContainerConfig networkDisabled(Boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
        return this;
    }

    @JsonProperty("NetworkDisabled")
    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public void setNetworkDisabled(Boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
    }

    /**
     * MAC address of the container.
     **/
    public ContainerConfig macAddress(String macAddress) {
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
     * &#x60;ONBUILD&#x60; metadata that were defined in the image&#39;s &#x60;Dockerfile&#x60;.
     **/
    public ContainerConfig onBuild(List<String> onBuild) {
        this.onBuild = onBuild;
        return this;
    }

    @JsonProperty("OnBuild")
    public List<String> getOnBuild() {
        return onBuild;
    }

    public void setOnBuild(List<String> onBuild) {
        this.onBuild = onBuild;
    }

    /**
     * User-defined key/value metadata.
     **/
    public ContainerConfig labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("Labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * Signal to stop a container as a string or unsigned integer.
     **/
    public ContainerConfig stopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
        return this;
    }

    @JsonProperty("StopSignal")
    public String getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
    }

    /**
     * Timeout to stop a container in seconds.
     **/
    public ContainerConfig stopTimeout(Integer stopTimeout) {
        this.stopTimeout = stopTimeout;
        return this;
    }

    @JsonProperty("StopTimeout")
    public Integer getStopTimeout() {
        return stopTimeout;
    }

    public void setStopTimeout(Integer stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    /**
     * Shell for when &#x60;RUN&#x60;, &#x60;CMD&#x60;, and &#x60;ENTRYPOINT&#x60; uses a shell.
     **/
    public ContainerConfig shell(List<String> shell) {
        this.shell = shell;
        return this;
    }

    @JsonProperty("Shell")
    public List<String> getShell() {
        return shell;
    }

    public void setShell(List<String> shell) {
        this.shell = shell;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerConfig = (ContainerConfig) o;
        return Objects.equals(this.hostname, containerConfig.hostname) &&
                       Objects.equals(this.domainname, containerConfig.domainname) &&
                       Objects.equals(this.user, containerConfig.user) &&
                       Objects.equals(this.attachStdin, containerConfig.attachStdin) &&
                       Objects.equals(this.attachStdout, containerConfig.attachStdout) &&
                       Objects.equals(this.attachStderr, containerConfig.attachStderr) &&
                       Objects.equals(this.exposedPorts, containerConfig.exposedPorts) &&
                       Objects.equals(this.tty, containerConfig.tty) &&
                       Objects.equals(this.openStdin, containerConfig.openStdin) &&
                       Objects.equals(this.stdinOnce, containerConfig.stdinOnce) &&
                       Objects.equals(this.env, containerConfig.env) &&
                       Objects.equals(this.cmd, containerConfig.cmd) &&
                       Objects.equals(this.healthcheck, containerConfig.healthcheck) &&
                       Objects.equals(this.argsEscaped, containerConfig.argsEscaped) &&
                       Objects.equals(this.image, containerConfig.image) &&
                       Objects.equals(this.volumes, containerConfig.volumes) &&
                       Objects.equals(this.workingDir, containerConfig.workingDir) &&
                       Objects.equals(this.entrypoint, containerConfig.entrypoint) &&
                       Objects.equals(this.networkDisabled, containerConfig.networkDisabled) &&
                       Objects.equals(this.macAddress, containerConfig.macAddress) &&
                       Objects.equals(this.onBuild, containerConfig.onBuild) &&
                       Objects.equals(this.labels, containerConfig.labels) &&
                       Objects.equals(this.stopSignal, containerConfig.stopSignal) &&
                       Objects.equals(this.stopTimeout, containerConfig.stopTimeout) &&
                       Objects.equals(this.shell, containerConfig.shell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, domainname, user, attachStdin, attachStdout, attachStderr, exposedPorts, tty, openStdin, stdinOnce, env, cmd, healthcheck, argsEscaped, image, volumes, workingDir, entrypoint, networkDisabled, macAddress, onBuild, labels, stopSignal, stopTimeout, shell);
    }

    @Override
    public String toString() {

        return "class ContainerConfig {\n" +
                            "    hostname: " + toIndentedString(hostname) + "\n" +
                            "    domainname: " + toIndentedString(domainname) + "\n" +
                            "    user: " + toIndentedString(user) + "\n" +
                            "    attachStdin: " + toIndentedString(attachStdin) + "\n" +
                            "    attachStdout: " + toIndentedString(attachStdout) + "\n" +
                            "    attachStderr: " + toIndentedString(attachStderr) + "\n" +
                            "    exposedPorts: " + toIndentedString(exposedPorts) + "\n" +
                            "    tty: " + toIndentedString(tty) + "\n" +
                            "    openStdin: " + toIndentedString(openStdin) + "\n" +
                            "    stdinOnce: " + toIndentedString(stdinOnce) + "\n" +
                            "    env: " + toIndentedString(env) + "\n" +
                            "    cmd: " + toIndentedString(cmd) + "\n" +
                            "    healthcheck: " + toIndentedString(healthcheck) + "\n" +
                            "    argsEscaped: " + toIndentedString(argsEscaped) + "\n" +
                            "    image: " + toIndentedString(image) + "\n" +
                            "    volumes: " + toIndentedString(volumes) + "\n" +
                            "    workingDir: " + toIndentedString(workingDir) + "\n" +
                            "    entrypoint: " + toIndentedString(entrypoint) + "\n" +
                            "    networkDisabled: " + toIndentedString(networkDisabled) + "\n" +
                            "    macAddress: " + toIndentedString(macAddress) + "\n" +
                            "    onBuild: " + toIndentedString(onBuild) + "\n" +
                            "    labels: " + toIndentedString(labels) + "\n" +
                            "    stopSignal: " + toIndentedString(stopSignal) + "\n" +
                            "    stopTimeout: " + toIndentedString(stopTimeout) + "\n" +
                            "    shell: " + toIndentedString(shell) + "\n" +
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


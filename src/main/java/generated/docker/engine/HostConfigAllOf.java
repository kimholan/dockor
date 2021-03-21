package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HostConfigAllOf {

    private List<String> binds = new ArrayList<>();

    private String containerIDFile;

    private HostConfigAllOfLogConfig logConfig;

    private String networkMode;

    private PortMap portBindings = new PortMap();

    private RestartPolicy restartPolicy;

    private Boolean autoRemove;

    private String volumeDriver;

    private List<String> volumesFrom = new ArrayList<>();

    private List<Mount> mounts = new ArrayList<>();

    private List<String> capAdd = new ArrayList<>();

    private List<String> capDrop = new ArrayList<>();

    private CgroupnsModeEnum cgroupnsMode;

    private List<String> dns = new ArrayList<>();

    private List<String> dnsOptions = new ArrayList<>();

    private List<String> dnsSearch = new ArrayList<>();

    private List<String> extraHosts = new ArrayList<>();

    private List<String> groupAdd = new ArrayList<>();

    private String ipcMode;

    private String cgroup;

    private List<String> links = new ArrayList<>();

    private Integer oomScoreAdj;

    private String pidMode;

    private Boolean privileged;

    private Boolean publishAllPorts;

    private Boolean readonlyRootfs;

    private List<String> securityOpt = new ArrayList<>();

    private Map<String, String> storageOpt = new HashMap<>();

    private Map<String, String> tmpfs = new HashMap<>();

    private String utSMode;

    private String usernsMode;

    private Integer shmSize;

    private Map<String, String> sysctls = new HashMap<>();

    private String runtime;

    private List<Integer> consoleSize = new ArrayList<>();

    private IsolationEnum isolation;

    private List<String> maskedPaths = new ArrayList<>();

    private List<String> readonlyPaths = new ArrayList<>();

    /**
     * A list of volume bindings for this container. Each volume binding is a string in one of these forms:  - &#x60;host-src:container-dest[:options]&#x60; to bind-mount a host path   into the container. Both &#x60;host-src&#x60;, and &#x60;container-dest&#x60; must   be an _absolute_ path. - &#x60;volume-name:container-dest[:options]&#x60; to bind-mount a volume   managed by a volume driver into the container. &#x60;container-dest&#x60;   must be an _absolute_ path.  &#x60;options&#x60; is an optional, comma-delimited list of:  - &#x60;nocopy&#x60; disables automatic copying of data from the container   path to the volume. The &#x60;nocopy&#x60; flag only applies to named volumes. - &#x60;[ro|rw]&#x60; mounts a volume read-only or read-write, respectively.   If omitted or set to &#x60;rw&#x60;, volumes are mounted read-write. - &#x60;[z|Z]&#x60; applies SELinux labels to allow or deny multiple containers   to read and write to the same volume.     - &#x60;z&#x60;: a _shared_ content label is applied to the content. This       label indicates that multiple containers can share the volume       content, for both reading and writing.     - &#x60;Z&#x60;: a _private unshared_ label is applied to the content.       This label indicates that only the current container can use       a private volume. Labeling systems such as SELinux require       proper labels to be placed on volume content that is mounted       into a container. Without a label, the security system can       prevent a container&#39;s processes from using the content. By       default, the labels set by the host operating system are not       modified. - &#x60;[[r]shared|[r]slave|[r]private]&#x60; specifies mount   [propagation behavior](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt).   This only applies to bind-mounted volumes, not internal volumes   or named volumes. Mount propagation requires the source mount   point (the location where the source directory is mounted in the   host operating system) to have the correct propagation properties.   For shared volumes, the source mount point must be set to &#x60;shared&#x60;.   For slave volumes, the mount must be set to either &#x60;shared&#x60; or   &#x60;slave&#x60;.
     **/
    public HostConfigAllOf binds(List<String> binds) {
        this.binds = binds;
        return this;
    }

    @JsonProperty("Binds")
    public List<String> getBinds() {
        return binds;
    }

    public void setBinds(List<String> binds) {
        this.binds = binds;
    }

    /**
     * Path to a file where the container ID is written
     **/
    public HostConfigAllOf containerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
        return this;
    }

    @JsonProperty("ContainerIDFile")
    public String getContainerIDFile() {
        return containerIDFile;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    /**
     *
     **/
    public HostConfigAllOf logConfig(HostConfigAllOfLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    @JsonProperty("LogConfig")
    public HostConfigAllOfLogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(HostConfigAllOfLogConfig logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * Network mode to use for this container. Supported standard values are: &#x60;bridge&#x60;, &#x60;host&#x60;, &#x60;none&#x60;, and &#x60;container:&lt;name|id&gt;&#x60;. Any other value is taken as a custom network&#39;s name to which this container should connect to.
     **/
    public HostConfigAllOf networkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    @JsonProperty("NetworkMode")
    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     *
     **/
    public HostConfigAllOf portBindings(PortMap portBindings) {
        this.portBindings = portBindings;
        return this;
    }

    @JsonProperty("PortBindings")
    public PortMap getPortBindings() {
        return portBindings;
    }

    public void setPortBindings(PortMap portBindings) {
        this.portBindings = portBindings;
    }

    /**
     *
     **/
    public HostConfigAllOf restartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    @JsonProperty("RestartPolicy")
    public RestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     * Automatically remove the container when the container&#39;s process exits. This has no effect if &#x60;RestartPolicy&#x60; is set.
     **/
    public HostConfigAllOf autoRemove(Boolean autoRemove) {
        this.autoRemove = autoRemove;
        return this;
    }

    @JsonProperty("AutoRemove")
    public Boolean getAutoRemove() {
        return autoRemove;
    }

    public void setAutoRemove(Boolean autoRemove) {
        this.autoRemove = autoRemove;
    }

    /**
     * Driver that this container uses to mount volumes.
     **/
    public HostConfigAllOf volumeDriver(String volumeDriver) {
        this.volumeDriver = volumeDriver;
        return this;
    }

    @JsonProperty("VolumeDriver")
    public String getVolumeDriver() {
        return volumeDriver;
    }

    public void setVolumeDriver(String volumeDriver) {
        this.volumeDriver = volumeDriver;
    }

    /**
     * A list of volumes to inherit from another container, specified in the form &#x60;&lt;container name&gt;[:&lt;ro|rw&gt;]&#x60;.
     **/
    public HostConfigAllOf volumesFrom(List<String> volumesFrom) {
        this.volumesFrom = volumesFrom;
        return this;
    }

    @JsonProperty("VolumesFrom")
    public List<String> getVolumesFrom() {
        return volumesFrom;
    }

    public void setVolumesFrom(List<String> volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    /**
     * Specification for mounts to be added to the container.
     **/
    public HostConfigAllOf mounts(List<Mount> mounts) {
        this.mounts = mounts;
        return this;
    }

    @JsonProperty("Mounts")
    public List<Mount> getMounts() {
        return mounts;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }

    /**
     * A list of kernel capabilities to add to the container. Conflicts with option &#39;Capabilities&#39;.
     **/
    public HostConfigAllOf capAdd(List<String> capAdd) {
        this.capAdd = capAdd;
        return this;
    }

    @JsonProperty("CapAdd")
    public List<String> getCapAdd() {
        return capAdd;
    }

    public void setCapAdd(List<String> capAdd) {
        this.capAdd = capAdd;
    }

    /**
     * A list of kernel capabilities to drop from the container. Conflicts with option &#39;Capabilities&#39;.
     **/
    public HostConfigAllOf capDrop(List<String> capDrop) {
        this.capDrop = capDrop;
        return this;
    }

    @JsonProperty("CapDrop")
    public List<String> getCapDrop() {
        return capDrop;
    }

    public void setCapDrop(List<String> capDrop) {
        this.capDrop = capDrop;
    }

    /**
     * cgroup namespace mode for the container. Possible values are:  - &#x60;\&quot;private\&quot;&#x60;: the container runs in its own private cgroup namespace - &#x60;\&quot;host\&quot;&#x60;: use the host system&#39;s cgroup namespace  If not specified, the daemon default is used, which can either be &#x60;\&quot;private\&quot;&#x60; or &#x60;\&quot;host\&quot;&#x60;, depending on daemon version, kernel support and configuration.
     **/
    public HostConfigAllOf cgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
        this.cgroupnsMode = cgroupnsMode;
        return this;
    }

    @JsonProperty("CgroupnsMode")
    public CgroupnsModeEnum getCgroupnsMode() {
        return cgroupnsMode;
    }

    public void setCgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
        this.cgroupnsMode = cgroupnsMode;
    }

    /**
     * A list of DNS servers for the container to use.
     **/
    public HostConfigAllOf dns(List<String> dns) {
        this.dns = dns;
        return this;
    }

    @JsonProperty("Dns")
    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    /**
     * A list of DNS options.
     **/
    public HostConfigAllOf dnsOptions(List<String> dnsOptions) {
        this.dnsOptions = dnsOptions;
        return this;
    }

    @JsonProperty("DnsOptions")
    public List<String> getDnsOptions() {
        return dnsOptions;
    }

    public void setDnsOptions(List<String> dnsOptions) {
        this.dnsOptions = dnsOptions;
    }

    /**
     * A list of DNS search domains.
     **/
    public HostConfigAllOf dnsSearch(List<String> dnsSearch) {
        this.dnsSearch = dnsSearch;
        return this;
    }

    @JsonProperty("DnsSearch")
    public List<String> getDnsSearch() {
        return dnsSearch;
    }

    public void setDnsSearch(List<String> dnsSearch) {
        this.dnsSearch = dnsSearch;
    }

    /**
     * A list of hostnames/IP mappings to add to the container&#39;s &#x60;/etc/hosts&#x60; file. Specified in the form &#x60;[\&quot;hostname:IP\&quot;]&#x60;.
     **/
    public HostConfigAllOf extraHosts(List<String> extraHosts) {
        this.extraHosts = extraHosts;
        return this;
    }

    @JsonProperty("ExtraHosts")
    public List<String> getExtraHosts() {
        return extraHosts;
    }

    public void setExtraHosts(List<String> extraHosts) {
        this.extraHosts = extraHosts;
    }

    /**
     * A list of additional groups that the container process will run as.
     **/
    public HostConfigAllOf groupAdd(List<String> groupAdd) {
        this.groupAdd = groupAdd;
        return this;
    }

    @JsonProperty("GroupAdd")
    public List<String> getGroupAdd() {
        return groupAdd;
    }

    public void setGroupAdd(List<String> groupAdd) {
        this.groupAdd = groupAdd;
    }

    /**
     * IPC sharing mode for the container. Possible values are:  - &#x60;\&quot;none\&quot;&#x60;: own private IPC namespace, with /dev/shm not mounted - &#x60;\&quot;private\&quot;&#x60;: own private IPC namespace - &#x60;\&quot;shareable\&quot;&#x60;: own private IPC namespace, with a possibility to share it with other containers - &#x60;\&quot;container:&lt;name|id&gt;\&quot;&#x60;: join another (shareable) container&#39;s IPC namespace - &#x60;\&quot;host\&quot;&#x60;: use the host system&#39;s IPC namespace  If not specified, daemon default is used, which can either be &#x60;\&quot;private\&quot;&#x60; or &#x60;\&quot;shareable\&quot;&#x60;, depending on daemon version and configuration.
     **/
    public HostConfigAllOf ipcMode(String ipcMode) {
        this.ipcMode = ipcMode;
        return this;
    }

    @JsonProperty("IpcMode")
    public String getIpcMode() {
        return ipcMode;
    }

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * Cgroup to use for the container.
     **/
    public HostConfigAllOf cgroup(String cgroup) {
        this.cgroup = cgroup;
        return this;
    }

    @JsonProperty("Cgroup")
    public String getCgroup() {
        return cgroup;
    }

    public void setCgroup(String cgroup) {
        this.cgroup = cgroup;
    }

    /**
     * A list of links for the container in the form &#x60;container_name:alias&#x60;.
     **/
    public HostConfigAllOf links(List<String> links) {
        this.links = links;
        return this;
    }

    @JsonProperty("Links")
    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    /**
     * An integer value containing the score given to the container in order to tune OOM killer preferences.
     **/
    public HostConfigAllOf oomScoreAdj(Integer oomScoreAdj) {
        this.oomScoreAdj = oomScoreAdj;
        return this;
    }

    @JsonProperty("OomScoreAdj")
    public Integer getOomScoreAdj() {
        return oomScoreAdj;
    }

    public void setOomScoreAdj(Integer oomScoreAdj) {
        this.oomScoreAdj = oomScoreAdj;
    }

    /**
     * Set the PID (Process) Namespace mode for the container. It can be either:  - &#x60;\&quot;container:&lt;name|id&gt;\&quot;&#x60;: joins another container&#39;s PID namespace - &#x60;\&quot;host\&quot;&#x60;: use the host&#39;s PID namespace inside the container
     **/
    public HostConfigAllOf pidMode(String pidMode) {
        this.pidMode = pidMode;
        return this;
    }

    @JsonProperty("PidMode")
    public String getPidMode() {
        return pidMode;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * Gives the container full access to the host.
     **/
    public HostConfigAllOf privileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    @JsonProperty("Privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * Allocates an ephemeral host port for all of a container&#39;s exposed ports.  Ports are de-allocated when the container stops and allocated when the container starts. The allocated port might be changed when restarting the container.  The port is selected from the ephemeral port range that depends on the kernel. For example, on Linux the range is defined by &#x60;/proc/sys/net/ipv4/ip_local_port_range&#x60;.
     **/
    public HostConfigAllOf publishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
        return this;
    }

    @JsonProperty("PublishAllPorts")
    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    /**
     * Mount the container&#39;s root filesystem as read only.
     **/
    public HostConfigAllOf readonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
        return this;
    }

    @JsonProperty("ReadonlyRootfs")
    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public void setReadonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
    }

    /**
     * A list of string values to customize labels for MLS systems, such as SELinux.
     **/
    public HostConfigAllOf securityOpt(List<String> securityOpt) {
        this.securityOpt = securityOpt;
        return this;
    }

    @JsonProperty("SecurityOpt")
    public List<String> getSecurityOpt() {
        return securityOpt;
    }

    public void setSecurityOpt(List<String> securityOpt) {
        this.securityOpt = securityOpt;
    }

    /**
     * Storage driver options for this container, in the form &#x60;{\&quot;size\&quot;: \&quot;120G\&quot;}&#x60;.
     **/
    public HostConfigAllOf storageOpt(Map<String, String> storageOpt) {
        this.storageOpt = storageOpt;
        return this;
    }

    @JsonProperty("StorageOpt")
    public Map<String, String> getStorageOpt() {
        return storageOpt;
    }

    public void setStorageOpt(Map<String, String> storageOpt) {
        this.storageOpt = storageOpt;
    }

    /**
     * A map of container directories which should be replaced by tmpfs mounts, and their corresponding mount options. For example:  &#x60;&#x60;&#x60; { \&quot;/run\&quot;: \&quot;rw,noexec,nosuid,size&#x3D;65536k\&quot; } &#x60;&#x60;&#x60;
     **/
    public HostConfigAllOf tmpfs(Map<String, String> tmpfs) {
        this.tmpfs = tmpfs;
        return this;
    }

    @JsonProperty("Tmpfs")
    public Map<String, String> getTmpfs() {
        return tmpfs;
    }

    public void setTmpfs(Map<String, String> tmpfs) {
        this.tmpfs = tmpfs;
    }

    /**
     * UTS namespace to use for the container.
     **/
    public HostConfigAllOf utSMode(String utSMode) {
        this.utSMode = utSMode;
        return this;
    }

    @JsonProperty("UTSMode")
    public String getUtSMode() {
        return utSMode;
    }

    public void setUtSMode(String utSMode) {
        this.utSMode = utSMode;
    }

    /**
     * Sets the usernamespace mode for the container when usernamespace remapping option is enabled.
     **/
    public HostConfigAllOf usernsMode(String usernsMode) {
        this.usernsMode = usernsMode;
        return this;
    }

    @JsonProperty("UsernsMode")
    public String getUsernsMode() {
        return usernsMode;
    }

    public void setUsernsMode(String usernsMode) {
        this.usernsMode = usernsMode;
    }

    /**
     * Size of &#x60;/dev/shm&#x60; in bytes. If omitted, the system uses 64MB.
     * minimum: 0
     **/
    public HostConfigAllOf shmSize(Integer shmSize) {
        this.shmSize = shmSize;
        return this;
    }

    @JsonProperty("ShmSize")
    public Integer getShmSize() {
        return shmSize;
    }

    public void setShmSize(Integer shmSize) {
        this.shmSize = shmSize;
    }

    /**
     * A list of kernel parameters (sysctls) to set in the container. For example:  &#x60;&#x60;&#x60; {\&quot;net.ipv4.ip_forward\&quot;: \&quot;1\&quot;} &#x60;&#x60;&#x60;
     **/
    public HostConfigAllOf sysctls(Map<String, String> sysctls) {
        this.sysctls = sysctls;
        return this;
    }

    @JsonProperty("Sysctls")
    public Map<String, String> getSysctls() {
        return sysctls;
    }

    public void setSysctls(Map<String, String> sysctls) {
        this.sysctls = sysctls;
    }

    /**
     * Runtime to use with this container.
     **/
    public HostConfigAllOf runtime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    @JsonProperty("Runtime")
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * Initial console size, as an &#x60;[height, width]&#x60; array. (Windows only)
     **/
    public HostConfigAllOf consoleSize(List<Integer> consoleSize) {
        this.consoleSize = consoleSize;
        return this;
    }

    @JsonProperty("ConsoleSize")
    public List<Integer> getConsoleSize() {
        return consoleSize;
    }

    public void setConsoleSize(List<Integer> consoleSize) {
        this.consoleSize = consoleSize;
    }

    /**
     * Isolation technology of the container. (Windows only)
     **/
    public HostConfigAllOf isolation(IsolationEnum isolation) {
        this.isolation = isolation;
        return this;
    }

    @JsonProperty("Isolation")
    public IsolationEnum getIsolation() {
        return isolation;
    }

    public void setIsolation(IsolationEnum isolation) {
        this.isolation = isolation;
    }

    /**
     * The list of paths to be masked inside the container (this overrides the default set of paths).
     **/
    public HostConfigAllOf maskedPaths(List<String> maskedPaths) {
        this.maskedPaths = maskedPaths;
        return this;
    }

    @JsonProperty("MaskedPaths")
    public List<String> getMaskedPaths() {
        return maskedPaths;
    }

    public void setMaskedPaths(List<String> maskedPaths) {
        this.maskedPaths = maskedPaths;
    }

    /**
     * The list of paths to be set as read-only inside the container (this overrides the default set of paths).
     **/
    public HostConfigAllOf readonlyPaths(List<String> readonlyPaths) {
        this.readonlyPaths = readonlyPaths;
        return this;
    }

    @JsonProperty("ReadonlyPaths")
    public List<String> getReadonlyPaths() {
        return readonlyPaths;
    }

    public void setReadonlyPaths(List<String> readonlyPaths) {
        this.readonlyPaths = readonlyPaths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var hostConfigAllOf = (HostConfigAllOf) o;
        return Objects.equals(this.binds, hostConfigAllOf.binds) &&
                       Objects.equals(this.containerIDFile, hostConfigAllOf.containerIDFile) &&
                       Objects.equals(this.logConfig, hostConfigAllOf.logConfig) &&
                       Objects.equals(this.networkMode, hostConfigAllOf.networkMode) &&
                       Objects.equals(this.portBindings, hostConfigAllOf.portBindings) &&
                       Objects.equals(this.restartPolicy, hostConfigAllOf.restartPolicy) &&
                       Objects.equals(this.autoRemove, hostConfigAllOf.autoRemove) &&
                       Objects.equals(this.volumeDriver, hostConfigAllOf.volumeDriver) &&
                       Objects.equals(this.volumesFrom, hostConfigAllOf.volumesFrom) &&
                       Objects.equals(this.mounts, hostConfigAllOf.mounts) &&
                       Objects.equals(this.capAdd, hostConfigAllOf.capAdd) &&
                       Objects.equals(this.capDrop, hostConfigAllOf.capDrop) &&
                       Objects.equals(this.cgroupnsMode, hostConfigAllOf.cgroupnsMode) &&
                       Objects.equals(this.dns, hostConfigAllOf.dns) &&
                       Objects.equals(this.dnsOptions, hostConfigAllOf.dnsOptions) &&
                       Objects.equals(this.dnsSearch, hostConfigAllOf.dnsSearch) &&
                       Objects.equals(this.extraHosts, hostConfigAllOf.extraHosts) &&
                       Objects.equals(this.groupAdd, hostConfigAllOf.groupAdd) &&
                       Objects.equals(this.ipcMode, hostConfigAllOf.ipcMode) &&
                       Objects.equals(this.cgroup, hostConfigAllOf.cgroup) &&
                       Objects.equals(this.links, hostConfigAllOf.links) &&
                       Objects.equals(this.oomScoreAdj, hostConfigAllOf.oomScoreAdj) &&
                       Objects.equals(this.pidMode, hostConfigAllOf.pidMode) &&
                       Objects.equals(this.privileged, hostConfigAllOf.privileged) &&
                       Objects.equals(this.publishAllPorts, hostConfigAllOf.publishAllPorts) &&
                       Objects.equals(this.readonlyRootfs, hostConfigAllOf.readonlyRootfs) &&
                       Objects.equals(this.securityOpt, hostConfigAllOf.securityOpt) &&
                       Objects.equals(this.storageOpt, hostConfigAllOf.storageOpt) &&
                       Objects.equals(this.tmpfs, hostConfigAllOf.tmpfs) &&
                       Objects.equals(this.utSMode, hostConfigAllOf.utSMode) &&
                       Objects.equals(this.usernsMode, hostConfigAllOf.usernsMode) &&
                       Objects.equals(this.shmSize, hostConfigAllOf.shmSize) &&
                       Objects.equals(this.sysctls, hostConfigAllOf.sysctls) &&
                       Objects.equals(this.runtime, hostConfigAllOf.runtime) &&
                       Objects.equals(this.consoleSize, hostConfigAllOf.consoleSize) &&
                       Objects.equals(this.isolation, hostConfigAllOf.isolation) &&
                       Objects.equals(this.maskedPaths, hostConfigAllOf.maskedPaths) &&
                       Objects.equals(this.readonlyPaths, hostConfigAllOf.readonlyPaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binds, containerIDFile, logConfig, networkMode, portBindings, restartPolicy, autoRemove, volumeDriver, volumesFrom, mounts, capAdd, capDrop, cgroupnsMode, dns, dnsOptions, dnsSearch, extraHosts, groupAdd, ipcMode, cgroup, links, oomScoreAdj, pidMode, privileged, publishAllPorts, readonlyRootfs, securityOpt, storageOpt, tmpfs, utSMode, usernsMode, shmSize, sysctls, runtime, consoleSize, isolation, maskedPaths, readonlyPaths);
    }

    @Override
    public String toString() {

        return "class HostConfigAllOf {\n" +
                            "    binds: " + toIndentedString(binds) + "\n" +
                            "    containerIDFile: " + toIndentedString(containerIDFile) + "\n" +
                            "    logConfig: " + toIndentedString(logConfig) + "\n" +
                            "    networkMode: " + toIndentedString(networkMode) + "\n" +
                            "    portBindings: " + toIndentedString(portBindings) + "\n" +
                            "    restartPolicy: " + toIndentedString(restartPolicy) + "\n" +
                            "    autoRemove: " + toIndentedString(autoRemove) + "\n" +
                            "    volumeDriver: " + toIndentedString(volumeDriver) + "\n" +
                            "    volumesFrom: " + toIndentedString(volumesFrom) + "\n" +
                            "    mounts: " + toIndentedString(mounts) + "\n" +
                            "    capAdd: " + toIndentedString(capAdd) + "\n" +
                            "    capDrop: " + toIndentedString(capDrop) + "\n" +
                            "    cgroupnsMode: " + toIndentedString(cgroupnsMode) + "\n" +
                            "    dns: " + toIndentedString(dns) + "\n" +
                            "    dnsOptions: " + toIndentedString(dnsOptions) + "\n" +
                            "    dnsSearch: " + toIndentedString(dnsSearch) + "\n" +
                            "    extraHosts: " + toIndentedString(extraHosts) + "\n" +
                            "    groupAdd: " + toIndentedString(groupAdd) + "\n" +
                            "    ipcMode: " + toIndentedString(ipcMode) + "\n" +
                            "    cgroup: " + toIndentedString(cgroup) + "\n" +
                            "    links: " + toIndentedString(links) + "\n" +
                            "    oomScoreAdj: " + toIndentedString(oomScoreAdj) + "\n" +
                            "    pidMode: " + toIndentedString(pidMode) + "\n" +
                            "    privileged: " + toIndentedString(privileged) + "\n" +
                            "    publishAllPorts: " + toIndentedString(publishAllPorts) + "\n" +
                            "    readonlyRootfs: " + toIndentedString(readonlyRootfs) + "\n" +
                            "    securityOpt: " + toIndentedString(securityOpt) + "\n" +
                            "    storageOpt: " + toIndentedString(storageOpt) + "\n" +
                            "    tmpfs: " + toIndentedString(tmpfs) + "\n" +
                            "    utSMode: " + toIndentedString(utSMode) + "\n" +
                            "    usernsMode: " + toIndentedString(usernsMode) + "\n" +
                            "    shmSize: " + toIndentedString(shmSize) + "\n" +
                            "    sysctls: " + toIndentedString(sysctls) + "\n" +
                            "    runtime: " + toIndentedString(runtime) + "\n" +
                            "    consoleSize: " + toIndentedString(consoleSize) + "\n" +
                            "    isolation: " + toIndentedString(isolation) + "\n" +
                            "    maskedPaths: " + toIndentedString(maskedPaths) + "\n" +
                            "    readonlyPaths: " + toIndentedString(readonlyPaths) + "\n" +
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

    public enum CgroupnsModeEnum {

        PRIVATE("private"), HOST("host");

        private final String value;

        CgroupnsModeEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static CgroupnsModeEnum fromValue(String value) {
            for (var b : CgroupnsModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

    public enum IsolationEnum {

        DEFAULT("default"), PROCESS("process"), HYPERV("hyperv");

        private final String value;

        IsolationEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static IsolationEnum fromValue(String value) {
            for (var b : IsolationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String value() {
            return value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

}


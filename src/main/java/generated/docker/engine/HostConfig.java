package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Container configuration that depends on the host we are running on
 **/

public class HostConfig {

    private Integer cpuShares;

    private Long memory = 0l;

    private String cgroupParent;

    private Integer blkioWeight;

    private List<ResourcesBlkioWeightDevice> blkioWeightDevice = new ArrayList<>();

    private List<ThrottleDevice> blkioDeviceReadBps = new ArrayList<>();

    private List<ThrottleDevice> blkioDeviceWriteBps = new ArrayList<>();

    private List<ThrottleDevice> blkioDeviceReadIOps = new ArrayList<>();

    private List<ThrottleDevice> blkioDeviceWriteIOps = new ArrayList<>();

    private Long cpuPeriod;

    private Long cpuQuota;

    private Long cpuRealtimePeriod;

    private Long cpuRealtimeRuntime;

    private String cpusetCpus;

    private String cpusetMems;

    private List<DeviceMapping> devices = new ArrayList<>();

    private List<String> deviceCgroupRules = new ArrayList<>();

    private List<DeviceRequest> deviceRequests = new ArrayList<>();

    private Long kernelMemory;

    private Long kernelMemoryTCP;

    private Long memoryReservation;

    private Long memorySwap;

    private Long memorySwappiness;

    private Long nanoCpus;

    private Boolean oomKillDisable;

    private Boolean init;

    private Long pidsLimit;

    private List<ResourcesUlimits> ulimits = new ArrayList<>();

    private Long cpuCount;

    private Long cpuPercent;

    private Long ioMaximumIOps;

    private Long ioMaximumBandwidth;

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
     * An integer value representing this container&#39;s relative CPU weight versus other containers.
     **/
    public HostConfig cpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
        return this;
    }

    @JsonProperty("CpuShares")
    public Integer getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    /**
     * Memory limit in bytes.
     **/
    public HostConfig memory(Long memory) {
        this.memory = memory;
        return this;
    }

    @JsonProperty("Memory")
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    /**
     * Path to &#x60;cgroups&#x60; under which the container&#39;s &#x60;cgroup&#x60; is created. If the path is not absolute, the path is considered to be relative to the &#x60;cgroups&#x60; path of the init process. Cgroups are created if they do not already exist.
     **/
    public HostConfig cgroupParent(String cgroupParent) {
        this.cgroupParent = cgroupParent;
        return this;
    }

    @JsonProperty("CgroupParent")
    public String getCgroupParent() {
        return cgroupParent;
    }

    public void setCgroupParent(String cgroupParent) {
        this.cgroupParent = cgroupParent;
    }

    /**
     * Block IO weight (relative weight).
     * minimum: 0
     * maximum: 1000
     **/
    public HostConfig blkioWeight(Integer blkioWeight) {
        this.blkioWeight = blkioWeight;
        return this;
    }

    @JsonProperty("BlkioWeight")
    public Integer getBlkioWeight() {
        return blkioWeight;
    }

    public void setBlkioWeight(Integer blkioWeight) {
        this.blkioWeight = blkioWeight;
    }

    /**
     * Block IO weight (relative device weight) in the form:  &#x60;&#x60;&#x60; [{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Weight\&quot;: weight}] &#x60;&#x60;&#x60;
     **/
    public HostConfig blkioWeightDevice(List<ResourcesBlkioWeightDevice> blkioWeightDevice) {
        this.blkioWeightDevice = blkioWeightDevice;
        return this;
    }

    @JsonProperty("BlkioWeightDevice")
    public List<ResourcesBlkioWeightDevice> getBlkioWeightDevice() {
        return blkioWeightDevice;
    }

    public void setBlkioWeightDevice(List<ResourcesBlkioWeightDevice> blkioWeightDevice) {
        this.blkioWeightDevice = blkioWeightDevice;
    }

    /**
     * Limit read rate (bytes per second) from a device, in the form:  &#x60;&#x60;&#x60; [{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}] &#x60;&#x60;&#x60;
     **/
    public HostConfig blkioDeviceReadBps(List<ThrottleDevice> blkioDeviceReadBps) {
        this.blkioDeviceReadBps = blkioDeviceReadBps;
        return this;
    }

    @JsonProperty("BlkioDeviceReadBps")
    public List<ThrottleDevice> getBlkioDeviceReadBps() {
        return blkioDeviceReadBps;
    }

    public void setBlkioDeviceReadBps(List<ThrottleDevice> blkioDeviceReadBps) {
        this.blkioDeviceReadBps = blkioDeviceReadBps;
    }

    /**
     * Limit write rate (bytes per second) to a device, in the form:  &#x60;&#x60;&#x60; [{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}] &#x60;&#x60;&#x60;
     **/
    public HostConfig blkioDeviceWriteBps(List<ThrottleDevice> blkioDeviceWriteBps) {
        this.blkioDeviceWriteBps = blkioDeviceWriteBps;
        return this;
    }

    @JsonProperty("BlkioDeviceWriteBps")
    public List<ThrottleDevice> getBlkioDeviceWriteBps() {
        return blkioDeviceWriteBps;
    }

    public void setBlkioDeviceWriteBps(List<ThrottleDevice> blkioDeviceWriteBps) {
        this.blkioDeviceWriteBps = blkioDeviceWriteBps;
    }

    /**
     * Limit read rate (IO per second) from a device, in the form:  &#x60;&#x60;&#x60; [{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}] &#x60;&#x60;&#x60;
     **/
    public HostConfig blkioDeviceReadIOps(List<ThrottleDevice> blkioDeviceReadIOps) {
        this.blkioDeviceReadIOps = blkioDeviceReadIOps;
        return this;
    }

    @JsonProperty("BlkioDeviceReadIOps")
    public List<ThrottleDevice> getBlkioDeviceReadIOps() {
        return blkioDeviceReadIOps;
    }

    public void setBlkioDeviceReadIOps(List<ThrottleDevice> blkioDeviceReadIOps) {
        this.blkioDeviceReadIOps = blkioDeviceReadIOps;
    }

    /**
     * Limit write rate (IO per second) to a device, in the form:  &#x60;&#x60;&#x60; [{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}] &#x60;&#x60;&#x60;
     **/
    public HostConfig blkioDeviceWriteIOps(List<ThrottleDevice> blkioDeviceWriteIOps) {
        this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
        return this;
    }

    @JsonProperty("BlkioDeviceWriteIOps")
    public List<ThrottleDevice> getBlkioDeviceWriteIOps() {
        return blkioDeviceWriteIOps;
    }

    public void setBlkioDeviceWriteIOps(List<ThrottleDevice> blkioDeviceWriteIOps) {
        this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
    }

    /**
     * The length of a CPU period in microseconds.
     **/
    public HostConfig cpuPeriod(Long cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
        return this;
    }

    @JsonProperty("CpuPeriod")
    public Long getCpuPeriod() {
        return cpuPeriod;
    }

    public void setCpuPeriod(Long cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
    }

    /**
     * Microseconds of CPU time that the container can get in a CPU period.
     **/
    public HostConfig cpuQuota(Long cpuQuota) {
        this.cpuQuota = cpuQuota;
        return this;
    }

    @JsonProperty("CpuQuota")
    public Long getCpuQuota() {
        return cpuQuota;
    }

    public void setCpuQuota(Long cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    /**
     * The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks.
     **/
    public HostConfig cpuRealtimePeriod(Long cpuRealtimePeriod) {
        this.cpuRealtimePeriod = cpuRealtimePeriod;
        return this;
    }

    @JsonProperty("CpuRealtimePeriod")
    public Long getCpuRealtimePeriod() {
        return cpuRealtimePeriod;
    }

    public void setCpuRealtimePeriod(Long cpuRealtimePeriod) {
        this.cpuRealtimePeriod = cpuRealtimePeriod;
    }

    /**
     * The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks.
     **/
    public HostConfig cpuRealtimeRuntime(Long cpuRealtimeRuntime) {
        this.cpuRealtimeRuntime = cpuRealtimeRuntime;
        return this;
    }

    @JsonProperty("CpuRealtimeRuntime")
    public Long getCpuRealtimeRuntime() {
        return cpuRealtimeRuntime;
    }

    public void setCpuRealtimeRuntime(Long cpuRealtimeRuntime) {
        this.cpuRealtimeRuntime = cpuRealtimeRuntime;
    }

    /**
     * CPUs in which to allow execution (e.g., &#x60;0-3&#x60;, &#x60;0,1&#x60;).
     **/
    public HostConfig cpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
        return this;
    }

    @JsonProperty("CpusetCpus")
    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    /**
     * Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems.
     **/
    public HostConfig cpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
        return this;
    }

    @JsonProperty("CpusetMems")
    public String getCpusetMems() {
        return cpusetMems;
    }

    public void setCpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
    }

    /**
     * A list of devices to add to the container.
     **/
    public HostConfig devices(List<DeviceMapping> devices) {
        this.devices = devices;
        return this;
    }

    @JsonProperty("Devices")
    public List<DeviceMapping> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceMapping> devices) {
        this.devices = devices;
    }

    /**
     * a list of cgroup rules to apply to the container
     **/
    public HostConfig deviceCgroupRules(List<String> deviceCgroupRules) {
        this.deviceCgroupRules = deviceCgroupRules;
        return this;
    }

    @JsonProperty("DeviceCgroupRules")
    public List<String> getDeviceCgroupRules() {
        return deviceCgroupRules;
    }

    public void setDeviceCgroupRules(List<String> deviceCgroupRules) {
        this.deviceCgroupRules = deviceCgroupRules;
    }

    /**
     * A list of requests for devices to be sent to device drivers.
     **/
    public HostConfig deviceRequests(List<DeviceRequest> deviceRequests) {
        this.deviceRequests = deviceRequests;
        return this;
    }

    @JsonProperty("DeviceRequests")
    public List<DeviceRequest> getDeviceRequests() {
        return deviceRequests;
    }

    public void setDeviceRequests(List<DeviceRequest> deviceRequests) {
        this.deviceRequests = deviceRequests;
    }

    /**
     * Kernel memory limit in bytes.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is deprecated as the kernel 5.4 deprecated &gt; &#x60;kmem.limit_in_bytes&#x60;.
     **/
    public HostConfig kernelMemory(Long kernelMemory) {
        this.kernelMemory = kernelMemory;
        return this;
    }

    @JsonProperty("KernelMemory")
    public Long getKernelMemory() {
        return kernelMemory;
    }

    public void setKernelMemory(Long kernelMemory) {
        this.kernelMemory = kernelMemory;
    }

    /**
     * Hard limit for kernel TCP buffer memory (in bytes).
     **/
    public HostConfig kernelMemoryTCP(Long kernelMemoryTCP) {
        this.kernelMemoryTCP = kernelMemoryTCP;
        return this;
    }

    @JsonProperty("KernelMemoryTCP")
    public Long getKernelMemoryTCP() {
        return kernelMemoryTCP;
    }

    public void setKernelMemoryTCP(Long kernelMemoryTCP) {
        this.kernelMemoryTCP = kernelMemoryTCP;
    }

    /**
     * Memory soft limit in bytes.
     **/
    public HostConfig memoryReservation(Long memoryReservation) {
        this.memoryReservation = memoryReservation;
        return this;
    }

    @JsonProperty("MemoryReservation")
    public Long getMemoryReservation() {
        return memoryReservation;
    }

    public void setMemoryReservation(Long memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * Total memory limit (memory + swap). Set as &#x60;-1&#x60; to enable unlimited swap.
     **/
    public HostConfig memorySwap(Long memorySwap) {
        this.memorySwap = memorySwap;
        return this;
    }

    @JsonProperty("MemorySwap")
    public Long getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(Long memorySwap) {
        this.memorySwap = memorySwap;
    }

    /**
     * Tune a container&#39;s memory swappiness behavior. Accepts an integer between 0 and 100.
     * minimum: 0
     * maximum: 100
     **/
    public HostConfig memorySwappiness(Long memorySwappiness) {
        this.memorySwappiness = memorySwappiness;
        return this;
    }

    @JsonProperty("MemorySwappiness")
    public Long getMemorySwappiness() {
        return memorySwappiness;
    }

    public void setMemorySwappiness(Long memorySwappiness) {
        this.memorySwappiness = memorySwappiness;
    }

    /**
     * CPU quota in units of 10&lt;sup&gt;-9&lt;/sup&gt; CPUs.
     **/
    public HostConfig nanoCpus(Long nanoCpus) {
        this.nanoCpus = nanoCpus;
        return this;
    }

    @JsonProperty("NanoCpus")
    public Long getNanoCpus() {
        return nanoCpus;
    }

    public void setNanoCpus(Long nanoCpus) {
        this.nanoCpus = nanoCpus;
    }

    /**
     * Disable OOM Killer for the container.
     **/
    public HostConfig oomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
        return this;
    }

    @JsonProperty("OomKillDisable")
    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
    }

    /**
     * Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used.
     **/
    public HostConfig init(Boolean init) {
        this.init = init;
        return this;
    }

    @JsonProperty("Init")
    public Boolean getInit() {
        return init;
    }

    public void setInit(Boolean init) {
        this.init = init;
    }

    /**
     * Tune a container&#39;s PIDs limit. Set &#x60;0&#x60; or &#x60;-1&#x60; for unlimited, or &#x60;null&#x60; to not change.
     **/
    public HostConfig pidsLimit(Long pidsLimit) {
        this.pidsLimit = pidsLimit;
        return this;
    }

    @JsonProperty("PidsLimit")
    public Long getPidsLimit() {
        return pidsLimit;
    }

    public void setPidsLimit(Long pidsLimit) {
        this.pidsLimit = pidsLimit;
    }

    /**
     * A list of resource limits to set in the container. For example:  &#x60;&#x60;&#x60; {\&quot;Name\&quot;: \&quot;nofile\&quot;, \&quot;Soft\&quot;: 1024, \&quot;Hard\&quot;: 2048} &#x60;&#x60;&#x60;
     **/
    public HostConfig ulimits(List<ResourcesUlimits> ulimits) {
        this.ulimits = ulimits;
        return this;
    }

    @JsonProperty("Ulimits")
    public List<ResourcesUlimits> getUlimits() {
        return ulimits;
    }

    public void setUlimits(List<ResourcesUlimits> ulimits) {
        this.ulimits = ulimits;
    }

    /**
     * The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is &#x60;CPUCount&#x60; first, then &#x60;CPUShares&#x60;, and &#x60;CPUPercent&#x60; last.
     **/
    public HostConfig cpuCount(Long cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    @JsonProperty("CpuCount")
    public Long getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(Long cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is &#x60;CPUCount&#x60; first, then &#x60;CPUShares&#x60;, and &#x60;CPUPercent&#x60; last.
     **/
    public HostConfig cpuPercent(Long cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    @JsonProperty("CpuPercent")
    public Long getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Long cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    /**
     * Maximum IOps for the container system drive (Windows only)
     **/
    public HostConfig ioMaximumIOps(Long ioMaximumIOps) {
        this.ioMaximumIOps = ioMaximumIOps;
        return this;
    }

    @JsonProperty("IOMaximumIOps")
    public Long getIoMaximumIOps() {
        return ioMaximumIOps;
    }

    public void setIoMaximumIOps(Long ioMaximumIOps) {
        this.ioMaximumIOps = ioMaximumIOps;
    }

    /**
     * Maximum IO in bytes per second for the container system drive (Windows only).
     **/
    public HostConfig ioMaximumBandwidth(Long ioMaximumBandwidth) {
        this.ioMaximumBandwidth = ioMaximumBandwidth;
        return this;
    }

    @JsonProperty("IOMaximumBandwidth")
    public Long getIoMaximumBandwidth() {
        return ioMaximumBandwidth;
    }

    public void setIoMaximumBandwidth(Long ioMaximumBandwidth) {
        this.ioMaximumBandwidth = ioMaximumBandwidth;
    }

    /**
     * A list of volume bindings for this container. Each volume binding is a string in one of these forms:  - &#x60;host-src:container-dest[:options]&#x60; to bind-mount a host path   into the container. Both &#x60;host-src&#x60;, and &#x60;container-dest&#x60; must   be an _absolute_ path. - &#x60;volume-name:container-dest[:options]&#x60; to bind-mount a volume   managed by a volume driver into the container. &#x60;container-dest&#x60;   must be an _absolute_ path.  &#x60;options&#x60; is an optional, comma-delimited list of:  - &#x60;nocopy&#x60; disables automatic copying of data from the container   path to the volume. The &#x60;nocopy&#x60; flag only applies to named volumes. - &#x60;[ro|rw]&#x60; mounts a volume read-only or read-write, respectively.   If omitted or set to &#x60;rw&#x60;, volumes are mounted read-write. - &#x60;[z|Z]&#x60; applies SELinux labels to allow or deny multiple containers   to read and write to the same volume.     - &#x60;z&#x60;: a _shared_ content label is applied to the content. This       label indicates that multiple containers can share the volume       content, for both reading and writing.     - &#x60;Z&#x60;: a _private unshared_ label is applied to the content.       This label indicates that only the current container can use       a private volume. Labeling systems such as SELinux require       proper labels to be placed on volume content that is mounted       into a container. Without a label, the security system can       prevent a container&#39;s processes from using the content. By       default, the labels set by the host operating system are not       modified. - &#x60;[[r]shared|[r]slave|[r]private]&#x60; specifies mount   [propagation behavior](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt).   This only applies to bind-mounted volumes, not internal volumes   or named volumes. Mount propagation requires the source mount   point (the location where the source directory is mounted in the   host operating system) to have the correct propagation properties.   For shared volumes, the source mount point must be set to &#x60;shared&#x60;.   For slave volumes, the mount must be set to either &#x60;shared&#x60; or   &#x60;slave&#x60;.
     **/
    public HostConfig binds(List<String> binds) {
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
    public HostConfig containerIDFile(String containerIDFile) {
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
    public HostConfig logConfig(HostConfigAllOfLogConfig logConfig) {
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
    public HostConfig networkMode(String networkMode) {
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
    public HostConfig portBindings(PortMap portBindings) {
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
    public HostConfig restartPolicy(RestartPolicy restartPolicy) {
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
    public HostConfig autoRemove(Boolean autoRemove) {
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
    public HostConfig volumeDriver(String volumeDriver) {
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
    public HostConfig volumesFrom(List<String> volumesFrom) {
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
    public HostConfig mounts(List<Mount> mounts) {
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
    public HostConfig capAdd(List<String> capAdd) {
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
    public HostConfig capDrop(List<String> capDrop) {
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
    public HostConfig cgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
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
    public HostConfig dns(List<String> dns) {
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
    public HostConfig dnsOptions(List<String> dnsOptions) {
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
    public HostConfig dnsSearch(List<String> dnsSearch) {
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
    public HostConfig extraHosts(List<String> extraHosts) {
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
    public HostConfig groupAdd(List<String> groupAdd) {
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
    public HostConfig ipcMode(String ipcMode) {
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
    public HostConfig cgroup(String cgroup) {
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
    public HostConfig links(List<String> links) {
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
    public HostConfig oomScoreAdj(Integer oomScoreAdj) {
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
    public HostConfig pidMode(String pidMode) {
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
    public HostConfig privileged(Boolean privileged) {
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
    public HostConfig publishAllPorts(Boolean publishAllPorts) {
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
    public HostConfig readonlyRootfs(Boolean readonlyRootfs) {
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
    public HostConfig securityOpt(List<String> securityOpt) {
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
    public HostConfig storageOpt(Map<String, String> storageOpt) {
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
    public HostConfig tmpfs(Map<String, String> tmpfs) {
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
    public HostConfig utSMode(String utSMode) {
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
    public HostConfig usernsMode(String usernsMode) {
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
    public HostConfig shmSize(Integer shmSize) {
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
    public HostConfig sysctls(Map<String, String> sysctls) {
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
    public HostConfig runtime(String runtime) {
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
    public HostConfig consoleSize(List<Integer> consoleSize) {
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
    public HostConfig isolation(IsolationEnum isolation) {
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
    public HostConfig maskedPaths(List<String> maskedPaths) {
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
    public HostConfig readonlyPaths(List<String> readonlyPaths) {
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
        var hostConfig = (HostConfig) o;
        return Objects.equals(this.cpuShares, hostConfig.cpuShares) &&
                       Objects.equals(this.memory, hostConfig.memory) &&
                       Objects.equals(this.cgroupParent, hostConfig.cgroupParent) &&
                       Objects.equals(this.blkioWeight, hostConfig.blkioWeight) &&
                       Objects.equals(this.blkioWeightDevice, hostConfig.blkioWeightDevice) &&
                       Objects.equals(this.blkioDeviceReadBps, hostConfig.blkioDeviceReadBps) &&
                       Objects.equals(this.blkioDeviceWriteBps, hostConfig.blkioDeviceWriteBps) &&
                       Objects.equals(this.blkioDeviceReadIOps, hostConfig.blkioDeviceReadIOps) &&
                       Objects.equals(this.blkioDeviceWriteIOps, hostConfig.blkioDeviceWriteIOps) &&
                       Objects.equals(this.cpuPeriod, hostConfig.cpuPeriod) &&
                       Objects.equals(this.cpuQuota, hostConfig.cpuQuota) &&
                       Objects.equals(this.cpuRealtimePeriod, hostConfig.cpuRealtimePeriod) &&
                       Objects.equals(this.cpuRealtimeRuntime, hostConfig.cpuRealtimeRuntime) &&
                       Objects.equals(this.cpusetCpus, hostConfig.cpusetCpus) &&
                       Objects.equals(this.cpusetMems, hostConfig.cpusetMems) &&
                       Objects.equals(this.devices, hostConfig.devices) &&
                       Objects.equals(this.deviceCgroupRules, hostConfig.deviceCgroupRules) &&
                       Objects.equals(this.deviceRequests, hostConfig.deviceRequests) &&
                       Objects.equals(this.kernelMemory, hostConfig.kernelMemory) &&
                       Objects.equals(this.kernelMemoryTCP, hostConfig.kernelMemoryTCP) &&
                       Objects.equals(this.memoryReservation, hostConfig.memoryReservation) &&
                       Objects.equals(this.memorySwap, hostConfig.memorySwap) &&
                       Objects.equals(this.memorySwappiness, hostConfig.memorySwappiness) &&
                       Objects.equals(this.nanoCpus, hostConfig.nanoCpus) &&
                       Objects.equals(this.oomKillDisable, hostConfig.oomKillDisable) &&
                       Objects.equals(this.init, hostConfig.init) &&
                       Objects.equals(this.pidsLimit, hostConfig.pidsLimit) &&
                       Objects.equals(this.ulimits, hostConfig.ulimits) &&
                       Objects.equals(this.cpuCount, hostConfig.cpuCount) &&
                       Objects.equals(this.cpuPercent, hostConfig.cpuPercent) &&
                       Objects.equals(this.ioMaximumIOps, hostConfig.ioMaximumIOps) &&
                       Objects.equals(this.ioMaximumBandwidth, hostConfig.ioMaximumBandwidth) &&
                       Objects.equals(this.binds, hostConfig.binds) &&
                       Objects.equals(this.containerIDFile, hostConfig.containerIDFile) &&
                       Objects.equals(this.logConfig, hostConfig.logConfig) &&
                       Objects.equals(this.networkMode, hostConfig.networkMode) &&
                       Objects.equals(this.portBindings, hostConfig.portBindings) &&
                       Objects.equals(this.restartPolicy, hostConfig.restartPolicy) &&
                       Objects.equals(this.autoRemove, hostConfig.autoRemove) &&
                       Objects.equals(this.volumeDriver, hostConfig.volumeDriver) &&
                       Objects.equals(this.volumesFrom, hostConfig.volumesFrom) &&
                       Objects.equals(this.mounts, hostConfig.mounts) &&
                       Objects.equals(this.capAdd, hostConfig.capAdd) &&
                       Objects.equals(this.capDrop, hostConfig.capDrop) &&
                       Objects.equals(this.cgroupnsMode, hostConfig.cgroupnsMode) &&
                       Objects.equals(this.dns, hostConfig.dns) &&
                       Objects.equals(this.dnsOptions, hostConfig.dnsOptions) &&
                       Objects.equals(this.dnsSearch, hostConfig.dnsSearch) &&
                       Objects.equals(this.extraHosts, hostConfig.extraHosts) &&
                       Objects.equals(this.groupAdd, hostConfig.groupAdd) &&
                       Objects.equals(this.ipcMode, hostConfig.ipcMode) &&
                       Objects.equals(this.cgroup, hostConfig.cgroup) &&
                       Objects.equals(this.links, hostConfig.links) &&
                       Objects.equals(this.oomScoreAdj, hostConfig.oomScoreAdj) &&
                       Objects.equals(this.pidMode, hostConfig.pidMode) &&
                       Objects.equals(this.privileged, hostConfig.privileged) &&
                       Objects.equals(this.publishAllPorts, hostConfig.publishAllPorts) &&
                       Objects.equals(this.readonlyRootfs, hostConfig.readonlyRootfs) &&
                       Objects.equals(this.securityOpt, hostConfig.securityOpt) &&
                       Objects.equals(this.storageOpt, hostConfig.storageOpt) &&
                       Objects.equals(this.tmpfs, hostConfig.tmpfs) &&
                       Objects.equals(this.utSMode, hostConfig.utSMode) &&
                       Objects.equals(this.usernsMode, hostConfig.usernsMode) &&
                       Objects.equals(this.shmSize, hostConfig.shmSize) &&
                       Objects.equals(this.sysctls, hostConfig.sysctls) &&
                       Objects.equals(this.runtime, hostConfig.runtime) &&
                       Objects.equals(this.consoleSize, hostConfig.consoleSize) &&
                       Objects.equals(this.isolation, hostConfig.isolation) &&
                       Objects.equals(this.maskedPaths, hostConfig.maskedPaths) &&
                       Objects.equals(this.readonlyPaths, hostConfig.readonlyPaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuShares, memory, cgroupParent, blkioWeight, blkioWeightDevice, blkioDeviceReadBps, blkioDeviceWriteBps, blkioDeviceReadIOps, blkioDeviceWriteIOps, cpuPeriod, cpuQuota, cpuRealtimePeriod, cpuRealtimeRuntime, cpusetCpus, cpusetMems, devices, deviceCgroupRules, deviceRequests, kernelMemory, kernelMemoryTCP, memoryReservation, memorySwap, memorySwappiness, nanoCpus, oomKillDisable, init, pidsLimit, ulimits, cpuCount, cpuPercent, ioMaximumIOps, ioMaximumBandwidth, binds, containerIDFile, logConfig, networkMode, portBindings, restartPolicy, autoRemove, volumeDriver, volumesFrom, mounts, capAdd, capDrop, cgroupnsMode, dns, dnsOptions, dnsSearch, extraHosts, groupAdd, ipcMode, cgroup, links, oomScoreAdj, pidMode, privileged, publishAllPorts, readonlyRootfs, securityOpt, storageOpt, tmpfs, utSMode, usernsMode, shmSize, sysctls, runtime, consoleSize, isolation, maskedPaths, readonlyPaths);
    }

    @Override
    public String toString() {

        return "class HostConfig {\n" +
                            "    cpuShares: " + toIndentedString(cpuShares) + "\n" +
                            "    memory: " + toIndentedString(memory) + "\n" +
                            "    cgroupParent: " + toIndentedString(cgroupParent) + "\n" +
                            "    blkioWeight: " + toIndentedString(blkioWeight) + "\n" +
                            "    blkioWeightDevice: " + toIndentedString(blkioWeightDevice) + "\n" +
                            "    blkioDeviceReadBps: " + toIndentedString(blkioDeviceReadBps) + "\n" +
                            "    blkioDeviceWriteBps: " + toIndentedString(blkioDeviceWriteBps) + "\n" +
                            "    blkioDeviceReadIOps: " + toIndentedString(blkioDeviceReadIOps) + "\n" +
                            "    blkioDeviceWriteIOps: " + toIndentedString(blkioDeviceWriteIOps) + "\n" +
                            "    cpuPeriod: " + toIndentedString(cpuPeriod) + "\n" +
                            "    cpuQuota: " + toIndentedString(cpuQuota) + "\n" +
                            "    cpuRealtimePeriod: " + toIndentedString(cpuRealtimePeriod) + "\n" +
                            "    cpuRealtimeRuntime: " + toIndentedString(cpuRealtimeRuntime) + "\n" +
                            "    cpusetCpus: " + toIndentedString(cpusetCpus) + "\n" +
                            "    cpusetMems: " + toIndentedString(cpusetMems) + "\n" +
                            "    devices: " + toIndentedString(devices) + "\n" +
                            "    deviceCgroupRules: " + toIndentedString(deviceCgroupRules) + "\n" +
                            "    deviceRequests: " + toIndentedString(deviceRequests) + "\n" +
                            "    kernelMemory: " + toIndentedString(kernelMemory) + "\n" +
                            "    kernelMemoryTCP: " + toIndentedString(kernelMemoryTCP) + "\n" +
                            "    memoryReservation: " + toIndentedString(memoryReservation) + "\n" +
                            "    memorySwap: " + toIndentedString(memorySwap) + "\n" +
                            "    memorySwappiness: " + toIndentedString(memorySwappiness) + "\n" +
                            "    nanoCpus: " + toIndentedString(nanoCpus) + "\n" +
                            "    oomKillDisable: " + toIndentedString(oomKillDisable) + "\n" +
                            "    init: " + toIndentedString(init) + "\n" +
                            "    pidsLimit: " + toIndentedString(pidsLimit) + "\n" +
                            "    ulimits: " + toIndentedString(ulimits) + "\n" +
                            "    cpuCount: " + toIndentedString(cpuCount) + "\n" +
                            "    cpuPercent: " + toIndentedString(cpuPercent) + "\n" +
                            "    ioMaximumIOps: " + toIndentedString(ioMaximumIOps) + "\n" +
                            "    ioMaximumBandwidth: " + toIndentedString(ioMaximumBandwidth) + "\n" +
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


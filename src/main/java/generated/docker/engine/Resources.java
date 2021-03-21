package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A container&#39;s resources (cgroups config, ulimits, etc)
 **/

public class Resources {

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

    /**
     * An integer value representing this container&#39;s relative CPU weight versus other containers.
     **/
    public Resources cpuShares(Integer cpuShares) {
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
    public Resources memory(Long memory) {
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
    public Resources cgroupParent(String cgroupParent) {
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
    public Resources blkioWeight(Integer blkioWeight) {
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
    public Resources blkioWeightDevice(List<ResourcesBlkioWeightDevice> blkioWeightDevice) {
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
    public Resources blkioDeviceReadBps(List<ThrottleDevice> blkioDeviceReadBps) {
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
    public Resources blkioDeviceWriteBps(List<ThrottleDevice> blkioDeviceWriteBps) {
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
    public Resources blkioDeviceReadIOps(List<ThrottleDevice> blkioDeviceReadIOps) {
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
    public Resources blkioDeviceWriteIOps(List<ThrottleDevice> blkioDeviceWriteIOps) {
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
    public Resources cpuPeriod(Long cpuPeriod) {
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
    public Resources cpuQuota(Long cpuQuota) {
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
    public Resources cpuRealtimePeriod(Long cpuRealtimePeriod) {
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
    public Resources cpuRealtimeRuntime(Long cpuRealtimeRuntime) {
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
    public Resources cpusetCpus(String cpusetCpus) {
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
    public Resources cpusetMems(String cpusetMems) {
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
    public Resources devices(List<DeviceMapping> devices) {
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
    public Resources deviceCgroupRules(List<String> deviceCgroupRules) {
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
    public Resources deviceRequests(List<DeviceRequest> deviceRequests) {
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
    public Resources kernelMemory(Long kernelMemory) {
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
    public Resources kernelMemoryTCP(Long kernelMemoryTCP) {
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
    public Resources memoryReservation(Long memoryReservation) {
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
    public Resources memorySwap(Long memorySwap) {
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
    public Resources memorySwappiness(Long memorySwappiness) {
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
    public Resources nanoCpus(Long nanoCpus) {
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
    public Resources oomKillDisable(Boolean oomKillDisable) {
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
    public Resources init(Boolean init) {
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
    public Resources pidsLimit(Long pidsLimit) {
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
    public Resources ulimits(List<ResourcesUlimits> ulimits) {
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
    public Resources cpuCount(Long cpuCount) {
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
    public Resources cpuPercent(Long cpuPercent) {
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
    public Resources ioMaximumIOps(Long ioMaximumIOps) {
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
    public Resources ioMaximumBandwidth(Long ioMaximumBandwidth) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var resources = (Resources) o;
        return Objects.equals(this.cpuShares, resources.cpuShares) &&
                       Objects.equals(this.memory, resources.memory) &&
                       Objects.equals(this.cgroupParent, resources.cgroupParent) &&
                       Objects.equals(this.blkioWeight, resources.blkioWeight) &&
                       Objects.equals(this.blkioWeightDevice, resources.blkioWeightDevice) &&
                       Objects.equals(this.blkioDeviceReadBps, resources.blkioDeviceReadBps) &&
                       Objects.equals(this.blkioDeviceWriteBps, resources.blkioDeviceWriteBps) &&
                       Objects.equals(this.blkioDeviceReadIOps, resources.blkioDeviceReadIOps) &&
                       Objects.equals(this.blkioDeviceWriteIOps, resources.blkioDeviceWriteIOps) &&
                       Objects.equals(this.cpuPeriod, resources.cpuPeriod) &&
                       Objects.equals(this.cpuQuota, resources.cpuQuota) &&
                       Objects.equals(this.cpuRealtimePeriod, resources.cpuRealtimePeriod) &&
                       Objects.equals(this.cpuRealtimeRuntime, resources.cpuRealtimeRuntime) &&
                       Objects.equals(this.cpusetCpus, resources.cpusetCpus) &&
                       Objects.equals(this.cpusetMems, resources.cpusetMems) &&
                       Objects.equals(this.devices, resources.devices) &&
                       Objects.equals(this.deviceCgroupRules, resources.deviceCgroupRules) &&
                       Objects.equals(this.deviceRequests, resources.deviceRequests) &&
                       Objects.equals(this.kernelMemory, resources.kernelMemory) &&
                       Objects.equals(this.kernelMemoryTCP, resources.kernelMemoryTCP) &&
                       Objects.equals(this.memoryReservation, resources.memoryReservation) &&
                       Objects.equals(this.memorySwap, resources.memorySwap) &&
                       Objects.equals(this.memorySwappiness, resources.memorySwappiness) &&
                       Objects.equals(this.nanoCpus, resources.nanoCpus) &&
                       Objects.equals(this.oomKillDisable, resources.oomKillDisable) &&
                       Objects.equals(this.init, resources.init) &&
                       Objects.equals(this.pidsLimit, resources.pidsLimit) &&
                       Objects.equals(this.ulimits, resources.ulimits) &&
                       Objects.equals(this.cpuCount, resources.cpuCount) &&
                       Objects.equals(this.cpuPercent, resources.cpuPercent) &&
                       Objects.equals(this.ioMaximumIOps, resources.ioMaximumIOps) &&
                       Objects.equals(this.ioMaximumBandwidth, resources.ioMaximumBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuShares, memory, cgroupParent, blkioWeight, blkioWeightDevice, blkioDeviceReadBps, blkioDeviceWriteBps, blkioDeviceReadIOps, blkioDeviceWriteIOps, cpuPeriod, cpuQuota, cpuRealtimePeriod, cpuRealtimeRuntime, cpusetCpus, cpusetMems, devices, deviceCgroupRules, deviceRequests, kernelMemory, kernelMemoryTCP, memoryReservation, memorySwap, memorySwappiness, nanoCpus, oomKillDisable, init, pidsLimit, ulimits, cpuCount, cpuPercent, ioMaximumIOps, ioMaximumBandwidth);
    }

    @Override
    public String toString() {
        return "class Resources {\n" +
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


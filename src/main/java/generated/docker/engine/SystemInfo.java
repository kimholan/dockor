package generated.docker.engine;

import generated.docker.engine.Commit;
import generated.docker.engine.GenericResources;
import generated.docker.engine.PluginsInfo;
import generated.docker.engine.RegistryServiceConfig;
import generated.docker.engine.Runtime;
import generated.docker.engine.SwarmInfo;
import generated.docker.engine.SystemInfoDefaultAddressPools;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class SystemInfo   {
  
  private String ID;
  private Integer containers;
  private Integer containersRunning;
  private Integer containersPaused;
  private Integer containersStopped;
  private Integer images;
  private String driver;
  private List<List<String>> driverStatus = new ArrayList<>();
  private String dockerRootDir;
  private PluginsInfo plugins;
  private Boolean memoryLimit;
  private Boolean swapLimit;
  private Boolean kernelMemory;
  private Boolean cpuCfsPeriod;
  private Boolean cpuCfsQuota;
  private Boolean cpUShares;
  private Boolean cpUSet;
  private Boolean pidsLimit;
  private Boolean oomKillDisable;
  private Boolean ipv4Forwarding;
  private Boolean bridgeNfIptables;
  private Boolean bridgeNfIp6tables;
  private Boolean debug;
  private Integer nfd;
  private Integer ngoroutines;
  private String systemTime;
  private String loggingDriver;

public enum CgroupDriverEnum {

    CGROUPFS(String.valueOf("cgroupfs")), SYSTEMD(String.valueOf("systemd")), NONE(String.valueOf("none"));


    private String value;

    CgroupDriverEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CgroupDriverEnum fromValue(String value) {
        for (var b : CgroupDriverEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CgroupDriverEnum cgroupDriver = CgroupDriverEnum.CGROUPFS;

public enum CgroupVersionEnum {

    _1(String.valueOf("1")), _2(String.valueOf("2"));


    private String value;

    CgroupVersionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CgroupVersionEnum fromValue(String value) {
        for (var b : CgroupVersionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CgroupVersionEnum cgroupVersion = CgroupVersionEnum._1;
  private Integer neventsListener;
  private String kernelVersion;
  private String operatingSystem;
  private String osVersion;
  private String osType;
  private String architecture;
  private Integer NCPU;
  private Long memTotal;
  private String indexServerAddress = "https://index.docker.io/v1/";
  private RegistryServiceConfig registryConfig;
  private GenericResources genericResources = new GenericResources();
  private String httpProxy;
  private String httpsProxy;
  private String noProxy;
  private String name;
  private List<String> labels = new ArrayList<>();
  private Boolean experimentalBuild;
  private String serverVersion;
  private String clusterStore;
  private String clusterAdvertise;
  private Map<String, Runtime> runtimes = new HashMap<>();
  private String defaultRuntime = "runc";
  private SwarmInfo swarm;
  private Boolean liveRestoreEnabled = false;

public enum IsolationEnum {

    DEFAULT(String.valueOf("default")), HYPERV(String.valueOf("hyperv")), PROCESS(String.valueOf("process"));


    private String value;

    IsolationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
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
}

  private IsolationEnum isolation = IsolationEnum.DEFAULT;
  private String initBinary;
  private Commit containerdCommit;
  private Commit runcCommit;
  private Commit initCommit;
  private List<String> securityOptions = new ArrayList<>();
  private String productLicense;
  private List<SystemInfoDefaultAddressPools> defaultAddressPools = new ArrayList<>();
  private List<String> warnings = new ArrayList<>();

  /**
   * Unique identifier of the daemon.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: The format of the ID itself is not part of the API, and &gt; should not be considered stable. 
   **/
  public SystemInfo ID(String ID) {
    this.ID = ID;
    return this;
  }

  

  
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }/**
   * Total number of containers on the host.
   **/
  public SystemInfo containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  

  
  @JsonProperty("Containers")
  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }/**
   * Number of containers with status &#x60;\&quot;running\&quot;&#x60;. 
   **/
  public SystemInfo containersRunning(Integer containersRunning) {
    this.containersRunning = containersRunning;
    return this;
  }

  

  
  @JsonProperty("ContainersRunning")
  public Integer getContainersRunning() {
    return containersRunning;
  }

  public void setContainersRunning(Integer containersRunning) {
    this.containersRunning = containersRunning;
  }/**
   * Number of containers with status &#x60;\&quot;paused\&quot;&#x60;. 
   **/
  public SystemInfo containersPaused(Integer containersPaused) {
    this.containersPaused = containersPaused;
    return this;
  }

  

  
  @JsonProperty("ContainersPaused")
  public Integer getContainersPaused() {
    return containersPaused;
  }

  public void setContainersPaused(Integer containersPaused) {
    this.containersPaused = containersPaused;
  }/**
   * Number of containers with status &#x60;\&quot;stopped\&quot;&#x60;. 
   **/
  public SystemInfo containersStopped(Integer containersStopped) {
    this.containersStopped = containersStopped;
    return this;
  }

  

  
  @JsonProperty("ContainersStopped")
  public Integer getContainersStopped() {
    return containersStopped;
  }

  public void setContainersStopped(Integer containersStopped) {
    this.containersStopped = containersStopped;
  }/**
   * Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted. 
   **/
  public SystemInfo images(Integer images) {
    this.images = images;
    return this;
  }

  

  
  @JsonProperty("Images")
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }/**
   * Name of the storage driver in use.
   **/
  public SystemInfo driver(String driver) {
    this.driver = driver;
    return this;
  }

  

  
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }/**
   * Information specific to the storage driver, provided as \&quot;label\&quot; / \&quot;value\&quot; pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of &#x60;docker info&#x60; on the command line.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: The information returned in this field, including the &gt; formatting of values and labels, should not be considered stable, &gt; and may change without notice. 
   **/
  public SystemInfo driverStatus(List<List<String>> driverStatus) {
    this.driverStatus = driverStatus;
    return this;
  }

  

  
  @JsonProperty("DriverStatus")
  public List<List<String>> getDriverStatus() {
    return driverStatus;
  }

  public void setDriverStatus(List<List<String>> driverStatus) {
    this.driverStatus = driverStatus;
  }/**
   * Root directory of persistent Docker state.  Defaults to &#x60;/var/lib/docker&#x60; on Linux, and &#x60;C:\\ProgramData\\docker&#x60; on Windows. 
   **/
  public SystemInfo dockerRootDir(String dockerRootDir) {
    this.dockerRootDir = dockerRootDir;
    return this;
  }

  

  
  @JsonProperty("DockerRootDir")
  public String getDockerRootDir() {
    return dockerRootDir;
  }

  public void setDockerRootDir(String dockerRootDir) {
    this.dockerRootDir = dockerRootDir;
  }/**
   **/
  public SystemInfo plugins(PluginsInfo plugins) {
    this.plugins = plugins;
    return this;
  }

  

  
  @JsonProperty("Plugins")
  public PluginsInfo getPlugins() {
    return plugins;
  }

  public void setPlugins(PluginsInfo plugins) {
    this.plugins = plugins;
  }/**
   * Indicates if the host has memory limit support enabled.
   **/
  public SystemInfo memoryLimit(Boolean memoryLimit) {
    this.memoryLimit = memoryLimit;
    return this;
  }

  

  
  @JsonProperty("MemoryLimit")
  public Boolean getMemoryLimit() {
    return memoryLimit;
  }

  public void setMemoryLimit(Boolean memoryLimit) {
    this.memoryLimit = memoryLimit;
  }/**
   * Indicates if the host has memory swap limit support enabled.
   **/
  public SystemInfo swapLimit(Boolean swapLimit) {
    this.swapLimit = swapLimit;
    return this;
  }

  

  
  @JsonProperty("SwapLimit")
  public Boolean getSwapLimit() {
    return swapLimit;
  }

  public void setSwapLimit(Boolean swapLimit) {
    this.swapLimit = swapLimit;
  }/**
   * Indicates if the host has kernel memory limit support enabled.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is deprecated as the kernel 5.4 deprecated &gt; &#x60;kmem.limit_in_bytes&#x60;. 
   **/
  public SystemInfo kernelMemory(Boolean kernelMemory) {
    this.kernelMemory = kernelMemory;
    return this;
  }

  

  
  @JsonProperty("KernelMemory")
  public Boolean getKernelMemory() {
    return kernelMemory;
  }

  public void setKernelMemory(Boolean kernelMemory) {
    this.kernelMemory = kernelMemory;
  }/**
   * Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host. 
   **/
  public SystemInfo cpuCfsPeriod(Boolean cpuCfsPeriod) {
    this.cpuCfsPeriod = cpuCfsPeriod;
    return this;
  }

  

  
  @JsonProperty("CpuCfsPeriod")
  public Boolean getCpuCfsPeriod() {
    return cpuCfsPeriod;
  }

  public void setCpuCfsPeriod(Boolean cpuCfsPeriod) {
    this.cpuCfsPeriod = cpuCfsPeriod;
  }/**
   * Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host. 
   **/
  public SystemInfo cpuCfsQuota(Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
    return this;
  }

  

  
  @JsonProperty("CpuCfsQuota")
  public Boolean getCpuCfsQuota() {
    return cpuCfsQuota;
  }

  public void setCpuCfsQuota(Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
  }/**
   * Indicates if CPU Shares limiting is supported by the host. 
   **/
  public SystemInfo cpUShares(Boolean cpUShares) {
    this.cpUShares = cpUShares;
    return this;
  }

  

  
  @JsonProperty("CPUShares")
  public Boolean getCpUShares() {
    return cpUShares;
  }

  public void setCpUShares(Boolean cpUShares) {
    this.cpUShares = cpUShares;
  }/**
   * Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt) 
   **/
  public SystemInfo cpUSet(Boolean cpUSet) {
    this.cpUSet = cpUSet;
    return this;
  }

  

  
  @JsonProperty("CPUSet")
  public Boolean getCpUSet() {
    return cpUSet;
  }

  public void setCpUSet(Boolean cpUSet) {
    this.cpUSet = cpUSet;
  }/**
   * Indicates if the host kernel has PID limit support enabled.
   **/
  public SystemInfo pidsLimit(Boolean pidsLimit) {
    this.pidsLimit = pidsLimit;
    return this;
  }

  

  
  @JsonProperty("PidsLimit")
  public Boolean getPidsLimit() {
    return pidsLimit;
  }

  public void setPidsLimit(Boolean pidsLimit) {
    this.pidsLimit = pidsLimit;
  }/**
   * Indicates if OOM killer disable is supported on the host.
   **/
  public SystemInfo oomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
    return this;
  }

  

  
  @JsonProperty("OomKillDisable")
  public Boolean getOomKillDisable() {
    return oomKillDisable;
  }

  public void setOomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
  }/**
   * Indicates IPv4 forwarding is enabled.
   **/
  public SystemInfo ipv4Forwarding(Boolean ipv4Forwarding) {
    this.ipv4Forwarding = ipv4Forwarding;
    return this;
  }

  

  
  @JsonProperty("IPv4Forwarding")
  public Boolean getIpv4Forwarding() {
    return ipv4Forwarding;
  }

  public void setIpv4Forwarding(Boolean ipv4Forwarding) {
    this.ipv4Forwarding = ipv4Forwarding;
  }/**
   * Indicates if &#x60;bridge-nf-call-iptables&#x60; is available on the host.
   **/
  public SystemInfo bridgeNfIptables(Boolean bridgeNfIptables) {
    this.bridgeNfIptables = bridgeNfIptables;
    return this;
  }

  

  
  @JsonProperty("BridgeNfIptables")
  public Boolean getBridgeNfIptables() {
    return bridgeNfIptables;
  }

  public void setBridgeNfIptables(Boolean bridgeNfIptables) {
    this.bridgeNfIptables = bridgeNfIptables;
  }/**
   * Indicates if &#x60;bridge-nf-call-ip6tables&#x60; is available on the host.
   **/
  public SystemInfo bridgeNfIp6tables(Boolean bridgeNfIp6tables) {
    this.bridgeNfIp6tables = bridgeNfIp6tables;
    return this;
  }

  

  
  @JsonProperty("BridgeNfIp6tables")
  public Boolean getBridgeNfIp6tables() {
    return bridgeNfIp6tables;
  }

  public void setBridgeNfIp6tables(Boolean bridgeNfIp6tables) {
    this.bridgeNfIp6tables = bridgeNfIp6tables;
  }/**
   * Indicates if the daemon is running in debug-mode / with debug-level logging enabled. 
   **/
  public SystemInfo debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

  

  
  @JsonProperty("Debug")
  public Boolean getDebug() {
    return debug;
  }

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }/**
   * The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled. 
   **/
  public SystemInfo nfd(Integer nfd) {
    this.nfd = nfd;
    return this;
  }

  

  
  @JsonProperty("NFd")
  public Integer getNfd() {
    return nfd;
  }

  public void setNfd(Integer nfd) {
    this.nfd = nfd;
  }/**
   * The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled. 
   **/
  public SystemInfo ngoroutines(Integer ngoroutines) {
    this.ngoroutines = ngoroutines;
    return this;
  }

  

  
  @JsonProperty("NGoroutines")
  public Integer getNgoroutines() {
    return ngoroutines;
  }

  public void setNgoroutines(Integer ngoroutines) {
    this.ngoroutines = ngoroutines;
  }/**
   * Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   **/
  public SystemInfo systemTime(String systemTime) {
    this.systemTime = systemTime;
    return this;
  }

  

  
  @JsonProperty("SystemTime")
  public String getSystemTime() {
    return systemTime;
  }

  public void setSystemTime(String systemTime) {
    this.systemTime = systemTime;
  }/**
   * The logging driver to use as a default for new containers. 
   **/
  public SystemInfo loggingDriver(String loggingDriver) {
    this.loggingDriver = loggingDriver;
    return this;
  }

  

  
  @JsonProperty("LoggingDriver")
  public String getLoggingDriver() {
    return loggingDriver;
  }

  public void setLoggingDriver(String loggingDriver) {
    this.loggingDriver = loggingDriver;
  }/**
   * The driver to use for managing cgroups. 
   **/
  public SystemInfo cgroupDriver(CgroupDriverEnum cgroupDriver) {
    this.cgroupDriver = cgroupDriver;
    return this;
  }

  

  
  @JsonProperty("CgroupDriver")
  public CgroupDriverEnum getCgroupDriver() {
    return cgroupDriver;
  }

  public void setCgroupDriver(CgroupDriverEnum cgroupDriver) {
    this.cgroupDriver = cgroupDriver;
  }/**
   * The version of the cgroup. 
   **/
  public SystemInfo cgroupVersion(CgroupVersionEnum cgroupVersion) {
    this.cgroupVersion = cgroupVersion;
    return this;
  }

  

  
  @JsonProperty("CgroupVersion")
  public CgroupVersionEnum getCgroupVersion() {
    return cgroupVersion;
  }

  public void setCgroupVersion(CgroupVersionEnum cgroupVersion) {
    this.cgroupVersion = cgroupVersion;
  }/**
   * Number of event listeners subscribed.
   **/
  public SystemInfo neventsListener(Integer neventsListener) {
    this.neventsListener = neventsListener;
    return this;
  }

  

  
  @JsonProperty("NEventsListener")
  public Integer getNeventsListener() {
    return neventsListener;
  }

  public void setNeventsListener(Integer neventsListener) {
    this.neventsListener = neventsListener;
  }/**
   * Kernel version of the host.  On Linux, this information obtained from &#x60;uname&#x60;. On Windows this information is queried from the &lt;kbd&gt;HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\&lt;/kbd&gt; registry value, for example _\&quot;10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\&quot;_. 
   **/
  public SystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  

  
  @JsonProperty("KernelVersion")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }/**
   * Name of the host&#39;s operating system, for example: \&quot;Ubuntu 16.04.2 LTS\&quot; or \&quot;Windows Server 2016 Datacenter\&quot; 
   **/
  public SystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  

  
  @JsonProperty("OperatingSystem")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }/**
   * Version of the host&#39;s operating system  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: The information returned in this field, including its &gt; very existence, and the formatting of values, should not be considered &gt; stable, and may change without notice. 
   **/
  public SystemInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  

  
  @JsonProperty("OSVersion")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }/**
   * Generic type of the operating system of the host, as returned by the Go runtime (&#x60;GOOS&#x60;).  Currently returned values are \&quot;linux\&quot; and \&quot;windows\&quot;. A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). 
   **/
  public SystemInfo osType(String osType) {
    this.osType = osType;
    return this;
  }

  

  
  @JsonProperty("OSType")
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }/**
   * Hardware architecture of the host, as returned by the Go runtime (&#x60;GOARCH&#x60;).  A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). 
   **/
  public SystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  

  
  @JsonProperty("Architecture")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }/**
   * The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected. 
   **/
  public SystemInfo NCPU(Integer NCPU) {
    this.NCPU = NCPU;
    return this;
  }

  

  
  @JsonProperty("NCPU")
  public Integer getNCPU() {
    return NCPU;
  }

  public void setNCPU(Integer NCPU) {
    this.NCPU = NCPU;
  }/**
   * Total amount of physical memory available on the host, in bytes. 
   **/
  public SystemInfo memTotal(Long memTotal) {
    this.memTotal = memTotal;
    return this;
  }

  

  
  @JsonProperty("MemTotal")
  public Long getMemTotal() {
    return memTotal;
  }

  public void setMemTotal(Long memTotal) {
    this.memTotal = memTotal;
  }/**
   * Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud. 
   **/
  public SystemInfo indexServerAddress(String indexServerAddress) {
    this.indexServerAddress = indexServerAddress;
    return this;
  }

  

  
  @JsonProperty("IndexServerAddress")
  public String getIndexServerAddress() {
    return indexServerAddress;
  }

  public void setIndexServerAddress(String indexServerAddress) {
    this.indexServerAddress = indexServerAddress;
  }/**
   **/
  public SystemInfo registryConfig(RegistryServiceConfig registryConfig) {
    this.registryConfig = registryConfig;
    return this;
  }

  

  
  @JsonProperty("RegistryConfig")
  public RegistryServiceConfig getRegistryConfig() {
    return registryConfig;
  }

  public void setRegistryConfig(RegistryServiceConfig registryConfig) {
    this.registryConfig = registryConfig;
  }/**
   **/
  public SystemInfo genericResources(GenericResources genericResources) {
    this.genericResources = genericResources;
    return this;
  }

  

  
  @JsonProperty("GenericResources")
  public GenericResources getGenericResources() {
    return genericResources;
  }

  public void setGenericResources(GenericResources genericResources) {
    this.genericResources = genericResources;
  }/**
   * HTTP-proxy configured for the daemon. This value is obtained from the [&#x60;HTTP_PROXY&#x60;](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. 
   **/
  public SystemInfo httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

  

  
  @JsonProperty("HttpProxy")
  public String getHttpProxy() {
    return httpProxy;
  }

  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }/**
   * HTTPS-proxy configured for the daemon. This value is obtained from the [&#x60;HTTPS_PROXY&#x60;](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. 
   **/
  public SystemInfo httpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

  

  
  @JsonProperty("HttpsProxy")
  public String getHttpsProxy() {
    return httpsProxy;
  }

  public void setHttpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
  }/**
   * Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [&#x60;NO_PROXY&#x60;](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. 
   **/
  public SystemInfo noProxy(String noProxy) {
    this.noProxy = noProxy;
    return this;
  }

  

  
  @JsonProperty("NoProxy")
  public String getNoProxy() {
    return noProxy;
  }

  public void setNoProxy(String noProxy) {
    this.noProxy = noProxy;
  }/**
   * Hostname of the host.
   **/
  public SystemInfo name(String name) {
    this.name = name;
    return this;
  }

  

  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }/**
   * User-defined labels (key/value metadata) as set on the daemon.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: When part of a Swarm, nodes can both have _daemon_ labels, &gt; set through the daemon configuration, and _node_ labels, set from a &gt; manager node in the Swarm. Node labels are not included in this &gt; field. Node labels can be retrieved using the &#x60;/nodes/(id)&#x60; endpoint &gt; on a manager node in the Swarm. 
   **/
  public SystemInfo labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  

  
  @JsonProperty("Labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }/**
   * Indicates if experimental features are enabled on the daemon. 
   **/
  public SystemInfo experimentalBuild(Boolean experimentalBuild) {
    this.experimentalBuild = experimentalBuild;
    return this;
  }

  

  
  @JsonProperty("ExperimentalBuild")
  public Boolean getExperimentalBuild() {
    return experimentalBuild;
  }

  public void setExperimentalBuild(Boolean experimentalBuild) {
    this.experimentalBuild = experimentalBuild;
  }/**
   * Version string of the daemon.  &gt; **Note**: the [standalone Swarm API](https://docs.docker.com/swarm/swarm-api/) &gt; returns the Swarm version instead of the daemon  version, for example &gt; &#x60;swarm/1.2.8&#x60;. 
   **/
  public SystemInfo serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  

  
  @JsonProperty("ServerVersion")
  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }/**
   * URL of the distributed storage backend.   The storage backend is used for multihost networking (to store network and endpoint information) and by the node discovery mechanism.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when using standalone Swarm &gt; mode, and overlay networking using an external k/v store. Overlay &gt; networks with Swarm mode enabled use the built-in raft store, and &gt; this field will be empty. 
   **/
  public SystemInfo clusterStore(String clusterStore) {
    this.clusterStore = clusterStore;
    return this;
  }

  

  
  @JsonProperty("ClusterStore")
  public String getClusterStore() {
    return clusterStore;
  }

  public void setClusterStore(String clusterStore) {
    this.clusterStore = clusterStore;
  }/**
   * The network endpoint that the Engine advertises for the purpose of node discovery. ClusterAdvertise is a &#x60;host:port&#x60; combination on which the daemon is reachable by other hosts.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when using standalone Swarm &gt; mode, and overlay networking using an external k/v store. Overlay &gt; networks with Swarm mode enabled use the built-in raft store, and &gt; this field will be empty. 
   **/
  public SystemInfo clusterAdvertise(String clusterAdvertise) {
    this.clusterAdvertise = clusterAdvertise;
    return this;
  }

  

  
  @JsonProperty("ClusterAdvertise")
  public String getClusterAdvertise() {
    return clusterAdvertise;
  }

  public void setClusterAdvertise(String clusterAdvertise) {
    this.clusterAdvertise = clusterAdvertise;
  }/**
   * List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \&quot;name\&quot; used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the &#x60;containerd&#x60; daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is &#x60;runc&#x60;, and automatically configured. Additional runtimes can be configured by the user and will be listed here. 
   **/
  public SystemInfo runtimes(Map<String, Runtime> runtimes) {
    this.runtimes = runtimes;
    return this;
  }

  

  
  @JsonProperty("Runtimes")
  public Map<String, Runtime> getRuntimes() {
    return runtimes;
  }

  public void setRuntimes(Map<String, Runtime> runtimes) {
    this.runtimes = runtimes;
  }/**
   * Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time. 
   **/
  public SystemInfo defaultRuntime(String defaultRuntime) {
    this.defaultRuntime = defaultRuntime;
    return this;
  }

  

  
  @JsonProperty("DefaultRuntime")
  public String getDefaultRuntime() {
    return defaultRuntime;
  }

  public void setDefaultRuntime(String defaultRuntime) {
    this.defaultRuntime = defaultRuntime;
  }/**
   **/
  public SystemInfo swarm(SwarmInfo swarm) {
    this.swarm = swarm;
    return this;
  }

  

  
  @JsonProperty("Swarm")
  public SwarmInfo getSwarm() {
    return swarm;
  }

  public void setSwarm(SwarmInfo swarm) {
    this.swarm = swarm;
  }/**
   * Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected. 
   **/
  public SystemInfo liveRestoreEnabled(Boolean liveRestoreEnabled) {
    this.liveRestoreEnabled = liveRestoreEnabled;
    return this;
  }

  

  
  @JsonProperty("LiveRestoreEnabled")
  public Boolean getLiveRestoreEnabled() {
    return liveRestoreEnabled;
  }

  public void setLiveRestoreEnabled(Boolean liveRestoreEnabled) {
    this.liveRestoreEnabled = liveRestoreEnabled;
  }/**
   * Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is &#x60;hyperv&#x60;, and on Windows server, the default is &#x60;process&#x60;.  This option is currently not used on other platforms. 
   **/
  public SystemInfo isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  

  
  @JsonProperty("Isolation")
  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }/**
   * Name and, optional, path of the &#x60;docker-init&#x60; binary.  If the path is omitted, the daemon searches the host&#39;s &#x60;$PATH&#x60; for the binary and uses the first result. 
   **/
  public SystemInfo initBinary(String initBinary) {
    this.initBinary = initBinary;
    return this;
  }

  

  
  @JsonProperty("InitBinary")
  public String getInitBinary() {
    return initBinary;
  }

  public void setInitBinary(String initBinary) {
    this.initBinary = initBinary;
  }/**
   **/
  public SystemInfo containerdCommit(Commit containerdCommit) {
    this.containerdCommit = containerdCommit;
    return this;
  }

  

  
  @JsonProperty("ContainerdCommit")
  public Commit getContainerdCommit() {
    return containerdCommit;
  }

  public void setContainerdCommit(Commit containerdCommit) {
    this.containerdCommit = containerdCommit;
  }/**
   **/
  public SystemInfo runcCommit(Commit runcCommit) {
    this.runcCommit = runcCommit;
    return this;
  }

  

  
  @JsonProperty("RuncCommit")
  public Commit getRuncCommit() {
    return runcCommit;
  }

  public void setRuncCommit(Commit runcCommit) {
    this.runcCommit = runcCommit;
  }/**
   **/
  public SystemInfo initCommit(Commit initCommit) {
    this.initCommit = initCommit;
    return this;
  }

  

  
  @JsonProperty("InitCommit")
  public Commit getInitCommit() {
    return initCommit;
  }

  public void setInitCommit(Commit initCommit) {
    this.initCommit = initCommit;
  }/**
   * List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), and rootless.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs. 
   **/
  public SystemInfo securityOptions(List<String> securityOptions) {
    this.securityOptions = securityOptions;
    return this;
  }

  

  
  @JsonProperty("SecurityOptions")
  public List<String> getSecurityOptions() {
    return securityOptions;
  }

  public void setSecurityOptions(List<String> securityOptions) {
    this.securityOptions = securityOptions;
  }/**
   * Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included. 
   **/
  public SystemInfo productLicense(String productLicense) {
    this.productLicense = productLicense;
    return this;
  }

  

  
  @JsonProperty("ProductLicense")
  public String getProductLicense() {
    return productLicense;
  }

  public void setProductLicense(String productLicense) {
    this.productLicense = productLicense;
  }/**
   * List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \&quot;10.10.0.0/16\&quot; with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools. 
   **/
  public SystemInfo defaultAddressPools(List<SystemInfoDefaultAddressPools> defaultAddressPools) {
    this.defaultAddressPools = defaultAddressPools;
    return this;
  }

  

  
  @JsonProperty("DefaultAddressPools")
  public List<SystemInfoDefaultAddressPools> getDefaultAddressPools() {
    return defaultAddressPools;
  }

  public void setDefaultAddressPools(List<SystemInfoDefaultAddressPools> defaultAddressPools) {
    this.defaultAddressPools = defaultAddressPools;
  }/**
   * List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user. 
   **/
  public SystemInfo warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  

  
  @JsonProperty("Warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemInfo = (SystemInfo) o;
    return Objects.equals(this.ID, systemInfo.ID) &&
        Objects.equals(this.containers, systemInfo.containers) &&
        Objects.equals(this.containersRunning, systemInfo.containersRunning) &&
        Objects.equals(this.containersPaused, systemInfo.containersPaused) &&
        Objects.equals(this.containersStopped, systemInfo.containersStopped) &&
        Objects.equals(this.images, systemInfo.images) &&
        Objects.equals(this.driver, systemInfo.driver) &&
        Objects.equals(this.driverStatus, systemInfo.driverStatus) &&
        Objects.equals(this.dockerRootDir, systemInfo.dockerRootDir) &&
        Objects.equals(this.plugins, systemInfo.plugins) &&
        Objects.equals(this.memoryLimit, systemInfo.memoryLimit) &&
        Objects.equals(this.swapLimit, systemInfo.swapLimit) &&
        Objects.equals(this.kernelMemory, systemInfo.kernelMemory) &&
        Objects.equals(this.cpuCfsPeriod, systemInfo.cpuCfsPeriod) &&
        Objects.equals(this.cpuCfsQuota, systemInfo.cpuCfsQuota) &&
        Objects.equals(this.cpUShares, systemInfo.cpUShares) &&
        Objects.equals(this.cpUSet, systemInfo.cpUSet) &&
        Objects.equals(this.pidsLimit, systemInfo.pidsLimit) &&
        Objects.equals(this.oomKillDisable, systemInfo.oomKillDisable) &&
        Objects.equals(this.ipv4Forwarding, systemInfo.ipv4Forwarding) &&
        Objects.equals(this.bridgeNfIptables, systemInfo.bridgeNfIptables) &&
        Objects.equals(this.bridgeNfIp6tables, systemInfo.bridgeNfIp6tables) &&
        Objects.equals(this.debug, systemInfo.debug) &&
        Objects.equals(this.nfd, systemInfo.nfd) &&
        Objects.equals(this.ngoroutines, systemInfo.ngoroutines) &&
        Objects.equals(this.systemTime, systemInfo.systemTime) &&
        Objects.equals(this.loggingDriver, systemInfo.loggingDriver) &&
        Objects.equals(this.cgroupDriver, systemInfo.cgroupDriver) &&
        Objects.equals(this.cgroupVersion, systemInfo.cgroupVersion) &&
        Objects.equals(this.neventsListener, systemInfo.neventsListener) &&
        Objects.equals(this.kernelVersion, systemInfo.kernelVersion) &&
        Objects.equals(this.operatingSystem, systemInfo.operatingSystem) &&
        Objects.equals(this.osVersion, systemInfo.osVersion) &&
        Objects.equals(this.osType, systemInfo.osType) &&
        Objects.equals(this.architecture, systemInfo.architecture) &&
        Objects.equals(this.NCPU, systemInfo.NCPU) &&
        Objects.equals(this.memTotal, systemInfo.memTotal) &&
        Objects.equals(this.indexServerAddress, systemInfo.indexServerAddress) &&
        Objects.equals(this.registryConfig, systemInfo.registryConfig) &&
        Objects.equals(this.genericResources, systemInfo.genericResources) &&
        Objects.equals(this.httpProxy, systemInfo.httpProxy) &&
        Objects.equals(this.httpsProxy, systemInfo.httpsProxy) &&
        Objects.equals(this.noProxy, systemInfo.noProxy) &&
        Objects.equals(this.name, systemInfo.name) &&
        Objects.equals(this.labels, systemInfo.labels) &&
        Objects.equals(this.experimentalBuild, systemInfo.experimentalBuild) &&
        Objects.equals(this.serverVersion, systemInfo.serverVersion) &&
        Objects.equals(this.clusterStore, systemInfo.clusterStore) &&
        Objects.equals(this.clusterAdvertise, systemInfo.clusterAdvertise) &&
        Objects.equals(this.runtimes, systemInfo.runtimes) &&
        Objects.equals(this.defaultRuntime, systemInfo.defaultRuntime) &&
        Objects.equals(this.swarm, systemInfo.swarm) &&
        Objects.equals(this.liveRestoreEnabled, systemInfo.liveRestoreEnabled) &&
        Objects.equals(this.isolation, systemInfo.isolation) &&
        Objects.equals(this.initBinary, systemInfo.initBinary) &&
        Objects.equals(this.containerdCommit, systemInfo.containerdCommit) &&
        Objects.equals(this.runcCommit, systemInfo.runcCommit) &&
        Objects.equals(this.initCommit, systemInfo.initCommit) &&
        Objects.equals(this.securityOptions, systemInfo.securityOptions) &&
        Objects.equals(this.productLicense, systemInfo.productLicense) &&
        Objects.equals(this.defaultAddressPools, systemInfo.defaultAddressPools) &&
        Objects.equals(this.warnings, systemInfo.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, containers, containersRunning, containersPaused, containersStopped, images, driver, driverStatus, dockerRootDir, plugins, memoryLimit, swapLimit, kernelMemory, cpuCfsPeriod, cpuCfsQuota, cpUShares, cpUSet, pidsLimit, oomKillDisable, ipv4Forwarding, bridgeNfIptables, bridgeNfIp6tables, debug, nfd, ngoroutines, systemTime, loggingDriver, cgroupDriver, cgroupVersion, neventsListener, kernelVersion, operatingSystem, osVersion, osType, architecture, NCPU, memTotal, indexServerAddress, registryConfig, genericResources, httpProxy, httpsProxy, noProxy, name, labels, experimentalBuild, serverVersion, clusterStore, clusterAdvertise, runtimes, defaultRuntime, swarm, liveRestoreEnabled, isolation, initBinary, containerdCommit, runcCommit, initCommit, securityOptions, productLicense, defaultAddressPools, warnings);
  }

  @Override
  public String toString() {

    return "class SystemInfo {\n" +
                          "    ID: " + toIndentedString(ID) + "\n" +
                          "    containers: " + toIndentedString(containers) + "\n" +
                          "    containersRunning: " + toIndentedString(containersRunning) + "\n" +
                          "    containersPaused: " + toIndentedString(containersPaused) + "\n" +
                          "    containersStopped: " + toIndentedString(containersStopped) + "\n" +
                          "    images: " + toIndentedString(images) + "\n" +
                          "    driver: " + toIndentedString(driver) + "\n" +
                          "    driverStatus: " + toIndentedString(driverStatus) + "\n" +
                          "    dockerRootDir: " + toIndentedString(dockerRootDir) + "\n" +
                          "    plugins: " + toIndentedString(plugins) + "\n" +
                          "    memoryLimit: " + toIndentedString(memoryLimit) + "\n" +
                          "    swapLimit: " + toIndentedString(swapLimit) + "\n" +
                          "    kernelMemory: " + toIndentedString(kernelMemory) + "\n" +
                          "    cpuCfsPeriod: " + toIndentedString(cpuCfsPeriod) + "\n" +
                          "    cpuCfsQuota: " + toIndentedString(cpuCfsQuota) + "\n" +
                          "    cpUShares: " + toIndentedString(cpUShares) + "\n" +
                          "    cpUSet: " + toIndentedString(cpUSet) + "\n" +
                          "    pidsLimit: " + toIndentedString(pidsLimit) + "\n" +
                          "    oomKillDisable: " + toIndentedString(oomKillDisable) + "\n" +
                          "    ipv4Forwarding: " + toIndentedString(ipv4Forwarding) + "\n" +
                          "    bridgeNfIptables: " + toIndentedString(bridgeNfIptables) + "\n" +
                          "    bridgeNfIp6tables: " + toIndentedString(bridgeNfIp6tables) + "\n" +
                          "    debug: " + toIndentedString(debug) + "\n" +
                          "    nfd: " + toIndentedString(nfd) + "\n" +
                          "    ngoroutines: " + toIndentedString(ngoroutines) + "\n" +
                          "    systemTime: " + toIndentedString(systemTime) + "\n" +
                          "    loggingDriver: " + toIndentedString(loggingDriver) + "\n" +
                          "    cgroupDriver: " + toIndentedString(cgroupDriver) + "\n" +
                          "    cgroupVersion: " + toIndentedString(cgroupVersion) + "\n" +
                          "    neventsListener: " + toIndentedString(neventsListener) + "\n" +
                          "    kernelVersion: " + toIndentedString(kernelVersion) + "\n" +
                          "    operatingSystem: " + toIndentedString(operatingSystem) + "\n" +
                          "    osVersion: " + toIndentedString(osVersion) + "\n" +
                          "    osType: " + toIndentedString(osType) + "\n" +
                          "    architecture: " + toIndentedString(architecture) + "\n" +
                          "    NCPU: " + toIndentedString(NCPU) + "\n" +
                          "    memTotal: " + toIndentedString(memTotal) + "\n" +
                          "    indexServerAddress: " + toIndentedString(indexServerAddress) + "\n" +
                          "    registryConfig: " + toIndentedString(registryConfig) + "\n" +
                          "    genericResources: " + toIndentedString(genericResources) + "\n" +
                          "    httpProxy: " + toIndentedString(httpProxy) + "\n" +
                          "    httpsProxy: " + toIndentedString(httpsProxy) + "\n" +
                          "    noProxy: " + toIndentedString(noProxy) + "\n" +
                          "    name: " + toIndentedString(name) + "\n" +
                          "    labels: " + toIndentedString(labels) + "\n" +
                          "    experimentalBuild: " + toIndentedString(experimentalBuild) + "\n" +
                          "    serverVersion: " + toIndentedString(serverVersion) + "\n" +
                          "    clusterStore: " + toIndentedString(clusterStore) + "\n" +
                          "    clusterAdvertise: " + toIndentedString(clusterAdvertise) + "\n" +
                          "    runtimes: " + toIndentedString(runtimes) + "\n" +
                          "    defaultRuntime: " + toIndentedString(defaultRuntime) + "\n" +
                          "    swarm: " + toIndentedString(swarm) + "\n" +
                          "    liveRestoreEnabled: " + toIndentedString(liveRestoreEnabled) + "\n" +
                          "    isolation: " + toIndentedString(isolation) + "\n" +
                          "    initBinary: " + toIndentedString(initBinary) + "\n" +
                          "    containerdCommit: " + toIndentedString(containerdCommit) + "\n" +
                          "    runcCommit: " + toIndentedString(runcCommit) + "\n" +
                          "    initCommit: " + toIndentedString(initCommit) + "\n" +
                          "    securityOptions: " + toIndentedString(securityOptions) + "\n" +
                          "    productLicense: " + toIndentedString(productLicense) + "\n" +
                          "    defaultAddressPools: " + toIndentedString(defaultAddressPools) + "\n" +
                          "    warnings: " + toIndentedString(warnings) + "\n" +
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


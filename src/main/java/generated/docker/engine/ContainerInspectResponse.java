package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerInspectResponse {

    private String id;

    private String created;

    private String path;

    private List<String> args = new ArrayList<>();

    private ContainerState state;

    private String image;

    private String resolvConfPath;

    private String hostnamePath;

    private String hostsPath;

    private String logPath;

    private String name;

    private Integer restartCount;

    private String driver;

    private String platform;

    private String mountLabel;

    private String processLabel;

    private String appArmorProfile;

    private List<String> execIDs = new ArrayList<>();

    private HostConfig hostConfig = null;

    private GraphDriverData graphDriver;

    private Long sizeRw;

    private Long sizeRootFs;

    private List<MountPoint> mounts = new ArrayList<>();

    private ContainerConfig config;

    private NetworkSettings networkSettings;

    /**
     * The ID of the container
     **/
    public ContainerInspectResponse id(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The time the container was created
     **/
    public ContainerInspectResponse created(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("Created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The path to the command being run
     **/
    public ContainerInspectResponse path(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * The arguments to the command being run
     **/
    public ContainerInspectResponse args(List<String> args) {
        this.args = args;
        return this;
    }

    @JsonProperty("Args")
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     *
     **/
    public ContainerInspectResponse state(ContainerState state) {
        this.state = state;
        return this;
    }

    @JsonProperty("State")
    public ContainerState getState() {
        return state;
    }

    public void setState(ContainerState state) {
        this.state = state;
    }

    /**
     * The container&#39;s image ID
     **/
    public ContainerInspectResponse image(String image) {
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
     *
     **/
    public ContainerInspectResponse resolvConfPath(String resolvConfPath) {
        this.resolvConfPath = resolvConfPath;
        return this;
    }

    @JsonProperty("ResolvConfPath")
    public String getResolvConfPath() {
        return resolvConfPath;
    }

    public void setResolvConfPath(String resolvConfPath) {
        this.resolvConfPath = resolvConfPath;
    }

    /**
     *
     **/
    public ContainerInspectResponse hostnamePath(String hostnamePath) {
        this.hostnamePath = hostnamePath;
        return this;
    }

    @JsonProperty("HostnamePath")
    public String getHostnamePath() {
        return hostnamePath;
    }

    public void setHostnamePath(String hostnamePath) {
        this.hostnamePath = hostnamePath;
    }

    /**
     *
     **/
    public ContainerInspectResponse hostsPath(String hostsPath) {
        this.hostsPath = hostsPath;
        return this;
    }

    @JsonProperty("HostsPath")
    public String getHostsPath() {
        return hostsPath;
    }

    public void setHostsPath(String hostsPath) {
        this.hostsPath = hostsPath;
    }

    /**
     *
     **/
    public ContainerInspectResponse logPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    @JsonProperty("LogPath")
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    /**
     *
     **/
    public ContainerInspectResponse name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/
    public ContainerInspectResponse restartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    @JsonProperty("RestartCount")
    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    /**
     *
     **/
    public ContainerInspectResponse driver(String driver) {
        this.driver = driver;
        return this;
    }

    @JsonProperty("Driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     *
     **/
    public ContainerInspectResponse platform(String platform) {
        this.platform = platform;
        return this;
    }

    @JsonProperty("Platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     *
     **/
    public ContainerInspectResponse mountLabel(String mountLabel) {
        this.mountLabel = mountLabel;
        return this;
    }

    @JsonProperty("MountLabel")
    public String getMountLabel() {
        return mountLabel;
    }

    public void setMountLabel(String mountLabel) {
        this.mountLabel = mountLabel;
    }

    /**
     *
     **/
    public ContainerInspectResponse processLabel(String processLabel) {
        this.processLabel = processLabel;
        return this;
    }

    @JsonProperty("ProcessLabel")
    public String getProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(String processLabel) {
        this.processLabel = processLabel;
    }

    /**
     *
     **/
    public ContainerInspectResponse appArmorProfile(String appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
        return this;
    }

    @JsonProperty("AppArmorProfile")
    public String getAppArmorProfile() {
        return appArmorProfile;
    }

    public void setAppArmorProfile(String appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    /**
     * IDs of exec instances that are running in the container.
     **/
    public ContainerInspectResponse execIDs(List<String> execIDs) {
        this.execIDs = execIDs;
        return this;
    }

    @JsonProperty("ExecIDs")
    public List<String> getExecIDs() {
        return execIDs;
    }

    public void setExecIDs(List<String> execIDs) {
        this.execIDs = execIDs;
    }

    /**
     *
     **/
    public ContainerInspectResponse hostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
        return this;
    }

    @JsonProperty("HostConfig")
    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }

    /**
     *
     **/
    public ContainerInspectResponse graphDriver(GraphDriverData graphDriver) {
        this.graphDriver = graphDriver;
        return this;
    }

    @JsonProperty("GraphDriver")
    public GraphDriverData getGraphDriver() {
        return graphDriver;
    }

    public void setGraphDriver(GraphDriverData graphDriver) {
        this.graphDriver = graphDriver;
    }

    /**
     * The size of files that have been created or changed by this container.
     **/
    public ContainerInspectResponse sizeRw(Long sizeRw) {
        this.sizeRw = sizeRw;
        return this;
    }

    @JsonProperty("SizeRw")
    public Long getSizeRw() {
        return sizeRw;
    }

    public void setSizeRw(Long sizeRw) {
        this.sizeRw = sizeRw;
    }

    /**
     * The total size of all the files in this container.
     **/
    public ContainerInspectResponse sizeRootFs(Long sizeRootFs) {
        this.sizeRootFs = sizeRootFs;
        return this;
    }

    @JsonProperty("SizeRootFs")
    public Long getSizeRootFs() {
        return sizeRootFs;
    }

    public void setSizeRootFs(Long sizeRootFs) {
        this.sizeRootFs = sizeRootFs;
    }

    /**
     *
     **/
    public ContainerInspectResponse mounts(List<MountPoint> mounts) {
        this.mounts = mounts;
        return this;
    }

    @JsonProperty("Mounts")
    public List<MountPoint> getMounts() {
        return mounts;
    }

    public void setMounts(List<MountPoint> mounts) {
        this.mounts = mounts;
    }

    /**
     *
     **/
    public ContainerInspectResponse config(ContainerConfig config) {
        this.config = config;
        return this;
    }

    @JsonProperty("Config")
    public ContainerConfig getConfig() {
        return config;
    }

    public void setConfig(ContainerConfig config) {
        this.config = config;
    }

    /**
     *
     **/
    public ContainerInspectResponse networkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
        return this;
    }

    @JsonProperty("NetworkSettings")
    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public void setNetworkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerInspectResponse = (ContainerInspectResponse) o;
        return Objects.equals(this.id, containerInspectResponse.id) &&
                       Objects.equals(this.created, containerInspectResponse.created) &&
                       Objects.equals(this.path, containerInspectResponse.path) &&
                       Objects.equals(this.args, containerInspectResponse.args) &&
                       Objects.equals(this.state, containerInspectResponse.state) &&
                       Objects.equals(this.image, containerInspectResponse.image) &&
                       Objects.equals(this.resolvConfPath, containerInspectResponse.resolvConfPath) &&
                       Objects.equals(this.hostnamePath, containerInspectResponse.hostnamePath) &&
                       Objects.equals(this.hostsPath, containerInspectResponse.hostsPath) &&
                       Objects.equals(this.logPath, containerInspectResponse.logPath) &&
                       Objects.equals(this.name, containerInspectResponse.name) &&
                       Objects.equals(this.restartCount, containerInspectResponse.restartCount) &&
                       Objects.equals(this.driver, containerInspectResponse.driver) &&
                       Objects.equals(this.platform, containerInspectResponse.platform) &&
                       Objects.equals(this.mountLabel, containerInspectResponse.mountLabel) &&
                       Objects.equals(this.processLabel, containerInspectResponse.processLabel) &&
                       Objects.equals(this.appArmorProfile, containerInspectResponse.appArmorProfile) &&
                       Objects.equals(this.execIDs, containerInspectResponse.execIDs) &&
                       Objects.equals(this.hostConfig, containerInspectResponse.hostConfig) &&
                       Objects.equals(this.graphDriver, containerInspectResponse.graphDriver) &&
                       Objects.equals(this.sizeRw, containerInspectResponse.sizeRw) &&
                       Objects.equals(this.sizeRootFs, containerInspectResponse.sizeRootFs) &&
                       Objects.equals(this.mounts, containerInspectResponse.mounts) &&
                       Objects.equals(this.config, containerInspectResponse.config) &&
                       Objects.equals(this.networkSettings, containerInspectResponse.networkSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, path, args, state, image, resolvConfPath, hostnamePath, hostsPath, logPath, name, restartCount, driver, platform, mountLabel, processLabel, appArmorProfile, execIDs, hostConfig, graphDriver, sizeRw, sizeRootFs, mounts, config, networkSettings);
    }

    @Override
    public String toString() {

        return "class ContainerInspectResponse {\n" +
                            "    id: " + toIndentedString(id) + "\n" +
                            "    created: " + toIndentedString(created) + "\n" +
                            "    path: " + toIndentedString(path) + "\n" +
                            "    args: " + toIndentedString(args) + "\n" +
                            "    state: " + toIndentedString(state) + "\n" +
                            "    image: " + toIndentedString(image) + "\n" +
                            "    resolvConfPath: " + toIndentedString(resolvConfPath) + "\n" +
                            "    hostnamePath: " + toIndentedString(hostnamePath) + "\n" +
                            "    hostsPath: " + toIndentedString(hostsPath) + "\n" +
                            "    logPath: " + toIndentedString(logPath) + "\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    restartCount: " + toIndentedString(restartCount) + "\n" +
                            "    driver: " + toIndentedString(driver) + "\n" +
                            "    platform: " + toIndentedString(platform) + "\n" +
                            "    mountLabel: " + toIndentedString(mountLabel) + "\n" +
                            "    processLabel: " + toIndentedString(processLabel) + "\n" +
                            "    appArmorProfile: " + toIndentedString(appArmorProfile) + "\n" +
                            "    execIDs: " + toIndentedString(execIDs) + "\n" +
                            "    hostConfig: " + toIndentedString(hostConfig) + "\n" +
                            "    graphDriver: " + toIndentedString(graphDriver) + "\n" +
                            "    sizeRw: " + toIndentedString(sizeRw) + "\n" +
                            "    sizeRootFs: " + toIndentedString(sizeRootFs) + "\n" +
                            "    mounts: " + toIndentedString(mounts) + "\n" +
                            "    config: " + toIndentedString(config) + "\n" +
                            "    networkSettings: " + toIndentedString(networkSettings) + "\n" +
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


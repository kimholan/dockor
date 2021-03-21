package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * A plugin for the Engine API
 **/

public class Plugin {

    private String id;

    private String name;

    private Boolean enabled;

    private PluginSettings settings;

    private String pluginReference;

    private PluginConfig config;

    /**
     *
     **/
    public Plugin id(String id) {
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
     *
     **/
    public Plugin name(String name) {
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
     * True if the plugin is running. False if the plugin is not running, only installed.
     **/
    public Plugin enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     **/
    public Plugin settings(PluginSettings settings) {
        this.settings = settings;
        return this;
    }

    @JsonProperty("Settings")
    public PluginSettings getSettings() {
        return settings;
    }

    public void setSettings(PluginSettings settings) {
        this.settings = settings;
    }

    /**
     * plugin remote reference used to push/pull the plugin
     **/
    public Plugin pluginReference(String pluginReference) {
        this.pluginReference = pluginReference;
        return this;
    }

    @JsonProperty("PluginReference")
    public String getPluginReference() {
        return pluginReference;
    }

    public void setPluginReference(String pluginReference) {
        this.pluginReference = pluginReference;
    }

    /**
     *
     **/
    public Plugin config(PluginConfig config) {
        this.config = config;
        return this;
    }

    @JsonProperty("Config")
    public PluginConfig getConfig() {
        return config;
    }

    public void setConfig(PluginConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var plugin = (Plugin) o;
        return Objects.equals(this.id, plugin.id) &&
                       Objects.equals(this.name, plugin.name) &&
                       Objects.equals(this.enabled, plugin.enabled) &&
                       Objects.equals(this.settings, plugin.settings) &&
                       Objects.equals(this.pluginReference, plugin.pluginReference) &&
                       Objects.equals(this.config, plugin.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, enabled, settings, pluginReference, config);
    }

    @Override
    public String toString() {
        return "class Plugin {\n" +
                       "    id: " + toIndentedString(id) + "\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    enabled: " + toIndentedString(enabled) + "\n" +
                       "    settings: " + toIndentedString(settings) + "\n" +
                       "    pluginReference: " + toIndentedString(pluginReference) + "\n" +
                       "    config: " + toIndentedString(config) + "\n" +
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


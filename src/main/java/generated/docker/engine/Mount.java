package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

public class Mount {

    private String target;

    private String source;

    private TypeEnum type;

    private Boolean readOnly;

    private String consistency;

    private MountBindOptions bindOptions;

    private MountVolumeOptions volumeOptions;

    private MountTmpfsOptions tmpfsOptions;

    /**
     * Container path.
     **/
    public Mount target(String target) {
        this.target = target;
        return this;
    }

    @JsonProperty("Target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Mount source (e.g. a volume name, a host path).
     **/
    public Mount source(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * The mount type. Available types:  - &#x60;bind&#x60; Mounts a file or directory from the host into the container. Must exist prior to creating the container. - &#x60;volume&#x60; Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - &#x60;tmpfs&#x60; Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - &#x60;npipe&#x60; Mounts a named pipe from the host into the container. Must exist prior to creating the container.
     **/
    public Mount type(TypeEnum type) {
        this.type = type;
        return this;
    }

    @JsonProperty("Type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Whether the mount should be read-only.
     **/
    public Mount readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @JsonProperty("ReadOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * The consistency requirement for the mount: &#x60;default&#x60;, &#x60;consistent&#x60;, &#x60;cached&#x60;, or &#x60;delegated&#x60;.
     **/
    public Mount consistency(String consistency) {
        this.consistency = consistency;
        return this;
    }

    @JsonProperty("Consistency")
    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

    /**
     *
     **/
    public Mount bindOptions(MountBindOptions bindOptions) {
        this.bindOptions = bindOptions;
        return this;
    }

    @JsonProperty("BindOptions")
    public MountBindOptions getBindOptions() {
        return bindOptions;
    }

    public void setBindOptions(MountBindOptions bindOptions) {
        this.bindOptions = bindOptions;
    }

    /**
     *
     **/
    public Mount volumeOptions(MountVolumeOptions volumeOptions) {
        this.volumeOptions = volumeOptions;
        return this;
    }

    @JsonProperty("VolumeOptions")
    public MountVolumeOptions getVolumeOptions() {
        return volumeOptions;
    }

    public void setVolumeOptions(MountVolumeOptions volumeOptions) {
        this.volumeOptions = volumeOptions;
    }

    /**
     *
     **/
    public Mount tmpfsOptions(MountTmpfsOptions tmpfsOptions) {
        this.tmpfsOptions = tmpfsOptions;
        return this;
    }

    @JsonProperty("TmpfsOptions")
    public MountTmpfsOptions getTmpfsOptions() {
        return tmpfsOptions;
    }

    public void setTmpfsOptions(MountTmpfsOptions tmpfsOptions) {
        this.tmpfsOptions = tmpfsOptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var mount = (Mount) o;
        return Objects.equals(this.target, mount.target) &&
                       Objects.equals(this.source, mount.source) &&
                       Objects.equals(this.type, mount.type) &&
                       Objects.equals(this.readOnly, mount.readOnly) &&
                       Objects.equals(this.consistency, mount.consistency) &&
                       Objects.equals(this.bindOptions, mount.bindOptions) &&
                       Objects.equals(this.volumeOptions, mount.volumeOptions) &&
                       Objects.equals(this.tmpfsOptions, mount.tmpfsOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, source, type, readOnly, consistency, bindOptions, volumeOptions, tmpfsOptions);
    }

    @Override
    public String toString() {
        return "class Mount {\n" +
                       "    target: " + toIndentedString(target) + "\n" +
                       "    source: " + toIndentedString(source) + "\n" +
                       "    type: " + toIndentedString(type) + "\n" +
                       "    readOnly: " + toIndentedString(readOnly) + "\n" +
                       "    consistency: " + toIndentedString(consistency) + "\n" +
                       "    bindOptions: " + toIndentedString(bindOptions) + "\n" +
                       "    volumeOptions: " + toIndentedString(volumeOptions) + "\n" +
                       "    tmpfsOptions: " + toIndentedString(tmpfsOptions) + "\n" +
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

    public enum TypeEnum {

        BIND("bind"), VOLUME("volume"), TMPFS("tmpfs"), NPIPE("npipe");

        private final String value;

        TypeEnum(String v) {
            value = v;
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (var b : TypeEnum.values()) {
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


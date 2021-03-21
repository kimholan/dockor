package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Secret {

    private String ID;

    private ObjectVersion version;

    private String createdAt;

    private String updatedAt;

    private SecretSpec spec;

    /**
     *
     **/
    public Secret ID(String ID) {
        this.ID = ID;
        return this;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     **/
    public Secret version(ObjectVersion version) {
        this.version = version;
        return this;
    }

    @JsonProperty("Version")
    public ObjectVersion getVersion() {
        return version;
    }

    public void setVersion(ObjectVersion version) {
        this.version = version;
    }

    /**
     *
     **/
    public Secret createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("CreatedAt")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     **/
    public Secret updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("UpdatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     **/
    public Secret spec(SecretSpec spec) {
        this.spec = spec;
        return this;
    }

    @JsonProperty("Spec")
    public SecretSpec getSpec() {
        return spec;
    }

    public void setSpec(SecretSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var secret = (Secret) o;
        return Objects.equals(this.ID, secret.ID) &&
                       Objects.equals(this.version, secret.version) &&
                       Objects.equals(this.createdAt, secret.createdAt) &&
                       Objects.equals(this.updatedAt, secret.updatedAt) &&
                       Objects.equals(this.spec, secret.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, version, createdAt, updatedAt, spec);
    }

    @Override
    public String toString() {
        return "class Secret {\n" +
                       "    ID: " + toIndentedString(ID) + "\n" +
                       "    version: " + toIndentedString(version) + "\n" +
                       "    createdAt: " + toIndentedString(createdAt) + "\n" +
                       "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
                       "    spec: " + toIndentedString(spec) + "\n" +
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


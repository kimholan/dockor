package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IndexInfo contains information about a registry.
 **/

public class IndexInfo {

    private String name;

    private List<String> mirrors = new ArrayList<>();

    private Boolean secure;

    private Boolean official;

    /**
     * Name of the registry, such as \&quot;docker.io\&quot;.
     **/
    public IndexInfo name(String name) {
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
     * List of mirrors, expressed as URIs.
     **/
    public IndexInfo mirrors(List<String> mirrors) {
        this.mirrors = mirrors;
        return this;
    }

    @JsonProperty("Mirrors")
    public List<String> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<String> mirrors) {
        this.mirrors = mirrors;
    }

    /**
     * Indicates if the registry is part of the list of insecure registries.  If &#x60;false&#x60;, the registry is insecure. Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  &gt; **Warning**: Insecure registries can be useful when running a local &gt; registry. However, because its use creates security vulnerabilities &gt; it should ONLY be enabled for testing purposes. For increased &gt; security, users should add their CA to their system&#39;s list of &gt; trusted CAs instead of enabling this option.
     **/
    public IndexInfo secure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    @JsonProperty("Secure")
    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    /**
     * Indicates whether this is an official registry (i.e., Docker Hub / docker.io)
     **/
    public IndexInfo official(Boolean official) {
        this.official = official;
        return this;
    }

    @JsonProperty("Official")
    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var indexInfo = (IndexInfo) o;
        return Objects.equals(this.name, indexInfo.name) &&
                       Objects.equals(this.mirrors, indexInfo.mirrors) &&
                       Objects.equals(this.secure, indexInfo.secure) &&
                       Objects.equals(this.official, indexInfo.official);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mirrors, secure, official);
    }

    @Override
    public String toString() {
        return "class IndexInfo {\n" +
                       "    name: " + toIndentedString(name) + "\n" +
                       "    mirrors: " + toIndentedString(mirrors) + "\n" +
                       "    secure: " + toIndentedString(secure) + "\n" +
                       "    official: " + toIndentedString(official) + "\n" +
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


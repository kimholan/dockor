package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Information about the issuer of leaf TLS certificates and the trusted root CA certificate.
 **/

public class TLSInfo {

    private String trustRoot;

    private String certIssuerSubject;

    private String certIssuerPublicKey;

    /**
     * The root CA certificate(s) that are used to validate leaf TLS certificates.
     **/
    public TLSInfo trustRoot(String trustRoot) {
        this.trustRoot = trustRoot;
        return this;
    }

    @JsonProperty("TrustRoot")
    public String getTrustRoot() {
        return trustRoot;
    }

    public void setTrustRoot(String trustRoot) {
        this.trustRoot = trustRoot;
    }

    /**
     * The base64-url-safe-encoded raw subject bytes of the issuer.
     **/
    public TLSInfo certIssuerSubject(String certIssuerSubject) {
        this.certIssuerSubject = certIssuerSubject;
        return this;
    }

    @JsonProperty("CertIssuerSubject")
    public String getCertIssuerSubject() {
        return certIssuerSubject;
    }

    public void setCertIssuerSubject(String certIssuerSubject) {
        this.certIssuerSubject = certIssuerSubject;
    }

    /**
     * The base64-url-safe-encoded raw public key bytes of the issuer.
     **/
    public TLSInfo certIssuerPublicKey(String certIssuerPublicKey) {
        this.certIssuerPublicKey = certIssuerPublicKey;
        return this;
    }

    @JsonProperty("CertIssuerPublicKey")
    public String getCertIssuerPublicKey() {
        return certIssuerPublicKey;
    }

    public void setCertIssuerPublicKey(String certIssuerPublicKey) {
        this.certIssuerPublicKey = certIssuerPublicKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var tlSInfo = (TLSInfo) o;
        return Objects.equals(this.trustRoot, tlSInfo.trustRoot) &&
                       Objects.equals(this.certIssuerSubject, tlSInfo.certIssuerSubject) &&
                       Objects.equals(this.certIssuerPublicKey, tlSInfo.certIssuerPublicKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustRoot, certIssuerSubject, certIssuerPublicKey);
    }

    @Override
    public String toString() {
        return "class TLSInfo {\n" +
                       "    trustRoot: " + toIndentedString(trustRoot) + "\n" +
                       "    certIssuerSubject: " + toIndentedString(certIssuerSubject) + "\n" +
                       "    certIssuerPublicKey: " + toIndentedString(certIssuerPublicKey) + "\n" +
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


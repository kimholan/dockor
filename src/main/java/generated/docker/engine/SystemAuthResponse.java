package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemAuthResponse   {
  
  private String status;
  private String identityToken;

  /**
   * The status of the authentication
   **/
  public SystemAuthResponse status(String status) {
    this.status = status;
    return this;
  }

  

  
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }/**
   * An opaque token used to authenticate a user after a successful login
   **/
  public SystemAuthResponse identityToken(String identityToken) {
    this.identityToken = identityToken;
    return this;
  }

  

  
  @JsonProperty("IdentityToken")
  public String getIdentityToken() {
    return identityToken;
  }

  public void setIdentityToken(String identityToken) {
    this.identityToken = identityToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var systemAuthResponse = (SystemAuthResponse) o;
    return Objects.equals(this.status, systemAuthResponse.status) &&
        Objects.equals(this.identityToken, systemAuthResponse.identityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, identityToken);
  }

  @Override
  public String toString() {

    return "class SystemAuthResponse {\n" +
                          "    status: " + toIndentedString(status) + "\n" +
                          "    identityToken: " + toIndentedString(identityToken) + "\n" +
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


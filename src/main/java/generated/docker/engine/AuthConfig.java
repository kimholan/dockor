package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class AuthConfig {

    private String username;

    private String password;

    private String email;

    private String serveraddress;

    /**
     *
     **/
    public AuthConfig username(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     **/
    public AuthConfig password(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     **/
    public AuthConfig email(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     **/
    public AuthConfig serveraddress(String serveraddress) {
        this.serveraddress = serveraddress;
        return this;
    }

    @JsonProperty("serveraddress")
    public String getServeraddress() {
        return serveraddress;
    }

    public void setServeraddress(String serveraddress) {
        this.serveraddress = serveraddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var authConfig = (AuthConfig) o;
        return Objects.equals(this.username, authConfig.username) &&
                       Objects.equals(this.password, authConfig.password) &&
                       Objects.equals(this.email, authConfig.email) &&
                       Objects.equals(this.serveraddress, authConfig.serveraddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email, serveraddress);
    }

    @Override
    public String toString() {
        return "class AuthConfig {\n" +
                       "    username: " + toIndentedString(username) + "\n" +
                       "    password: " + toIndentedString(password) + "\n" +
                       "    email: " + toIndentedString(email) + "\n" +
                       "    serveraddress: " + toIndentedString(serveraddress) + "\n" +
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


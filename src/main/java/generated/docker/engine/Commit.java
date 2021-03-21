package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Commit holds the Git-commit (SHA1) that a binary was built from, as reported in the version-string of external tools, such as &#x60;containerd&#x60;, or &#x60;runC&#x60;.
 **/

public class Commit {

    private String ID;

    private String expected;

    /**
     * Actual commit ID of external tool.
     **/
    public Commit ID(String ID) {
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
     * Commit ID of external tool expected by dockerd as set at build time.
     **/
    public Commit expected(String expected) {
        this.expected = expected;
        return this;
    }

    @JsonProperty("Expected")
    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var commit = (Commit) o;
        return Objects.equals(this.ID, commit.ID) &&
                       Objects.equals(this.expected, commit.expected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, expected);
    }

    @Override
    public String toString() {
        return "class Commit {\n" +
                       "    ID: " + toIndentedString(ID) + "\n" +
                       "    expected: " + toIndentedString(expected) + "\n" +
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


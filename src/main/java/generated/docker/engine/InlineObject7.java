package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class InlineObject7 {

    private String unlockKey;

    /**
     * The swarm&#39;s unlock key.
     **/
    public InlineObject7 unlockKey(String unlockKey) {
        this.unlockKey = unlockKey;
        return this;
    }

    @JsonProperty("UnlockKey")
    public String getUnlockKey() {
        return unlockKey;
    }

    public void setUnlockKey(String unlockKey) {
        this.unlockKey = unlockKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var inlineObject7 = (InlineObject7) o;
        return Objects.equals(this.unlockKey, inlineObject7.unlockKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unlockKey);
    }

    @Override
    public String toString() {

        return "class InlineObject7 {\n" +
                            "    unlockKey: " + toIndentedString(unlockKey) + "\n" +
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


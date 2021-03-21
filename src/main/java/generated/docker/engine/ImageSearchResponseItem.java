package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ImageSearchResponseItem {

    private String description;

    private Boolean isOfficial;

    private Boolean isAutomated;

    private String name;

    private Integer starCount;

    /**
     *
     **/
    public ImageSearchResponseItem description(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     **/
    public ImageSearchResponseItem isOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
        return this;
    }

    @JsonProperty("is_official")
    public Boolean getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    /**
     *
     **/
    public ImageSearchResponseItem isAutomated(Boolean isAutomated) {
        this.isAutomated = isAutomated;
        return this;
    }

    @JsonProperty("is_automated")
    public Boolean getIsAutomated() {
        return isAutomated;
    }

    public void setIsAutomated(Boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    /**
     *
     **/
    public ImageSearchResponseItem name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/
    public ImageSearchResponseItem starCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    @JsonProperty("star_count")
    public Integer getStarCount() {
        return starCount;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var imageSearchResponseItem = (ImageSearchResponseItem) o;
        return Objects.equals(this.description, imageSearchResponseItem.description) &&
                       Objects.equals(this.isOfficial, imageSearchResponseItem.isOfficial) &&
                       Objects.equals(this.isAutomated, imageSearchResponseItem.isAutomated) &&
                       Objects.equals(this.name, imageSearchResponseItem.name) &&
                       Objects.equals(this.starCount, imageSearchResponseItem.starCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, isOfficial, isAutomated, name, starCount);
    }

    @Override
    public String toString() {

        return "class ImageSearchResponseItem {\n" +
                            "    description: " + toIndentedString(description) + "\n" +
                            "    isOfficial: " + toIndentedString(isOfficial) + "\n" +
                            "    isAutomated: " + toIndentedString(isAutomated) + "\n" +
                            "    name: " + toIndentedString(name) + "\n" +
                            "    starCount: " + toIndentedString(starCount) + "\n" +
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


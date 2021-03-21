package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImageRootFS {

    private String type;

    private List<String> layers = new ArrayList<>();

    private String baseLayer;

    /**
     *
     **/
    public ImageRootFS type(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/
    public ImageRootFS layers(List<String> layers) {
        this.layers = layers;
        return this;
    }

    @JsonProperty("Layers")
    public List<String> getLayers() {
        return layers;
    }

    public void setLayers(List<String> layers) {
        this.layers = layers;
    }

    /**
     *
     **/
    public ImageRootFS baseLayer(String baseLayer) {
        this.baseLayer = baseLayer;
        return this;
    }

    @JsonProperty("BaseLayer")
    public String getBaseLayer() {
        return baseLayer;
    }

    public void setBaseLayer(String baseLayer) {
        this.baseLayer = baseLayer;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var imageRootFS = (ImageRootFS) o;
        return Objects.equals(this.type, imageRootFS.type) &&
                       Objects.equals(this.layers, imageRootFS.layers) &&
                       Objects.equals(this.baseLayer, imageRootFS.baseLayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, layers, baseLayer);
    }

    @Override
    public String toString() {

        return "class ImageRootFS {\n" +
                            "    type: " + toIndentedString(type) + "\n" +
                            "    layers: " + toIndentedString(layers) + "\n" +
                            "    baseLayer: " + toIndentedString(baseLayer) + "\n" +
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


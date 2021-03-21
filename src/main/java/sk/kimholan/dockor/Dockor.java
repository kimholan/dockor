package sk.kimholan.dockor;

import com.fasterxml.jackson.annotation.JsonProperty;
import generated.docker.engine.ContainerSummary;

public class Dockor {

    @JsonProperty
    String uri;

    @JsonProperty
    String param;

    @JsonProperty
    String apiVersion;

    @JsonProperty
    String period;

    @JsonProperty
    ContainerSummary containerSummary;

}

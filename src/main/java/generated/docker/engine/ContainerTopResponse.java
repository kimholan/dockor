package generated.docker.engine;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OK response to ContainerTop operation
 **/

public class ContainerTopResponse {

    private List<String> titles = new ArrayList<>();

    private List<List<String>> processes = new ArrayList<>();

    /**
     * The ps column titles
     **/
    public ContainerTopResponse titles(List<String> titles) {
        this.titles = titles;
        return this;
    }

    @JsonProperty("Titles")
    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    /**
     * Each process running in the container, where each is process is an array of values corresponding to the titles.
     **/
    public ContainerTopResponse processes(List<List<String>> processes) {
        this.processes = processes;
        return this;
    }

    @JsonProperty("Processes")
    public List<List<String>> getProcesses() {
        return processes;
    }

    public void setProcesses(List<List<String>> processes) {
        this.processes = processes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var containerTopResponse = (ContainerTopResponse) o;
        return Objects.equals(this.titles, containerTopResponse.titles) &&
                       Objects.equals(this.processes, containerTopResponse.processes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titles, processes);
    }

    @Override
    public String toString() {

        return "class ContainerTopResponse {\n" +
                            "    titles: " + toIndentedString(titles) + "\n" +
                            "    processes: " + toIndentedString(processes) + "\n" +
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


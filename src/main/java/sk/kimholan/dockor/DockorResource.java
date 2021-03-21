package sk.kimholan.dockor;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@ApplicationScoped
@Path("/dockor")
public class DockorResource {

    @ConfigProperty(name = "dockor.uri", defaultValue = "http://127.0.0.1:6666")
    String host;

    @ConfigProperty(name = "dockor.param", defaultValue = "httpClient.connectTimeout=10000&httpClient.socketTimeout=60000&bridgeEndpoint=true")
    String param;

    @ConfigProperty(name = "dockor.apiVersion", defaultValue = "1.41")
    String apiVersion;

    @ConfigProperty(name = "dockor.period", defaultValue = "3000")
    String period;

    Dockor dockor;

    @PostConstruct
    void postConstruct() {
        dockor = new Dockor();
        dockor.uri = host;
        dockor.param = param;
        dockor.apiVersion = apiVersion;
        dockor.period = period;
    }

    @GET
    @Produces(APPLICATION_JSON)
    public Dockor get() {
        return dockor;
    }

}

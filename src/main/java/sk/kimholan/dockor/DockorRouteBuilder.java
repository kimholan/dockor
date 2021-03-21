package sk.kimholan.dockor;

import generated.docker.engine.ContainerSummary;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DockorRouteBuilder
        extends RouteBuilder {

    @Inject
    DockorResource dockorResource;

    @Override
    public void configure() {
        var dockor = dockorResource.get();
        fromF("timer:dockor?period=%s", dockor.period)
                .toF("%s/v%s/containers/json?%s", dockor.uri, dockor.apiVersion, dockor.param)
                .unmarshal().json(ContainerSummary.class)
                .process(this::containersJson);
    }

    void containersJson(Exchange exchange) {
        var message = exchange.getMessage();
        var containerSummary = message.getBody(ContainerSummary.class);
        var dockor = dockorResource.get();
        dockor.containerSummary = containerSummary;
    }

}

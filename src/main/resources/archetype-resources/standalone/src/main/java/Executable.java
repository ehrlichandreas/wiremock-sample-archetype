package ${package};

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.github.ehrlichandreas.wiremock.starter.WireMockStarter;

@Configuration
@PropertySource(value = "${symbol_dollar}{standalone.properties-path:classpath:standalone.properties}", ignoreResourceNotFound = true)
public class Executable extends WireMockStarter {
    private static String WIREMOCK_SERVER_PORT_PROPERTY_NAME = "wiremock.server.port";
    private static String WIREMOCK_STUBS_DIRECTORY_PROPERTY_NAME = "wiremock.stubs.directory";
    private static String WIREMOCK_STUBS_ROOT_CONTEXT_PROPERTY_NAME = "wiremock.stubs.root-context";

    public static void main(String[] args) {
        WireMockStarter wireMockStarter = new Executable();
        wireMockStarter.startWireMockServer();
    }

    public String getWiremockServerPortPropertyName() {
        return WIREMOCK_SERVER_PORT_PROPERTY_NAME;
    }

    public String getWiremockStubsDirectoryPropertyName() {
        return WIREMOCK_STUBS_DIRECTORY_PROPERTY_NAME;
    }

    public String getWiremockStubsRootContextPropertyName() {
        return WIREMOCK_STUBS_ROOT_CONTEXT_PROPERTY_NAME;
    }
}

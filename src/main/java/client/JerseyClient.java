package client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;

public class JerseyClient {

    private static String BASE_URL = "http://petstore.swagger.io/v2";
    private static Client client = Client.create();

    private static final Logger log = LoggerFactory.getLogger(JerseyClient.class);

    public static ClientResponse findPetByID(String petID) {
        client.addFilter(new LoggingFilter(System.out));
        WebResource webResource = client.resource(
                String.format(BASE_URL + "/pet/%s", petID));
        ClientResponse response = webResource
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
        log.info("Recieved status response - [{}]", new Object[]{response.getStatus()});
        log.info("Recieved response - [{}]", new Object[]{response.getEntity(String.class)});
        return response;
    }

    public static ClientResponse createUser(String user) {
        client.addFilter(new LoggingFilter(System.out));
        WebResource webResource = client.resource(
                String.format(BASE_URL + "/user/%s", user));
        ClientResponse response = webResource
                .accept(MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, user);
        log.info("Recieved status response - [{}]", new Object[]{response.getStatus()});
        log.info("Recieved response - [{}]", new Object[]{response.getEntity(String.class)});
        return response;
    }

    public static ClientResponse createPet(String pet) {
        client.addFilter(new LoggingFilter(System.out));
        WebResource webResource = client.resource(BASE_URL + "/pet");
        ClientResponse response = webResource
                .accept(MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, pet);
        log.info("Recieved status response - [{}]", new Object[]{response.getStatus()});
        log.info("Recieved response - [{}]", new Object[]{response.getEntity(String.class)});
        return response;
    }


}

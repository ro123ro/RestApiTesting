package bo;

import client.JerseyClient;
import com.sun.jersey.api.client.ClientResponse;
import org.testng.Assert;

import javax.ws.rs.core.Response;

public class UserBO {
    public void createUser(String user, Response.Status status) {
        ClientResponse clientResponse = JerseyClient.createUser(user);
        Assert.assertEquals(clientResponse.getStatus(), status.getStatusCode());
    }
}

package bo;

import model.Pet.Pet;
import client.JerseyClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientResponse;
import org.testng.Assert;

import javax.ws.rs.core.Response;

public class PetBO {

    public Pet findPetByID(String petID, Response.Status status) {
        ClientResponse clientResponse = JerseyClient.findPetByID(petID);
        Assert.assertEquals(clientResponse.getStatus(), status.getStatusCode());
        String output = clientResponse.getEntity(String.class);
        Pet petFromResponse = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            petFromResponse = objectMapper.readValue(output, Pet.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(output);
        return petFromResponse;
    }


    public String createPet(Pet pet, Response.Status status) {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        objectMapper.writeValue(pet.);
        ClientResponse clientResponse = JerseyClient.createPet(pet.toString());
        Assert.assertEquals(clientResponse.getStatus(), status.getStatusCode());
        String output = clientResponse.getEntity(String.class);
//        Assert.assertNotNull(output);
        return output;
    }

}

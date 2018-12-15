package petStore;

import Assertion.PetAssertions;
import builder.PetCreatorRQ;
import data.PetData;
import model.Pet.Pet;
import bo.PetBO;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;

public class PetTest {

//    public static final int x = 3;
//
//    private void doSMTH(int... x) {
//        //varargs
//        System.out.println(x.length);
//        for (int y : x) {
//            System.out.println(y);
//        }
//    }
//
//    @Test
//    public void testV() {
//        doSMTH(1, 3, 4, 6);
//    }

    private PetBO petBO = new PetBO();

    @Test
    public void test() {
        String petId = "8";
        String expectCategoryName = "MyPet";
        String expectPetName = "MyPetDoggggg";

        Pet petFromResponse = petBO.findPetByID(petId, Response.Status.OK);
        System.out.println(petFromResponse);
        PetAssertions.assertPetData(petId, expectCategoryName, expectPetName, petFromResponse);

//        String actualPetID = petFromResponse.getId().toString();
//        String actualCategoryName = petFromResponse.getCategory().getName();
//        String actualPetName = petFromResponse.getName();
//
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(petId, actualPetID, "Incorrect ID of pet");
//        softAssert.assertEquals(actualCategoryName, expectCategoryName, "Incorrect CategoryName of pet");
//        softAssert.assertEquals(actualPetName, expectPetName, "Incorrect Name of pet");
//        softAssert.assertAll();


    }


    @Test
    public void testPetCreation() {
        PetData petData = new PetData();
        petData.namePet = "NewPet";
        Pet newPetToCreate = new PetCreatorRQ(petData).createPet();

        petBO.createPet(newPetToCreate, Response.Status.OK);
    }


}

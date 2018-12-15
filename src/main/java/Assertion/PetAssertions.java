package Assertion;

import model.Pet.Pet;
import org.testng.asserts.SoftAssert;

public class PetAssertions {
   public static void assertPetData(String expectPetId, String expectCategoryName, String expectPetName, Pet petFromResponse ) {

        String actualPetID = petFromResponse.getId().toString();
        String actualCategoryName = petFromResponse.getCategory().getName();
        String actualPetName = petFromResponse.getName();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualPetID, expectPetId, "Incorrect ID of pet");
        softAssert.assertEquals(actualCategoryName, expectCategoryName, "Incorrect CategoryName of pet");
        softAssert.assertEquals(actualPetName, expectPetName, "Incorrect Name of pet");
        softAssert.assertAll();

    }
}

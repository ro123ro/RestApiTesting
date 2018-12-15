package userTests;

import data.PetData;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void test1() {
        PetData petData = new PetData();
        System.out.println(petData);
    }

    @Test
    public void test2() {
//        Tag tag = new TagBuilder().setId(x),setName("fgfdg").build();
    }
}

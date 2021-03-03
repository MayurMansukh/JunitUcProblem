package JavaJUnit;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void give_FirstName_True_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.FirstName("May");
        Assert.assertTrue(result);

    }

    @Test
    public void give_FirstName_False_Test() {
        UserRegistration user = new UserRegistration();
        boolean result = user.FirstName("Mayur");
        Assert.assertFalse(result);
    }


   
}
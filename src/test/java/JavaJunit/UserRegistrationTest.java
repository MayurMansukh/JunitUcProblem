package JavaJunit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user;

    @Before
    public void intialize() {
        user=new UserRegistration();
    }

    @Test
    public void given_first_name_check_true() throws UserRegistrationException{
        boolean result=user.validateFirstName("mayur");
        Assert.assertTrue(result);
    }

    @Test
    public void given_first_name_check_false() {
        try {
            user.validateFirstName("mayur");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_last_name_check_true() throws UserRegistrationException {
        boolean result= user.validateLastName("Mansukh");
        Assert.assertTrue(result);
    }

    @Test
    public void given_last_name_check_false() {
        try {
            user.validateLastName("Mansukh");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_email_check_true() throws UserRegistrationException{
        boolean result=user.validateEmail("Mansukh04@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void given_email_check_false() {
        try {
            user.validateEmail("Mansukh04@gmail.com");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_phone_number_check_true() throws UserRegistrationException{
        boolean result=user.validatePhonenumber("91 8866778899");
        Assert.assertTrue(result);
    }

    @Test
    public void given_phone_number_check_false() {
        try {
            user.validatePhonenumber("887644366");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_password_check_true() throws UserRegistrationException{
        boolean result=user.validatePassword("Mansukh1@2");
        Assert.assertTrue(result);
    }


    @Test
    public void given_password_check_false() {
        try {
            user.validatePassword("Pass");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
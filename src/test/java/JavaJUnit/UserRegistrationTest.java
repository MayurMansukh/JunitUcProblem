package JavaJUnit;

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
    public void given_first_name_check_false() {
        try {
            user.validateFirstName("Mayur");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
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
    public void given_email_check_false() {
        try {
            user.validateEmail("Mansukh@gmail.com");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_phone_number_check_false() {
        try {
            user.validatePhonenumber("889967677");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void given_password_check_false() {
        try {
            user.validatePassword("asd");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
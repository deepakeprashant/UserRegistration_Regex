import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFormValidation {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenMessage_Test_User_FirstName_Valid_ReturnHappy() {
        String actual = userRegistration.getValidUserName("Viky");
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_FirstName_NotValid_ReturnSad() {
        String actual = userRegistration.getValidUserName("viky");
        Assertions.assertEquals("Sad", actual);
    }

    @Test
    public void givenMessage_Test_User_LastName_Valid_ReturnHappy() {
        String actual = userRegistration.getValidUserName("Deepake");
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_LastName_Valid_ReturnSad() {
        String actual = userRegistration.getValidUserName("deepake");
        Assertions.assertEquals("Sad", actual);
    }

    @Test
    public void givenMessage_Test_User_Email_Valid_ReturnHappy() {
        String actual = userRegistration.getValidEmailId("deepake07@gmail.com");
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_Email_Valid_ReturnSad() {
        String actual = userRegistration.getValidEmailId("deepake07@@gmail.com");
        Assertions.assertEquals("Sad", actual);
    }

    @Test
    public void givenMessage_Test_User_PhoneNumber_Valid_ReturnHappy() {
        String actual = userRegistration.getValidPhoneNumber("91 9130590029");
        Assertions.assertEquals("Happy", actual);
    }
    @Test
    public void givenMessage_Test_User_PhoneNumber_Valid_ReturnSad(){
        String actual = userRegistration.getValidPhoneNumber("91 13059029");
        Assertions.assertEquals("Sad",actual);
    }
    @Test
    public void givenMessage_Test_User_Password_Valid_ReturnHappy(){
        String actual = userRegistration.getValidPassword("Viky143@007");
        Assertions.assertEquals("Happy",actual);
    }
    @Test
    public void givenMessage_Test_User_Password_Valid_ReturnSad(){
        String actual = userRegistration.getValidPassword("viky143007");
        Assertions.assertEquals("Sad",actual);
    }
}

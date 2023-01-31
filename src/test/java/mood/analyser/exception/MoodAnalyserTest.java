package mood.analyser.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_Test_User_FirstName_Valid_ReturnHappy() throws MoodAnalysisException {
        UserRegistrationMoodAnalyser userRegistration = new UserRegistrationMoodAnalyser("Viky");
        String actual = userRegistration.getValidUserName();
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_LastName_Valid_ReturnHappy() throws MoodAnalysisException {
        UserRegistrationMoodAnalyser userRegistration = new UserRegistrationMoodAnalyser("Deepake");
        String actual = userRegistration.getValidUserName();
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_Email_Valid_ReturnHappy() throws MoodAnalysisException {
        UserRegistrationMoodAnalyser userRegistration = new UserRegistrationMoodAnalyser("deepake@gmail.com");
        String actual = userRegistration.getValidEmailId();
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_PhoneNumber_Valid_ReturnHappy() throws MoodAnalysisException {
        UserRegistrationMoodAnalyser userRegistration = new UserRegistrationMoodAnalyser("91 9130590029");
        String actual = userRegistration.getValidPhoneNumber();
        Assertions.assertEquals("Happy", actual);
    }

    @Test
    public void givenMessage_Test_User_Password_Valid_ReturnHappy() throws MoodAnalysisException {
        UserRegistrationMoodAnalyser userRegistration = new UserRegistrationMoodAnalyser("PAss@143583");
        String actual = userRegistration.getValidPassword();
        Assertions.assertEquals("Happy", actual);
    }
}

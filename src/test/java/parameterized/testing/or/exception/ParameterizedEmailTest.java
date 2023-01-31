package parameterized.testing.or.exception;

import mood.analyser.exception.UserRegistrationMoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedEmailTest {

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com","abc-100@gmail.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc@1.com", "abc.100@abc.com.au",
            "abc@.com.my", "abc123@gmail.a", ".abc@abc.com", "abc()*@gmail.co"
            , "abc..2002@gamil.co", "abc@abc@gmail.com"})
    public void multipleEmailsCheck(String value) throws MoodAnalysisException {
        SampleEmailsMoodAnalyser sampleEMailsCheck = new SampleEmailsMoodAnalyser(value);
        String actual = sampleEMailsCheck.getValidEmailId();
        Assertions.assertEquals("Happy", actual);
    }
}

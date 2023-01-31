package mood.analyser.exception;

public class UserRegistrationMoodAnalyser {
    String message;
    boolean result;

    public UserRegistrationMoodAnalyser() {
    }

    public UserRegistrationMoodAnalyser(String message) {
        this.message = message;
    }

    public String getValidUserName() throws MoodAnalysisException {
        String regex = "^[A-Z][a-z]{3,}$";
        result = message.matches(regex);
        return getValidOrNotOrException();
    }

    public String getValidEmailId() throws MoodAnalysisException {
        String regex = "^[a-z]+[.+_-]{0,1}[A-Za-z0-9]*@[a-z0-9]+.[a-z]{0,3}[.]{0,1}[a-z]{2,3}$";
        result = message.matches(regex);
        return getValidOrNotOrException();
    }

    public String getValidPhoneNumber() throws MoodAnalysisException {
        String regex = "^[0-9]{2}[\s][6-9][0-9]{9}$";
        result = message.matches(regex);
        return getValidOrNotOrException();
    }

    public String getValidPassword() throws MoodAnalysisException {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).{8,}$";
        result = message.matches(regex);
        return getValidOrNotOrException();
    }

    public String getValidOrNotOrException() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Empty mood, Please Enter Proper Message");
            if (result)
                return "Happy";
            else
                return "Sad";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Entered Null, Please Enter Proper Message");
        }
    }
}

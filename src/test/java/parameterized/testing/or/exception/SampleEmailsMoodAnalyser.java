package parameterized.testing.or.exception;

public class SampleEmailsMoodAnalyser {
    String message;
    boolean result;

    public SampleEmailsMoodAnalyser() {
    }

    public SampleEmailsMoodAnalyser(String message) {
        this.message = message;
    }

    public String getValidEmailId() throws MoodAnalysisException{
        String regex = "^[a-z]+[.+_-]{0,1}[a-z0-9]*@[a-z0-9]+.[a-z]{0,3}[.]{0,1}[a-z]{2,3}$";
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

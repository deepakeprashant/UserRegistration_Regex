package email.sample.data;

public class SampleEmailData {
    public static void main(String[] args) {
        SampleEmailData sampleEmailDataObject = new SampleEmailData();
        String emails[] = sampleEmailDataObject.getMultipleEmailId();
        sampleEmailDataObject.checkEmailIdValidOrNot(emails);
    }

    String[] getMultipleEmailId() {
        String[] emails = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc@1.com", "abc.100@abc.com.au",
                "abc@.com.my", "abc123@gmail.a", ".abc@abc.com", "abc()*@gmail.co"
                , "abc..2002@gamil.co", "abc@abc@gmail.com"};
        return emails;
    }

    void checkEmailIdValidOrNot(String[] emails) {
        String regex = "^[a-z]+[.+_-]{0,1}[a-z0-9]*@[a-z0-9]+.[a-z]{0,3}[.]{0,1}[a-z]{2,3}$";
        for (int i = 0; i < emails.length; i++) {
            boolean result = emails[i].matches(regex);
            if (result) {
                System.out.println(i + "] " + emails[i] + " ::-\t email-id is valid");
            } else {
                System.out.println(i + "] " + emails[i] + " ::-\t email-id is not valid");
            }
        }
    }
}

public class UserRegistration {
    boolean result;
    public String getValidUserName(String firstName){
        String regex = "^[A-Z][a-z]{3,}$";
        result = firstName.matches(regex);
        if (result){
            return "Happy";
        }else {
            return "Sad";
        }
    }
    public String getValidEmailId(String email){
        String regex ="^[a-z]+[.+_-]{0,1}[A-Za-z0-9]*@[a-z0-9]+.[a-z]{0,3}[.]{0,1}[a-z]{2,3}$";
        result = email.matches(regex);
        if (result){
            return "Happy";
        }
        return "Sad";
    }
    public String getValidPhoneNumber(String phoneNumber){
        String regex ="^[0-9]{2}[\s][6-9][0-9]{9}$";
        result = phoneNumber.matches(regex);
        if (result){
            return "Happy";
        }
        return "Sad";
    }
    public String getValidPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).{8,}$";
        result = password.matches(regex);
        if (result){
            return "Happy";
        }
        return "Sad";
    }
}

package user.registration;

public class RegistrationRepository {
    boolean result;

    public void checkNameValidOrNot(String name) {
        String regex = "^[A-Z][a-z]{3,9}$";
        result = name.matches(regex);
        if (result){
            System.out.println(name+" Name is valid");
        }else {
            System.out.println(name+" Name does not valid");
        }
    }
    public void checkEmailIdValidOrNot(String emails){
        String regex = "^[a-z]+[.+_-]{0,1}[a-z0-9]*@[a-z0-9]+.[a-z]{0,3}[.]{0,1}[a-z]{2,3}$";
        result = emails.matches(regex);
        if (result){
            System.out.println(emails+" :- Email Id is valid");
        }else {
            System.out.println(emails+" :- Email Id does not valid");
            System.out.println("Note example:- abc.xyz@bl.co.in");
        }
    }
    public void checkMobileValidationOrNot(String mobileNumber) {
        String regex ="^[0-9]{2}[\s][6-9][0-9]{9}$";
        result = mobileNumber.matches(regex);
        if (result){
            System.out.println(mobileNumber+" number is valid");
        }else {
            System.out.println(mobileNumber+" number is does not valid");
            System.out.println("example :- 91 9130590029");
        }
    }

    public void checkPassWordValidOrNot(String password) {
        String regex = "^[A-Z]+[A-Za-z]{7,}";
        result = password.matches(regex);
        if (result){
            System.out.println(password+" is Valid");
        }else {
            System.out.println(password+" Password is does not valid");
            System.out.println("example :- minimum 8 digit character, minimum 1 capital character");
        }
    }
}

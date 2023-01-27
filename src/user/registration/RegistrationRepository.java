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
}

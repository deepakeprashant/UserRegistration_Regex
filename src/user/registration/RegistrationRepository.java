package user.registration;

public class RegistrationRepository {

    public void checkValidOrNot(String name) {
        String regex = "^[A-Z][a-z]{3,9}$";
        boolean result = name.matches(regex);
        if (result){
            System.out.println(name+" Name is valid");
        }else {
            System.out.println(name+" Name does not valid");
        }
    }
}

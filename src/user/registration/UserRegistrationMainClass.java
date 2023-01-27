package user.registration;

public class UserRegistrationMainClass {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        RegistrationRepository repositoryObject = new RegistrationRepository();
        repositoryObject.checkValidOrNot(userInterface.getFirstName());
        repositoryObject.checkValidOrNot(userInterface.getLastName());
    }
}

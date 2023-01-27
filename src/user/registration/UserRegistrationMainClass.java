package user.registration;

public class UserRegistrationMainClass {
    public static final int FULL_NAME = 1;
    public static final int EMAIL_ID = 2;
    public static final int MOBILE_NO = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        RegistrationRepository repositoryObject = new RegistrationRepository();
        while (true) {
            switch (userInterface.getUserChoice()) {
                case FULL_NAME:
                    repositoryObject.checkNameValidOrNot(userInterface.getFirstName());
                    repositoryObject.checkNameValidOrNot(userInterface.getLastName());
                    break;
                case EMAIL_ID:
                    repositoryObject.checkEmailIdValidOrNot(userInterface.getEmailId());
                    break;
                case MOBILE_NO:
                    repositoryObject.checkMobileValidationOrNot(userInterface.getMobileNumber());
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}

package ua.training.main.task3.view;

/**
 * The view renders presentation of the model in a particular format.
 * @author Maltsev Dmytro
 */
public class View {
    public static final String INPUT_SURNAME = "Enter your surname: ";
    public static final String INPUT_NAME = "Enter your name: ";
    public static final String INPUT_NICKNAME = "Enter your nickname: ";
    public static final String INPUT_PATRONYMIC = "Enter your patronymic: ";
    public static final String INPUT_COMMENT = "Enter comment: ";
    public static final String INPUT_HOME_PHONE = "Enter your home phone: ";
    public static final String INPUT_MOBILE_PHONE = "Enter your mobile phone: ";
    public static final String INPUT_EMAIL = "Enter your email: ";
    public static final String INPUT_SKYPE = "Enter your Skype login: ";
    public static final String INPUT_POST_INDEX = "Enter your post index: ";
    public static final String INPUT_CITY = "Enter your city: ";
    public static final String INPUT_STREET = "Enter your street: ";
    public static final String INPUT_HOUSE_NUMBER = "Enter your house number: ";
    public static final String INPUT_FLAT_NUMBER = "Enter your house number: ";
    public static final String WRONG_INPUT_DATA = "Wrong input data! ";

    /**
     * This method encapsulates the output of a message to the console
     * @param message - message to output to the console
     */
    public void printMessage(String message){
        System.out.println(message);
    }
}

package ua.training.main.task3.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.training.main.task3.view.TextConstant.INPUT_STRING_DATA;
import static ua.training.main.task3.view.TextConstant.WRONG_INPUT_DATA;

/**
 * The view renders presentation of the model in a particular format.
 * @author Maltsev Dmytro
 */
public class View {
    static String MESSAGE_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME,
                    //new Locale("ua", "UA"));
                    new Locale("en"));

    /**
     * This method encapsulates the output of a message to the console
     * @param message - message to output to the console
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    private String concatenateStrings(String ... strings){
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: strings) {
            stringBuilder.append(str);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public void printWrongMessage(String message){
        printMessage(concatenateStrings(bundle.getString(WRONG_INPUT_DATA)
                ,bundle.getString(INPUT_STRING_DATA)
                ,bundle.getString(message)));
    }

    public void printStringInput(String message){
        printMessage(concatenateStrings(bundle.getString(INPUT_STRING_DATA)
                ,bundle.getString(message)));
    }
}

package view;

import static view.TextConstant.INPUT_STRING_DATA;
import static view.TextConstant.WRONG_INPUT_DATA;

/**
 * The main.view renders presentation of the model in a particular format.
 * @author Maltsev Dmytro
 */
public class View {
    public static final MessageManager messageManager =
            MessageManager.EN;
            //MessageManager.UA;

    /**
     * This method encapsulates the output of a message to the console
     * @param message - message to output to the console
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    private String concatenateStrings(String ... strings){
        return String.join(" ", strings);
    }

    public void printWrongMessage(String message){
        printMessage(concatenateStrings(
                messageManager.getString(WRONG_INPUT_DATA),
                messageManager.getString(INPUT_STRING_DATA),
                messageManager.getString(message)));
    }

    public void printStringInput(String message){
        printMessage(concatenateStrings(
                messageManager.getString(INPUT_STRING_DATA),
                messageManager.getString(message)));
    }
}

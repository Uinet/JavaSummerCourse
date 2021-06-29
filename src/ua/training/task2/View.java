package ua.training.task2;

import java.util.ArrayList;

public class View {
    public static final String WRONG_INPUT_DATA = "Wrong input data! ";
    public static final String ENTER_NUMBER = "Enter number between %d and %d:";
    public static final String WINNER_MESSAGE = "Congratulations, you have guessed the secret number";
    public static final String PAST_ATTEMPTS = "Past attempts: ";
    public static final String NUMBER_IS_GREATER = "The entered number is greater than the secret. Secret number between %d and %d";
    public static final String NUMBER_IS_LESS = "The entered number is less than the secret. Secret number between %d and %d";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printPastAttempts(ArrayList<Integer> arrayList){
        printMessage(PAST_ATTEMPTS);
        for(int i = 0; i < arrayList.size(); i++){
            printMessage(i + ": " + arrayList.get(i));
        }
    }
}

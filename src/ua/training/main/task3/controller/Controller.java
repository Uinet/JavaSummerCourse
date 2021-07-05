package ua.training.main.task3.controller;

import ua.training.main.task3.view.View;
import ua.training.main.task3.model.Model;

import java.util.Scanner;

/**
 * This class is used to receive data from a view, validate the received data and pass it to the model
 * @see View
 * @see Model
 * @author Maltsev Dmytro
 */
public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void process(){
        Scanner scanner = new Scanner(System.in);
        model.setSurname(inputSurnameWithScanner(scanner));
        model.setNickname(inputNicknameWithScanner(scanner));

        view.printMessage(model.toString());
    }

    /**
     * This method is used to get the surname from the console
     * @param scanner - an instance of the Scanner class to read data from the command line
     * @return - a string representation of the surname
     */
    public String inputSurnameWithScanner(Scanner scanner){
        view.printMessage(View.INPUT_SURNAME);
        return inputValueWithRegex(scanner, RegexConstant.REG_SURNAME);
    }

    /**
     * This method is used to get the nickname from the console
     * @param scanner - an instance of the Scanner class to read data from the command line
     * @return - a string representation of the nickname
     */
    public String inputNicknameWithScanner(Scanner scanner){
        view.printMessage(View.INPUT_NICKNAME);
        return inputValueWithRegex(scanner, RegexConstant.REG_NICKNAME);
    }

    /**
     * This method reads data from the console and returns those that match the given pattern
     * @param scanner - an instance of the Scanner class to read data from the command line
     * @param regex - the regular expression pattern to match the string received from the console
     * @return - a string that matches the given pattern
     */
    public String inputValueWithRegex(Scanner scanner, String regex){
        String value = scanner.next();
        while (!value.matches(regex)){
            view.printMessage(View.WRONG_INPUT_DATA);
            value = scanner.next();
        }
        return value;
    }
}

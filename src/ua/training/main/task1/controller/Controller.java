package ua.training.main.task1.controller;

import ua.training.main.task1.model.Model;
import ua.training.main.task1.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void process(){
        Scanner scanner = new Scanner(System.in);
        model.setValue(inputStringValueWithScanner(scanner, View.INPUT_FIRST_WORD, View.HELLO_WORD));
        model.Append(" ");
        model.Append(inputStringValueWithScanner(scanner, View.INPUT_SECOND_WORD, View.WORLD_WORD));
        view.printMessage(View.SUCCESSFUL_OPERATION);
        view.printMessage(model.getValue());
    }

    public String inputStringValueWithScanner(Scanner scanner, String message, String pattern){
        view.printMessage(message);
        while( !scanner.hasNext(pattern)) {
            view.printMessage(View.WRONG_INPUT_DATA + " " + message);
            scanner.next();
        }
        return scanner.next();
    }
}

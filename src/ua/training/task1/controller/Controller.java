package ua.training.task1.controller;

import ua.training.task1.model.Model;
import ua.training.task1.view.View;

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
        model.setValue(inputStringValue(scanner));
        view.printMessage("Result: ");
        view.printMessage(model.getValue());
    }

    public String inputStringValue(Scanner scanner){
        StringBuilder stringBuilder = new StringBuilder();
        view.printMessage(View.INPUT_FIRST_WORD);
        while( !scanner.hasNext(View.HELLO_WORD)) {
            view.printMessage(View.WRONG_INPUT_DATA + " " + View.INPUT_FIRST_WORD);
            scanner.next();
        }
        stringBuilder.append(scanner.next());
        stringBuilder.append(" ");

        view.printMessage(View.INPUT_SECOND_WORD);
        while( !scanner.hasNext(View.WORLD_WORD)) {
            view.printMessage(View.WRONG_INPUT_DATA + " " + View.INPUT_SECOND_WORD);
            scanner.next();
        }
        stringBuilder.append(scanner.next());

        return stringBuilder.toString();
    }
}

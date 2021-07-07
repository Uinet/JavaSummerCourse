package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view){
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex){
        view.printStringInput(message);
        String result = scanner.next();
        while (!result.matches(regex)){
            view.printWrongMessage(message);
            result = scanner.next();
        }
        return  result;
    }
}

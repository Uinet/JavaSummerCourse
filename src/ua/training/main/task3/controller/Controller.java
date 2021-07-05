package ua.training.main.task3.controller;

import ua.training.main.task3.view.View;
import ua.training.main.task3.model.Model;

import java.util.Scanner;

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

    public String inputSurnameWithScanner(Scanner scanner){
        view.printMessage(View.INPUT_SURNAME);
        return inputValueWithRegex(scanner, RegexConstant.REG_SURNAME);
    }

    public String inputNicknameWithScanner(Scanner scanner){
        view.printMessage(View.INPUT_NICKNAME);
        return inputValueWithRegex(scanner, RegexConstant.REG_NICKNAME);
    }

    public String inputValueWithRegex(Scanner scanner, String regex){
        String value = scanner.next();
        while (!value.matches(regex)){
            view.printMessage(View.WRONG_INPUT_DATA);
            value = scanner.next();
        }
        return value;
    }
}

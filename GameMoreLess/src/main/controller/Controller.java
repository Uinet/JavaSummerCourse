package main.controller;

import main.model.Model;
import main.view.View;

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

        model.setLowerLimit(GlobalConstant.DEFAULT_LOWER_LIMIT);
        model.setUpperLimit(GlobalConstant.DEFAULT_UPPER_LIMIT);

        model.generateSecretNumber();

        while (!model.checkNumber(inputIntValueWithScanner(scanner)));

        view.printMessage(String.format(View.WINNER_MESSAGE,
                model.getSecretNumber()));
        view.printPastAttempts(model.getAttempts());
    }

    public int inputIntValueWithScanner(Scanner sc){
        int res = 0;

        view.printMessage(String.format(View.ENTER_NUMBER, model.getLowerLimit(),
                model.getUpperLimit()));

        while (true){
            while( ! sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA + View.ENTER_NUMBER);
                sc.next();
            }

            if((res = sc.nextInt()) <= model.getLowerLimit()){
                view.printMessage(String.format(View.NUMBER_IS_LESS,
                        model.getLowerLimit(), model.getUpperLimit()));
                continue;
            }
            if (res >= model.getUpperLimit()){
                view.printMessage(String.format(View.NUMBER_IS_GREATER,
                        model.getLowerLimit(), model.getUpperLimit()));
                continue;
            }
            break;
        }

        return res;
    }
}

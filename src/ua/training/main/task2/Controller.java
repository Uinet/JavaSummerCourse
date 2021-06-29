package ua.training.main.task2;

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
        int checkResult;
        do{
            checkResult = model.checkNumber(inputIntValueWithScanner(scanner));
            if(checkResult > 0){
                view.printMessage(String.format(View.NUMBER_IS_GREATER, model.getLowerLimit(), model.getUpperLimit()));
            } else if(checkResult < 0){
                view.printMessage(String.format(View.NUMBER_IS_LESS, model.getLowerLimit(), model.getUpperLimit()));
            }
        }
        while (checkResult != 0);

        view.printMessage(View.WINNER_MESSAGE);
        view.printPastAttempts(model.getAttempts());
    }

    public int inputIntValueWithScanner(Scanner sc){
        view.printMessage(String.format(View.ENTER_NUMBER, model.getLowerLimit(), model.getUpperLimit()));
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + View.ENTER_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }
}

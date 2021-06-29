package ua.training.task2;

import java.util.ArrayList;

public class Model {
    private int upperLimit;
    private int lowerLimit;
    private int secretNumber;
    private ArrayList<Integer> attempts;

    public Model(){
        upperLimit = 100;
        lowerLimit = 0;
        secretNumber = (int)(Math.random() * (upperLimit - lowerLimit + 1)) + lowerLimit;
        attempts = new ArrayList<>();
    }

    public int checkNumber(int number){
        attempts.add(number);
        int compareResult = Integer.compare(number, secretNumber);
        lowerLimit = compareResult == -1 ? number : lowerLimit;
        upperLimit = compareResult == 1 ? number : upperLimit;
        return compareResult;
    }

    public int getUpperLimit(){
        return upperLimit;
    }

    public int getLowerLimit(){
        return lowerLimit;
    }

    public ArrayList<Integer> getAttempts() {
        return new ArrayList<>(attempts);
    }
}

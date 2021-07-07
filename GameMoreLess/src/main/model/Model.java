package main.model;

import java.util.ArrayList;

public class Model {
    private int upperLimit;
    private int lowerLimit;

    private int secretNumber;

    private ArrayList<Integer> attempts;

    public Model(){
        attempts = new ArrayList<>();
    }

    public int generateSecretNumber(){
        secretNumber = (int)Math.ceil(Math.random()*
                (upperLimit - lowerLimit - 1) + lowerLimit);
        return secretNumber;
    }

    public boolean checkNumber(int number){
        attempts.add(number);
        if(number == secretNumber){
            return true;
        } else if(number > secretNumber){
            upperLimit = number;
        }else {
            lowerLimit = number;
        }
        return false;
    }

    public int getUpperLimit(){
        return upperLimit;
    }

    public int getLowerLimit(){
        return lowerLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getSecretNumber(){
        return secretNumber;
    }

    public ArrayList<Integer> getAttempts() {
        return new ArrayList<>(attempts);
    }
}

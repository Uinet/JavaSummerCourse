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
        InputNoteBook inputNoteBook = new InputNoteBook(scanner, view);
        inputNoteBook.inputNote();
    }
}

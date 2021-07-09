package controller;

import model.entity.NotUniqueException;
import model.entity.NoteBook;
import view.View;
import model.Model;

import java.util.Scanner;

/**
 * This class is used to receive data from a main.view, validate the received data and pass it to the model
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

        System.out.println(getNoteBook(inputNoteBook));

    }

    private NoteBook getNoteBook(InputNoteBook inputNoteBook){
        NoteBook noteBook = null;
        while (true){
            try {
                noteBook = new NoteBook(inputNoteBook.getSurname(),
                        inputNoteBook.getNickName());
                break;
            }
            catch (NotUniqueException ex){
                ex.printStackTrace();
                System.out.println(inputNoteBook.getNickName() +
                        " is not unique! Enter new nickname");
                inputNoteBook.inputNickName();
            }
        }
        return noteBook;
    }
}

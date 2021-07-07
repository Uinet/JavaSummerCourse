package controller;

import view.View;

import java.util.Scanner;

import static controller.RegexConstant.*;
import static view.TextConstant.NICK_NAME_DATA;
import static view.TextConstant.SURNAME_DATA;

public class InputNoteBook {
    private View view;
    private Scanner scanner;

    private String surname;
    private String nickName;

    public InputNoteBook(Scanner scanner, View view){
        this.scanner = scanner;
        this.view = view;
    }

    public void inputNote(){
        UtilityController utilityController =
                new UtilityController(scanner, view);

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REG_SURNAME_UKR : REG_SURNAME;

        this.surname = utilityController.inputStringValueWithScanner(SURNAME_DATA, str);
        this.nickName = utilityController.inputStringValueWithScanner(NICK_NAME_DATA, REG_NICKNAME);
    }
}

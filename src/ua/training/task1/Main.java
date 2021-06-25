package ua.training.task1;

import ua.training.task1.controller.Controller;
import ua.training.task1.model.Model;
import ua.training.task1.view.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.process();
    }
}

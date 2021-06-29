package ua.training.main.task1;

import ua.training.main.task1.model.Model;
import ua.training.main.task1.view.View;
import ua.training.main.task1.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.process();
    }
}

package ua.training.main.task3;

import ua.training.main.task3.controller.Controller;
import ua.training.main.task3.model.Model;
import ua.training.main.task3.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.process();
    }
}

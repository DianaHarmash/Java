package com.company;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}

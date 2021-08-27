package com.company;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private String getDataFromUser(String string) {
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("String is empty");
        }
        view.printMessage(string);
        while (true) {
            String inputData = new Scanner(System.in).nextLine();
            if (model.getRightString(string, inputData)) {
                return inputData;
            } else {
                view.printMessage(View.WRONG_INPUT);
            }
        }
    }

    public void process() {
        model.setHello(getDataFromUser(View.GET_STRING_HELLO));
        model.setWorld(getDataFromUser(View.GET_STRING_WORLD));
        view.printMessage(View.CONCATED_STRING + model.getString());
    }
}

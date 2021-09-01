package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        InputProcessing inputProcessing = new InputProcessing(view, scanner);
        String[] nameAndLogin = inputProcessing.processInput();
        model.setFirstName(nameAndLogin[0]);
        model.setLogin(nameAndLogin[1]);
    }
}

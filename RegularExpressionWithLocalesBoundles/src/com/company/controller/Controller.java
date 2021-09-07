package com.company.controller;

import com.company.model.LoginIsSetException;
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

    private boolean setLogin(String login) {
        try {
            model.setLogin(login);
            return true;
        } catch (LoginIsSetException e) {
            System.out.println(e.fillInStackTrace());
            return false;
        }
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        InputProcessing inputProcessing = new InputProcessing(view, scanner);
        model.setFirstName(inputProcessing.processNameInput());
        do {

        } while (!setLogin(inputProcessing.processLoginInput()));
    }
}

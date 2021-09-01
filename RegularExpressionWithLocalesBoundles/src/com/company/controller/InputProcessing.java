package com.company.controller;

import com.company.view.View;

import java.util.Scanner;

public class InputProcessing {
    Scanner scanner;
    View view;

    String firstName;
    String login;
    InputProcessing(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    public String[] processInput() {
        this.firstName = inputStringWithScanner(view.bundle.getString("input.data") + view.bundle.getString("input.first.name.data.regexp"), String.valueOf(view.bundle.getLocale()).equals("eng") ? view.bundle.getString("name.eng.regexp") : view.bundle.getString("name.ukr.regexp"));
        this.login = inputStringWithScanner(view.bundle.getString("input.data") + view.bundle.getString("input.login.data.regexp"), view.bundle.getString("login.regexp"));
        return new String[] {firstName, login};
    }

    public String inputStringWithScanner(String message, String regex) {
        view.printMessage(message);
        String string;
        while (!(string = String.valueOf(scanner.nextLine())).matches(regex.replace("\"", ""))) {
            view.printMessage(view.bundle.getString("input.wrong.data"));
        }
        return string;
    }
}

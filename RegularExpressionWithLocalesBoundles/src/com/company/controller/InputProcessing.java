package com.company.controller;

import com.company.ConstantString;
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
        this.firstName = inputStringWithScanner(view.bundle.getString(ConstantString.INPUT_DATA) + view.bundle.getString(ConstantString.INPUT_FIRST_NAME_DATA), String.valueOf(view.bundle.getLocale()).equals("eng") ? view.bundle.getString(ConstantString.NAME_ENG) : view.bundle.getString(ConstantString.NAME_UKR));
        this.login = inputStringWithScanner(view.bundle.getString(ConstantString.INPUT_DATA) + view.bundle.getString(ConstantString.INPUT_LOGIN_DATA), view.bundle.getString(ConstantString.LOGIN));
        return new String[] {firstName, login};
    }

    public String inputStringWithScanner(String message, String regex) {
        view.printMessage(message);
        String string;
        while (!(string = String.valueOf(scanner.nextLine())).matches(regex.replace("\"", ""))) {
            view.printMessage(view.bundle.getString(ConstantString.INPUT_WRONG_DATA));
        }
        return string;
    }
}

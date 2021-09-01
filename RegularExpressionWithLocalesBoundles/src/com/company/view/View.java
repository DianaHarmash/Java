package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public final ResourceBundle bundle = ResourceBundle.getBundle("myLocales",
            // new Locale("eng")
            new Locale("ukr", "UA")
    );

    public void printMessage(String message) {
        System.out.println(message);
    }
}


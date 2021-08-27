package com.company;

public class View {
    public static final String GET_STRING_HELLO = "Input 'hello' :: ";
    public static final String GET_STRING_WORLD = "Input 'world!' :: ";
    public static final String WRONG_INPUT = "Wrong input, so please repeat :: ";
    public static final String CONCATED_STRING = "Your string is ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageAndString(String message, String string) {
        System.out.print(message + string);
    }
}

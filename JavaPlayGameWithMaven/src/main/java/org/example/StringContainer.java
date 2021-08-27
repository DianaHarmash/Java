package org.example;

public enum StringContainer {
    GET_NUMBER ("Please, input a number :: "),
    UNACCEPTABLE_FORMAT ("Unacceptable format, please, retry"),
    THE_RANGE_IS ("The number must be "),
    BEFORE_INPUT ("Your previous input is "),
    INDEX_OUT_OF_RANGE ("You must enter a value in define boards"),
    WIN ("You guessed!"),
    STATISTIC("Your statistic is "),
    NEW_LINE("\n"),
    IS_LARGER("> "),
    IS_SMALLER("< "),
    SECRET_VALUE("Secret value"),
    WHITE_SPACE(" "),
    MIN_VALUE("0"),
    MAX_VALUE("100");

    private final String myString;

    StringContainer(String myString) {
        this.myString = myString;
    }

    static String getString(StringContainer... stringContainer) {
        StringBuilder string = new StringBuilder("");
        for (int x = 0; x < stringContainer.length; x++) {
            string.append(stringContainer[x].myString);
        }
        return string.toString();
    }
}

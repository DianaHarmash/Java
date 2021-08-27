package org.example;

import java.util.Scanner;

public class Controller {
    private final View view;
    private final Model model;

    Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    private int typeANumber(Scanner scanner) {
        try {
            return Integer.parseInt(new Scanner(System.in).nextLine());
        } catch (IllegalArgumentException e) {
            view.printMassage(StringContainer.getString(StringContainer.UNACCEPTABLE_FORMAT, StringContainer.NEW_LINE));
            return typeANumber(scanner);
        }
    }

    private boolean isValid(int num) {
        return num > model.getMinInt() && num < model.getMaxInt();
    }

    private boolean whileIsNOtGuessed(Scanner scanner) {
        view.printMassage(StringContainer.getString(StringContainer.THE_RANGE_IS, StringContainer.IS_LARGER) + model.getMinInt() + StringContainer.getString(StringContainer.WHITE_SPACE, StringContainer.SECRET_VALUE, StringContainer.WHITE_SPACE, StringContainer.IS_SMALLER) + model.getMaxInt() + StringContainer.getString(StringContainer.NEW_LINE));
        if (model.getList().size() != 0) view.printMassage(StringContainer.getString(StringContainer.BEFORE_INPUT) + model.getTheLastIntInTheList() + StringContainer.getString(StringContainer.NEW_LINE));
        view.printMassage(StringContainer.getString(StringContainer.GET_NUMBER));
        int num = typeANumber(scanner);
        if (isValid(num)) {
            return model.isGuessed(num);
        } else {
            view.printMassage(StringContainer.getString(StringContainer.INDEX_OUT_OF_RANGE, StringContainer.NEW_LINE));
        }
        return false;
    }

    public void getProcessed() {
        Scanner scanner = new Scanner(System.in);
        while (!whileIsNOtGuessed(scanner));
        view.printMassage(StringContainer.getString(StringContainer.WIN));
        view.printMassage(StringContainer.getString(StringContainer.STATISTIC, StringContainer.NEW_LINE) + model.getList().toString());
    }
}

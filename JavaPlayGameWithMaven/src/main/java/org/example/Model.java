package org.example;

import java.util.ArrayList;

public class Model {
    private ArrayList<Integer> myInt = new ArrayList<>();

    private int minInt = 0;
    private int maxInt = 100;
    private final int guess;

    Model() {
        this.guess = getRandNum();
    }

    public int getRandNum() {
        return (int) ((Math.random() * (this.maxInt - this.minInt -1)) + this.minInt + 1);
    }

    public ArrayList<Integer> getList() {
        return myInt;
    }

    public int getMaxInt() {
        return maxInt;
    }
    public int getMinInt() {
        return minInt;
    }

    public void setMyIntToTheList(int myInt) { this.myInt.add(myInt); }

    public int getTheLastIntInTheList() {
        return myInt.get(myInt.size()-1);
    }

    private void newBoards(int num) {
        if (num > this.guess) {
            this.maxInt = num;
        } else {
            this.minInt = num;
        }
    }

    public boolean isGuessed(int num) {
        setMyIntToTheList(num);
        if (num == this.guess) {
            return true;
        } else {
            newBoards(num);
        }
        return false;
    }
}

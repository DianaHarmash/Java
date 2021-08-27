package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
    static Model model;

    @BeforeClass
    public static void initialize() {
        model = new Model();
    }

    @Before
    public void callOfMethod() {
        int n = 0;
        while (n < 1000) {
            testGetRandInt();
            n++;
        }
    }

    int myInt;

    @Test
    public void testGetRandInt() {
        myInt = model.getRandNum();
        assertTrue("The number is out " + myInt, myInt > 0 && myInt < 100);
    }

    @Test
    public void testGetMaxInt() {
        Assert.assertEquals("Your maxInt isn't 100, but " + model.getMaxInt(), 100, model.getMaxInt());
    }

    @Test
    public void testGetMinINt() {
        Assert.assertEquals("Your minINt isn't 0, but " + model.getMinInt(), 0, model.getMinInt());
    }

    final int ELEMENT = 100;

    @Before
    public void fillArrayList() {
        for (int x = 0; x <= ELEMENT; x++) {
            model.setMyIntToTheList(x);
        }
    }

    @Test
    public void testGetTheLastIntInTheList() {
        Assert.assertEquals("Your last el isn't " + ELEMENT + " , but " + model.getTheLastIntInTheList(), ELEMENT, model.getTheLastIntInTheList());
    }
}

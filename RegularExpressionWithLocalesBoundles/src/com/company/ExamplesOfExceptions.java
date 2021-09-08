package com.company;

public class ExamplesOfExceptions {
    public static void main(String[] args) {

//        int d = area(2, -5); // code will stop working

/*        try {
            int d = area(2, -2);
            System.out.println(d);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } // catch will handle the exception and program will continue to work
        System.out.println("Code is working"); */

        /*try {
            catchCantHandleTheHeirOfItself();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        System.out.println(tryFinally());
    }

    public static void theMethod1() throws Throwable {
        throw new Throwable();
    }

    public static int area(int width, int height) throws IllegalArgumentException {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Arguments is not valid");
        }
        return width*height;
    }

    public static void catchCantHandleTheHeirOfItself() throws Exception {
        try {
            System.out.println("0");
            if (true) throw new Exception();
            System.out.println("2");
        } catch (RuntimeException e) {
            System.out.println("3");
        }
        System.out.println("4");
    }


    public static int tryFinally() {
        try {
            return 0;
        } finally {
            return 1; // return form finally section will earse return from try section
        }
    }

    public static void exception() throws /*Exception*/ Throwable {
        try {
            Throwable throwable = new Exception();
            throw throwable;
        } catch (Exception e) { // Throwable e
            e.fillInStackTrace();
        }
    }
}

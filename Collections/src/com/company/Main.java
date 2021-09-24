package com.company;

public class Main {

    public static void main(String[] args) {
//	    MapUse.notMain();
//        ImmutableArrayList<Integer> myList = new ImmutableArrayList<>();
//        for (int x = 0; x < 100; x++) {
//            myList.add(x);
//        }
//        myList.add(java.util.Optional.of(110).get(), 2);
//        myList.forEach(x -> System.out.println(x));

        MyList myList = new MyList();

        myList.push(1);
        myList.push(2);
        myList.push(3);
        myList.push(4);
        myList.push(5);
        myList.getList();
    }
}

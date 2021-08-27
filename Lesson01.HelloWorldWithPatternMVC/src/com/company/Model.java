package com.company;

public class Model {
    private String hello;
    private String world;

    public String getString() {
        return hello + " " + world;
    }

    public String getHello() {
        return hello;
    }
    public String getWorld() {
        return world;
    }
    public void setHello(String hello) {
        this.hello = hello;
    }
    public void setWorld(String world) {
        this.world = world;
    }

    public boolean getRightString(String string, String input) {
        String dataToBePrinted = (string.contains("hello")) ? "hello" : "world!";
        return dataToBePrinted.compareToIgnoreCase(input) == 0;
    }
}

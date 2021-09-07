package com.company.model;

public enum DBNoteBook {
    FIRST_USER ("Sasha", "login123"),
    SECOND_USER ("Tolya", "tolyatolya"),
    THIRD_USER ("Vasya", "theVasyyliy"),
    FOURTH_USER ("Kate", "katya111");

    private String userName;
    private String login;

    DBNoteBook(String userName, String login) {
        this.userName = userName;
        this.login = login;
    }

    public String userName() { return this.userName; }

    public String login() { return this.login; }
}

package com.company.model;

public class Model {
    private String firstName;
    private String login;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLogin() {
        return login;
    }

    private boolean isThereALogin(String login) {
        for (DBNoteBook user : DBNoteBook.values()) {
            if (user.login().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public void setLogin(String login) throws LoginIsSetException {
        if (!isThereALogin(login)) {
            this.login = login;
        } else {
            throw new LoginIsSetException("The login is already exist");
        }
    }
}

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

    /**
     * A method which checks if there is a such login in DB
     * @param login
     * @return true if login exists
     *         false if DB doesn't have a such login
     */

    private boolean isThereALogin(String login) {
        for (DBNoteBook user : DBNoteBook.values()) {
            if (user.login().equals(login)) {
                return true;
            }
        }
        return false;
    }

    /**
     * A method which sets login or throws exception if a login is in DB (call
     * @isThereLogin() method)
     * @param login
     * @throws LoginIsSetException
     */

    public void setLogin(String login) throws LoginIsSetException {
        if (!isThereALogin(login)) {
            this.login = login;
        } else {
            throw new LoginIsSetException("The login is already exist");
        }
    }
}

package org.teaching.essential.lecture6_inners_nestedes.additional_nadia.task2;

//Переписать предыдущее задание, используя локальный класс

public class User {

    private final String login;
    private final int password;

    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String createQuery() {

        class Query {

            public String printToLog() {
                return "The user login: " + login + "\n" +
                        "password: " + password + "\n" +
                        "Has sent request to system.";
            }

        }

        Query query = new Query();

        return query.printToLog();
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

}

package org.teaching.lecture6.additional_nadia.task1;

/*
Задание 1
- Создать класс User, содержащий private переменные login, password.
- Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(),
который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
- Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
 */

public class User {

    private final String login;
    private final int password;

    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    class Query {
        public String printToLog() {
            return "The user login: " + login + "\n" +
                    "password: " + password + "\n" +
                    "Has sent request to system.";
        }

    }

    public String createQuery() {
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

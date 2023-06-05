package org.teaching.lecture3.itvdn_tasks.task4;

/*
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
 */

public class FileRedactor {

    static final int KEY_PRO = 481215;
    static final int KEY_EXPERT = 1298656;

    public String versionSelection(int userKey) {
        if (userKey == KEY_PRO) {
            DocumentWorker proVersion = new ProDocumentWorker();
            return proVersion.editDocument() + System.lineSeparator() +
                    proVersion.saveDocument();
        } else if (userKey == KEY_EXPERT) {
            ProDocumentWorker expertVersion = new ExpertDocumentWorker();
            return expertVersion.saveDocument();
        } else {
            DocumentWorker freeVersion = new DocumentWorker();
            return freeVersion.openDocument() + System.lineSeparator() +
                    freeVersion.editDocument() + System.lineSeparator() +
                    freeVersion.saveDocument();
        }
    }
}

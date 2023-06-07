package org.teaching.lecture3.itvdn_tasks.task4;

/*
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
 */

public class FileRedactor {

    static final int PRO = 481215;
    static final int EXPERT = 1298656;

    private DocumentWorker version;

    public DocumentWorker documentFactory(int key){
        switch (key){
            case 123:
                 version = new DocumentWorker();
                 break;
            case PRO:
                 version = new ProDocumentWorker();
                 break;
            case EXPERT:
                 version = new ExpertDocumentWorker();
        }
        return version;
    }
}

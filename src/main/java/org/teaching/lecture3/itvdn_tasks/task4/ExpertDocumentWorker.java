package org.teaching.lecture3.itvdn_tasks.task4;

/*
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
"Документ сохранен в новом формате".
 */

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    public String saveDocument(){
        return "The document has been saved in new format";
    }
}

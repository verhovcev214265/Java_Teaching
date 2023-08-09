package org.teaching.lecture3_inheritance.itvdn_tasks.task4;

/*
Создайте производный класс ProDocumentWorker.
Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
доступно в версии Эксперт".
 */

public class ProDocumentWorker extends DocumentWorker{

    @Override
    public String editDocument(){
        return "The document has been edited";
    }

    @Override
    public String saveDocument(){
        return "The document has been saved in old format,saving in an another formats is available in the Expert version";
    }
}

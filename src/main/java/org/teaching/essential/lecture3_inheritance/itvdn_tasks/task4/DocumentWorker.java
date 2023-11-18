package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task4;

/*
Создайте класс DocumentWorker.
В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
 */

public class DocumentWorker {

    public String openDocument(){
        return "The document has been opened";
    }

    public String editDocument(){
        return "Document editing is available in the pro version";
    }

    public String saveDocument(){
        return "Document saving is available in the pro version";
    }
}

package org.teaching.lecture4_abstract_interfaces.itvdn.task1;

/*
Создайте класс AbstractHandler.
В теле класса создать методы void --> String <-- open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
 */

public abstract class Handler {

    abstract String open();

    abstract String create();

    abstract String change();

    abstract String save();
}

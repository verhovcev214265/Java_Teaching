package org.teaching.lecture4_abstract_interfaces.itvdn.task1;

public class DOC extends Handler {
    @Override
    String open() {
        return "DOC file has been opened";
    }

    @Override
    String create() {
        return "DOC file has been created";
    }

    @Override
    String change() {
        return "DOC file has been changed";
    }

    @Override
    String save() {
        return "DOC file has been saved";
    }
}

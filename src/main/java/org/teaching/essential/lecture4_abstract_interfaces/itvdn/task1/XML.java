package org.teaching.essential.lecture4_abstract_interfaces.itvdn.task1;

public class XML extends Handler {

    @Override
    String open() {
        return "XML file has been opened";
    }

    @Override
    String create() {
        return "XML file has been created";
    }

    @Override
    String change() {
        return "XML file has been changed";
    }

    @Override
    String save() {
        return "XML file has been saved";
    }
}

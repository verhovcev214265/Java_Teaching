package org.teaching.lecture4_abstract_interfaces.itvdn.task1;

public class TXT extends Handler {
    @Override
    String open() {
        return "TXT file has been opened";
    }

    @Override
    String create() {
        return "TXT file has been created";
    }

    @Override
    String change() {
        return "TXT file has been changed";
    }

    @Override
    String save() {
        return "TXT file has been saved";
    }
}

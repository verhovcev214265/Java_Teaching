package org.teaching.lecture3.itvdn_tasks.task2;

public class BadPupil extends Pupil{

    @Override
    public String study(){
        return "Bad study";
    }

    @Override
    public String read() {
        return "Bad read";
    }

    @Override
    public String write() {
        return "Bad write";
    }

    @Override
    public String relax() {
        return "Bad relax";
    }
}

package org.teaching.lecture3_inheritance.itvdn_tasks.task2;

public class GoodPupil extends Pupil {

    @Override
    public String study(){
        return "Good study";
    }

    @Override
    public String read() {
        return "Good read";
    }

    @Override
    public String write() {
        return "Good write";
    }

    @Override
    public String relax() {
        return "Good relax";
    }
}

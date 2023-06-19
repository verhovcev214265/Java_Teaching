package org.teaching.lecture4.itvdn.task2;

public class Player implements  Recording{

    @Override
    public String play() {
        return "Play.";
    }

    @Override
    public String pause() {
        return "Pause.";
    }

    @Override
    public String stop() {
        return "Stop.";
    }

    @Override
    public String record() {
        return "Record.";
    }
}

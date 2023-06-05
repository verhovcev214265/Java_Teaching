package org.teaching.lecture3.itvdn_tasks.task1;

import org.teaching.ITaskConstants;

public class Xerox extends Printer{

    @Override
    public String print(String value){
        return ITaskConstants.IColors.YELLOW;
    }
}

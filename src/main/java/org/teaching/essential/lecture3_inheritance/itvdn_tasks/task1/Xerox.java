package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task1;

import org.teaching.ITaskConstants;

public class Xerox extends Printer{

    @Override
    public String print(String value){
        return ITaskConstants.IColors.YELLOW;
    }
}

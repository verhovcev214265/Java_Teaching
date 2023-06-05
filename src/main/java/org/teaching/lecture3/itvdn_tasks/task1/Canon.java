package org.teaching.lecture3.itvdn_tasks.task1;

import org.teaching.ITaskConstants;

public class Canon extends Printer{

    @Override
    public String print(String value){
        return ITaskConstants.IColors.BLUE;
    }
}

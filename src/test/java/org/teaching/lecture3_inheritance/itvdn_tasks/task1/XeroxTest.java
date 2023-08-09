package org.teaching.lecture3_inheritance.itvdn_tasks.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.ITaskConstants;

public class XeroxTest {

    private Printer printer;
    private Xerox xerox;

    @Before
    public void setUp(){
        printer = new Xerox();
        xerox = (Xerox) printer;
    }

    @Test
    public void realizePrint_withYellowColor_UpCast(){
        String value = "Ukraine";

        Assert.assertEquals(ITaskConstants.IColors.YELLOW, printer.print(value));
    }

    @Test
    public void realizePrint_withYellowColor_DownCast(){
        String value = "Ukraine";

        Assert.assertEquals(ITaskConstants.IColors.YELLOW, xerox.print(value));
    }
}

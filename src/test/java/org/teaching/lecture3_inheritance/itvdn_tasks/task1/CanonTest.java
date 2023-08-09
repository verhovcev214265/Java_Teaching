package org.teaching.lecture3_inheritance.itvdn_tasks.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.ITaskConstants;

public class CanonTest {

    private Printer printer;
    private Canon canon;

    @Before
    public void setUp(){
        printer = new Canon();
        canon = (Canon) printer;
    }

    @Test
    public void realizePrint_withBlueColor_UpCast(){
        String value = "Ukraine";

        Assert.assertEquals(ITaskConstants.IColors.BLUE, printer.print(value));
    }

    @Test
    public void realizePrint_withBlueColor_DownCast(){
        String value = "Ukraine";

        Assert.assertEquals(ITaskConstants.IColors.BLUE, canon.print(value));
    }
}

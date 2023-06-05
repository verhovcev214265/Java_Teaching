package org.teaching.lecture3.itvdn_tasks.task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileRedactorTest {

    private FileRedactor fileRedactor;

    @Before
    public void setUp(){
        fileRedactor = new FileRedactor();
    }

    @Test
    public void checkKey_VersionPro(){
        Assert.assertEquals(FileRedactor.KEY_PRO, 481215);
    }

    @Test
    public void checkKey_VersionExpert(){
        Assert.assertEquals(FileRedactor.KEY_EXPERT, 1298656);
    }

    @Test
    public void shouldRun_FreeVersion(){
        Assert.assertEquals("The document has been opened" + System.lineSeparator() +
                "Document editing is available in the pro version" + System.lineSeparator() +
                "Document saving is available in the pro version",
                fileRedactor.versionSelection(1234)
        );
    }

    @Test
    public void shouldRun_ProVersion(){
        Assert.assertEquals("The document has been edited" + System.lineSeparator() +
                "The document has been saved in old format,saving in an another formats is available in the Expert version",
                fileRedactor.versionSelection(FileRedactor.KEY_PRO)
        );
    }

    @Test
    public void shouldRun_ExpertVersion(){
        Assert.assertEquals("The document has been saved in new format",
                fileRedactor.versionSelection(FileRedactor.KEY_EXPERT)
        );
    }
}

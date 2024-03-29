package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task4;

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
        Assert.assertEquals(FileRedactor.PRO, 481215);
    }

    @Test
    public void checkKey_VersionExpert(){
        Assert.assertEquals(FileRedactor.EXPERT, 1298656);
    }

    @Test
    public void shouldRun_FreeVersion(){
        Assert.assertEquals("The document has been opened",
                fileRedactor.documentFactory(123).openDocument()
        );

        Assert.assertEquals("Document editing is available in the pro version",
                fileRedactor.documentFactory(123).editDocument()
        );

        Assert.assertEquals("Document saving is available in the pro version",
                fileRedactor.documentFactory(123).saveDocument()
        );
    }

    @Test
    public void shouldRun_ProVersion(){
        Assert.assertEquals("The document has been edited",
                fileRedactor.documentFactory(FileRedactor.PRO).editDocument()
        );

        Assert.assertEquals("The document has been saved in old format,saving in an another formats is available in the Expert version",
                fileRedactor.documentFactory(FileRedactor.PRO).saveDocument()
        );
    }

    @Test
    public void shouldRun_ExpertVersion(){
        Assert.assertEquals("The document has been saved in new format",
                fileRedactor.documentFactory(FileRedactor.EXPERT).saveDocument()
        );
    }
}

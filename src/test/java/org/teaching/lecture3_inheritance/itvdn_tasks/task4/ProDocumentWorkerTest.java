package org.teaching.lecture3_inheritance.itvdn_tasks.task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProDocumentWorkerTest {

    private ProDocumentWorker proDocumentWorker;

    @Before
    public void setUp(){
        proDocumentWorker = new ProDocumentWorker();
    }


    @Test
    public void checkEditDocument(){
        Assert.assertEquals("The document has been edited", proDocumentWorker.editDocument());
    }

    @Test
    public void checkSaveDocument(){
        Assert.assertEquals(
                "The document has been saved in old format,saving in an another formats is available in the Expert version",
                proDocumentWorker.saveDocument()
        );
    }
}

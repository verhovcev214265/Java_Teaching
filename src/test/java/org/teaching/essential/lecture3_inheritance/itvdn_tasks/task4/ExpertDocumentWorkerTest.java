package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExpertDocumentWorkerTest {

    private ExpertDocumentWorker expertDocumentWorker;

    @Before
    public void settUp(){
        expertDocumentWorker = new ExpertDocumentWorker();
    }

    @Test
    public void checkSaveDocument(){
        Assert.assertEquals("The document has been saved in new format", expertDocumentWorker.saveDocument());
    }
}

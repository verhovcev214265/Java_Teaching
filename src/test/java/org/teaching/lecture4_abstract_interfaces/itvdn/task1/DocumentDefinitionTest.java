package org.teaching.lecture4_abstract_interfaces.itvdn.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DocumentDefinitionTest {

    private DocumentDefinition documentDefinition;

    @Before
    public void setUp(){
        documentDefinition = new DocumentDefinition();
    }

    @Test
    public void shouldRunFormat_XML(){

        Assert.assertEquals(
                "XML file has been opened", documentDefinition.formatFactory(DocumentDefinition.XML).open()
        );

        Assert.assertEquals(
                "XML file has been created", documentDefinition.formatFactory(DocumentDefinition.XML).create()
        );

        Assert.assertEquals(
                "XML file has been changed", documentDefinition.formatFactory(DocumentDefinition.XML).change()
        );

        Assert.assertEquals(
                "XML file has been saved", documentDefinition.formatFactory(DocumentDefinition.XML).save()
        );
    }

    @Test
    public void shouldRunFormat_DOC(){

        Assert.assertEquals(
                "DOC file has been opened", documentDefinition.formatFactory(DocumentDefinition.DOC).open()
        );

        Assert.assertEquals(
                "DOC file has been created", documentDefinition.formatFactory(DocumentDefinition.DOC).create()
        );

        Assert.assertEquals(
                "DOC file has been changed", documentDefinition.formatFactory(DocumentDefinition.DOC).change()
        );

        Assert.assertEquals(
                "DOC file has been saved", documentDefinition.formatFactory(DocumentDefinition.DOC).save()
        );
    }

    @Test
    public void shouldRunFormat_TXT(){

        Assert.assertEquals(
                "TXT file has been opened", documentDefinition.formatFactory(DocumentDefinition.TXT).open()
        );

        Assert.assertEquals(
                "TXT file has been created", documentDefinition.formatFactory(DocumentDefinition.TXT).create()
        );

        Assert.assertEquals(
                "TXT file has been changed", documentDefinition.formatFactory(DocumentDefinition.TXT).change()
        );

        Assert.assertEquals(
                "TXT file has been saved", documentDefinition.formatFactory(DocumentDefinition.TXT).save()
        );
    }
}

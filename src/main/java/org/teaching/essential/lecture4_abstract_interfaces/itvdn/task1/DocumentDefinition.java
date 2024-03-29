package org.teaching.essential.lecture4_abstract_interfaces.itvdn.task1;

/*
Написать программу, которая будет выполнять определение документа и для каждого формата должны
быть методы открытия, создания, редактирования, сохранения определенного формата документа.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocumentDefinition {

    private static final Logger logger = LoggerFactory.getLogger(DocumentDefinition.class);

    static final String XML = "XML";
    static final String DOC = "DOC";
    static final String TXT = "TXT";

    public Handler formatFactory(String format) {

        switch (format) {
            case XML:
                return new XML();
            case DOC:
                return new DOC();
            case TXT:
                return new TXT();
            default:
                logger.error("This format isn't supported.");
                throw new IllegalArgumentException("This format isn't supported.");
        }
    }
}

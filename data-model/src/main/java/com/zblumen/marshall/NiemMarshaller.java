package com.zblumen.marshall;

import gov.niem.utility.structures.ObjectType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class NiemMarshaller {
    public static void marshalToXml(ObjectType objectType, String outputFile) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(objectType.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        OutputStream os = new FileOutputStream(outputFile);
        jaxbMarshaller.marshal( objectType, os );
    }
}

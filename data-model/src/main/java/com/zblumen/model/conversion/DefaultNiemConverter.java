package com.zblumen.model.conversion;

import gov.niem.adapters.xs.DateTime;
import gov.niem.adapters.xs.ObjectFactory;
import gov.niem.core.DateType;
import gov.niem.core.TextType;
import lombok.AllArgsConstructor;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.util.Date;
import java.util.GregorianCalendar;

@AllArgsConstructor
public abstract class DefaultNiemConverter {
    private final ObjectFactory xsObjectFactory = new ObjectFactory();
    protected final gov.niem.core.ObjectFactory ncObjectFactory = new gov.niem.core.ObjectFactory();

    protected gov.niem.adapters.xs.String convertString(String x){
        gov.niem.adapters.xs.String result = xsObjectFactory.createString();
        result.setValue(x);
        return result;
    }

    protected TextType convertTextType(String x){
        TextType result = ncObjectFactory.createTextType();
        result.setValue(x);
        return result;
    }

    protected DateType convertDateType(Instant x){
        XMLGregorianCalendar xmlCal;
        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTimeInMillis(x.toEpochMilli());
            xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Unable to convert DateTime", e);
        }
        DateTime dateRepresentation = xsObjectFactory.createDateTime();
        dateRepresentation.setValue(xmlCal);
        DateType result = ncObjectFactory.createDateType();
        result.getDateRepresentation().add(ncObjectFactory.createDateTime(dateRepresentation));
        return result;
    }
}

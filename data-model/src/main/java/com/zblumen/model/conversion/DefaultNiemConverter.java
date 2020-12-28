package com.zblumen.model.conversion;

import gov.niem.adapters.xs.ObjectFactory;
import gov.niem.core.TextType;
import lombok.AllArgsConstructor;

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
}

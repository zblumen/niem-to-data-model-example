package com.zblumen.model.domain.subject;

import com.zblumen.model.conversion.Niemable;
import com.zblumen.model.domain.item.binary.Image;
import gov.niem.core.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends Subject implements Niemable<PersonType> {

    Instant birthDate;

    String descriptionText;

    String fullName;
    String givenName;
    String surname;
    String middleName;

    String email;
    String userName;
    String address;

    String gender;

    Set<String> nationality;

    Set<String> identifications;

    Set<Image> images;

    private PersonNameType convertPersonName(){
        PersonNameType result = ncObjectFactory.createPersonNameType();
        return result;
    }

    @Override
    public PersonType makeNiemType() {
        return null;
    }
}

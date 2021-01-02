package com.zblumen.model.domain.subject;

import com.zblumen.model.conversion.Niemable;
import gov.niem.core.GenericEntityType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GenericSubject extends Subject implements Niemable<GenericEntityType> {

    private String name;
    private String description;

    @Override
    public GenericEntityType makeNiemType() {
        return null;
    }
}

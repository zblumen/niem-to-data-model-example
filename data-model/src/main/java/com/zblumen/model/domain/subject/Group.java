package com.zblumen.model.domain.subject;

import com.zblumen.model.conversion.Niemable;
import gov.niem.core.GenericEntityType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Group extends Subject implements Niemable<GenericEntityType> {
    @Override
    public GenericEntityType makeNiemType() {
        return null;
    }
}

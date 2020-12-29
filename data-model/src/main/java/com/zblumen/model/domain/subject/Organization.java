package com.zblumen.model.domain.subject;

import com.zblumen.model.conversion.Niemable;
import gov.niem.core.OrganizationType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Organization extends Subject implements Niemable<OrganizationType> {
    @Override
    public OrganizationType makeNiemType() {
        return null;
    }
}

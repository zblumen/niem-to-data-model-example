package com.zblumen.model.domain.item.binary;

import com.zblumen.model.conversion.Niemable;
import gov.niem.core.BinaryType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BinaryFile extends BinaryItem implements Niemable<BinaryType> {
    @Override
    public BinaryType makeNiemType() {
        return null;
    }
}

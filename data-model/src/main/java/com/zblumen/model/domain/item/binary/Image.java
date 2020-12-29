package com.zblumen.model.domain.item.binary;

import com.zblumen.model.conversion.Niemable;
import gov.niem.core.ImageType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Image extends BinaryItem implements Niemable<ImageType> {

    @Override
    public ImageType makeNiemType() {
        return null;
    }
}

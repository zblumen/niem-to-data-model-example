package com.zblumen.model.domain.item.document;

import com.zblumen.model.conversion.Niemable;
import com.zblumen.model.domain.item.Item;
import gov.niem.core.DocumentType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Document extends Item implements Niemable<DocumentType> {
    @Override
    public DocumentType makeNiemType() {
        return null;
    }
}

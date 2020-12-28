package com.zblumen.model.conversion;

import gov.niem.utility.structures.ObjectType;

public interface Niemable<T extends ObjectType> {
     T makeNiemObject();
}

package com.zblumen.model.domain;

import com.zblumen.model.conversion.NiemTypeConverter;
import lombok.*;

@Data
public abstract class Thing extends NiemTypeConverter {
    protected String id;
}

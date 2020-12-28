package com.zblumen.model.domain.event;

import com.zblumen.model.domain.Thing;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Event extends Thing {
    protected Date eventDate;
    protected String referenceId;
}

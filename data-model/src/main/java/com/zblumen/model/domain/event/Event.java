package com.zblumen.model.domain.event;

import com.zblumen.model.domain.Thing;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Event extends Thing {
    protected Instant eventDate;
    protected String referenceId;
}

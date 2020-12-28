package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.domain.subject.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonMessage extends Message{
    private Person sender;
}

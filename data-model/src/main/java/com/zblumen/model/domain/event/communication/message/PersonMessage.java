package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.conversion.Niemable;
import com.zblumen.model.domain.subject.Person;
import gov.niem.core.MessageType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonMessage extends Message implements Niemable<MessageType> {
    private Person sender;

    @Override
    public MessageType makeNiemType() {
        MessageType result = makeBaseNiemType();
        result.getMessageSenderAbstract().add(this.ncObjectFactory.createPerson(this.sender.makeNiemType()));
        return result;
    }
}

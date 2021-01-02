package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.conversion.Niemable;
import com.zblumen.model.domain.subject.GenericSubject;
import gov.niem.core.MessageType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GenericMessage extends Message implements Niemable<MessageType> {

    private GenericSubject sender;

    @Override
    public MessageType makeNiemType() {
        MessageType result = makeBaseNiemType();
        result.getMessageSenderAbstract().add(this.ncObjectFactory.createGenericEntity(this.sender.makeNiemType()));
        return result;
    }
}

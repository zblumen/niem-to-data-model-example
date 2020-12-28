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
    public MessageType makeNiemObject() {
        MessageType result = ncObjectFactory.createMessageType();
        result.setId(this.id);

        if(this.referenceId !=null){
            result.getMessageReferenceID().add(convertString(this.referenceId));
        }
        if(this.messageHeaderText != null){
            result.getMessageSubjectText().add(convertTextType(this.messageHeaderText));
        }
        if(this.messageBodyText != null){
            result.getMessageText().add(convertTextType(this.messageBodyText));
        }
        return result;
    }
}

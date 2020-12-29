package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.conversion.Niemable;
import com.zblumen.model.domain.subject.Organization;
import gov.niem.core.MessageType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrganizationMessage extends Message implements Niemable<MessageType> {
    private Organization sender;

    @Override
    public MessageType makeNiemType() {
        MessageType result = makeBaseNiemType();
        result.getMessageSenderAbstract().add(this.ncObjectFactory.createOrganization(this.sender.makeNiemType()));
        return result;
    }
}

package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.conversion.Niemable;
import com.zblumen.model.domain.event.communication.Communication;
import com.zblumen.model.domain.item.binary.BinaryFile;
import com.zblumen.model.domain.item.binary.Image;
import com.zblumen.model.domain.item.document.Document;
import gov.niem.core.MessageType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Message extends Communication {
    protected String messageBodyText;
    protected String messageHeaderText;
    protected List<Image> messageImageAttachments;
    protected List<BinaryFile> messageBinaryFileAttachments;
    protected List<Document> messageDocumentAttachments;

    protected MessageType makeBaseNiemType() {
        MessageType result = ncObjectFactory.createMessageType();

        //required
        result.setId(this.id);
        result.getMessageSentDate().add(convertDateType(this.eventDate));

        if(this.referenceId !=null){
            result.getMessageReferenceID().add(convertString(this.referenceId));
        }
        if(this.personRecipients != null){
            this.personRecipients.forEach( person -> {
                result.getMessageRecipientAbstract()
                        .add(this.ncObjectFactory.createPerson(person.makeNiemType()));
            });
        }

        if(this.organizationRecipients != null){
            this.organizationRecipients.forEach( organization -> {
                result.getMessageRecipientAbstract()
                        .add(this.ncObjectFactory.createOrganization(organization.makeNiemType()));
            });
        }

        if(this.genericRecipients != null){
            this.genericRecipients.forEach( genericSubject -> {
                result.getMessageRecipientAbstract()
                        .add(this.ncObjectFactory.createGenericEntity(genericSubject.makeNiemType()));
            });
        }

        if(this.isGroupCommunication && communicationGroup != null){
            result.getMetadata().add(communicationGroup);
        }

        if(this.messageHeaderText != null){
            result.getMessageSubjectText().add(convertTextType(this.messageHeaderText));
        }

        if(this.messageBodyText != null){
            result.getMessageText().add(convertTextType(this.messageBodyText));
        }

        if(this.messageImageAttachments != null){
            this.messageImageAttachments.forEach(attachment -> {
                result.getMessageAttachmentAbstract()
                        .add(this.ncObjectFactory.createMessageAttachmentImage(attachment.makeNiemType()));
            });
        }

        if(this.messageDocumentAttachments != null){
            this.messageDocumentAttachments.forEach(attachment -> {
                result.getMessageAttachmentAbstract()
                        .add(this.ncObjectFactory.createMessageAttachmentDocument(attachment.makeNiemType()));
            });
        }

        if(this.messageBinaryFileAttachments != null){
            this.messageBinaryFileAttachments.forEach(attachment -> {
                result.getMessageAttachmentAbstract()
                        .add(this.ncObjectFactory.createMessageAttachmentBinary(attachment.makeNiemType()));
            });
        }


        return result;
    }
}

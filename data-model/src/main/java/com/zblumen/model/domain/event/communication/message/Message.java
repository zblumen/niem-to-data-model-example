package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.domain.event.communication.Communication;
import com.zblumen.model.domain.item.binary.BinaryFile;
import com.zblumen.model.domain.item.binary.Image;
import com.zblumen.model.domain.item.document.Document;
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
}

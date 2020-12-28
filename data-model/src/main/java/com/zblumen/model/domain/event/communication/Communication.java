package com.zblumen.model.domain.event.communication;

import com.zblumen.model.domain.event.Event;
import com.zblumen.model.domain.subject.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Communication extends Event {

    protected Subject sender;
    protected List<Person> personRecipients;
    protected List<Organization> organizationRecipients;
    protected List<GenericSubject> genericRecipients;
    protected Boolean isGroupCommunication;
    protected Group CommunicationGroup;

}
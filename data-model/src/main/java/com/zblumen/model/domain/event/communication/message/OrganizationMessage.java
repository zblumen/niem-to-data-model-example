package com.zblumen.model.domain.event.communication.message;

import com.zblumen.model.domain.subject.Organization;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrganizationMessage extends Message{
    private Organization sender;
}

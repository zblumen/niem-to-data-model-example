package com.zblumen.model.domain.event.communication.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GenericSenderMessage extends Message{
    private GenericSenderMessage sender;
}

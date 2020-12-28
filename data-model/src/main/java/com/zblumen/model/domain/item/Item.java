package com.zblumen.model.domain.item;

import com.zblumen.model.domain.Thing;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Item extends Thing {
}

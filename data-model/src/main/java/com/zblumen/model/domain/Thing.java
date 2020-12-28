package com.zblumen.model.domain;

import com.zblumen.model.conversion.DefaultNiemConverter;

import lombok.*;

@Data
public abstract class Thing extends DefaultNiemConverter {
    protected String id;
}

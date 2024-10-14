package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

/**
 * SMP execution type
 */
@Getter
public enum SmpType {
    NONE("None"),
    CANCEL_MAKER("CancelMaker"),
    CANCEL_TAKER("CancelTaker"),
    CANCEL_BOTH("CancelBoth");

    private final String description;

    SmpType(String description) {
        this.description = description;
    }

    @JsonCreator
    public static SmpType fromString(String value) {
        for (SmpType type : SmpType.values()) {
            if(type.description.equals(value)) {
                return type;
            }
        }
        return null;
    }

}

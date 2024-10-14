package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum OrderFilter {
    ORDER("Order"),
    TPSL_ORDER("tpslOrder"),
    STOP_ORDER("StopOrder");

    private final String orderFilterType;

    OrderFilter(String orderFilterType) {
        this.orderFilterType = orderFilterType;
    }

    @JsonCreator
    public static OrderFilter fromString(String value) {
        for (OrderFilter type : OrderFilter.values()) {
            if(type.orderFilterType.equals(value)) {
                return type;
            }
        }
        return null;
    }

}

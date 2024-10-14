package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum StopOrderType {
    TAKE_PROFIT("TakeProfit"),
    STOP_LOSS("StopLoss"),
    TRAILING_STOP("TrailingStop"),
    STOP("Stop"),
    PARTIAL_TAKE_PROFIT("PartialTakeProfit"),
    PARTIAL_STOP_LOSS("PartialStopLoss"),
    TPSL_ORDER("tpslOrder"),
    MM_RATE_CLOSE("MmRateClose");

    private final String description;

    StopOrderType(String description) {
        this.description = description;
    }

    @JsonCreator
    public static StopOrderType fromString(String value) {
        for (StopOrderType stopOrderType : StopOrderType.values()) {
            if(stopOrderType.description.equals(value)) {
                return stopOrderType;
            }
        }
        return null;
    }
}

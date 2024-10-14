package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum Side {
    BUY("Buy"),
    SELL("Sell");

    private final String transactionSide;

    Side(String transactionSide) {
        this.transactionSide = transactionSide;
    }

    @JsonCreator
    public static Side fromString(String value) {
        for (Side type : Side.values()) {
            if(type.transactionSide.equals(value)) {
                return type;
            }
        }
        return null;
    }

}


package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum TimeInForce {
    GOOD_TILL_CANCEL("GTC"),
    IMMEDIATE_OR_CANCEL("IOC"),
    FILL_OR_KILL("FOK"),
    POST_ONLY("PostOnly");

    private final String description;

    TimeInForce(String description) {
        this.description = description;
    }

    @JsonCreator
    public static TimeInForce fromString(String value) {
        for (TimeInForce type : TimeInForce.values()) {
            if(type.description.equals(value)) {
                return type;
            }
        }
        return null;
    }

}
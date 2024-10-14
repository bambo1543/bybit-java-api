package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum CancelType {

    CANCEL_BY_USER("CancelByUser"),
    CANCEL_BY_REDUCE_ONLY("CancelByReduceOnly"),
    CANCEL_BY_PREPARE_LIQ("CancelByPrepareLiq"),
    CANCEL_ALL_BEFORE_LIQ("CancelAllBeforeLiq"), // Cancelled due to liquidation
    CANCEL_BY_PREPARE_ADL("CancelByPrepareAdl"),
    CANCEL_ALL_BEFORE_ADL("CancelAllBeforeAdl"), // Cancelled due to ADL
    CANCEL_BY_ADMIN("CancelByAdmin"),
    CANCEL_BY_SETTLE("CancelBySettle"),
    CANCEL_BY_TP_SL_TS_CLEAR("CancelByTpSlTsClear"),
    CANCEL_BY_PZ_SIDE_CH("CancelByPzSideCh"),
    CANCEL_BY_SMP("CancelBySmp"),
    UNKNOWN("UNKNOWN");

    private final String cancelReason;

    CancelType(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    @JsonCreator
    public static CancelType fromString(String value) {
        for (CancelType type : CancelType.values()) {
            if(type.cancelReason.equals(value)) {
                return type;
            }
        }
        return null;
    }

}

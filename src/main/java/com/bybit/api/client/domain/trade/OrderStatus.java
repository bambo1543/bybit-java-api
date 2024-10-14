package com.bybit.api.client.domain.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Status of a submitted order.
 *
 * //    open status
 * //
 * //    New order has been placed successfully
 * //    PartiallyFilled
 * //    Untriggered Conditional orders are created
 * //
 * //    closed status
 * //
 * //    Rejected
 * //    PartiallyFilledCanceled Only spot has this order status
 * //    Filled
 * //    Cancelled In derivatives, orders with this status may have an executed qty
 * //    Triggered instantaneous state for conditional orders from Untriggered to New
 * //    Deactivated UTA: Spot tp/sl order, conditional order, OCO order are cancelled before they are triggered
 */
@Getter
public enum OrderStatus {
    CREATED("Created", false),
    NEW("New", false),
    REJECTED("Rejected", true),

    PARTIALLY_FILLED("PartiallyFilled", true),
    PARTIALLY_FILLED_CANCELED("PartiallyFilledCanceled", true),
    FILLED("Filled", true),
    CANCELLED("Cancelled", true),
    TRIGGERED("Triggered", true),
    DEACTIVATED("Deactivated", true);

    private final String description;
    private final boolean closed;

    OrderStatus(String description, boolean closed) {
        this.description = description;
        this.closed = closed;
    }

    @JsonCreator
    public static OrderStatus fromString(String value) {
        for (OrderStatus type : OrderStatus.values()) {
            if(type.description.equals(value)) {
                return type;
            }
        }
        return null;
    }

}
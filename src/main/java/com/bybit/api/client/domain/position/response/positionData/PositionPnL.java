package com.bybit.api.client.domain.position.response.positionData;

import com.bybit.api.client.domain.TradeOrderType;
import com.bybit.api.client.domain.trade.PositionIdx;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionPnL extends AbstractPositionData {
    private TradeOrderType orderType;
    private String orderId;
    private String closedPnl;
    private String avgEntryPrice;
    private String qty;
    private String cumEntryValue;
    private String orderPrice;
    private String closedSize;
    private String avgExitPrice;
    private String execType;
    private String fillCount;
    private String cumExitValue;
}

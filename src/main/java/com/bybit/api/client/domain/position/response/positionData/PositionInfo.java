package com.bybit.api.client.domain.position.response.positionData;

import com.bybit.api.client.domain.trade.PositionIdx;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionInfo extends AbstractPositionData {
    private Integer autoAddMargin;
    private String avgPrice;
    private String liqPrice;
    private String riskLimitValue;
    private String takeProfit;
    private String positionValue;
    private Boolean isReduceOnly;
    private String tpslMode;
    private Integer riskId;
    private String trailingStop;
    private String unrealisedPnl;
    private String markPrice;
    private Integer adlRankIndicator;
    private String cumRealisedPnl;
    private String positionMM;
    private PositionIdx positionIdx;
    private String positionIM;
    private Long seq;
    private String bustPrice;
    private String positionBalance;
    private String leverageSysUpdatedTime;
    private String curRealisedPnl;
    private String size;
    private String positionStatus;
    private String mmrSysUpdatedTime;
    private String stopLoss;
    private Integer tradeMode;
    private String sessionAvgPrice;
}

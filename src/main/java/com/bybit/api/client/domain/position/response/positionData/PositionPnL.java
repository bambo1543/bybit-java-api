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

//         "symbol" -> "SEIUSDT"
//             "leverage" -> "7.69"
//             "autoAddMargin" -> {Integer@30534} 0
//            "avgPrice" -> "0"
//            "liqPrice" -> ""
//            "riskLimitValue" -> "200000"
//            "takeProfit" -> ""
//            "positionValue" -> ""
//            "isReduceOnly" -> {Boolean@35956} false
//            "tpslMode" -> "Full"
//            "riskId" -> {Integer@30530} 1
//            "trailingStop" -> "0"
//            "unrealisedPnl" -> ""
//            "markPrice" -> "0.26981"
//            "adlRankIndicator" -> {Integer@30534} 0
//            "cumRealisedPnl" -> "-255.52210734"
//            "positionMM" -> "0"
//            "createdTime" -> "1729005375743"
//            "positionIdx" -> {Integer@30530} 1 // 1 = Long 2 = Short
//            "positionIM" -> "0"
//            "seq" -> {Long@36531} 194240593182
//            "updatedTime" -> "1740468338472"
//            "side" -> ""
//            "bustPrice" -> ""
//            "positionBalance" -> "0"
//            "leverageSysUpdatedTime" -> ""
//            "curRealisedPnl" -> "0"
//            "size" -> "0"
//            "positionStatus" -> "Normal"
//            "mmrSysUpdatedTime" -> ""
//            "stopLoss" -> ""
//            "tradeMode" -> {Integer@30534} 0
//            "sessionAvgPrice" -> ""

    private Integer positionIdx; // 1 = Long 2 = Short
    private String curRealisedPnl;
    private String unrealisedPnl;
    private String cumRealisedPnl;
    private String markPrice;
    private String positionMM;
    private String createdTime;
    private String updatedTime;
    private String positionBalance;
    private String size;

}

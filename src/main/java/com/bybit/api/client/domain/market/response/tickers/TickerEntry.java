package com.bybit.api.client.domain.market.response.tickers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 *
 //    "symbol" -> "BTCUSDT"
 //            "lastPrice" -> "60883.60"
 //            "indexPrice" -> "60918.45"
 //            "markPrice" -> "60884.52"
 //            "prevPrice24h" -> "62135.00"
 //            "price24hPcnt" -> "-0.02014"
 //            "highPrice24h" -> "62390.00"
 //            "lowPrice24h" -> "60266.00"
 //            "prevPrice1h" -> "60950.00"
 //            "openInterest" -> "66102.245"
 //            "openInterestValue" -> "4024603457.75"
 //            "turnover24h" -> "7662866133.0644"
 //            "volume24h" -> "124987.2350"
 //            "fundingRate" -> "-0.00002808"
 //            "nextFundingTime" -> "1728576000000"
 //            "predictedDeliveryPrice" -> ""
 //            "basisRate" -> ""
 //            "deliveryFeeRate" -> ""
 //            "deliveryTime" -> "0"
 //            "ask1Size" -> "11.099"
 //            "bid1Price" -> "60883.60"
 //            "ask1Price" -> "60883.70"
 //            "bid1Size" -> "8.585"
 //            "basis" -> ""
 //            "preOpenPrice" -> ""
 //            "preQty" -> ""
 //            "curPreListingPhase" -> ""
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerEntry {

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("prevPrice1h")
    private String prevPrice1h;

    @JsonProperty("fundingRate")
    private String fundingRate;

    @JsonProperty("nextFundingTime")
    private String nextFundingTime;

    @JsonProperty("openInterest")
    private String openInterest;

    @JsonProperty("openInterestValue")
    private String openInterestValue;

    @JsonProperty("predictedDeliveryPrice")
    private String predictedDeliveryPrice;

    @JsonProperty("markPrice")
    private String markPrice;

    @JsonProperty("indexPrice")
    private String indexPrice;

    @JsonProperty("basisRate")
    private String basisRate;

    @JsonProperty("deliveryFeeRate")
    private String deliveryFeeRate;

    @JsonProperty("basis")
    private String basis;

    @JsonProperty("preOpenPrice")
    private String preOpenPrice;

    @JsonProperty("preQty")
    private String preQty;

    @JsonProperty("curPreListingPhase")
    private String curPreListingPhase;

    @JsonProperty("bid1Price")
    private String bid1Price;

    @JsonProperty("bid1Size")
    private String bid1Size;

    @JsonProperty("ask1Price")
    private String ask1Price;

    @JsonProperty("ask1Size")
    private String ask1Size;

    @JsonProperty("lastPrice")
    private String lastPrice;

    @JsonProperty("prevPrice24h")
    private String prevPrice24h;

    @JsonProperty("price24hPcnt")
    private String price24hPcnt;

    @JsonProperty("highPrice24h")
    private String highPrice24h;

    @JsonProperty("lowPrice24h")
    private String lowPrice24h;

    @JsonProperty("turnover24h")
    private String turnover24h;

    @JsonProperty("volume24h")
    private String volume24h;

}

package com.bybit.api.client.domain.market.response.instrumentInfo;

import lombok.Getter;

@Getter
public class LotSizeFilter {
    private String maxOrderQty;
    private String minOrderQty;
    private String qtyStep;
    private String postOnlyMaxOrderQty;
    private String maxMktOrderQty;
    private String minNotionalValue;
}

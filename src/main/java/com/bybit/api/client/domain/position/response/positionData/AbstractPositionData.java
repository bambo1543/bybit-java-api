package com.bybit.api.client.domain.position.response.positionData;

import com.bybit.api.client.domain.trade.Side;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractPositionData {

    private Side side;
    private String symbol;
    private String leverage;
    private String updatedTime;
    private String createdTime;

}

package com.bybit.api.client.domain.position.response.positionData;

import com.bybit.api.client.domain.CategoryType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonPropertyOrder()
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PositionPnLResult {
    private CategoryType category;
    @JsonProperty("list")
    private List<PositionPnL> list;
}

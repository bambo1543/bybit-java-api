package com.bybit.api.client.domain.account.response.walletData;

import com.bybit.api.client.domain.trade.response.OrderEntry;
import com.bybit.api.client.domain.websocket_message.private_channel.WalletData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonPropertyOrder()
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WalletDataResult {
    @JsonProperty("list")
    private List<WalletData> walletDataList;
}

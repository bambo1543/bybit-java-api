package com.bybit.api.examples.Websocket;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.constant.Util;
import com.bybit.api.client.service.BybitApiClientFactory;

import java.util.List;

public class WebsocketPrivateChannelExamples {
    public static void main(String[] args) {
        BybitApiClientFactory factory = BybitApiClientFactory.newInstance("8wYkmpLsMg10eNQyPm","Ouxc34myDnXvei54XsBZgoQzfGxO4bkr2Zsj",true);
        var client = factory.newWebsocketClient((message) -> System.out.println("Handle message :" + message), true);

        // Position
        // client.getOrderBookStream(List.of("position.linear"), BybitApiConfig.V5_PRIVATE);

        // Order
        client.getPrivateChannelStream(List.of("order"), BybitApiConfig.V5_PRIVATE);
    }
}

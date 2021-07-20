package com.plancarrera.jm.ticketsservice.model.web_service;

import lombok.Builder;

@Builder
public class RequestParameterPriceFood {

    private String type;
    private int days;
    private long pricePerDay;
}

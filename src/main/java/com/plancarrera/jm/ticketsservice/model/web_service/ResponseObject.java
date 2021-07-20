package com.plancarrera.jm.ticketsservice.model.web_service;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResponseObject {

    private int statusCode;
    private String Message;
}

package com.plancarrera.jm.ticketsservice.service;

import com.plancarrera.jm.ticketsservice.model.web_service.RequestParameterPriceFood;
import com.plancarrera.jm.ticketsservice.model.web_service.ResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TicketService {


    public Mono<ResponseObject> registerStandardPrice(RequestParameterPriceFood request) {
        return Mono.just(
                ResponseObject.builder()
                        .statusCode(HttpStatus.OK.value())
                        .Message("Registro realizado satisfactoriamente")
                        .build()
                );
    }
}

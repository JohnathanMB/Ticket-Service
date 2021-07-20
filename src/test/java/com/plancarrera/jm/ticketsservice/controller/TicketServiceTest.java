package com.plancarrera.jm.ticketsservice.controller;

import com.plancarrera.jm.ticketsservice.model.web_service.RequestParameterPriceFood;
import com.plancarrera.jm.ticketsservice.model.web_service.ResponseObject;
import com.plancarrera.jm.ticketsservice.service.TicketService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TicketServiceTest {

    @InjectMocks
    private TicketController ticketController;

    @Mock
    private TicketService ticketService;

    private ResponseObject responseObjectExpected;
    private RequestParameterPriceFood request;

    @BeforeEach
    void init(){
        responseObjectExpected = ResponseObject.builder()
                .statusCode(HttpStatus.OK.value())
                .Message("Registro realizado satisfactoriamente")
                .build();

        request = RequestParameterPriceFood.builder()
                .type("BREAKFAST")
                .days(15)
                .pricePerDay(6500)
                .build();

        when(ticketService.registerStandardPrice(any())).thenReturn(Mono.just(responseObjectExpected));
    }

    @Test
    void registerStandarPrice(){
        Mono<ResponseObject> monoResponse = ticketController.registerStandardPrice(request);

        StepVerifier.create(monoResponse)
                .expectNext(responseObjectExpected)
                .expectComplete()
                .verify();
    }

}
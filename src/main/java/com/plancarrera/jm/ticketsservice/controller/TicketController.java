package com.plancarrera.jm.ticketsservice.controller;

import com.plancarrera.jm.ticketsservice.model.web_service.RequestParameterPriceFood;
import com.plancarrera.jm.ticketsservice.model.web_service.ResponseObject;
import com.plancarrera.jm.ticketsservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/parameter")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/standard-price")
    public Mono<ResponseObject> registerStandardPrice(@RequestBody RequestParameterPriceFood request) {
        return ticketService.registerStandardPrice(request);
    }
}

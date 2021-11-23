package com.picpay.demo.springprofile.restapi;

import com.picpay.demo.springprofile.service.ResponseGetter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final ResponseGetter responseGetter;

    @GetMapping
    public Response get() {
        return Response.builder().message(responseGetter.get()).build();
    }
}

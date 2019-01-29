package com.example.restserverreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetTelloRequest;
import io.spring.guides.gs_producing_web_service.GetTelloResponse;

@Endpoint
public class TelloEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private TelloRepository telloRepository;

    @Autowired
    public TelloEndpoint(TelloRepository telloRepository) {
        this.telloRepository = telloRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTelloRequest")
    @ResponsePayload
    public GetTelloResponse getTello(@RequestPayload GetTelloRequest request) {
        GetTelloResponse response = new GetTelloResponse();
        response.setTello(telloRepository.findTello(request.getName()));

        return response;
    }
}

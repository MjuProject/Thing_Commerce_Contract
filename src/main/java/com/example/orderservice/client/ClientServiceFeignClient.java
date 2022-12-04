package com.example.orderservice.client;

import com.example.orderservice.dto.ApiResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("client-service")
public interface ClientServiceFeignClient {

    @GetMapping("/clients/{clientIndex}")
    public ApiResponseDto<ClientDto> getClient(@PathVariable("clientIndex") int clientIndex);
}

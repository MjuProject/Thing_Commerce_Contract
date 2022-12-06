package com.thing.contract.client;

import com.thing.contract.dto.ApiResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("client-service")
public interface ClientServiceFeignClient {

    @GetMapping("/clients/{clientIndex}")
    public ApiResponseDto<ClientDto> getClient(@PathVariable("clientIndex") int clientIndex);
}

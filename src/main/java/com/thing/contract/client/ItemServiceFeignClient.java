package com.thing.contract.client;

import com.thing.contract.dto.ApiResponseDto;
import com.thing.contract.dto.ItemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("item-service")
public interface ItemServiceFeignClient {

    @GetMapping("/items/{itemId}")
    public ApiResponseDto<ItemDto> getItem(@PathVariable("itemId")int itemId);
}

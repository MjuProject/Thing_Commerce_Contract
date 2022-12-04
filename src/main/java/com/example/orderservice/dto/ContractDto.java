package com.example.orderservice.dto;

import com.example.orderservice.client.ClientDto;
import com.example.orderservice.client.ItemDto;
import lombok.Data;

import java.util.Date;

@Data
public class ContractDto {
    private long id;
    private Date createAt;

    private ClientDto client;
    private ItemDto item;
}

package com.thing.contract.dto;

import com.thing.contract.client.ClientDto;
import com.thing.contract.client.ItemDto;
import lombok.Data;

import java.util.Date;

@Data
public class ContractDto {
    private long id;
    private Date createAt;

    private ClientDto client;
    private ItemDto item;
}

package com.thing.contract.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ContractDto {
    private long id;
    private Date createAt;

    private ClientDto client;
    private ItemDto item;
}

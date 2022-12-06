package com.thing.contract.client;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ItemDto {

    private ClientDto ownerInfo;
    private Item item;
    private Long basketCount;
    private Boolean isLike;

    public static ItemDto from(ClientDto clientInfoDTO, Item item, Long basketCount, Boolean isLike){
        return new ItemDto(
                clientInfoDTO,
                item,
                basketCount,
                isLike
        );
    }
}
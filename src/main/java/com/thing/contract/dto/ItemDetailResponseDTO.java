package com.thing.contract.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ItemDetailResponseDTO {

    private ClientInfoDTO ownerInfo;
    private ItemDto item;
    private Integer basketCount;
    private Boolean isLike;

}

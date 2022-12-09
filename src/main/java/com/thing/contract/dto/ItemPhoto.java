package com.thing.contract.dto;

import lombok.Data;

@Data
public class ItemPhoto {
    private Integer itemPhotoIndex;
    private String itemPhoto;
    private Boolean isMain;
}
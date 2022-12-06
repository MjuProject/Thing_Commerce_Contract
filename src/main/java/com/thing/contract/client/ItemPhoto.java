package com.thing.contract.client;

import lombok.Data;

@Data
public class ItemPhoto {
    private Integer itemPhotoIndex;
    private String itemPhoto;
    private Boolean isMain;
}
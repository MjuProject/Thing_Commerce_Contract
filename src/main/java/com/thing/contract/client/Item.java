package com.thing.contract.client;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Item{
    private Integer itemId;
    private Integer ownerId;
    private Integer categoryBig;
    private Integer categoryMiddle;
    private Integer categorySmall;
    private String itemTitle;
    private String itemContent;
    private int price;
    private double itemLatitude;
    private double itemLongitude;
    private String itemAddress;
    private int views;
    private Date createdDate;
    private boolean status;
    private List<ItemPhoto> photos;
}
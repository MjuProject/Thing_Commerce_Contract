package com.thing.contract.dto;


import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ItemDto {

    private Integer itemId;
    private Integer categoryBig;
    private Integer categoryMiddle;
    private Integer categorySmall;
    private String itemTitle;
    private String itemContent;
    private int price;
    private String itemAddress;
    private int views;
    private Date createdDate;
    private boolean status;
    private List<String> itemPhotoUri;

}
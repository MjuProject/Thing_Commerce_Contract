package com.thing.contract.client;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ClientDto {

    private Integer clientIndex;
    private String clientId;
    private String email;
    private String phoneNumber;
    private Date birthdate;
    private String clientName;
    private String nickname;
    private String clientPhoto;
    private Float trustPoint;
}


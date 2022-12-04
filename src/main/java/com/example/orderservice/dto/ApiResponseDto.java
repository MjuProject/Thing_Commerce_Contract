package com.example.orderservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponseDto<T> {

    private boolean success;
    private int code;
    private String message;
    private T data;

    public ApiResponseDto(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static ApiResponseDto success(){
        return new ApiResponseDto(true, 0, "성공하였습니다.");
    }

    public static <T> ApiResponseDto success(T data){
        return new ApiResponseDto(true, 0, "성공하였습니다.", data);
    }

    public static ApiResponseDto fail(int code, String message){
        return new ApiResponseDto(false, code, message);
    }
}
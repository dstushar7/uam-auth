package org.dstushar7.uamauth.model.dto.response;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private Boolean success;
    private Integer status;
    private String message;
    private T data;
}
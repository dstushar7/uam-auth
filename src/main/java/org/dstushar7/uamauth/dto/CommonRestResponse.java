package org.dstushar7.uamauth.dto;

import lombok.Data;

@Data
public class CommonRestResponse {
    private int status;
    private String message;
    private Object data;
}
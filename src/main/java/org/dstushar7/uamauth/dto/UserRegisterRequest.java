package org.dstushar7.uamauth.dto;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}

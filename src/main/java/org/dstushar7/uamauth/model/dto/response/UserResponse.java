package org.dstushar7.uamauth.model.dto.response;

import lombok.Data;

@Data
public class UserResponse {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}

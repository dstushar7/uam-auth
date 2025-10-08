package org.dstushar7.uamauth.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    SUPERADMIN("ROLE_SUPERADMIN"),
    ADMIN( "ROLE_ADMIN"),
    USER("ROLE_USER");

    private final String authority;

    // Build hierarchy string for Spring Security
    public static String buildHierarchyString(){
        return "ROLE_SUPERADMIN > ROLE_ADMIN > ROLE_USER";
    }

}

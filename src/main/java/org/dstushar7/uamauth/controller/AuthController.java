package org.dstushar7.uamauth.controller;

import lombok.RequiredArgsConstructor;
import org.dstushar7.uamauth.service.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @GetMapping("/register")
    public String register() {
        return "Hello World";
    }

    @GetMapping("/login")
    public String login() {
        return "Hello World";
    }

    @GetMapping("/superadmin")
    public String superadmin() {
        return "Hello World";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello World";
    }
}

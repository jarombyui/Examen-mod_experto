package com.codigo.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class AutenticationController {

    @GetMapping("/login")
    public String login() {
        return "Página de inicio de sesión";
    }

    @GetMapping("/logout")
    public String logout() {
        return "Página de cierre de sesión";
    }
}

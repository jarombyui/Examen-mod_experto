package com.codigo.examen.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-examen/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    @GetMapping("/info")
    public String adminInfo() {
        return "Información del administrador";
    }
}

package com.codigo.examen.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {
    private String username;
    private String telefono;
    private String email;
    private String password;
}

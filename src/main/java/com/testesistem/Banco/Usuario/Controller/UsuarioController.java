package com.testesistem.Banco.Usuario.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class UsuarioController {

    @GetMapping("/boas-vindas")
    public  String mensagem(){
        return  "Sistema rodando com sucesso.";
    }

}

package com.testesistem.Banco.Servicos.Model;

import com.testesistem.Banco.Usuario.Controller.UsuarioController;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_trabalhos")
public class ServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeTrabalho;

    private String nivelDeFormação;

    private List<UsuarioController> usuarioUsuarios;

    public ServicosModel(){}

    public ServicosModel(String nomeTrabalho, String nivelDeFormação) {
        this.nomeTrabalho = nomeTrabalho;
        this.nivelDeFormação = nivelDeFormação;
    }

}

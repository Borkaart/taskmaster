package com.projeto.taskmaster.controller;

import com.projeto.taskmaster.model.Usuario;
import com.projeto.taskmaster.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutenticacaoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastro(Usuario usuario) {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String salvarUsuario(Usuario usuario) {
        usuarioService.salvar(usuario);
        return "redirect:/login";
    }
}
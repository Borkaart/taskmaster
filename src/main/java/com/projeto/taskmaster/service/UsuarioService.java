package com.projeto.taskmaster.service;

import com.projeto.taskmaster.model.Usuario;
import com.projeto.taskmaster.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public void salvar(Usuario usuario) {
        // Criptografa a senha antes de salvar no banco
        String senhaCriptografada = encoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCriptografada);
        repository.save(usuario);
    }
}
package com.projeto.taskmaster.controller;

import com.projeto.taskmaster.model.Tarefa;
import com.projeto.taskmaster.model.Prioridade;
import com.projeto.taskmaster.model.Usuario;
import com.projeto.taskmaster.repository.TarefaRepository;
import com.projeto.taskmaster.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public String listar(Model model, java.security.Principal principal) {
        String email = principal.getName();
        Usuario usuario = usuarioRepository.findByEmail(email).get();

        // Envia o nome do usuário para o HTML
        model.addAttribute("nomeUsuario", usuario.getNome());

        model.addAttribute("tarefas", tarefaRepository.findByUsuarioId(usuario.getId()));
        return "tarefas";
    }

    @PostMapping
    public String salvar(Tarefa tarefa, java.security.Principal principal) {
        String email = principal.getName();
        Usuario usuario = usuarioRepository.findByEmail(email).get();

        // 4. Antes de salvar, vincula a tarefa ao usuário logado
        tarefa.setUsuario(usuario);

        tarefaRepository.save(tarefa);
        return "redirect:/tarefas";
    }

    @PostMapping("/{id}/concluir")
    public String concluir(@PathVariable Long id) {
        // Mude de 'repository' para 'tarefaRepository'
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow();
        tarefa.setConcluida(true);
        tarefaRepository.save(tarefa);
        return "redirect:/tarefas";
    }

    @GetMapping("/{id}/remover")
    public String remover(@PathVariable Long id) {
        // Mude de 'repository' para 'tarefaRepository'
        tarefaRepository.deleteById(id);
        return "redirect:/tarefas";
    }
}
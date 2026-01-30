package com.projeto.taskmaster.controller;

import com.projeto.taskmaster.model.Tarefa;
import com.projeto.taskmaster.model.Prioridade;
import com.projeto.taskmaster.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tarefas", repository.findAll());
        model.addAttribute("prioridades", Prioridade.values());
        return "tarefas";
    }

    @PostMapping
    public String salvar(Tarefa tarefa) {
        repository.save(tarefa);
        return "redirect:/tarefas";
    }

    @PostMapping("/{id}/concluir")
    public String concluir(@PathVariable Long id) {
        Tarefa tarefa = repository.findById(id).orElseThrow();
        tarefa.setConcluida(true);
        repository.save(tarefa);
        return "redirect:/tarefas";
    }

    @GetMapping("/{id}/remover")
    public String remover(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/tarefas";
    }
}
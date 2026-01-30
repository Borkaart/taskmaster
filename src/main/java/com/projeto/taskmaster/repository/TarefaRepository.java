package com.projeto.taskmaster.repository;

import com.projeto.taskmaster.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Busca apenas as tarefas que pertencem ao ID de um usuário específico
    List<Tarefa> findByUsuarioId(Long usuarioId);
}
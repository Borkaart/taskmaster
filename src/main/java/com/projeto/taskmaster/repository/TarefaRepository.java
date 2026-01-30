package com.projeto.taskmaster.repository;

import com.projeto.taskmaster.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Caso queira buscar apenas as que não foram concluídas
    List<Tarefa> findByConcluidaFalse();
}
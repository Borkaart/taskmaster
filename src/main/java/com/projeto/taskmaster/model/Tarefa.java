package com.projeto.taskmaster.model;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataPrazo;

    @Enumerated(EnumType.STRING) // Salva o nome da prioridade no banco (ex: "ALTA")
    private Prioridade prioridade;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    private boolean concluida = false;

    // Getter e Setter para o campo concluida
    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
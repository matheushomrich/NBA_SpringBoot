package com.nba.modelos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Team {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date dataCriacao;
    private int nTitulos;
    @OneToMany
    private List<Player> players;

    public Team(Long id, String nome, Date dataCriacao, int nTitulos) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.nTitulos = nTitulos;
    }

    public Team() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getnTitulos() {
        return nTitulos;
    }

    public void setnTitulos(int nTitulos) {
        this.nTitulos = nTitulos;
    }
}

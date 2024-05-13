package br.unipar.entity;

import java.util.List;

public class Desafios {

    private String nome;
    private Integer quantidade;
    private List<Locais>locais;
    private Integer tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public List<Locais> getLocais() {
        return locais;
    }

    public void setLocais(List<Locais> locais) {
        this.locais = locais;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }
}

package br.unipar.entity;

import java.util.List;

public class Chaves {
    private String nome;
    private Integer quantidade;
    private List<Locais> locais;

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
}

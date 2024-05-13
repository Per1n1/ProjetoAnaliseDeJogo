package br.unipar.entity;

import java.util.List;

public class Locais {
    private String nome;
    private List<Chaves>chaves;
    private List<Desafios>desafios;
    private List<Itens>itens;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Chaves> getChaves() {
        return chaves;
    }

    public void setChaves(List<Chaves> chaves) {
        this.chaves = chaves;
    }

    public List<Desafios> getDesafios() {
        return desafios;
    }

    public void setDesafios(List<Desafios> desafios) {
        this.desafios = desafios;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}

package br.unipar.entity;

import java.util.List;

public class Personagens {
    private Integer vida;
    private Integer dano;
    private String nome;
    private Integer velocidade;
    private List<Itens> itens;
    private List<Animacoes> animacoes;

    public Personagens (Integer vida, Integer dano, String nome, Integer velocidade, List<Itens>itens, List<Animacoes>animacoes )
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public List<Animacoes> getAnimacoes() {
        return animacoes;
    }

    public void setAnimacoes(List<Animacoes> animacoes) {
        this.animacoes = animacoes;
    }
}

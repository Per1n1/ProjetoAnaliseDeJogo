package br.unipar.entity;

public class Animacoes {

   private String nome;
   private Integer velocidade;
   private Integer dano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }
}

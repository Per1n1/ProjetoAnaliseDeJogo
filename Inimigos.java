package br.unipar.entity;

import java.util.List;

public class Inimigos extends Personagens{

    public Inimigos (Integer vida, Integer dano, String nome, Integer velocidade, List<Itens> itens, List<Animacoes> animacoes){
        super (vida, dano, nome, velocidade, itens, animacoes);
    }


}

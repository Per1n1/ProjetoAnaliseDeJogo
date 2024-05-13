package br.unipar.entity;

public class Itens {

   private String nome;
   private Double preco;
   private Integer quantidade;
   private String locais;

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Double getPreco() {
      return preco;
   }

   public void setPreco(Double preco) {
      this.preco = preco;
   }

   public Integer getQuantidade() {
      return quantidade;
   }

   public void setQuantidade(Integer quantidade) {
      this.quantidade = quantidade;
   }

   public String getLocais() {
      return locais;
   }

   public void setLocais(String locais) {
      this.locais = locais;
   }
}

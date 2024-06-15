package br.com.cursoalura.DesafiosDoCurso.Desafio3;

public class Produtos {
    private String nome;
    private Double preco;

    @Override
    public String toString() {
        return "PRODUTO: " + this.getNome() + " PREÇO: R$" + this.getPreco();
    }

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
}

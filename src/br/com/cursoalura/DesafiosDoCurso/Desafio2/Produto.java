package br.com.cursoalura.DesafiosDoCurso.Desafio2;

//1 Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor obrigando a colocar um nome
    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Sobreescrever método primordial ToString;
    @Override
    public String toString() {
        return "PRODUTO: " + this.getNome() + " PREÇO: R$" + this.getPreco() + " QUANTIDADE: "+this.getQuantidade();
    }

}

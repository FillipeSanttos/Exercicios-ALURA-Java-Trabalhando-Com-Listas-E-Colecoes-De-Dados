package br.com.cursoalura.DesafiosDoCurso.Desafio2;

public class ProdutoPerecivel extends Produto{

    private String dataDeValidade;

    //Construtor da super classe + obrigatório desta classe
    public ProdutoPerecivel(String nome, String dataDeValidade) {
        super(nome);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    //Substituir toString para essa classe especifica para mostrar a data de validade.
    @Override
    public String toString() {
        return "PRODUTO: " + this.getNome() + " PREÇO: R$" + this.getPreco() + " QUANTIDADE: "+this.getQuantidade()+" DATA DE VALIDADE: "+this.dataDeValidade;
    }
}

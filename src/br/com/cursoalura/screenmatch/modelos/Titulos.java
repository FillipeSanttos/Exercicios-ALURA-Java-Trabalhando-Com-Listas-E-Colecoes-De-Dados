package br.com.cursoalura.screenmatch.modelos;
//Superclasse TITULOS: serve para herança em classe Filmes e classe Séries


public class Titulos implements Comparable<Titulos>{
    private String titulo;
    private int ano;
    private boolean incluidoNoPlano;
    private int valorTotalAvaliacoes;
    private int quantidadeDeAvaliacoes;
    private int duracaoEmMinutos;

    //Construtor personalizado: obrigatorio titulo e ano.
    public Titulos(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.cursoalura.screenmatch.modelos.Filme: "+titulo);
        System.out.println("Ano do br.com.cursoalura.screenmatch.modelos.Filme: "+ano);
        System.out.println("Quantidade de Avaliações: "+ quantidadeDeAvaliacoes);
    }

    public void adicionarAvaliacao(double nota){
        valorTotalAvaliacoes += nota;
        quantidadeDeAvaliacoes++;
    }

    public double mediaDeNotas(){
        return (valorTotalAvaliacoes/quantidadeDeAvaliacoes);
    }

    public int getValorTotalAvaliacoes(){ //Funcao para PUXAR valor total das avaliações
        return valorTotalAvaliacoes;
    }

    public void setTitulo(String titulo) { //Funcao para SETAR titulo
        this.titulo = titulo;
    }

    public void setAno(int ano) { //Funcao para SETAR ano
        this.ano = ano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {  //Funcao para SETAR incluido no plano
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setValorTotalAvaliacoes(int valorTotalAvaliacoes) {
        this.valorTotalAvaliacoes = valorTotalAvaliacoes;
    }

    public int getQuantidadeDeAvaliacoes() {
        return quantidadeDeAvaliacoes;
    }

    public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
        this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int compareTo(Titulos outroTitulos) {
        return this.getTitulo().compareTo(outroTitulos.getTitulo());
    }
}

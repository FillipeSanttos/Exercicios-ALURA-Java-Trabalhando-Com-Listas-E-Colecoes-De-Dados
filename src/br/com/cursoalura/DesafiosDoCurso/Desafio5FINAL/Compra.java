package br.com.cursoalura.DesafiosDoCurso.Desafio5FINAL;

public class Compra implements Comparable<Compra>{
    private String descricaoDaCompra;
    private double valorDaCompra;

    public Compra(String descricaoDaCompra, double valorDaCompra) {
        this.descricaoDaCompra = descricaoDaCompra;
        this.valorDaCompra = valorDaCompra;
    }

    public String getDescricaoDaCompra() {
        return descricaoDaCompra;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    @Override
    public String toString() {
        return "Compra: Descrição = '" + descricaoDaCompra + '\'' +
                ", Valor = " + valorDaCompra +
                '}';
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorDaCompra).compareTo(Double.valueOf(outraCompra.valorDaCompra));
    }
}

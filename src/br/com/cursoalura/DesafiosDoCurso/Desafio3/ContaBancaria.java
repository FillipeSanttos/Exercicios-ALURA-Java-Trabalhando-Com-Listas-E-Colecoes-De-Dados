package br.com.cursoalura.DesafiosDoCurso.Desafio3;

public class ContaBancaria {

    private int numeroDaConta;
    private double saldo;

    //Construtor
    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return ("NUMERO DA CONTA: " + this.getNumeroDaConta()+" SALDO: R$"+this.getSaldo());
    }
}

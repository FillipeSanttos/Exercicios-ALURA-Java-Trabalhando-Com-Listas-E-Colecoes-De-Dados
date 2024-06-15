package br.com.cursoalura.DesafiosDoCurso.Desafio5FINAL;

//1 - Criar uma aplicacao para lancamento de compras no cartao de credito
//2 - Menu para lançamento de compras
//3 - Exibicao da lista de compras realizadas e ordenadas por valor

import java.util.ArrayList;
import java.util.List;

public class CartaodeCredito {

    //atributos
    private double limiteDoCartao;
    private double saldoDoCartao;
    private List<Compra> compras;

    public CartaodeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldoDoCartao = limiteDoCartao;
        this.compras = new ArrayList<>();
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public double getSaldoDoCartao() {
        return saldoDoCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancarCompra (Compra compra){
        if (this.saldoDoCartao > compra.getValorDaCompra()) {
            this.saldoDoCartao -= compra.getValorDaCompra();
            this.compras.add(compra);
            return true;
        }
        return false;



        }




    }


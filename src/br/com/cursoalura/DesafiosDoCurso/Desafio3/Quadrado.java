package br.com.cursoalura.DesafiosDoCurso.Desafio3;

public class Quadrado implements Forma{
    private double ladoDoQuadrado;

    @Override
    public double calcularArea() {
        return ladoDoQuadrado * ladoDoQuadrado;
    }

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }
}

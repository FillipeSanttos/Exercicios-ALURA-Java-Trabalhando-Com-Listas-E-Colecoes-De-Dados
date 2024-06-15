package br.com.cursoalura.DesafiosDoCurso.Desafio4;

public class Titulo2 implements Comparable<Titulo2> {
    String nome;

    public Titulo2(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo2 outroTitulo2) {
        return this.nome.compareTo(outroTitulo2.nome);
    }

    @Override
    public String toString() {
        return ("NOME DO TÍTULO: " + this.nome);
    }

}


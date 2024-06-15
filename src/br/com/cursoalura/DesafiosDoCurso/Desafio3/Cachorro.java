package br.com.cursoalura.DesafiosDoCurso.Desafio3;

public class Cachorro extends Animal{


    public Cachorro(String nome) {
        super(nome);
    }



    @Override
    public String toString() {
        return ("RAÇA DO CACHORRO: " + this.getNome());
    }

}


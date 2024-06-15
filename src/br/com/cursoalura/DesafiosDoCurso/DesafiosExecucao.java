package br.com.cursoalura.DesafiosDoCurso;

import br.com.cursoalura.DesafiosDoCurso.Desafio1.Pessoa;
import br.com.cursoalura.DesafiosDoCurso.Desafio2.Produto;
import br.com.cursoalura.DesafiosDoCurso.Desafio2.ProdutoPerecivel;
import br.com.cursoalura.DesafiosDoCurso.Desafio3.*;
import br.com.cursoalura.DesafiosDoCurso.Desafio4.Titulo2;
import br.com.cursoalura.DesafiosDoCurso.Desafio5FINAL.CartaodeCredito;
import br.com.cursoalura.DesafiosDoCurso.Desafio5FINAL.Compra;
import br.com.cursoalura.screenmatch.modelos.Filme;
import com.sun.jdi.connect.spi.TransportService;

import java.util.*;

import static br.com.cursoalura.DesafiosDoCurso.Desafio3.Produtos.*;

public class DesafiosExecucao {
    public static void main(String[] args) {

        //DESAFIO 1 - EXERCICIO 1
        //Criar uma classe e um objeto
        System.out.println("DESAFIO 1:");
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Joao");
        pessoa01.setIdade(19);

        System.out.println(pessoa01);

        //DESAFIO 1 - EXERCICIO 2
        //Criar uma lista

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //DESAFIO 1 - EXERCICIO 3
        //Adicionar 3 objetos na lista

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("Pedro");
        pessoa02.setIdade(25);

        Pessoa pessoa03 = new Pessoa();
        pessoa03.setNome("Paulo");
        pessoa03.setIdade(41);

        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);
        listaDePessoas.add(pessoa03);

        //DESAFIO 1 - EXERCICIO 4
        //Imprimir tamanho total da lista
        System.out.println(listaDePessoas.size());

        //DESAFIO 1 - EXERCICIO 5
        //Imprimir primeiro da lista
        System.out.println(listaDePessoas.get(0));

        //DESAFIO 1 - EXERCICIO 6
        //Imprimir lista completa
        System.out.println(listaDePessoas);


        //DESAFIO 2 - EXERCICIO 1
        System.out.println("DESAFIO 2:");

        Produto produto01 = new Produto("Macarrao");
//        produto01.setNome("Macarrao");
        produto01.setPreco(15.88);
        produto01.setQuantidade(15);

        Produto produto02 = new Produto("Molho");
//        produto02.setNome("Molho");
        produto02.setPreco(7.54);
        produto02.setQuantidade(5);

        Produto produto03 = new Produto("Arroz");
//        produto03.setNome("Arroz");
        produto03.setPreco(5.02);
        produto03.setQuantidade(3);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto01);
        listaDeProdutos.add(produto02);
        listaDeProdutos.add(produto03);

        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(0).getNome());

        //DESAFIO 2 - EXERCICIO 2

        System.out.println(listaDeProdutos);


        //DESAFIO 2 - EXERCICIO 3
        //Realizado criando o construtor, comentando os antigos setters e adicionando o atributo na criacao do objeto

        Produto produto04 = new Produto("Sopa");
        produto04.setQuantidade(8);
        produto04.setPreco(2.11);


        Produto produto05 = new Produto("Bolacha");
        produto05.setQuantidade(3);
        produto05.setPreco(1.17);

        listaDeProdutos.add(produto04);
        listaDeProdutos.add(produto05);

        System.out.println(listaDeProdutos);


        //DESAFIO 2 - EXERCICIO 4

        ProdutoPerecivel produtoperecivel01 = new ProdutoPerecivel("Leite", "15/05/2024");
        produtoperecivel01.setPreco(3.44);
        produtoperecivel01.setQuantidade(7);

        System.out.println(produtoperecivel01);


        //DESAFIO 3 - EXERCICIO 1
        System.out.println("DESAFIO 3:");

        Cachorro cachorro01 = new Cachorro("Poodle");
        Cachorro cachorro02 = new Cachorro("Vira Lata");
        Cachorro cachorro03 = new Cachorro("Pastor Alemão");

        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add(cachorro01);
        listaDeCachorros.add(cachorro02);
        listaDeCachorros.add(cachorro03);

        for (Cachorro nomedocachorro : listaDeCachorros) {
            System.out.println(nomedocachorro);
        }

        //DESAFIO 3 - EXERCICIO 2
        //CASTING: Transformando o objeto da classe CACHORRO em objeto da classe ANIMAL
        Animal animal = (Animal) cachorro01;
        animal = (Animal) cachorro02;
        animal = (Animal) cachorro03;

        //DESAFIO 3 - EXERCICIO 3

        if (animal instanceof Cachorro) {
            Cachorro cachorros = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        //DESAFIO 3 - EXERCICIO 4

        Produtos produto001 = new Produtos();
        produto001.setNome("Pão");
        produto001.setPreco(2.33);

        Produtos produto002 = new Produtos();
        produto002.setNome("Salgadinho");
        produto002.setPreco(0.15);

        Produtos produto003 = new Produtos();
        produto003.setNome("Café");
        produto003.setPreco(0.75);

        ArrayList<Produtos> listaTotalDeProdutos = new ArrayList<>();
        listaTotalDeProdutos.add(produto001);
        listaTotalDeProdutos.add(produto002);
        listaTotalDeProdutos.add(produto003);

        System.out.println(listaTotalDeProdutos);

        double somaPrecos = 0;
        for (Produtos produtos : listaTotalDeProdutos) {
            somaPrecos += produtos.getPreco();
        }

        double precoMedio = somaPrecos / listaTotalDeProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);


        //DESAFIO 3 - EXERCICIO 5

        Quadrado quadrado01 = new Quadrado();
        quadrado01.setLadoDoQuadrado(5);
        Circulo circulo01 = new Circulo();
        circulo01.setRaio(3);

        System.out.println("Área do Quadrado: " + quadrado01.calcularArea());
        System.out.println("Área do Círculo: " + circulo01.calcularArea());


//DESAFIO 3 - EXERCICIO 6

        ContaBancaria conta01 = new ContaBancaria(10001, 15.22);
        ContaBancaria conta02 = new ContaBancaria(10002, 115.22);
        ContaBancaria conta03 = new ContaBancaria(10003, 125.22);
        ContaBancaria conta04 = new ContaBancaria(10004, 175.22);
        ContaBancaria conta05 = new ContaBancaria(10005, 105.22);

        ArrayList<ContaBancaria> listaDeContasBancarias = new ArrayList<>();
        listaDeContasBancarias.add(conta01);
        listaDeContasBancarias.add(conta02);
        listaDeContasBancarias.add(conta03);
        listaDeContasBancarias.add(conta04);
        listaDeContasBancarias.add(conta05);

        System.out.println(listaDeContasBancarias);

        ContaBancaria contaMaiorSaldo = listaDeContasBancarias.get(0);
        for (ContaBancaria conta : listaDeContasBancarias) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }

        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());


//DESAFIO 4 - EXERCICIO 1

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);

        //DESAFIO 4 - EXERCICIO 2

        //DESAFIO 4 - EXERCICIO 3

        ArrayList<Titulo2> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo2("D"));
        listaTitulos.add(new Titulo2("A"));
        listaTitulos.add(new Titulo2("B"));

        Collections.sort(listaTitulos);

        for (Titulo2 titulo : listaTitulos) {
            System.out.println(titulo);
        }

        //DESAFIO 4 - EXERCICIO 4

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

//DESAFIO 4 - EXERCICIO 5

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

//DESAFIO 5 - FINAL

        Scanner leituraDeDados = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        double novolimiteDoCartao = leituraDeDados.nextDouble();
        CartaodeCredito cartao01 = new CartaodeCredito(novolimiteDoCartao);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricaoDaCompra = leituraDeDados.next();

            System.out.println("Digite o valor da compra:");
            double valorDaCompra = leituraDeDados.nextDouble();

            Compra compra = new Compra(descricaoDaCompra, valorDaCompra);
            boolean compraRealizada = cartao01.lancarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar:");
                sair = leituraDeDados.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("*******************");
        System.out.println("COMPRAS REALIZADAS: \n");

        Collections.sort(cartao01.getCompras());

        for (Compra c : cartao01.getCompras()){
            System.out.println(c.getDescricaoDaCompra() + " - " + c.getValorDaCompra());
        }

        System.out.println("\n*************************");

        System.out.println("\n Saldo do Cartão: " + cartao01.getSaldoDoCartao());




    }
}


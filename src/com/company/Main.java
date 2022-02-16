package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Exercício da Calculadora:");
        System.out.println(Calculadora.somar(3, 6));
        System.out.println(Calculadora.subtrair(9, 1.8));
        System.out.println(Calculadora.multiplicar(7, 8));
        System.out.println(Calculadora.dividir(5, 2.5));


        System.out.println("Exercício da Mensagem:");
        Mensagem.receberMensagem(7);
        Mensagem.receberMensagem(15);
        Mensagem.receberMensagem(22);

        System.out.println("Exercício do Empréstimo:");
        Emprestimo.calcular(800, 2);

    }
}

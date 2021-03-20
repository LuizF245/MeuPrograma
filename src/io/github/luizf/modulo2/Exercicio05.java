package io.github.luizf.modulo2;

public class Exercicio05 {

    public static void main(String[] args) {

        /*
         * Exercício 05
         * Imprima os fatoriais de 1 a 10
         */

        int fatorial = 1;
        for (int n = 1; n <= 10; n++) {
            fatorial *= n;
            System.out.println("O fatorial de " + n + " é igual a " + fatorial);
        }
    }
}

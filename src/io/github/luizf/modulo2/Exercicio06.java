package io.github.luizf.modulo2;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        /*
         * Exercício 06
         * Escreva um programa que, dada uma variável X com algum valor inteiro,
         * temos um novo X de acordo com a seguinte regra:
         * se X é par: X = X / 2
         * se X é ímpar: X = 3 * X + 1
         * O programa deve parar quando X tiver o valor final de 1.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        double x = scanner.nextDouble();

        while (x > 1.0) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }

            System.out.print(x);

            if (!(x == 1.0)) {
                System.out.print(" » ");
            }
        }
    }
}

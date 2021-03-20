package io.github.luizf.modulo2;

public class Exercicio04 {

    public static void main(String[] args) {
        /*
         * Exercício 04
         * Imprima todos os múltiplos de 3, entre 1 e 100
         */

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}

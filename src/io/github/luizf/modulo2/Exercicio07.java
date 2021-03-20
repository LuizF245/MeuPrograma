package io.github.luizf.modulo2;

public class Exercicio07 {

    public static void main(String[] args) {

        /*
         * Exercício 07
         * Imprima a seguinte tabela, usando for's encadeados
         * 1
         * 2 4
         * 3 6 9
         * 4 8 12 16
         */

        int linhas = 4;
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i*j) + " ");
            }

            System.out.println("");
        }
    }
}

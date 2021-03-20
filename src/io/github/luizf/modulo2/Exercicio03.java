package io.github.luizf.modulo2;

public class Exercicio03 {

    public static void main(String[] args) {
        /*
         * Exercício 03
         * Imprima a soma de 1 até 1000
         */

        int resultado = 0;
        int ultimoValor;

        for (int i = 0; i <= 1000; i++) {
            ultimoValor = resultado;
            resultado += + i;
            System.out.println(resultado + " = " + ultimoValor + " + " + i);
        }
    }
}

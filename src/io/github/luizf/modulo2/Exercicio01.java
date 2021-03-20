package io.github.luizf.modulo2;

public class Exercicio01 {

    public static void main(String[] args) {

        /*
         * Exercício 01
         * Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês.
         * Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
         * Sabendo que , em Janeiro, foram gastos 15000 reais, em Fevereiro 23000 reais
         * e em Março, 17000 reais, faça um programa que calcule e imprima o gasto
         * total do primeiro trimestre.
         */

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println(gastosTrimestre);

        int mediaMensal = gastosTrimestre / 3;

        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}

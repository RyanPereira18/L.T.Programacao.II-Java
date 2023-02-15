/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author 15894822637
 */
public class exercicio4 {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        double cotacao_dolar, valor_dolar, valor_real;
        System.out.println("Conversor de dolar em real\n\n:");
        System.out.println("digite a cotacao do dolar:");
        cotacao_dolar = entrada.nextDouble();
        System.out.println("Digite o valor em Dolar:");
        valor_dolar = entrada.nextDouble();
        valor_real = cotacao_dolar * valor_dolar;
        System.out.println("O valor em Real é:"+valor_real+ "\n");
    }
}

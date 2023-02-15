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
public class exercicio5 {
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        System.out.println("Entre com a sua altura em metros:");
        double altura = imput.nextDouble();
        System.out.println("Digite o seu peso em kg:");
        double peso = imput.nextDouble();
        double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é %.2f%n", imc);
        
        if (imc < 19.1) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (imc >= 19.1 && imc <= 25.8) {
            System.out.println("Você está no peso ideal.");
        } else if (imc > 25.8 && imc < 30.0) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está obeso.");
        }
        
     
    }      
}

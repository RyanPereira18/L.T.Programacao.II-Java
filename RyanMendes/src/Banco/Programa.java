/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author 15894822637
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta minhaConta = new Conta();
        
        System.out.println("Digite o valor para depositar: ");
        minhaConta.deposito(entrada.nextDouble());
        
        System.out.println("Digite uma valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())==true){
            System.out.println();
        }     
    }
}

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
public class exercicio8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hp, lp, ha, la, areaParede, areaAzulejo, quantidadeAzulejos;
        
        System.out.print("Digite a altura da parede em metros: ");
        hp = input.nextDouble();
        
        System.out.print("Digite a largura da parede em metros: ");
        lp = input.nextDouble();
        
        System.out.print("Digite a altura do azulejo em metros: ");
        ha = input.nextDouble();
        
        System.out.print("Digite a largura do azulejo em metros: ");
        la = input.nextDouble();
        
        areaParede = hp * lp;
        areaAzulejo = ha * la;
        quantidadeAzulejos = Math.ceil(areaParede / areaAzulejo);
        
        System.out.println("Serão necessários: " + quantidadeAzulejos + " azulejos para cobrir a parede.");
    }
}


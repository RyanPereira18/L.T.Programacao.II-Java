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
public class exercicio9 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double areaTotal, areaConstruida, valorConstruido, valorNaoConstruido, valorTotal;
        
        System.out.print("Digite a area total do Terreno em metros quadrados: ");
        areaTotal = input.nextDouble();
        
        System.out.print("Digite a area construída do Terreno em metros quadrados: ");
        areaConstruida = input.nextDouble();
        
        valorConstruido = areaConstruida * 5;
        valorNaoConstruido = (areaTotal - areaConstruida) * 3.8;
        valorTotal = valorConstruido + valorNaoConstruido;
        
        System.out.println("O valor total do imposto a ser pago é de RS" + valorTotal);
    }
    }
    


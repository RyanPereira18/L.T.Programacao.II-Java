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
public class exercicio6 {
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        double comprimento, largura, area, perimetro;
        
        System.out.println("Digite o comprimento do retangulo:");
        comprimento = imput.nextDouble();
        
        System.out.println("Digite a largura do retangulo:");
        largura = imput.nextDouble();
        
        area = comprimento * largura;
        perimetro = 2*comprimento + 2*largura;
        
        System.out.println("Area do retangulo:"+ area);
        System.out.println("Perimetro do retangulo:"+ perimetro);
    }          
}

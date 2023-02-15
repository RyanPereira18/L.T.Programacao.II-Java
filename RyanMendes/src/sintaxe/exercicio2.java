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
public class exercicio2 {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        Integer soma=0, cont;      
        for(cont = 0;cont < 100;cont++){
            soma = cont+1;
         System.out.println( cont+ "+1 =" +soma);
        }      
    }    
}

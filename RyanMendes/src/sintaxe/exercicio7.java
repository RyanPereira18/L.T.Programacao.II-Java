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
public class exercicio7 {
     public static void main(String[]args){
         Scanner ent = new Scanner(System.in);
         int nota1, nota2, nota3, nota4;
         int media, i, contAluno = 0;
         
         for(i=0;i < 4;i++){
             contAluno++;
             System.out.println("Aluno" +contAluno+ "Digite a 1 nota:");
             nota1 = ent.nextInt();
             System.out.println("Aluno" +contAluno+ "Digite a 2 nota:");
             nota2 = ent.nextInt();
             System.out.println("Aluno" +contAluno+ "Digite a 3 nota:");
             nota3 = ent.nextInt();
             System.out.println("Aluno" +contAluno+ "Digite a 4 nota:");
             nota4 = ent.nextInt();
             media = (nota1 + nota2 + nota3 + nota4)/4;
             System.out.println("A media do Aluno:" + contAluno + "é" +media);
             if ((media >=0) && (media <4)){
                 System.out.println("Nota E");
             }
                 else if(media < 5){
                     System.out.println("Nota D");
             }
                 else if(media < 7){
                     System.out.println("Nota D");
             }
                 else if(media < 8){
                     System.out.println("Nota D");
             }
                 else if(media <= 10){
                     System.out.println("Nota D");
             }
             
         }
     }  
}

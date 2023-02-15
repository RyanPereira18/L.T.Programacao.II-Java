/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author 15894822637
 */
public class Conta {
           String cliente;
           double saldo;
           double limite;  
           
public void deposito(double saldo){
    this.saldo=this.saldo+saldo;
}
    public boolean saca(double saldo){
    if(this.saldo>=saldo){
    this.saldo = this.saldo - saldo;
    System.out.println("Saque realizado com sucesso:");
    return true;
} else{
    System.out.println("Saldo insuficiente:");
    return false;
    }
    }
}


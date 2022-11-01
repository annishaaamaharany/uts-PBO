/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

import utspbo.Bank;

/**
 *
 * @author annishamaharany
 */
public class BankBereaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bank bank = new Bank(100_000);
        bank.getSaldo();
        bank.simpanUang(500_000);
        bank.ambilUang(700_000);
    }
    
}

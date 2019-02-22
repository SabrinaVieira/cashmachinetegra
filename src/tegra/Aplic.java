/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tegra;

import java.util.Scanner;

/* @author Sabrina*/
public class Aplic {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int opcao, vlr;
        
        do{
            System.out.print("\n----------------------------------");
            System.out.print("\nBem vindo\nDigite uma opção do menu:");
            System.out.println("\n 1. SAQUE\n 2. SAIR");
            opcao = ent.nextInt();
            Operacao Op = new Operacao();
            
            switch(opcao){
                    case 1:
                        System.out.println("Digite o valor do saque: R$");
                        vlr = ent.nextInt();
                        System.out.println("\n");
                        Op.Saque(vlr);
                        break;
            }
        }while(opcao != 2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tegra;

/**@author Sabrina*/
    public class Operacao { 
        int nota100, nota50, nota20, nota10;
        
        public void Saque(int valor){
            
            if(valor > 10){
                int len = String.valueOf(valor).length();
                int x=0,s=0;
                
                for(int i = len; i>0; i--){
                    x = (int) Math.pow(10, i-1);
                    s = valor % x;
                }
                if(s>0){
                    System.out.println("\nErro de notas indisponíveis" + s);
                    System.out.println("x" + x);
                }else
                 Notas(valor);
        
            }else
                System.out.println("Valor inválido");
       }
   
   public void Notas(int valor){
        
            
       while(valor/10 > 9){
           
           while(valor / 100 > 0){
                nota100++;
                valor -=100;
            }
            while(valor /50 > 0){
                 nota50++;
                 valor -=50;
            }
            while(valor /20 > 0){
                 nota20++;
                 valor -=20;
            }
            while(valor /10 > 0){
                 nota10++;
                 valor -=10;
            }      
       }
       System.out.println("\nSaque realizado com sucesso: ");
       if(nota100 >0){
            System.out.println(nota100 + " notas de R$100,00");
        }
       if(nota50 >0){
            System.out.println(nota50 + " notas de R$50,00");
        }
       if(nota20 >0){
            System.out.println(nota20 + " notas de R$20,00");
        }
       if(nota10 >0){
            System.out.println(nota10 + " notas de R$10,00");
        }
   }
}
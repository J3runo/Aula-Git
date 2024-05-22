
package aula01;

import java.util.Scanner;

public class Aula01 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de gols");
        int QG = leia.nextInt();
        System.out.println("Digite a quantidade de passes certos");
        int PC = leia.nextInt();
        System.out.println("Digite a quantidade de passes errados");
        int PE = leia.nextInt();
        
        int TP = (QG*50 + PC*5)+ (PE* -5);
        
        if (TP<50){
                    
        System.out.println("pessima partida");
        }
               
        else if (TP >50 && TP<100){
                    
        System.out.println("partida ruim");
        }
        
        else if (TP >100 && TP<150){
                    
        System.out.println("jogou bem");
        }
        
        else if (TP >150 && TP<200){
                    
        System.out.println("otima partida");
        }
        
        else if (TP >200){
                    
        System.out.println("jogou demais");
        }
        
        System.out.println(TP + "sua pontuação foi ");
        
        
    }
    
}       
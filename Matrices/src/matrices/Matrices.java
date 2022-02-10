
package matrices;

import java.util.Scanner;


public class Matrices {

    public static void main(String[] args) {
        
            int matriz [] [] = new int [3] [3];
            
            Scanner teclado = new Scanner(System.in);
            
            for (int i = 0; i < 3; i++){
                  for (int j = 0; j < 3; j++){
                      System.out.println("Ingrese un valor: ");
                      matriz [i] [j] =  teclado.nextInt();
                  }
            }
            for (int i = 0; i < 3; i++){
                  for (int j = 0; j < 3; j++){
                      System.out.println("En la posicion "+ i +" , "+ j +" esta asignado el valor " + matriz [i] [j]);
                  }
            }
        
            
       
    }
    
}

package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        // Declaracíon del vector

        int vector[] = new int[5];
        Scanner valorTecleado = new Scanner(System.in);

        // Asignación del vector 
        for (int indice = 0; indice < 5; indice++) {

            System.out.println("Asigne el valor de la posición " + indice + " del vector: ");

            vector[indice] = valorTecleado.nextInt();
            System.out.println("Acabas de ingresar en la posición " + indice + " del vector el valor " + vector[indice]);
        }
        
        System.out.println("Los valores del arreglo son : ");
        
        for (int recorrer = 0; recorrer < 5; recorrer++) {
            System.out.println("Posición " + recorrer + " valor " + vector[recorrer]);
        }
    }

}

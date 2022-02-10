package ejercicio.con.vector;

import java.util.Scanner;

public class EjercicioConVector {

    public static void main(String[] args) {

        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero para el vector: ");
            vector[i] = teclado.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                cont++;
            }

        }
        System.out.println("La cantidad de 3 encontrados es " + cont);

    }
}

package ejercicios.con.matriz;

import java.util.Scanner;

public class EjerciciosConMatriz {

    public static void main(String[] args) {
        double matriz[][] = new double[4][4];
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 4; f++) {
            double suma = 0.0;
            for (int c = 0; c < 4; c++) {
                if (c < 3) {
                    System.out.println("Ingrese la nota del alumno " + f);
                    matriz[f][c] = teclado.nextDouble();
                    suma += matriz[f][c];
                } else {
                    matriz[f][c] = suma / 3;
                }

            }
        }
        for (int f = 0; f < 4; f++) {
            double suma = 0.0;
            for (int c = 0; c < 4; c++) {
                if (c < 3) {
                    System.out.println("La nota" + c + " del alumno " + f + " es " + matriz[f][c]);

                } else {
                    System.out.println("El promedio del alumno " + f + " es " + matriz[f][c]);
                }

            }
        }
    }

}

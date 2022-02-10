package calculando.sueldos;

import java.util.Scanner;

public class CalculandoSueldos {

    public static void main(String[] args) {
        double sueldo = 021;
        int categoria;

        System.out.println("Ingrese el número de la categoría del sueldo a calcular :");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        switch (categoria) {
            case 1:
                sueldo = 15890 * 1.10;
                break;
            case 2:
                sueldo = 25630.89;
                break;
            case 3:
                sueldo = 35560.20 * 0.89;
                break;
            default:
                System.out.println("El número de categoría no es válido");

        }
        if ((categoria < 4) && (categoria > 0)) {
            System.out.println("El valor de la categoría " + categoria + " es de $ " + sueldo);
        }

    }

}

package repetidores;

public class Repetidores {

    public static void main(String[] args) {
        int cont = 0;
        while (cont <= 10) {
            System.out.println("Estoy en la vuelta " + cont + " del while");
            cont++;
        }
        for (int i = 0; i <= 10; i++ ){
            System.out.println("Estoy en la vuelta " + i + " del for");
        }
    }
       

}

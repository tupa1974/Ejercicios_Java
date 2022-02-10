
package variables;


public class Variables {

  
    public static void main(String[] args) {
      
        int num1, num2, resultado;
        
        num1 = 3;
        num2 = 4;
        
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es : " + resultado);
        
        if (num1 > num2){
            
            System.out.println("El numero 1 es mayor que el numero 2");
        }else{
            if (num1 == num2){
                System.out.println("Son iguales");
            }
            else{
            System.out.println("El numero 2 es mayor que el numero 1");
            }
        }
        
    }
    
}

package practicas_de_clase;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        
        //Declaración de variables
        int n1, n2; //Números de operacion
        char op; //Caracter de operación
        Scanner sc = new Scanner(System.in); //Variable Scanner
        
        //Ingreso de datos
        System.out.println("Ingrese el numero 1: "); n1 = sc.nextInt(); //Ingreso de n1
        System.out.println("Ingrese el número 2: "); n2 = sc.nextInt(); //Ingreso de n2
        System.out.println("¿Qué tipo de operación desea realizar?"); op = sc.next().charAt(0); //Ingreso de operación
        
        //Operaciones
        
        switch (op){
            case 'S':
            case 's': 
                System.out.println("El resultado de la suma es: "+ (n1+ n2));
            break;
            
            case 'R':
            case 'r':
                System.out.println("El resultado de la resta es: "+ (n1-12));
            break;
            
            case 'M':
            case 'm':
                System.out.println("El resultado de la multiplicación es: "+ (n1*n2));
            break;
            
            case 'D':
            case 'd':
                System.out.println("El resultadod de la división es: "+ (n1/n2));
            break;
            
            default: System.out.println("Operación no válida");
            break;
        }  
    }
}

package ejercicios_switch;
import java.lang.Math.*;      
import java.util.Scanner;
/*Elaborar un programa que muestre al usuario el siguiente menú y resuelva el problema correspondiente:
a. Área del triángulo
b. Área del cuadrado
c. Área del círculo*/
public class Ejercicio_3 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in); 
        char $entrada;
        double resultado;
        
        //Ingreso de opción de menú
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("        a. Área del triángulo");
        System.out.println("        b. Área del cuadrado");
        System.out.println("        c. Área del cuadrado");
        $entrada = sc.next().charAt(0);
        
        //Sentencia condicional SWITCH
        switch($entrada){
            case 'A':
            case 'a':
                //Ingreso de datos
                System.out.println("Ingrese la base del triangulo: "); double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triangluo: "); double altura = sc.nextDouble();
                
                //Operaciones
                resultado = (double)((base*altura)/2);
                
                //Salida de resultados
                System.out.println("El área del triangulo ingresado es: "+resultado);
            break;
            
            case 'B':               
            case 'b':
                //Ingreso de datos
                System.out.println("Ingrese un lado del cuadrado: "); double lado = sc.nextDouble();
                
                //Operaciones
                resultado = lado*lado;
                
                //Salida de resultados
                System.out.println("El área del cuadrado ingresado es: "+resultado);               
            break;
            
            case 'C':
            case 'c':
                //Ingreso de datos
                System.out.println("Ingrese el radio del círculo: ");double radio = sc.nextDouble();
                
                //Operaciones
                resultado = (radio*radio)* Math.PI;
                
                //Salida de resultados
                System.out.println("El área del círculo ingresado es: "+resultado);
                
            break;
            
            default: System.out.println("La opción ingresada no es válida");
            break;
        }
    }
}
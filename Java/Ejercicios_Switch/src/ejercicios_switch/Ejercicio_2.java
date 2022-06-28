package ejercicios_switch;
import java.util.Scanner;
/*Pedir al usuario un número entero entre 1 y 12 y mostrar la cantidad de días que tiene ese mes*/
public class Ejercicio_2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        int entrada; 
        Scanner sc = new Scanner(System.in); 
        
        //Entrada de datos
        System.out.println("Ingresee un número entre 1 y 12: "); entrada = sc.nextInt();
        
        //Sentencia condicional SWITCH
        
        switch(entrada){
            case 1: case 3: case 5: case 7: case 8: case 10:
            case 12: System.out.println("Número de més: "+entrada+". Número de días: 31");
            break;
            
            case 4: case 6: case 9: 
            case 11: System.out.println("Número de més: "+entrada+". Número de días: 30");
            break;
            
            case 2: System.out.println("Número de més: "+entrada+". Número de días: 28");
            break;
            
            default: System.out.println("El número introducido no se encuentra en el rango requerido");
            break;
        }
        
    }
}

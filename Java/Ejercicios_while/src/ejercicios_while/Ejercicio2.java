package ejercicios_while;
import java.util.Scanner;
/*
Realizar un programa que pida números enteros al usuario, hasta que el usuario teclee el'0' y mostrar en pantalla la suma de todos los 
números dados por el usuario.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n = 0,in = 0;
        
        //Ingreso de dato inicial
        System.out.println("Ingrese el primer número entero: "); in = sc.nextInt();
        
        //Proceso general
        while(in != 0){
            System.out.println("Ingrese un nuevo número: "); in = sc.nextInt();
            n += in;
        }
        System.out.println("El resultado de la suma fue: "+n);
    }
}

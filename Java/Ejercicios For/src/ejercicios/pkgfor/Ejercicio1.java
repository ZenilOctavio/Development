package ejercicios.pkgfor;
/*
Realizar la tabla de multiplicar de un número dado por el usuario (desde 1 hasta 10).
*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
       
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n;
        
        //Ingreso de datos
        System.out.println("Ingrese un número para sacar su tabla de multiplicar: ");
        n = sc.nextInt();
        
        //Llamada al método
        Ejercicio1.tabla(n);
        
    }
    public static void tabla(int n){
        System.out.println("La tabla del 1 - 10 de "+n+" es: "+"\n");
        for(int i= 1; i<11; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
package ejercicios.pkgfor;
/*
Realizar la siguiente sucesión de números utilizando el siclo for: X = x^3, la regla nos indica sacar el cubo del número de la 
iteración, el final de la sucesión lo determinará el usuario
*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int fin;
        
        //Ingreso de datos
        System.out.println("¿Cuál será el final de la suceción cúbica?"); fin = sc.nextInt();
        
        //Llamo al método
        Ejercicio5.sucesionCubo(fin);
    }
    public static void sucesionCubo(int n){
        for(int i = 1; i <=n; i++){
            System.out.println(i+"^3"+" = "+(i*i*i));
        }
    }
}
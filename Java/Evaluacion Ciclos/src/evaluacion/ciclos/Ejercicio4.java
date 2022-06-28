package evaluacion.ciclos;
/*
Realizar un programa que determine el número mayor de 10 números enteros itroducidos por el usuario, usando el ciclo while.
*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int[] serie = new int[10];
        int numeroMayor, contador = 0;
        
        //Ingreso de datos
        while(contador < 10){
            System.out.println("Numero "+(contador+1)+": ");
            serie[contador] = sc.nextInt();
            contador++;
        }
        
        //Proceso
        contador = 1;
        numeroMayor = serie[0];
        while(contador < serie.length){
            if(numeroMayor < serie[contador]){
                numeroMayor = serie[contador];
            }
            contador++;
        }
        
        //Salida de datos
        System.out.println("EL número mas grande de la suseción es: "+numeroMayor);
    }
}
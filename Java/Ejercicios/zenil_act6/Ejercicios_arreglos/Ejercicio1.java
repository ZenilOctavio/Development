package Ejercicios_arreglos;
/*
Elabora un programa que contenga un arreglo bidimensional de 4 x 4 y almacene solo los números pares a partir 
del número 20.

Solo se cambiará el lugar en el arreglo cuando se le ingrese un valor
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int arreglo[][] = new int[4][4],n,i = 0,j = 0;
       // System.out.println("EO");
        //Ciclo de ingreso de valores
        while(i<arreglo.length){
            j = 0;
            //System.out.println("EOO");
            while(j<arreglo[i].length){
                System.out.print("Ingrese el valor de la matriz en la posición "+i+"-"+j+":  ");
                n = sc.nextInt();
                if((n%2 == 0)&&(n>20)){
                    arreglo[i][j] = n;
                    j++;
                }
            }
            i++;
        }
        
        //Salida de datos
        System.out.println("Los valores de la matriz son: ");
        for (int[] fila : arreglo) {
            for(int columna : fila){
                System.out.print(columna+ " ");
            }
            System.out.println();
        }
    }
}
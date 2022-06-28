package Ejercicios_arreglos;
/*
Escribir un algoritmo que contenga el arreglo a[n][m] y formar la matriz traspuesta del arreglo a[m][n], 
mostrar ambas matrices en pantalla.
*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int matriz[][], matrizT[][], fila, columna;

        //Entrada de datos
        System.out.print("Ingrese la cantidad de filas que tendrá su matriz de enteros:  ");
        fila = sc.nextInt();
        System.out.print("\nIngrese la cantidad de columnas que tendrá su matriz de enteros:  ");
        columna = sc.nextInt();

        matriz = new int[fila][columna]; matrizT = new int[columna][fila];  //Adapto las matrices

        //Ingreso de valores a la matriz
        System.out.println("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el valor de la fila "+i+" y columna "+j+":  ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //Creación de la matriz transpuesta
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        //Salida de datos
        System.out.println("\n\nMatriz original");
        for (int[] i : matriz) {    //Matriz original
            for (int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz tranpuesta");

        for (int[] i : matrizT) {    //Matriz transpuesta
            for (int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
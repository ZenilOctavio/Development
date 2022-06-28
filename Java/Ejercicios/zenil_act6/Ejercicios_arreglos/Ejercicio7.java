package Ejercicios_arreglos;
/*
Algoritmo que llene dos vectores A y B de 45 elementos cada uno, sumar el elemento uno del vector A con el 
elemento uno del vector B y así sucesivamente hasta 45, almacenar el resultado en un vector C, e imprimir el 
vector resultante.
*/
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int arregloA[] = new int[45], arregloB[] = new int[45], arregloC[] = new int[45], limite;
        char seleccion;

        //Selección para llenar arreglos
        System.out.println("Comienza el programa: \n\n");
        System.out.println("Elija su opción:");
        System.out.println("          a) Introducir los números manualmente");
        System.out.println("          b) Rellenarlos automáticamente");
        seleccion = sc.nextLine().charAt(0);

        //Condicional
        if(seleccion == 'a' || seleccion == 'A'){
            for (int i = 0; i < arregloA.length; i++) {
                System.out.print("\nIntroduzca el valor en la posición "+i+" del arreglo A: ");
                arregloA[i] = sc.nextInt();
                System.out.println();
            }
            System.out.println("\n");
            for (int i = 0; i < arregloB.length; i++) {
                System.out.print("Introduzca el valor en la posición "+i+" del arreglo b: ");
                arregloB[i] = sc.nextInt();
                System.out.println();
            }
        }
        else if(seleccion == 'b' || seleccion == 'B'){
            System.out.println("\nIntroduzca el límite para los números a ingresar en los arreglos: ");
            limite = sc.nextInt();
            rellenarArr(arregloA, limite);  //Rellenamos el arreglo A
            rellenarArr(arregloB, limite);  //Rellenamos el arreglo B
        }

        //Proceso de datos
        for (int i = 0; i < arregloC.length; i++) {
            arregloC[i] = arregloA[i] + arregloB[i];
        }
        
        //Salida de datos
        System.out.println("\n");
        System.out.println("Arreglo A: ");
        for (int i : arregloA) {
            System.out.print(i+" ");
        }

        System.out.println("\n");

        System.out.println("Arreglo B: ");
        for (int i : arregloB) {
            System.out.print(i+" ");
        }

        System.out.println("\n");

        System.out.println("Arreglo C: ");
        for (int i : arregloC) {
            System.out.print(i+" ");
        }
    }
    public static int[] rellenarArr(int[] arr, int limite){         //Método para rellenar el arreglo
        double x;
        for(int i = 0; i<arr.length; i++){
            x = Math.random()*limite;
            arr[i] = (int)(x);
        }

        return arr;
    }
}
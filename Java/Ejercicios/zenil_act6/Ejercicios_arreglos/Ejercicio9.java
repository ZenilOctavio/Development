package Ejercicios_arreglos;
/*
Realizar un algoritmo que contenga dos arreglos a y b, en uno de ellos almacene los valores enteros de 0 a 
29 y en otros de ellos las letras del abecedario, preguntar al usuario un valor entero entre 0 y 29 y muestre 
en pantalla la letra correspondiente del abecedario.
*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        
        //Declaración de variables
        int numeros[] = new int[27],entrada;
        char abecedario[] = new char[27];
        Scanner sc = new Scanner(System.in);
        
        //Llenar arreglos
        for (int i = 0; i < abecedario.length; i++) {
            numeros[i] = i;
            abecedario[i] = (char)(i+97);
        }

        //Ingreso de datos
        System.out.println("Comienza el programa:\n");
        System.out.print("Ingrese el valor que desea buscar:  ");
        entrada = sc.nextInt();

        //Salida de información
        System.out.print("\nEl valor buscado es "+entrada+", el arreglo numérico contiene "+numeros[entrada]+" y el arreglo del abecedario contiene "+abecedario[numeros[entrada]]);
    }
}
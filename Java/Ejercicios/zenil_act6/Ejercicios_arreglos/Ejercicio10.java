package Ejercicios_arreglos;
/*
Elaborar un algoritmo que permita leer una lista de números de un arreglo de tamaño “n”, calcule la suma, 
promedio, cuadrado, cubo y desviación estándar de dichos valores. Mostrar los resultados en pantalla.
*/
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        
        //Declaración de variables
        int n;
        double arreglo[], promedio,suma = 0,cuadrado, cubo, desviacion = 0;
        Scanner sc = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Comienza el programa:\n");
        System.out.print("Ingrese el tamaño del arreglo:  ");
        n = sc.nextInt();

        arreglo = new double[n];    //Adapto el arreglo

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la posición "+i+": ");
            arreglo[i] = sc.nextInt();
            System.out.println();
        }

        //Proceso de datos
        for (double d : arreglo) {
            suma += d;
        }

        promedio = suma/n;
        cuadrado = suma*suma;
        cubo = cuadrado * suma;
        
        for (int i = 0; i < arreglo.length; i++) {
            desviacion += Math.pow(arreglo[i]-promedio,2);
        }
        desviacion /= (n-1);

        desviacion = Math.sqrt(desviacion);

        //Salida de resultados
        System.out.print("El arreglo es:\n");
        for (double d : arreglo) {
            System.out.print(d+" ");
        }

        System.out.println("\n");

        System.out.print("La suma es: "+suma+"\nEl promedio es: "+promedio+"\nEl cuadrado es: "+cuadrado+
        "\nEl cubo es: "+cubo+"\nLa desviación estandar es: "+desviacion);
    }
}

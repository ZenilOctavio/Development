package Ejercicios_arreglos;
/*
Algoritmo que permita calcular el promedio de 50 valores almacenados en un vector. Determinar además cuantos 
son mayores que el promedio, imprimir el promedio, el número de datos mayores que el promedio y una lista de 
valores mayores que el promedio.
*/
import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int serie[] = new int[50],contadorMayores,datosMayores[];
        double promedio;

        //Ingreso de valores
        for (int i = 0; i < serie.length; i++) {
            System.out.print("Ingrese el valor del numero en la posición "+i+":  ");
            serie[i] = sc.nextInt();
        }
        //Proceso de valores
        promedio = Ejercicio6.promedioArray(serie);
        contadorMayores = Ejercicio6.contarMayorEnArreglo(promedio, serie);
        datosMayores = Ejercicio6.getBiggerValues(promedio, serie);

        //Salida de valores
        System.out.println("\n");
        System.out.println("\nEl promedio es "+promedio+".");
        System.out.println("En el arreglo hay "+contadorMayores+" números mayores al promedio.");
        System.out.print("Los valores mayores al promedio son:  ");
        for (int i = 0; i < datosMayores.length; i++) {
            System.out.print(datosMayores[i]+" ");
        }
    }
    public static double promedioArray(int[]arreglo){

        //Declaración de variables
        double promedio = 0;

        //Recolección de valores
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }

        //Hago el promedio
        promedio /= arreglo.length;

        return promedio;
    }
    public static int contarMayorEnArreglo(double prom, int[]arreglo){

        //Declaración de variables
        int contador = 0;

        //Contar valores mayores al promedio
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > prom){contador++;}
        }

        return contador;
    }
    public static int[] getBiggerValues(double prom, int[] arreglo){

        //Declaración de variables
        String conjunto = "",array[];
        int values[] = new int[3];;

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > prom){
                conjunto += String.valueOf(arreglo[i])+",";
            }
        }
        StringBuilder conjunto$ = new StringBuilder(conjunto);
        conjunto$.deleteCharAt(conjunto.length()-1);

        conjunto = conjunto$.toString();

        array = conjunto.split(",");

        values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = Integer.parseInt(array[i]);
        }

        return values;
    }
}
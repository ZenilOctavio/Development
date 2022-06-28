package Ejercicios_arreglos;
/*
Realizar un algoritmo que permita guardar en un arreglo los primeros 100 números de la sucesión de Fibonacci.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        
        //Declaración de variables
        long pp=0,pa=0,ps=1,arreglo[] = new long[100];

        //Proceso de datos
        for(int i = 1; i<=arreglo.length; i++){
            arreglo[i-1] = pa;
            pp = pa;
            pa = ps;
            ps = pa + pp;
        }

        //Salida del arreglo
        System.out.println("El arreglo es:");
        for (long l : arreglo) {
            System.out.print(l+" ");
        }
    }
}
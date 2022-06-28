package Ejercicios_arreglos;
/*
En un arreglo bidimensional se almacena la cantidad de pc’s vendidos por tres empleados en 4 zonas diferentes, 
se pide realizar un algoritmo que muestre:

a. La zona que más computadoras vendió

b. El vendedor que menos computadoras vendió

c. La cantidad de computadoras vendidas por todos los vendedores en todas las zonas.
*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int ventas[][] = new int[3][4], //La primera dimensión se refiere a los empleados y la segunda a la zona
        indiceZona = 0,indiceVendedor = 0,contador = 0,aux = 0,totalVentas = 0,
        ventasZona[] = new int[4], ventasVendedor[] = new int[3];

        //Ingreso de datos
        System.out.println("Comienze a ingresar la información de las ventas.\n\n");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("¿Cuámtas pc's vendio el empleado "+(i+1)+" en la zona "+(j+1)+"?  ");
                ventas[i][j] = sc.nextInt();
                totalVentas += ventas[i][j];    //Sumo todas las ventas
            }
            System.out.println();
        }

        for (int i[] : ventas) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        ventasVendedor = getVentas(ventas, true);   //Obtengo los arreglos de cada uno
        ventasZona = getVentas(ventas, false);      //de los conjuntos necesarios

        System.out.println("\nVentas por vendedor: ");

        aux = ventasVendedor[0];
        for (int i = 0; i < ventasVendedor.length; i++){
            if(aux>ventasVendedor[i]){
                aux = ventasVendedor[i];
                indiceVendedor = i;
            }
        }

        aux = ventasZona[0];
        for (int i = 0; i < ventasZona.length; i++){
            if(aux<ventasZona[i]){
                aux = ventasZona[i];
                indiceZona = i;
            }
        }

        for (int i : ventasVendedor) {
            System.out.print(i+" ");
        }

        System.out.println("\nVentas por zona: ");
        for (int i : ventasZona) {
            System.out.print(i+" ");
        }

        //Salida de información
        System.out.println("\n\nLa zona con más ventas fue la zona "+ (indiceZona+1)+".\n" );
        System.out.println("El vendedor con menos ventas fue el vendedor " + (indiceVendedor+1)+".\n");
        System.out.print("Se consiguieron "+totalVentas+" de ventas en pc's.");

    }
    public static int[] getVentas(int matriz[][],boolean x){

        //Declaración de variables
        int arreglo[] = (x)?new int[matriz.length]:new int[matriz[0].length],acumulador = 0;

        if(x){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    acumulador += matriz[i][j];
                }
                arreglo[i] = acumulador;
                acumulador = 0;
            }
        }
        else{
            for (int i = 0; i < matriz[0].length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    acumulador += matriz[j][i];
                }
                arreglo[i] = acumulador;
                acumulador =0;
            }
        }

        return arreglo;
    }
}
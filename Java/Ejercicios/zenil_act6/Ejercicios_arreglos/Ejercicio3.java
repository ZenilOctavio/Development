package Ejercicios_arreglos;
/*
Escribir un programa que tenga un arreglo a[3][5] = {4,7,1,3,5,2,0,6,9,7,3,1,2,6,4}

Y lo muestre de la siguiente manera:

*/ 
public class Ejercicio3 {
    public static void main(String[] args) {
        int arregloBI[][] = {{4,7,1,3,5},{2,0,6,9,7},{3,1,2,6,4}},
        arregloBIF[][] = new int[5][3], 
        auxiliar[] = Ejercicio3.getValues(arregloBI),contador = 0;   //Arreglo auxiliar

        //Salida de la matriz inicial
        System.out.println("Matríz inicial:");
        for (int i[] : arregloBI) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Proceso de arreglo
        System.out.println("\n");
        for (int i = 0; i < arregloBIF[0].length; i++) {
            for (int j = 0; j < arregloBIF.length; j++) {
                arregloBIF[j][i] = auxiliar[contador];
                contador++;
            }
        }

        //Salida arreglo final
        System.out.print("Matriz final:\n");
        for (int i[] : arregloBIF) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static int[] getValues(int [][]matriz) {
        
        //Declaración de variables
        int aux[] = new int[(matriz.length*matriz[0].length)], i = 0;

        for (int fila[] : matriz) {
            for (int columna : fila) {
                aux[i] = columna;
                i++;
            }
        }
        return aux;
    }
}
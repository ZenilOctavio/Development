package Ejercicios_arreglos;
/*
Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce: nombre, horas trabajadas cada 
día de la semana (6 días) y sueldo por hora. Realizar un algoritmo que:

a. Calcule el total de horas trabajadas a la semana para cada trabajador thr[5][6]

b. Calcule el sueldo semanal para cada uno de ellos ss[5][6] = shr*thr[

c. Calcule el total que pagará la empresa

d. Indique el nombre del trabajador que labora más horas el día lunes [0]

e. Imprimir un reporte con todos los datos anteriores

NOTA: I = choferes; j = días de la semana
*/ 

/*  Especificaciones del programa
En este programa a los trabajadores se les dará un sueldo determinado por día, no será el mismo para todos los dias

*/ 
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double horasSemanales[][] = new double[5][6], sueldoDiarioHora[] = new double[5],
        totalHoras[] = new double[5], sueldoSemanal[] = new double[5], totalPagar = 0.0;
        int masHorasLunes;
        String nombres [] = new String[5], diasSemana [] = {"Lunes", "Martes","Miercoles","Jueves","Viernes","Sabado"};


        //Ingreso de datos
        System.out.println("Comienza el programa: ");
        for(int i = 0; i<nombres.length;i++){
            System.out.print("\n\nIngrese el nombre del trabajador "+(i+1)+":  ");
            nombres[i] = sc.nextLine();

            for(int j = 0; j<horasSemanales[i].length; j++){
                System.out.print("Ingrese las horas trabajadas el día "+ diasSemana[j]+" por " + nombres[i] +":  ");
                horasSemanales[i][j] = sc.nextDouble();
                
            }
            System.out.print("Ingrese el sueldo por hora de "+nombres[i]+":  ");
                sueldoDiarioHora[i] = sc.nextDouble();
                sc.nextLine();
        }

        //Proceso de datos
       // totalHoras = addArrayValues(horasSemanales);
        for(int i = 0; i<horasSemanales.length; i++){
            for(int j = 0; j<horasSemanales[i].length; j++){
            totalHoras[i] += horasSemanales[i][j];  //Sumo todas las horas de cada chofer  
            }
            sueldoSemanal[i] += sueldoDiarioHora[i] * totalHoras[i];    //Calculo el el sueldo semanal de cada chofer
            totalPagar += sueldoSemanal[i]; //Sumo todos los sueldos
        }
        masHorasLunes = biggerInArray(0, horasSemanales);
        

        //Salida de datos
        System.out.println("\n\n");
        for(int i = 0; i<horasSemanales.length; i++){
            System.out.println(nombres[i]+" trabajó "+ totalHoras[i] + " horas en la semana, a lo que le pagarán $"+sueldoSemanal[i]+" pesos esta semana.");
        }
        System.out.println("\nEl empleado con más horas el día Lunes fue "+nombres[masHorasLunes]+" con un total de "+horasSemanales[masHorasLunes][0]+" horas.");
        System.out.print("\nLa empresa tendrá que gastar $"+ totalPagar + " pesos en sueldos de sus choferes.");
    }
    public static int biggerInArray(int index, double matriz [][]){

        //Declaración de variables
        double comparador = matriz[0][index];
        int indice = 0;

        for(int i = 0;i<matriz.length;i++){
            if(matriz[i][index] > comparador){comparador = matriz[i][index]; indice = i;}
        }
        return indice;
    }
    public static double[] addArrayValues(double [][]matriz){

        //Declaración de variables
        double[] arreglo = new double[matriz.length];

        //Proceso de suma
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                arreglo[i] += matriz[i][j];
            }
        }
        return arreglo;
    }
}
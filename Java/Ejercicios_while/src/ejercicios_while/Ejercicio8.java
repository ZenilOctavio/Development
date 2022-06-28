package ejercicios_while;
/*
Elaborar un programa que calcule el promedio final de un alumno, el alumno debe introducir la cantidad de materias que cursa, y aparte 
del promedio, debe indicar si es aprobado o no (promedio mínimo de 70 para aprobar)
*/
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n, i = 0;
        double prom = 0;
        
        //Ingreso de datos
        System.out.println("Ingrese la cantidad de materias: ");
        n = sc.nextInt();
        System.out.println("");
        if(n<= 0){System.out.println("Cantidad inválida");System.exit(0);}
        int[] materias = new int[n];
        
        do{
            System.out.println("Ingrese el promedio de la materia "+(i+1));
            materias[i] = sc.nextInt();
            System.out.println("");
            i++;
        }while(i<n);
        System.out.println("");
        System.out.println("");
        
        //Proceso de datos
        i = 0;
        do{
            prom += materias[i];
            i++;
        }while(i<n);
        prom /= n;
        
        //Salida de datos
        i = 0;
        do{
            System.out.print("Materia "+(i+1)+": "+materias[i]+". ");
            if(materias[i]>=70){
                System.out.print("Situación: Aprobado");
                System.out.println("");
            }
            else{
                System.out.print("Situación: Reprobado");
                System.out.println("");
            }
            i++;
        }while(i<n);
        System.out.println("");
        System.out.print("El promedio general es: "+ prom+". ");
        if(prom>=70){
            System.out.print("Situación: Aprobado");
        }
        else{
            System.out.print("Situación: Reprobado");
        }
    }
}
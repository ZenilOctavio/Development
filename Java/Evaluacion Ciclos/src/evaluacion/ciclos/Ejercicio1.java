package evaluacion.ciclos;
/*
Escribir un programa que solicite ingresar n calificaciones de alumnos y nos informe cuántos tienen calificaciones mayores o iguales a 
75 y cuántos menores. El programa termina cuanto se ingrese un valor de 0. (puedes usar cualquier ciclo de tu preferencia)
*/
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        List calificaciones = new ArrayList();
        int [] checker = new int[3];
        int contador = 0;
        
        //Ingreso de valores       
        System.out.println("Comienza a ingresar las calificaciones \nEste programa solo acepta enteros del 1-100 \nEscribe 0 para terminar\n");
        do{
            System.out.println("\nAlumno "+(contador+1)+":");
            checker[0] = sc.nextInt();
            if(checker[0]>=0 && checker[0]<101){
                if(checker[0] != 0){calificaciones.add(checker[0]); contador++;}
            }
            else{
                System.out.println("\nValor inválido, vuelve a ingresarlo: ");
            }
        }while(checker[0] != 0);
        
        //Proceso de datos
        checker[1] = 0;
        checker[2] = 0;
        
        for(contador = 0; contador< calificaciones.size(); contador++){
            if(((int)(calificaciones.get(contador)))>= 75){
                checker[1]++;
            }
            else{
                checker[2]++;
            }
        }
        
        //Salida de datos
        System.out.println("\n\nCalificaciones mayores o iguales a 75: "+checker[1]);
        System.out.println("Calificaciones menores a 75: "+checker[2]);
    }
}
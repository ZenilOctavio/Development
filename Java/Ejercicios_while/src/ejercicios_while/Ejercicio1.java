package ejercicios_while;
import java.util.Scanner;
/*
Realizar un programa que pida "n" cantidad de alumnos sus calificacipones finales de la materia de programación e imprima en pantalla 
el promedio final de la materia, también debería imprimir la cantidad de alumnos que registraron su calificación.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n,i = 0;
        double prom = 0;
        
        //Ingreso de datos
        System.out.println("¿Cuantos alumnos ingresarán su calificación?"); n = sc.nextInt();
        
        while(i<n){
            System.out.println("Ingrese la calificación del alumno "+(i+1)+": "); prom += sc.nextDouble();
            i++;
        }
        
        //Proceso de datos
        prom /= n;
        
        //Salida de datos
        System.out.println("El promedio de los "+n+" alumnos fue: "+(prom));
        
    }
}

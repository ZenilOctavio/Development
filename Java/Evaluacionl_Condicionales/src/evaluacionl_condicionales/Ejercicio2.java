package evaluacionl_condicionales;
/*
Realizar un programa que pida una calificación a un alumno (0 – 10) y a través de un switch decirle su grado de acuerdo con las 
siguientes opciones:
  
a.       5 = Insuficiente
  
b.       6  = Regular
  
c.       7 = Suficiente
  
d.       8 = Notable
  
e.       9 = Sobresaliente
  
f.        10 = Mención honorifica
  
g.       Cualquier otra calificación mostrar el mensaje de “Calificación invalida”
*/
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int calificacion;
        
        //Ingreso de datos
        System.out.println("Ingresa la calificación (0-10): "); calificacion = sc.nextInt();
        
        switch(calificacion){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Calificación insuficiente");
            break;
            
            case 6:
                System.out.println("Calificación regular");
            break;
            
            case 7:
                System.out.println("Calificación suficiente");
            break;
            
            case 8:
                System.out.println("Calificación notable");
            break;
            
            case 9:
                System.out.println("Calificación sobresaliente");
            break;
            
            case 10:
                System.out.println("Calificación digna de una mención honorífica");
            break;
            
            default:
                System.out.println("Calificación inválida");
            break;
        }
    }
}

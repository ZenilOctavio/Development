import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double teoria, problemas, practica, promedio;
        
        //Ingreso de datos
        System.out.println("Ingrese la calificación de la parte teorica del 1-100"); teoria = sc.nextDouble();
        System.out.println("Ingrese la calificación de la parte práctica del 1-100"); practica = sc.nextDouble();
        System.out.println("Ingrese la calificación de los problemas del 1-100"); problemas = sc.nextDouble();
        
        //Condicional
        if(((teoria <= 100)&&(teoria >= 0))&&((practica <= 100)&&(practica >= 0))&&((problemas <= 100)&&(problemas >= 0))){
            //Operaciones si "true"
            teoria *= .4;
            practica *= .1;
            problemas *= .5;
            
            promedio = teoria + practica + problemas;
            
            System.out.println("El promedio obtenido dadas las calificaciones ingresadas fue de: " + promedio);
        }
        else{
            System.out.println("Las calificaciones ingresadas no se encuentran en el rango del 1- 100");
        }
    }
}

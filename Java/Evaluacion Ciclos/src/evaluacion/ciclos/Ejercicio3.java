package evaluacion.ciclos;
/*
Realizar un programa el cual genere un número alatorio entre 0 y 100(Math.random()*100) y el usuario lo adivine. En cada intento el 
usuario ingresará un número entre 1 y 100 y se deberá mostrar si el número que ingresó es menor o mayor que el núemro generado(random). 
El juego termina cuando se acierte el número o ha realizado un máximo de 5 intentos, se deberá mostrar al ususario la calificación 
obtenida: (ciclo dowhile)
*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int numeroRandom = (int)(Math.random()*100);
        int contador = 1;
        int ingreso;
        
        //Proceso
        System.out.println("El juego consiste en ingresar números del 1 al 100 hasta adivinar el número que generó el programa");
        System.out.println("Solo tienes 5 intentos");
        do{
            System.out.println("Intento "+contador+":"); ingreso = sc.nextInt();
            if(ingreso != numeroRandom){
                contador++;
                if(ingreso < numeroRandom){
                    System.out.println("El número ingresado es menor \n");
                }
                else{
                    System.out.println("El número ingresado es mayor \n");
                }
            }
        }while((ingreso != numeroRandom)&&(contador < 6));
        
        //Resultados
        switch(contador){
            case 1:
                System.out.println("Adivinaste, eres un genio");
            break;
            
            case 2:
            case 3:
                System.out.println("Adivinaste, que suerte la tuya");
            break;
            
            case 4:
            case 5:
                System.out.println("Adivinaste, no está mal");
            break;
            
            case 6:
                System.out.println("Perdiste ☹");
                System.out.println("El numero era "+ numeroRandom);
            break;
        }
    }
}

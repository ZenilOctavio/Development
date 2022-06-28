package ejercicios_while;
/*
Utilizando el ciclo do-while realizar el siguiente programa siguiendo el menú de opciones:
a. Imprimir los números del 50 al 250
b. Imprimir solo los números pares del 100 al 500
c. Imprimir solo los números múlitplos e 3 del 3 al 300
d. Salir
*/
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int inicio = 0,fin = 0,divisor = 0;
        char choice;
        
        //Salida/Entrada de datos
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("a. Imprimir los números del 50 al 250");
        System.out.println("b. Imprimir solo los números pares del 100 al 500");
        System.out.println("c. Imprimir solo los números múlitplos e 3 del 3 al 300");
        System.out.println("d. Salir");
        choice = sc.next().charAt(0);
        
        switch(choice){
            case 'A':
            case 'a':
                inicio = 50;
                fin = 251;
                divisor = 1;
            break;
            
            case 'B':
            case 'b':
                inicio = 100;
                fin = 501;
                divisor = 2;
            break;
            
            case 'C':
            case 'c':
                inicio = 3;
                fin = 301;
                divisor = 3;
            break;
            
            case 'D':
            case 'd':
                System.exit(0);
            break;
        }
        do{
            if(inicio%divisor == 0){
                System.out.print(inicio+" ");
            }
            inicio++;
        }while(inicio<fin);
        
    }
}
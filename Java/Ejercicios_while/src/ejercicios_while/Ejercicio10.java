package ejercicios_while;
/*
Programa que lea un núemro natural y diga si es o no es triangular. A saber: un número N es triangular si, y solamente si, es la suma 
de los primeros M números naturales, para algún valor de M. Ejemplo: 6 es triangular pues 6 = 1+2+3. Una forma de obtener los números 
triangulares es aplicando la fórmula: (n*(n+1))/2
*/
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n;
        
        //Ingreso de valores
        System.out.println("Ingrese el valor de \"n\": ");
        n = sc.nextInt();
        System.out.println("");
        
        //Llamo a la función
        triangular(n);
    }
    public static void triangular(int x){
        
        //Declaración de variables
        int i = 1,contador = 0;
        String serie = "";
        
        //Proceso
        do{
            contador += i;
            if(contador == x){
                serie += i;
            }
            else{
                serie += i+" + ";
            }
            i++;
        }while(contador < x);
        
        if(contador == x){
            System.out.println("Si es un número triangular para M = "+(i-1));
            System.out.println("y sus números son");
            System.out.print(serie + " = "+contador +"\n");       
        }
        else{
            System.out.println("El valor de \"n\" no es triangular");
        }
        
    }
}
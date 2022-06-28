package ejercicios_while;
/*
Programa que pida la usuario n cantidad de números e imprima solo los números positivos, el programa debe parar cuando el usuario 
teclee '0'.
*/
import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        
        //Declaración de varibales
        Scanner sc = new Scanner(System.in);
        int i = 0;
        List serie = new ArrayList();
        
        
        //Ingreso de datos   
        System.out.println("Comience a ingresar los números: ");
        do{
            serie.add(sc.nextInt());
            i++;
        }while(((int)(serie.get(i-1))) != 0);
        System.out.println("");
        System.out.println("");
 
        //Salida de datos
        i = 0;
        System.out.println("Los números positivos introducidos son: ");
        do{
            if(((int)(serie.get(i)))>0){
                System.out.println("Posición "+(i+1)+": "+(serie.get(i)));
            }
            i++;
        }while(i<serie.size());
    }
}
package ejercicios.pkgfor;
/*
Escribir un programa en el que se pregunte al usuario por una frase y una letra, y se muestre por pantalla el número de veces que 
aparece la letra en la frase
*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String frase;
        char letra;
        
        //Ingreso de datos
        System.out.println("Ingrese la frase que desea analizar: "); frase = sc.nextLine();
        System.out.println("\nIngrese la letra que desea buscar: "); letra = sc.nextLine().charAt(0);
        
        //Egreso de datos
        System.out.println("\n\nLa letra ingresada se repite "+Ejercicio4.countChar(frase, letra)+" veces");
    }
    public static int countChar(String cadena, char caracter){
        int counter = 0;
        for(int i = 0; i<cadena.length(); i++){
            if(caracter == cadena.charAt(i)){
                counter++;
            }
        }
        return counter;
    }
}
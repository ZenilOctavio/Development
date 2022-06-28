package ejercicios_while;
/*
Una planta que fabrica perfiles de hierro posee un lote de n piezas. Elaborar un programa que pida ingresar por un teclado la cantidad 
de piezas a procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya logitud esté comprendida en el rango de 
1,2 y 1,3 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.
*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n,contador = 0;
        
        //Primer ingreso de datos
        System.out.println("Ingrese la cantidad de piezas a procesar: "); n = sc.nextInt();
        
        //Creación del arreglo
        double[] lista = new double[n];
        
        //Segundo ingreso de datos
        while(contador < lista.length){
            System.out.println("Ingrese la longitud de la pieza "+(contador+1)+": "); lista[contador] = sc.nextDouble();
            contador++;
        }
        contador = 0;
        //Salida/proceso de piezas piezas aptas
        while((contador<lista.length)){
            if((lista[contador]<=1.3)&&(lista[contador]>=1.2)){
                System.out.println("La pieza "+(contador+1)+" es apta");
            }
            contador++;
        }
    }
}
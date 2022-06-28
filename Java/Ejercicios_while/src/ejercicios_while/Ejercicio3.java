package ejercicios_while;
import java.util.Scanner;

/*
Crear un programa que permita al usuario ingresar los montos de las compras de un cliente (se desconoce la cantidad de datos que cargará,
la cual puede cambiar en cada ejecución), cortando el ingreso de datos cuando el usuario ingrese el monto 0. 
Si ingresa un monto negativo, no se debe procesar y se debe pedir que ingrese un nuevo monto. Al finalizar, 
informar el total a pagar teniendo en cuenta que si las ventas superan de $1000, se le debe aplicar un 10% de descuento.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
    
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double ingreso =1,lista = 0;
        int contador = 0;
        
        //Ingreso de datos
        System.out.println("Comienza a ingresar los montos: ");
        
        while(ingreso !=0){
            System.out.println("Monto del articulo "+(contador+1)+" :"); ingreso = sc.nextDouble();
            lista += ingreso;
            contador++;
        }
        
        //Proceso de datos
        if(lista >= 1000){
            lista*= .9;
        }
        contador -=1;
        
        //Salida de datos
        System.out.println("El total a pagar es: "+lista);
        System.out.println("El total de articulos es: "+contador);
    }
}
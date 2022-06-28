package evaluacionl_condicionales;
/*
Se ingresan 3 valores por pantalla. El primero es la cantidad de kilómetros a recorrer con un auto. El segundo es el precio de un litro 
de combustible. El tercero es el precio del peaje a cruzar. Se pide que realice un algoritmo que permita calcular el gasto para ir y 
volver a cualquier lugar sabiendo que… 
  
a.       El auto consume 1 litro de combustible cada 13 kilómetros.
  
b.       La cantidad de peajes son 2 (con el mismo precio ambos) hasta la llegada.
  
c.       Si la cantidad de kilómetros es mayor a 400 kilómetros, se cobrarán 50 pesos más por demora. 
*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double distancia, $litro, $peaje, total;
        
        //Ingreso de datos
        System.out.println("Ingrese el la cantidad de kilómetros a recorrer");
        distancia = sc.nextDouble();
        
        System.out.println("Ingrese el precio por litro de combustible");
        $litro = sc.nextDouble();
        
        System.out.println("Ingrese el precio del peaje a cruzar");
        $peaje = sc.nextDouble();
        
        total = ((distancia/13)*$litro);
        
        total += $peaje*2;
        
        if(distancia>400){
            total += 50;
        }
        
        System.out.println("El total a pagar es: "+ total);
    }
}



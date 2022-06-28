package evaluacionl_condicionales;
/*
Una compañía dedicada al alquiler de automóviles cobra un monto fijo de $300000 para los primeros 300 km de recorrido. Para más de 300 km
y hasta 1000 km, cobra un monto adicional de $ 15.000 por cada kilómetro en exceso sobre 300. Para más de 1000 km cobra un monto 
adicional de $ 10.000 por cada kilómetro en exceso sobre 1000. Los precios ya incluyen el 20% del impuesto general a las ventas, IVA. 
Diseñe un algoritmo que determine el monto a pagar por el alquiler de un vehículo y el monto incluido del impuesto.
*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double recorrido, total = 0, subtotal, iva;
        
        //Ingresos de datos
        System.out.println("Ingrese la cantidad de kilómetros a recorrer"); recorrido = sc.nextDouble();
        
        //Proceso
        total = 300000;
        if(recorrido <=300){
            
        }
        else if((recorrido > 300)){
            total += (recorrido-300)*15;
            
            if(recorrido > 1000 ){
                total += (recorrido -1000)*10;
            }
        }
        
        subtotal = total / 1.2;
        iva = subtotal * .2;
        
        System.out.println("El monto a pagar por el vehículo es: "+subtotal);
        System.out.println( "El impuesto será: "+iva);
        System.out.println(" y el total será: " + total);
        
    }
}

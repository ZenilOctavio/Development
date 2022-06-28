/*
Elaborar un programa para dar el total a pagar de un helado
de acuerdo al topping que elija el ususario, solo puede elegir 1.
 */
package practicas_de_clase;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Declaración de varibales
        Scanner sc = new Scanner(System.in);
        int topping, precio = 15;
        
        
        //Entrada de datos
        System.out.println("¿Qué topping desea para su helado?");
        System.out.println("1) Sin topping");
        System.out.println("2) Oreo");
        System.out.println("3) Kitkat");
        System.out.println("4) Brownie");
        System.out.println("5) Frutos rojos");
        System.out.println("6) Frutos secos");
        System.out.println("7) Miel de abeja");
        topping = sc.nextInt();
        
        //Proceso de datos
        
        switch(topping){
            case 1: 
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            case 2:
                precio += 5;
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            case 3:
                precio += 5;
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            case 4:
                precio += 12;
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            case 5:
                precio += 15;
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            case 6:
                precio += 15;
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            case 7:
                precio += 17;
                System.out.println("El precio de tu helado será: "+precio);
            break;
            
            default:
                System.out.println("Esa no es una opción disponible");
            break;
        }
    }
}
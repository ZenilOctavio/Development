/*
A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000,
por encima de 1000 y hasta 2000 el 5% del adicional y por encima de 2000 3l 3% del adicional.
Calcular el descuento y el sueldo neto que recibe el trabajador dado su sueldo.
 */
package practicas_de_clase;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        float sueldo;
        
        //Ingreso de datos
        System.out.println("Ingrese el sueldo: "); sueldo = sc.nextFloat();
        
        sueldo -= sueldo *.1;
        //Sentencia condicional 
        
        if (sueldo <= 1000){
            System.out.println("Tu sueldo final será: "+sueldo);
        }
        else if((sueldo > 1000)){
            sueldo -= sueldo*.05;
            if(sueldo <= 2000){
                System.out.println("Tu sueldo final será: "+sueldo);
            }
            else{
                sueldo -= sueldo*.03;
                System.out.println("Tu sueldo final será: "+sueldo);
            }
        }
    }
}

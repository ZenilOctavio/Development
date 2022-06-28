/*
Elaborar un algoritmo que determine el valor de la hipotenusa de un triángulo rectángulo a partir del valor de al longitud de sus dos catetos.
 */
package practicas_de_clase;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double catetoa,catetob,hipotenusa;
        
        //Ingreso de valores
        System.out.println("Ingrese el valor para el cateto A: ");catetoa = sc.nextFloat();
        System.out.println("Ingrese el valor para el cateto B: ");catetob = sc.nextFloat();
        
        if((catetoa > 0)&&(catetob > 0)){
            hipotenusa = Math.sqrt((catetoa*catetoa)+(catetob*catetob));
            System.out.println("La hipotenusa del triangulo planteado es: "+hipotenusa);
        }
        else{
            System.out.println("Alguno de las medidas introducidas son inválidas");
        }
    }
}

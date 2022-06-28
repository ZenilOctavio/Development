package ejercicios.pkgfor;
/*
Una tienda de productos artesanales actualiza cada seis meses los precios de una "jícara" hecha a mano y sobre pedido, que vende en 
función a los valores oficiales de la inflación mensual. Se requiere realizar un programa que proporcione el precio actualizado a partir 
del precio anterior y los valores de inflación. La empresa nos proporciona la siguiente fórmula que ellos aplican para calcular estks 
valores.precio = precio*(inflación mes/mes) + precio * ( 1 + (inflación mes/100))
*/
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double[] inflacionMensual = new double[6];
        double precio;
        
        //Ingreso de datos
        System.out.println("Ingrese el precio inicial del producto: "); precio = sc.nextDouble();
        System.out.println("\n"+"\n"+"Comience a ingresar la inflación de cada mes:"+"\n");
        
        for(int i = 0;i<inflacionMensual.length; i++){
            System.out.println("Inflacion del mes "+(i+1));  inflacionMensual[i] = sc.nextDouble();
        }
        
        //Llamo al metodo
        System.out.println("\n\n"+"El precio final de la jícara es: $"+ Ejercicio2.interesCompuesto(inflacionMensual, precio));
    }
    
    public static double interesCompuesto(double[] serie, double precioInicial){
        for(int i = 0; i<serie.length;i++){
            precioInicial *= (1+(serie[i]/100));
        }
        return precioInicial;
    }
}
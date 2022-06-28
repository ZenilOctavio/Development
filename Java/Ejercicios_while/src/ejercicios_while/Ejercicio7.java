package ejercicios_while;
/*
Elaborar un programa que calcule el total de compra de una serie de n productos introducidos por el usuario, se debe preguntar al usuario
la cantidad y nombre del producto. El programa debe calcular el subtotal de compra, iva (16%) y el total a pagar.
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n, i = 0;
        double subtotal = 0,total,iva;
        
        //Ingreso de datoss
        System.out.println("Comienza el listado, introduce la cantidad de productos distintos de la lista");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        if(n<=0){System.out.println("Cantidad inválida"); System.exit(0);}
        String [] productos = new String[n];
        int [] cantidad = new int[n];
        double [] precio = new double[n];
        
        do{
            System.out.println("Escribe el nombre del producto "+(i+1)+":");
            productos[i] = sc.nextLine();
            System.out.println("");
            
            System.out.println("Escribe la cantidad de este producto: ");
            cantidad[i] = sc.nextInt();
            System.out.println("");
            
            System.out.println("Escribe el precio unitario de este producto: ");
            precio[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("");
            
            i++;
        }while(i<n);
        
        //Proceso
        i = 0;  //Establezco mi variable contador como 0 otra vez
        
        do{
            subtotal += (cantidad[i])*(precio[i]);  //A subtotal se le sumará la multiplicación de los precios por su cantidad
            
            i++;
        }while(i<n);
        
        iva = subtotal*.16;
        total = subtotal + iva;
        
        //Salidad de datos
        i = 0;
        System.out.println("Nombre del producto   |   Precio unitario   |   Cantidad   |   Monto  ");
                                                 
        do{                                      
        System.out.println(productos[i]+"   |   "+precio[i]+"   |   "+cantidad[i]+"   |   "+(cantidad[i]*precio[i]));
        i++;
        }while(i<n);
        System.out.println("                                                  Subtotal: "+subtotal);
        System.out.println("                                                       IVA: "+iva);
        System.out.println("                                                     Total: "+total);
    }
}
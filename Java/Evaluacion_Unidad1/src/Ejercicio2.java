import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String nombre; int cantidad; double precio, subtotal, total;
        
        //Ingreso de datos
        System.out.println("Ingrese el nombre del producto"); nombre = sc.nextLine();
        System.out.println("Ingrese la cantidad para llevar"); cantidad = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto"); precio = sc.nextDouble();
        
        //Operaciones
        if((cantidad > 0)&&(precio > 0)){
            subtotal = cantidad * precio;
            total = subtotal*1.16;
            
            System.out.println("Producto: "+nombre);
            System.out.println("Cantidad: "+cantidad);
            System.out.println("Subtotal: "+subtotal);
            System.out.println("IVA: "+(subtotal*.16));
            System.out.println("Total: "+total);
        }
        else{
            System.out.println("Los números ingresados son inválidos");
        }
    }
}
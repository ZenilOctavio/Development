import java.util.Scanner;
public class Num3 {
    public static void main(String[] args) {
    //variables
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159265;
        double radio, area;
    //Ingreso de datos   
        System.out.println("Ingrese el valor del radio: ");
        radio = sc.nextDouble();
    //operaciones
        area = PI*(radio*radio);
        
    //Salida
        System.out.println("El área del circulo ingresado es: "+area);
    }
}

import java.util.Scanner;
public class Num1 {
    public static void main(String[] args) {
        int num1, num2, resta, suma, multiplicacion;double division;
        
        Scanner sc = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.println("Escribe el valor del primer número: ");
        num1 = sc.nextInt();
        System.out.println("Escribe el valor del segundo número: ");
        num2 = sc.nextInt();
        
        //Operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double)num1/(double)num2;
         
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
}
}

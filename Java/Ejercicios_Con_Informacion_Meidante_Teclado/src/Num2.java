import java.util.Scanner;
public class Num2 {
    public static void main(String[] args) {
        //variables
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        //Ingreso de datos
        System.out.println("Ingrese el valor del primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        num2 = sc.nextInt();
        //operaciones
        if(num1>num2){
            System.out.println("El número más grande es: "+num1);
        }
        else if (num1 == num2){
            System.out.println("Ambos numeros equivalen a: "+num1);
        }
        else{
            System.out.println("El número más grande es: "+num2);
        }
        
    }
}

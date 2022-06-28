import java.util.Scanner;
public class Caracteres {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        char a, b;
        
        //Ingreso de datos
        System.out.println("Ingrese el valor de \"a\""); a = sc.nextLine().charAt(0);
        System.out.println("Ingrese el valor de \"b\""); b = sc.nextLine().charAt(0);
        
        //Operaciones
        
        if(a == b){
            System.out.println("Ambos números son iguales");
        }
        else{
            System.out.println(a+" es diferente de "+b);
        }
        
    }
}

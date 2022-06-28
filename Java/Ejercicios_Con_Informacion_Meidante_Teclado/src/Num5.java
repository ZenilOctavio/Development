import java.util.Scanner;
public class Num5 {
    public static void main(String[] args) {
        //Declaración de variables
        String name; Scanner sc = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Introduce tu nombre:");
        name = sc.nextLine();
        
        //Salida de datos
        System.out.println("Hola "+name);
    }
}

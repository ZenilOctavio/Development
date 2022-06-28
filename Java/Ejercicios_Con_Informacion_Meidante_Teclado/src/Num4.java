import java.util.Scanner;
public class Num4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        char toNum; int fin;
        Scanner sc = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Ingrese el caractér que desea transformar:");
        toNum = sc.nextLine().charAt(0);
        
        //Transformar datos
        fin = (int)toNum;
        
        //Salida
        System.out.println("El valor del caractér es: "+fin);
    }
}

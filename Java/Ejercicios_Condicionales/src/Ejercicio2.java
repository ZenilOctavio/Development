import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Declaración de variables
        String user, password;
        Scanner sc = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.println("Ingrese el nombre de usuario:"); user = sc.nextLine();
        System.out.println("Ingrese su contraseña:"); password = sc.next();
        
        //Operaciones
        if("admin_123".equals(password)){
            System.out.println("Tiene acceso");
        }
        else{
            System.out.println("Contraseña incorrecta, no tiene acceso");
        }
           
    }
}

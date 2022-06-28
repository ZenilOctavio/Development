package ejercicios_switch;
import java.util.Scanner;
/*Pedir un número entero al usuario y realizar la operación según el siguiente menú
a. Numero par o impar
b. Elevar el núemro a "x" potencia
c. Numero primo o no primo
d. Salir (System.exit(0))*/
public class Ejercicio_5 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int n,x;double y; char entrada;
        
        //Entrada de datos
        System.out.println("Ingrese el número: "); n = sc.nextInt();
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("        a. Verificar si es par o impar");
        System.out.println("        b. Elevar el número a \"x\" potencia");
        System.out.println("        c. Saber si es primo o no");
        System.out.println("        d. Salir");
        entrada = sc.next().charAt(0);
        
        //Sentencia condicional SWITCH
        switch(entrada){
            case 'A':
            case 'a':
                x = n%2;
                
                switch(x){
                    case 0: System.out.println("El número "+n+" es par.");
                    break;
                    
                    default: System.out.println("El número "+n+" no es par.");
                }
            break;
            
            case 'B':
            case 'b':
                System.out.println("Ingrese la potencia a la que desea elevar"); x = sc.nextInt();
               
                //Operacion
                y = Math.pow(n, x);
                
                //Salida de datos
                System.out.println("El valor "+n+" elevado a la "+x+" es: "+y);
            break;
            
            case 'C':
            case 'c':
                boolean b = true;
                for(int i = 2; i<n; i++){
                    b = (b) &&(n%i != 0);
                }
                if(b){
                    System.out.println("El número es primo");
                } 
                else{
                    System.out.println("El número no es primo");
                }
            break;
            
            case 'D':
            case 'd':
                System.exit(0);
            break;
            
            default: System.out.println("Opción no válida");
            break;
        }
    }
}

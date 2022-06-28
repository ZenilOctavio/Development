package practicas_de_clase;
import java.util.Scanner;
public class Ejercicio1 {   
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        float ingresokg, egresox;
        char unidad;
        
        //Entrada de datos
        System.out.println("Ingrese el valor en KG que desea cambiar"); ingresokg = sc.nextFloat();
        System.out.println("¿A qué unidad desea transformar?");
        System.out.println("a) Decagramos");
        System.out.println("b) Gramos");
        System.out.println("c) Decigramos");
        System.out.println("d) Centigramos");
        System.out.println("e) Miligramos");
        unidad = sc.next().charAt(0);
        
        //Estructura condicional SWITCH
        switch(unidad){
            case 'A':
            case 'a':   
                egresox = ingresokg*100;
                System.out.println("El valor de "+ingresokg+" KG es igual a "+egresox+" DECAGRAMOS.");
            break;
            
            case 'B':
            case 'b':
                egresox = ingresokg*1000;
                System.out.println("El valor de "+ingresokg+" KG es igual a "+egresox+" GRAMOS.");
            break;
            
            case 'C':
            case 'c':
                egresox = ingresokg*10000;
                System.out.println("El valor de "+ingresokg+" KG es igual a "+egresox+" DECIGRAMOS.");
            break;
            
            case 'D':
            case 'd':
                egresox = ingresokg*100000;
                System.out.println("El valor de "+ingresokg+" KG es igual a "+egresox+" CENTIGRAMOS.");
            break;
            
            case 'E':
            case 'e':
                egresox = ingresokg*1000000;
                System.out.println("El valor de "+ingresokg+" KG es igual a "+egresox+" MILIGRAMOS.");
            break; 
        }
    } 
}

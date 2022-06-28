package ejercicios_switch;
import java.util.Scanner;
/*Pedir al usuario un número entero entre 1 y 12 y mostrar el mes correspondiente al número*/
public class Ejercicio_1 {
    public static void main(String[] args) {
        
        //Declaración de variables
        int entrada; 
        Scanner sc = new Scanner(System.in); 
        
        //Entrada de datos
        System.out.println("Ingrese un número entre 1 y 12: ");entrada = sc.nextInt();
        
        //Sentencia condicional SWITCH
        
        switch(entrada){
            case 1: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Enero");
            break;
            
            case 2: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Febrero");
            break;
            
            case 3: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Marzo");
            break;
            
            case 4: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Abril");
            break;
            
            case 5: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Mayo");
            break;
            
            case 6: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Junio");
            break;
            
            case 7: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Julio");
            break;
            
            case 8: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Agosto");
            break;
            
            case 9: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Septiembre");
            break;
            
            case 10: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Octubre");
            break;
            
            case 11: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Noviembre");
            break;
            
            case 12: System.out.println("Numero de mes: "+entrada+". Nombre de mes: Diciembre");
            break;
            
            default: System.out.println("El número introducido no se encuentra en el rango requerido");
            break;
        }     
    }
}

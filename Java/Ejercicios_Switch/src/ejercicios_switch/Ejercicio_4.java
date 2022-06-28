package ejercicios_switch;
import java.util.Scanner;
/*Elaborar un programa que calcule el suedo semanal de un empleado, según el turno trabajado.
Para el empleado se debe pedir nombre, horas trabajadas, sueldo por hora.
a. Turno matutino (sepaga el sueldo por hora)
b. Turno vespertino(se paga el sueldo por hora + el 25%)
c. Turno nocturno (se paga el sueldo por hora + el 75%)
*/
public class Ejercicio_4 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        char $entrada;
        String nombre;
        double horas,sueldo,$sueldo;
        
        //Ingreso de datos
        System.out.println("Ingrese su nombre"); nombre = sc.nextLine();
        System.out.println("Muy bien "+nombre+", ¿Qué turno trabajas?");
        System.out.println("        a. Turno matutino");
        System.out.println("        b. Turno vespertino");
        System.out.println("        c. Turno nocturno");
        $entrada = sc.next().charAt(0);
        System.out.println("¿Cuál es tu sueldo por hora?: "); sueldo = sc.nextDouble();
        System.out.println("¿Cuántas horas trabajas al día?: "); horas = sc.nextDouble();
        
        //Operaciones
        $sueldo = sueldo*horas*6;
        
        //Sentencia condicional SWITCH
            switch($entrada){
                case 'A':
                case 'a':                
                    //Salida de resultados
                    System.out.println(nombre+", tu sueldo semanal es: "+$sueldo);                     
                break;
                
                case 'B':
                case 'b':
                    //Operacion
                    $sueldo *= 1.25;
                    
                    //Salida de resultados
                    System.out.println(nombre+", tu sueldo semanal es: "+$sueldo);
                break;
                
                case 'C':
                case 'c':
                     //Operacion
                    $sueldo *= 1.75;
                    
                    //Salida de resultados
                    System.out.println(nombre+", tu sueldo semanal es: "+$sueldo);
                break;
                
                default: System.out.println("Opción no válida");
                break;
            }
    }
}
/*
Se desea conocer el sueldo neto de una persona  partir de sus horas trabajadas y la cantidad de pago por hora, además se debe tomar en cuenta
si el empleado tuvo de 1 a 3 faltas en el mes se le descontará el 3% de su sueldo, si tuvo más de 3 faltas se descuenta el 5%, a parte de
ese descuentoo se le hace el 7.4% de descuento por concepto de servicio médico. Por otra parte, la persona recbe un bono de asistencia si
llego puntual a su trabajo, este bono consiste en $350 más a su sueldo, también si es empleado del mes se le dará una bonificación del 10% a
su sueldo. El algoritmo deberá mostrar en panatalla: el nombre de la persona, la cantidad de horas trabajadas, los descuentos realizados, los
bonos brindados y el total de suledo neto que se le debe pagar.
 */
package practicas_de_clase;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double horas,pago,sueldo;
        int faltas;
        char eom,asis = ' ';
        String nombre, descuentos = "-7.4% por servicio médico";
        
        //Entrada de datos
        System.out.println("Ingrese su nombre: "); nombre = sc.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas: "); horas = sc.nextDouble();
        System.out.println("Ingrese el pago por hora: "); pago = sc.nextDouble();
        System.out.println("Cantidad de faltas: "); faltas = sc.nextInt();
        System.out.println("¿Fuiste empleado del mes?: a) SI   b) NO"); eom = sc.next().charAt(0);
        //Obtener sueldo
        sueldo = horas*pago;
        //
        if((horas <= 0)||(pago <= 0)||(faltas <0)){
            System.out.println("Algunos de los datos introducidos son inválidos");
        }
        else{
            if((faltas>=1)&&(faltas<=3)){
                sueldo -= sueldo*.03;
                sueldo -= sueldo*.074;
                descuentos += ", -3% por 1-3 faltas";
            }
            else if(faltas > 3){
                sueldo -= sueldo*.05;
                sueldo -= sueldo*.074;
                descuentos += ", -5% por +3 faltas";
            }
            else{
                System.out.println("¿Llegaste a tiempo todos los días?: a) SI   b) NO"); asis = sc.next().charAt(0);
            }
            if((eom == 'A')||(eom == 'a')||(eom == 'S')||(eom == 's')){
                sueldo += sueldo*.1;
                descuentos += ", +10% por ser el empleado del mes";
            }
            if(( asis == 'A')||(asis == 'a')||(asis == 'S')||(asis == 's')){
                sueldo += 350;
                descuentos += ", + $350 por asistencia";
            } 
            
            System.out.println(nombre+", tu sueldo será de "+sueldo+" debido a que trabajaste "+horas+" horas, ganaste "+pago+" por hora, y tus bonos/descuentos fueron: ");
            System.out.println(descuentos);
        }   
    }
}

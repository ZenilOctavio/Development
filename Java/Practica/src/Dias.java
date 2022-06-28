import java.util.Scanner;
public class Dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int entrada; final String [] DIAS = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        System.out.println("Ingrese el número del día"); entrada = sc.nextInt(); //Ingreso de datos
        if((entrada <= 7)&&(entrada >= 1)){
            System.out.print(DIAS[entrada-1]);
        }
        else{System.out.println("El número de día no es válido");}
    }
}

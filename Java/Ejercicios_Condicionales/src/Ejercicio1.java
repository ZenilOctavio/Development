import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaración de variables
        int num1, num2; //Declaración de dos enteros
        Scanner sc = new Scanner(System.in); //Declaración de mi variable Scanner
        
        //Ingreso de datos
        System.out.println("Ingrese el valor del número 1"); num1 = sc.nextInt(); //Ingreso de dato a num1
        System.out.println("Ingrese el valor del número 2"); num2 = sc.nextInt(); //Ingreso de dato a num2
        
        //Operaciones
        
        if(((num1 <= 100)&&(num2 <= 100))&&((num1 >= 0)&&(num2 >= 0))){
            if(num1 > num2){
                System.out.println("El número 1 con valor: "+num1+" es mayor al número 2 con valor: "+num2);
            }
            else if(num1 == num2){
                System.out.println("Ambos números tienen el valor: "+num1);
            }
            else{
                System.out.println("El número 2 con valor: "+num2+" es mayor al número 1 con valor: "+num1);
            }
        }
        else{
            System.out.println("Alguno de los números introducidos no se encuentran en el rango del 0 al 100");
        }       
    }
}

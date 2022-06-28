import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        final double PI = 3.1416; double diametro, volumen;
        
        //Ingreso de datos
        System.out.println("Ingrese la medida del diametro de la esfera: "); diametro = sc.nextDouble();
        
        //Operaciones
        if(diametro > 0){
            volumen = ((double)4/3)*PI*(Math.pow((diametro/2),3));
            System.out.println("El volumen es: "+volumen);
        }
        else{
            System.out.println("El valor ingresado para el diametro es inválido");
        }
    }
}
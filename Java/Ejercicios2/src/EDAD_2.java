import java.util.Scanner;
public class EDAD_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        //Ingreso de datos
        System.out.println("Ingrese su edad");edad = sc.nextInt();
        
        //Operaciones
        if((edad <= 100)&&(edad >= 0) ){
        
            if(edad <= 18){
                System.out.println("Es mayor de edad");
            }
        
            else{
                System.out.println("Eres menor papi");
            }
        }
        else{
            System.out.println("No es una edad válida");
        }
    }
}

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Declaración de variables
        double c1,c2,c3,c4,prom; Scanner sc = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.println("Ingrese la primera calificación del 1 - 10"); c1 = sc.nextDouble(); //Ingreso de c1
        System.out.println("Ingrese la segunda calificación del 1 - 10"); c2 = sc.nextDouble(); //Ingreso de c2
        System.out.println("Ingrese la tercera calificación del 1 - 10"); c3 = sc.nextDouble(); //Ingreso de c3
        System.out.println("Ingrese la cuarta calificación del 1 - 10"); c4 = sc.nextDouble(); //Ingreso de c4
        
        //Operaciones
        
        if((((c1 >= 0)&&(c1 <= 10))&&((c2 >= 0)&&(c2 <= 10)))&&(((c3 >=0)&&(c3 <=10))&&((c4 >= 0)&&(c4 <=10)))){
            prom = (c1+c2+c3+c4)/4;
        
            if(prom >= 6){
                System.out.println("Pasasaste con un promedio de: "+prom);
            }
            else{
                System.out.println("Reprobaste, sacaste: "+prom);
            }
        }
        else{
            System.out.println("Las calificaciones introducidas no se encuentran en el rango del 1 - 10");
        }
    }
}

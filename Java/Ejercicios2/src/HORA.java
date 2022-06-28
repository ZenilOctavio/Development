import java.util.Scanner;
public class HORA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos, minutos, hora;
        
        //Ingreso de datos
        System.out.println("Ingrese la cantidad de segundos: "); segundos = sc.nextInt();
        System.out.println("Ingrese la cantidad de minutos: "); minutos = sc.nextInt();
        System.out.println("Ingrese la cantidad de horas: "); hora = sc.nextInt();
        
        if(((segundos < 60)&&(minutos < 60))&&(hora<24)){
            System.out.println("La hora es correcta: "+hora+":"+minutos+":");
        }
        else{
            System.out.println("La hora es inválida");
        }
    }
}

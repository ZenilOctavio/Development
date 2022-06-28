import java.util.Scanner;
public class euclides{
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números para obtener su Maximo Común Divisor");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println("El Maximo Común Divisor de "+x+" y "+y+" es: "+MCD(x,y));   //Llamo al método 
    }
    public static int MCD(int n1, int n2){
        int help;
        if(n2 > n1){                //Establezco que siempre será mayor n1 
            help = n1;
            n1 = n2;
            n2 = help;
        }  
        if((n1%n2) == 0){           //Establezco el caso base
            return n2;
        }
        else{                       //Caso recursivo
            return MCD(n2,(n1%n2)); 
        }
    }
}
import java.util.Scanner;
class evaluacion{

    public static void main(String[] args){
        //Declaración de variables
        Scanner sc = new Scanner(System.in);

        //Ingreso de ecuacion
        double[] ecuacion = crearEcuacion(sc);

        //Número a evaluar
        System.out.println("Ingrese el número en el que se desea evaluar la función");
        double x = sc.nextDouble();

        //Evaluador
        System.out.println("\nf("+x+") = "+evaluador(x, ecuacion));

    }

    public static double evaluador(double x, double[] ecuacion){
        double resultado = 0; 
        for(int i = 0;i<ecuacion.length; i++){
            resultado += ecuacion[i]*(Math.pow(x,i));
        }
        return resultado;
    }
    public static double[] crearEcuacion(Scanner sc){
        System.out.println("¿Cuál será el grado de la ecuación?"); int grado = sc.nextInt();
        double[] ecuacion = new double[grado+1];

        System.out.println();

        for(int i = ecuacion.length-1; i >= 0; i--){
            System.out.println("Ingrese el coeficiente de x^"+i);
            ecuacion[i] = sc.nextDouble();
        }
        return ecuacion;
    }
}
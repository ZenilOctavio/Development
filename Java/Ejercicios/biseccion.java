import java.util.Scanner;
class biseccion{
    public static void main(String[] args){

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double xi, xs;

        //Entrada de datos
        System.out.print("Ingrese el grado de la ecuación\n");
        double[] expresion = new double[sc.nextInt()+1];
        System.out.print("Ingrese el inicio del intervalo\n");
        xi = sc.nextDouble();
        System.out.print("Ingrese el final del intervalo\n");
        xs = sc.nextDouble();

        System.out.print("\n\nComience a ingresar los coeficientes de cada valor\n");
        for(int i = ((expresion.length)-1); i>=0; i--){
            System.out.println("Coeficiente de x^"+i);
            expresion[i] = sc.nextDouble();
        }
        double raiz = bifuncion(expresion,xi,xs);
        System.out.println("La raiz es: "+raiz);

        double valorx = 0;
        for(int i = 0; i<expresion.length; i++){
            valorx += expresion[i]*(Math.pow(raiz,i));
        }
        System.out.println("El valor de y en "+raiz+" es: "+valorx);
    }
    public static double bifuncion(double[] ecuacion, double xi, double xs){
        double ansi = 0, ansa = 0, xa = ((xi+xs)/2);

        do{
            xa = ((xi+xs)/2);
            ansi = 0;
            ansa = 0;
            for(int i = 0;i<ecuacion.length; i++){
                ansi += (ecuacion[i]*(Math.pow(xi,i)));
                ansa += (ecuacion[i]*(Math.pow(xa,i)));
            }
            //System.out.println(ansi);
            //System.out.println(ansa);
            if((ansa*ansi)<0){
                xs = xa;
            }
            else if((ansa*ansi)> 0){
                xi = xa;
            }

        }while((Math.abs(ansa) > 0.0000000001));
        return xa;
    }

}
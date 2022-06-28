//Problema de solución única
class biseprueba{
    public static void main(String[] args) {
        
        //Declaración de variables
        double[] ecuacion = {12,-7,1,-3,1};     //Es de cuarto grado (x^4 -3x^3 +x^2 -7x +12)
                                                //El indice sería el exponente de x
        double xi = 1, xs = 2, xa, ansi= 0, ansa = 0;
        

        do{
            xa = (xi+xs)/2;
            ansa = 0;
            ansi = 0;
            for(int i = 0; i<ecuacion.length; i++){
                ansi += ecuacion[i]*(Math.pow(xa,i));
                ansa += ecuacion[i]*(Math.pow(xi,i));
                //System.out.println(i);
            }
            if((ansa*ansi)>0){
                xi = xa;
            }
            else if((ansa*ansi)<0){
                xs = xa;
            }
        }while(ansa > 0.000001);
        System.out.println(ansa);
        System.out.println("Valor de x: "+xa);
    }
}
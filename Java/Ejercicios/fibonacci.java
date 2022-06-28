public class fibonacci{
    public static void main(String[] args) {

        //Establecemos la pocisión de la serie a buscar
        int indice = 10;
        System.out.println(fiboIterativo(indice));   //Llamo al método que usa el ciclo
        System.out.println(fiboRecursivo(indice));   //Llamo a la función recursiva
        System.out.println(fiboDefinicion(indice)); //Llamo a la función aritmética para comprobar mi resultado
    }

    //Método algorítmico para encontrar el número en la posición deseada por medio de un ciclo
    public static int fiboIterativo(int n){
        int [] terminos = new int[3];
        terminos[0] = 0;                //este indice almacenará el valor anterior al reciente
        terminos[1] = 0;                //este indice almacenará el valor reciente
        terminos[2] = 1;                //este indice almacenará el valor que sigue

        for(int i = 0; i<n; i++){
            terminos[0] = terminos[1];       //0 1 1 2
            terminos[1] = terminos[2];       //1 1 2 3
            terminos[2] = terminos[0] + terminos[1];   //1 2 3 5
        }
        return terminos[1];
    }// 1 1 2 3 5
    public static int fiboRecursivo(int n){
        if(n<2){
            return n;
        } 
        else{
            return fiboRecursivo(n-1) + fiboRecursivo(n-2);
        }
    }
    //Método para corroborar el resultado del anterior, basado en la propia definición del número aureo
    public static int fiboDefinicion(int n){
        double $n = (1/(Math.sqrt(5)))*((Math.pow(((1+(Math.sqrt(5)))/2),n))-(Math.pow(((1-(Math.sqrt(5)))/2),n)));
        return (int)$n;
    }

}
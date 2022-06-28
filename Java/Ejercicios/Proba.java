class Proba {
   /* public static int[] insercionDirecta(int A[]){                                            
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
                  aux = A[p];           // el final, guardamos el elemento y
                  j = p - 1;            // empezamos a comprobar con el anterior
                  while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                                    // valor de aux sea menor que los
                                 A[j + 1] = A[j];   // de la izquierda, se desplaza a
                                 j--;               // la derecha
                  }
                  A[j + 1] = aux;       // colocamos aux en su sitio
        }
        return A;
    }
    public static int[] bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
    return arr;
    }
    public static void main(String[] args) {
        
        double x; 
        int[] arreglo = new int[1000];
        
        //Rellenar arreglo
        for(int i = 0; i< arreglo.length; i++){
            x = Math.random()/Math.random();
            arreglo[i] = (int)(x*100);
        }

        long bubTi = System.nanoTime();
        //Bubblesort
        //int[]arb =  bubbleSort(arreglo);
        long bubTf = System.nanoTime();

        //Inserción

        long inTi = System.nanoTime();
        //int [] ari = insercionDirecta(arreglo);
        long inTf = System.nanoTime();


        System.out.println("El resultado de BUBBLESORT es: "+(bubTf-bubTi)+" nanosegundos");
        System.out.println("El resultado de INSERCION es: "+(inTf-inTi)+" nanosegundos");

    }*//*
    public static void main(String[] args) {
        //Declaración de variables
        int arreglo[] = {2,3,5,6,8,8,5,4,2,45,6,756,32,3,56,6,3}; 
        String conjunto = "",array[];
        int values[];
        double prom = 0;

        for (int i : arreglo) {
            prom += i;
            System.out.print(i+" ");
        }

        prom /= arreglo.length;
        System.out.println("\n");

        System.out.print("El promedio es: "+prom);

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > prom){
                conjunto += String.valueOf(arreglo[i])+",";
            }
        }
        StringBuilder conjunto$ = new StringBuilder(conjunto);
        conjunto$.deleteCharAt(conjunto.length()-1);

        conjunto = conjunto$.toString();

        array = conjunto.split(",");

        values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = Integer.parseInt(array[i]);
        }

        //return values;

        
    }*/

}
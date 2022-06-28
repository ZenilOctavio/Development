class algoritmos{

    public static int[] rellenarArr(int[] arr){         //Método para rellenar el arreglo
        double x;
        for(int i = 0; i<arr.length; i++){
            x = Math.random()/Math.random();
            arr[i] = (int)(x*10);
        }

        return arr;
    }

    public static void bubbleSort(int [] arr,int c) {   //Método para ordenar por BUBBLESORT
        //Ordenamiento                                            
        for(int i = 0; i<arr.length;i++){
            for(int j = 1; j<(arr.length-i); j++){
                if(arr[j-1]>arr[j]){
                    c = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = c;
                }
            }
        }
    }

    public static void insercion(int[]arr ,int c){      //Método para ordenar por INSERCION  
        //Ordenamiento              
        for(int i = 1; i < (arr.length); i++){
            c = arr[i];
            for(int j = (i-1); (j>=0)&&(c<arr[j]);j--){
                arr[j+1] = arr[j];
                arr[j] = c;
            }
        }
    }
}

public class ordenamiento{
    public static void main(String[] args) {

        //Declaración del arreglo
        int[] arreglo = new int[10000];            //Creo algoritmo para el test
        int comp = 0;                              //Creo una variable para auxiliar a los algoritmos

        //Rellenado del arreglo
        arreglo = algoritmos.rellenarArr(arreglo); //Llamo al método de rellenado del arreglo


        //Algoritmo de ordenamiento BUBBLESORT
        long bubbleti = System.nanoTime();      //Tiempo inicial BUBBLESORT
        algoritmos.bubbleSort(arreglo,comp);    //Llamo al método del algoritmo BUBBLESORT
        long bubbletf = System.nanoTime();      //Tiempo final de BUBBLESORT


        //Algoritmo de ordenamiento INSERCION
        long inserti = System.nanoTime();       //Tiempo inicial de INSERCION
        algoritmos.insercion(arreglo, comp);    //Llamo al método del algoritmo INSERCION
        long insertf = System.nanoTime();       //Tiempo final de INSERCION


        //Resultados
        System.out.println();System.out.println();System.out.println("Resultados BUBBLESORT");
         System.out.println("El tiempo de ejecución fue: " + (bubbletf - bubbleti) + " nanosegundos");   //Salida de resultados BUBBLESORT

        System.out.println();System.out.println();System.out.println("Resultados INSERCION");
        System.out.println("El tiempo de ejecución fue: " + (insertf - inserti) + " nanosegundos");  //Salida de resultados INSERCION


        //Sentencia IF/ELSE
        System.out.println();System.out.println();System.out.println("Resultados comparativos: ");
        if((insertf - inserti)<(bubbletf - bubbleti)){
             System.out.println("El Método INSERCIÓN fue más rápido");
        }
        else if((bubbletf - bubbleti)<(insertf - inserti)){
            System.out.println("El Método BUBBLESORT fue más rápido");
        }
    }
}
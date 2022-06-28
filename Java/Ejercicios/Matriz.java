import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int a[][],columna,fila;
        
        //Entrada de datos
        System.out.print("Ingrese el valor de la columna:  ");
        columna = sc.nextInt();
        System.out.println("\nIngrese el valor del renglon:  ");
        fila = sc.nextInt();
        
        a = new int[fila][columna];  //Adaptación del arreglo
        
        for(int i = 0; i<fila; i++){
            for(int j = 0; j<columna; j++){
                System.out.print("\nIngrese el valor de la fila "+i+" y columna "+j+": ");
                a[i][j] = sc.nextInt();
            }
        }
        
        //Salida de datos de la matriz
        for(int fil[] : a){
            for(int col : fil){
            System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

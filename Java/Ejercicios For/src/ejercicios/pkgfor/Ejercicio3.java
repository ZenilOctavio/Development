package ejercicios.pkgfor;
/*
Elaborar un programa que imprima los números primos contemplados de 1 hasta 100
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Llamo al método
        Ejercicio3.printPrimo(1,100); // Establezco el comienzo en 1 y el final en 100
    }
    public static void printPrimo(int inicio, int fin){
        boolean com;
        for(int i = inicio; i<=fin; i++){
            com = true;
            for(int j = 2; (j<i)&&(com == true); j++){
                com = ((i%j) != 0);
            }
            if(com){
                System.out.println(i);
            }
        }
    }
}
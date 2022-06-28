package ejercicios_while;
/*
Crear un programa que muestre los números múltiplos de 8 desde el 0 hasta el 500
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Múltiplos de 8 desde el 0 hasta el 500");
        while(contador < 501){
            if(contador%8 == 0){
                System.out.print(contador+ " ");
            }
            contador++;
        }
        System.out.println("");
    }
}

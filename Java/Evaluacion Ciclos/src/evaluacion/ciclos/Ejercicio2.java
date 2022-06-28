package evaluacion.ciclos;
/*
Crear un programa que imprima una escalera de * (de 1 a 5), puedes usar cualquier ciclo de tu preferencia, también 
puedes usar anidamiento
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        for(int i = 1; i<6; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
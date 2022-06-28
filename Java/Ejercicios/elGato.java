import java.util.Scanner;
public class elGato {
    public static void main(String[] args) {

        //Declaración de variables
        char tablero[][] = new char[3][3], jugadores[] = {'X','O'}, input;
        int caracter = 97;;
        Scanner sc = new Scanner(System.in);
        boolean checker = false;
        String aux = "";

        //Ciclo de juego
        while(!checker){
            //Ciclo de jugadores
            for(int jugador = 0; (jugador < jugadores.length)&&(!checker); jugador++){
                salidaTablero(tablero, caracter, false);   //Salida del tablero
                System.out.print("Turno de jugador "+ (jugador+1) + ": (" + jugadores[jugador]+ ").  ");
                input = sc.nextLine().charAt(0);    //Ingreso de la casilla
                tablero = ingresoDatos(tablero, input, caracter, jugador, jugadores);   //Meto el valor en la matriz
                aux = isOver(tablero);  //Llamo a una función que me dice si ya terminó el juego
                //System.out.println(aux);
                checker = (aux.charAt(0) == 't')?true:false;    //Obtengo el valor del estatus del juego
                //System.out.println(checker);
            }
        }
        System.out.println("\n\n");
        salidaTablero(tablero,caracter,true);    //Salida del tablero final
        System.out.println("Fin del juego");
        if(aux.charAt(aux.length()-1) != 'n'){
            System.out.print("El ganador fue el jugador ");
            System.out.print((indexOf(jugadores, aux.charAt((aux.length()-1)))+1)+" ("+(aux.charAt((aux.length()-1)))+")."); //Obtengo el jugador que ganó
        }
        else{
            System.out.println("Se acabo el espacio de juego");
        }
    }

    public static void salidaTablero(char matriz[][],int charCounter, boolean letrasOvacio){
        for(int fila = 0; fila<3; fila++){
            for(int columna = 0; columna<4; columna++){
                System.out.print("|");
                if(columna<3){
                    if((matriz[fila][columna]) != ((char)0)){
                        System.out.print(matriz[fila][columna]);
                    }
                    else if(letrasOvacio){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print((char)charCounter);
                    }
                    charCounter++;
                }
            }
            System.out.println();
        }
    }
    public static char[][] ingresoDatos(char matriz[][],char dato,int charCounter,int posicion,char serie[]) {
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
               if(dato == ((char)charCounter)){
                    matriz[fila][columna] = serie[posicion];
               } 
               charCounter++;
            }
        }
        return matriz;
    }

    public static String isOver(char matriz[][]){
        boolean checker = false;
        char [] conjunto = new char[3];

        for(int fila = 0; fila<matriz.length; fila++){
            for(int columna = 0; columna<matriz.length; columna++){
                
            }
        }

        for(int fila = 0; fila<matriz.length; fila++){              //Verificación de columnas
            for(int columna = 0; columna<matriz[fila].length; columna++){
                conjunto[columna] = matriz[fila][columna];
            }
            checker = ((conjunto[0] != ((char)0))&&(conjunto[0] == conjunto[1])&&((conjunto[0] == conjunto[2])))||(checker);
            if(checker){return String.valueOf(checker)+conjunto[1];}
        }
        

        for(int columna = 0; columna<matriz.length; columna++){     //Verificacion de filas
            for(int fila = 0; fila<matriz[columna].length; fila++){
                conjunto[fila] = matriz[fila][columna];
            }
            checker = ((conjunto[0] != ((char)0))&&(conjunto[0] == conjunto[1])&&((conjunto[0] == conjunto[2])))||(checker);
            if(checker){return String.valueOf(checker)+conjunto[1];}
        }
        

        for(int superior = 0; superior<matriz.length; superior++){              //Verificacion de diagonal inferior-superior desde la izquierda
            conjunto[superior] = matriz[superior][Math.abs(2-superior)];
        }
        checker = ((conjunto[0] != ((char)0))&&(conjunto[0] == conjunto[1])&&((conjunto[0] == conjunto[2])))||(checker);
        if(checker){return String.valueOf(checker)+conjunto[1];}

        for(int inferior = 0; inferior<matriz.length; inferior++){              //Verificacion diagonal superior-inferior desde la izquierda
            conjunto[inferior] = matriz[inferior][inferior];
        }
        checker = ((conjunto[0] != ((char)0))&&(conjunto[0] == conjunto[1])&&((conjunto[0] == conjunto[2])))||(checker);
        if(checker){return String.valueOf(checker)+conjunto[1];}

        checker = true;
        for(int fila = 0; fila<matriz.length; fila++){                          //Verificar si esta lleno
            for(int columna = 0; columna<matriz[fila].length; columna++){
                checker = ((matriz[fila][columna]) != ((char)0))&&(checker);
            }
        }
        return String.valueOf(checker)+'n';
    }
    public static int indexOf(char[]arreglo, char valor){
        int i = 0;
        while(i<arreglo.length){
            if(valor == arreglo[i]){
                return i;
            }
            i++;
        }
        return -1;
    }
}
import java.util.Scanner;

/**
 * clases
 */
public class clases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // perro z = new perro("Juan",23,8);
        perro x = new perro("Luis",23,8);
        perro o = new perro("Luis",23,8);
        perro t = new perro("Luis",23,8);
        perro j = new perro("Luis",23,8);
        perro k = new perro("Luis",23,8);
        perro z = new perro("Luis",23,8);
        perro w = new perro("Luis",23,8);
        perro a = new perro("Luis",23,8);
        perro b = new perro("Luis",23,8);
        perro c = new perro("Luis",23,8);
        
        System.out.println(x.nombre);
        System.out.println(x.edad);
        System.out.println(x.patas);
        System.out.println(x.id);
        System.out.println(perro.idClass);

        x.setPatas(sc.nextInt());        
        x.getPatas();

        System.out.println("\n______________\n");

        System.out.println(x.nombre);
        System.out.println(x.edad);
        System.out.println(x.patas);
        System.out.println(x.id);
        System.out.println(perro.idClass);

        System.out.println("\n______________\n");

        System.out.println("Pon pata:");x.setPatas(sc.nextInt());
        System.out.println("Aqui tus patas:"+ x.getPatas());

        System.out.println(x.nombre);
        System.out.println(x.edad);
        System.out.println(x.patas);
        System.out.println(x.id);
        System.out.println(perro.idClass);

    }
}
class perro{
    //Atributos
    int edad;
    int patas;
    String nombre;
    int id;
    
    static int idClass = 0;   //variable estatica de la clase

    perro(String nombre, int edad, int patas){
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
        this.id = ++idClass;
    }
    void setPatas(int nuevoNumero){
        this.patas = nuevoNumero;
    }
    int getPatas(){
        return this.patas;
    }
}
public class Clase_Perro{
    public static void main(String[] args) {
        Perro z = new Perro("firu", "Chihuahua", 5, "blanco");
        
        System.out.println("Nombre: "+ z.getNombre()+"\nEdad: "+ z.getEdad()+"\nRaza: "+z.getRaza()+"\nColor: "+z.getColor());
     }
}
class Perro {

    //Atributos de la clase 
    static int num= 0;
    int id;
    String nombre;
    String raza;
    int edad;
    String color;

    Perro(String nombre, String raza, int edad, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.id = ++Perro.num;
    }

    //Métodos de la clase
        //Métodos get
    String getNombre(){
        return this.nombre;
    }
    String getRaza(){
        return this.raza;
    }
    int getEdad(){
        return this.edad;
    }
    String getColor(){
        return this.color;
    }
    int getId(){
        return this.id;
    }

        //Métodos set
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    void setRaza(String raza){
        this.raza = raza;
    }
    void setEdad(int edad){
        this.edad = edad;
    }
    void setColor(String color){
        this.color = color;
    }
}
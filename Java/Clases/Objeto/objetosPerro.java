package Objeto;
class Perro{

    //Atributos de la clase 
    static int numero = 0;
    String nombre;
    String raza;
    int edad;
    int id;
    String color;

    Perro(String nombre, String raza, int edad, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.id = ++Perro.numero;
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
public class objetosPerro {
    public static void main(String[] args) {
        //Declaración de perros
        Perro z = new Perro("Juanito", "Gran Pitbull", 25, "Negro");
        Perro y = new Perro("Humberto", "Chihuahua", 2, "Cremita");
        Perro x = new Perro("Gilberto", "Pitbull", 5, "Gris");
        Perro w = new Perro("Miranda", "French Poodle", 1, "Café");
        Perro v = new Perro("Zenil", "French bulldog", 81, "Negro con puntos blancos");
        Perro u = new Perro("Pipo", "Pastor alemán", 8, "Negro con naranja");
        Perro t = new Perro("Popi", "Pastor belga", 4, "Negro con caqui");
        Perro s = new Perro("Alan", "Alaskan Malamute", 3, "Negro con caqui");
        Perro r = new Perro("Alberto", "Calupoh", 6, "Negro");
        Perro q = new Perro("Jesus", "Chihuahua", 5, "Blanco");
        Perro p = new Perro("Aaron", "Labrador", 3, "Rosado");
        Perro o = new Perro("Yordi", "Pomerania", 50, "Rosado");
        Perro n = new Perro("Firulais", "QuienSabe", 6, "De todos");
        Perro m = new Perro("Max", "Bulldog terrier", 8, "Blanco");
        Perro l = new Perro("Octavio", "French Poodle", 9, "Blanco");
        Perro k = new Perro("Kronos", "Pastor soviético", 16, "Gris");
        Perro j = new Perro("Coco", "Bull terrier", 3, "Blanco");
        Perro i = new Perro("Thor", "Border Collie", 5, "Negro con blanco");
        Perro h = new Perro("Leo", "Boxer", 1, "Café con blanco");
        Perro g = new Perro("Simba", "Pug", 7, "Negro");
        Perro f = new Perro("Lucas", "Rottweiler", 6, "Negro");

        //Imprimir valores
        System.out.println("Información de los perros:\n");
        System.out.println("Nombre: "+ z.getNombre()+"\nEdad: "+ z.getEdad()+"\nRaza: "+z.getRaza()+"\nColor: "+z.getColor()+"\nNum. "+z.getId()+"\n");
        System.out.println("Nombre: "+ y.getNombre()+"\nEdad: "+ y.getEdad()+"\nRaza: "+y.getRaza()+"\nColor: "+y.getColor()+"\nNum. "+y.getId()+"\n");
        System.out.println("Nombre: "+ x.getNombre()+"\nEdad: "+ x.getEdad()+"\nRaza: "+w.getRaza()+"\nColor: "+w.getColor()+"\nNum. "+x.getId()+"\n");
        System.out.println("Nombre: "+ w.getNombre()+"\nEdad: "+ w.getEdad()+"\nRaza: "+w.getRaza()+"\nColor: "+w.getColor()+"\nNum. "+w.getId()+"\n");
        System.out.println("Nombre: "+ v.getNombre()+"\nEdad: "+ v.getEdad()+"\nRaza: "+v.getRaza()+"\nColor: "+v.getColor()+"\nNum. "+v.getId()+"\n");
        System.out.println("Nombre: "+ u.getNombre()+"\nEdad: "+ u.getEdad()+"\nRaza: "+u.getRaza()+"\nColor: "+u.getColor()+"\nNum. "+u.getId()+"\n");
        System.out.println("Nombre: "+ t.getNombre()+"\nEdad: "+ t.getEdad()+"\nRaza: "+t.getRaza()+"\nColor: "+t.getColor()+"\nNum. "+t.getId()+"\n");
        System.out.println("Nombre: "+ s.getNombre()+"\nEdad: "+ s.getEdad()+"\nRaza: "+s.getRaza()+"\nColor: "+s.getColor()+"\nNum. "+s.getId()+"\n");
        System.out.println("Nombre: "+ r.getNombre()+"\nEdad: "+ r.getEdad()+"\nRaza: "+r.getRaza()+"\nColor: "+r.getColor()+"\nNum. "+r.getId()+"\n");
        System.out.println("Nombre: "+ q.getNombre()+"\nEdad: "+ q.getEdad()+"\nRaza: "+q.getRaza()+"\nColor: "+q.getColor()+"\nNum. "+q.getId()+"\n");
        System.out.println("Nombre: "+ p.getNombre()+"\nEdad: "+ p.getEdad()+"\nRaza: "+p.getRaza()+"\nColor: "+p.getColor()+"\nNum. "+p.getId()+"\n");
        System.out.println("Nombre: "+ o.getNombre()+"\nEdad: "+ o.getEdad()+"\nRaza: "+o.getRaza()+"\nColor: "+o.getColor()+"\nNum. "+o.getId()+"\n");
        System.out.println("Nombre: "+ n.getNombre()+"\nEdad: "+ n.getEdad()+"\nRaza: "+n.getRaza()+"\nColor: "+n.getColor()+"\nNum. "+n.getId()+"\n");
        System.out.println("Nombre: "+ m.getNombre()+"\nEdad: "+ m.getEdad()+"\nRaza: "+m.getRaza()+"\nColor: "+m.getColor()+"\nNum. "+m.getId()+"\n");
        System.out.println("Nombre: "+ l.getNombre()+"\nEdad: "+ l.getEdad()+"\nRaza: "+l.getRaza()+"\nColor: "+l.getColor()+"\nNum. "+l.getId()+"\n");
        System.out.println("Nombre: "+ k.getNombre()+"\nEdad: "+ k.getEdad()+"\nRaza: "+k.getRaza()+"\nColor: "+k.getColor()+"\nNum. "+k.getId()+"\n");
        System.out.println("Nombre: "+ j.getNombre()+"\nEdad: "+ j.getEdad()+"\nRaza: "+j.getRaza()+"\nColor: "+j.getColor()+"\nNum. "+j.getId()+"\n");
        System.out.println("Nombre: "+ i.getNombre()+"\nEdad: "+ i.getEdad()+"\nRaza: "+i.getRaza()+"\nColor: "+i.getColor()+"\nNum. "+i.getId()+"\n");
        System.out.println("Nombre: "+ h.getNombre()+"\nEdad: "+ h.getEdad()+"\nRaza: "+h.getRaza()+"\nColor: "+h.getColor()+"\nNum. "+h.getId()+"\n");
        System.out.println("Nombre: "+ g.getNombre()+"\nEdad: "+ g.getEdad()+"\nRaza: "+g.getRaza()+"\nColor: "+g.getColor()+"\nNum. "+g.getId()+"\n");
        System.out.println("Nombre: "+ f.getNombre()+"\nEdad: "+ f.getEdad()+"\nRaza: "+f.getRaza()+"\nColor: "+f.getColor()+"\nNum. "+f.getId()+"\n");

        
    }
}
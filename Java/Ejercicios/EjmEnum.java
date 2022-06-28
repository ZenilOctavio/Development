enum Transporte {
CAMION(90), AVION(700), AUTOMOVIL(110);
int velocidad; // Atributo

Transporte(int v){ // Constructor
this.velocidad = v;
}
int getVel(){ // metodo
return velocidad;
}
}



class EjmEnum{
public static void main(String[] args) {
    Transporte t;
    t = Transporte.AUTOMOVIL;
    System.out.println(t);

    for (Transporte t1 : Transporte.values() ) {
        System.out.println(t1+ " velocidad: "+ t1.getVel());
    }
}
}
enum Fruta{
    PERA(12), MANZANA(30), FRESA(25), NARANJA(8), DURAZNO(35);

    double price;

    Fruta(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}

class Enum{
    public static void main (String[]args){

        //Creación del objeto
        Fruta miFruta = Fruta.MANZANA;

        System.out.println("Mi fruta es una "+miFruta+" y cuesta "+miFruta.price);

        for(Fruta Fruta : Fruta.values()){
            System.out.println("Fruta "+Fruta+" vale: $"+ Fruta.getPrice() );
        }
    }

}
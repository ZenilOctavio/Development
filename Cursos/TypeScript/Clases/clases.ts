class Persona{
    private nombre:string;    //Esta variable solo se podrá llamar dentro de esta clase

    constructor(nombre:string){
        this.nombre = nombre;
    }
    getNombre():string{
        return this.nombre;
    }
    
    static metodoEstatico():number{
        return 15;
    }
}
let person1 = new Persona("Diego");

console.log(person1.getNombre());
console.log(Persona.metodoEstatico());

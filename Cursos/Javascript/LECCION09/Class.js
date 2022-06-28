/*
A diferencia de los objetos, la clase es una plantilla.
Una clase no contiene valores normalmente, pero si los tiene, todos las instancias de esa clase los tendrán
*/

//El hoisting no funciona con las clases
//let $persona = new Persona;     //El hoisting no funciona
//Primero se tiene que declarar la clase

class Persona{
    static objtCounter = 0;
    static get MAX_OBJ(){
        return 5;
    }
    static cartera = 0;     //Establecemos una variable que tenga relación directa con la clase y no con las instancias
    //Método constructor de las instancias de esta clase
    _cartera = 50;      //Esta en cambio es un atributo de nuestra clase
    constructor(nombre, apellido){
        if(Persona.objtCounter <= Persona.MAX_OBJ){
            this._nombre = nombre;      //Se acostumbra tener métodos set y get para acceder a los atributos
            this._apellido = apellido;  //de forma indirecta
            this._capital = ++Persona.cartera;
            this._objId = ++Persona.objtCounter;
        }
        else{
            console.log("El constructor de objetos ha alcanzado su máximo");
        }
    }
    get nombre(){                   //No es requerido crear los métodos, pero es lo más adecuado
        return this._nombre
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get nombreCompleto(){
        return this._nombre + " " + this._apellido;
    }
    toString(){
        return this.nombreCompleto;
    }
    //Uso de la palabra static
    //Es para crear métodos asociados a la clase, no a los objetos creados en base a ella
    static saludar(){
        console.log("Saludos desde método static");
    }
    static saludar2(persona){
        console.log("Saludos a "+persona.nombre);
    }
}

let persona1 = new Persona("Pedro", "Hernández");   //Al crear una instancia, se llama automáticamente al constructor
console.log(persona1.nombre);
persona1.nombre = "Ernesto";
console.log(persona1.nombre);

//Herencia
/*Se crea una clase "hija" que contiene atributos y funciones propias, pero también heredadas*/
class Empleado extends Persona{
    constructor(nombre,apellido,departamento){
        super(nombre,apellido);        //Para inicializar el constructor de la clase padre se necesita el "super" y así mandar los parámetros de la clase padre a su constructor
        this._departamento = departamento;
        this._fechaIngreso = new Date();
    }
    get departamento(){
        return this._departamento
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    //Sobrescritura
 /* get nombreCompleto(){ //Esta podría ser una forma
        return this._nombre + " " + this._apellido + " " + this._departamento; 
    }*/

    get nombreCompleto(){       //Pero esta es la forma más óptima
        return super.nombreCompleto + ", " + this._departamento;     //Super sirve para acceder a los métodos y atributos de la clase padre
    }
    get fechaIngreso(){
        return this._fechaIngreso;
    }
    set fechaIngreso(date){
        this._fechaIngreso = date;
    }
}

let empleado = new Empleado("Ernesto","Savila","Ingeniería industrial y de sistemas");

console.log(empleado);

//Ahora se pueden utilizar metodos de la clase padre en la clase hija

console.log(empleado.nombreCompleto);

//Sobre escritura
/*Esto se utiliza cuando se desea acceder a un conjunto de atributos comninados entre la clase original y la 
hija, de un objeto creado en una clase hija. Consiste en la modificación de métodos de la clase original, ya
que desde la perspectiva de la clase hija, los métodos están incompletos*/

//Metodos de la clase Object
//Todas las clases tienen implicitamente el "extends Object"

console.log(empleado.toString());
console.log(persona1.toString());
//Sobrescribí la función to String, por lo que ahora, esa función funcionará diferente dependiendo de
//el tipo de objeto con el que trabaje, y se modifica en ambas clases, tanto la hija como la padre
//debido a que se sobrecibió en la clase padre

//Llamar a un método static
//persona1.saludar(); no funciona porque se tiene que utilizar desde la clase
Persona.saludar();  //Solo se puede llamar desde la clase

//Pero si puede tener argumentos y parámetros de tipo objeto

Persona.saludar2(persona1); //Solo se puede ver en la salida de la consola

console.log(persona1.cartera);  //No tiene valor, ya que es un atributo static
console.log(Persona.cartera);   //Solo suelta valor si llamamos directamente a la clase
/*
Las variables estáticas pueden ser alteradas, mas no pueden ser llamadas a través de una instancia
*/
console.log(Empleado.cartera);  //También se hereda la propiedad

console.log(persona1._cartera); //Este atributo no es estático, por lo que si lo muestra
console.log(empleado._cartera); //Este atrubuto fue heredado y tiene un valor por default

console.log(persona1._capital); //Ahora estamos utilizando un valor static, asignandolo en un atributo

console.log(Persona.MAX_OBJ);   //Este método simula una constante de tipo static en nuestra clase
Persona.MAX_OBJ += 10;
console.log(Persona.MAX_OBJ);   //No se altera, debido a que solo hay un método get, y no uno set    

let Victor = new Persona();
let Simitrio = new Persona();
let Lorenia = new Persona();
let Cecilia = new Persona();
let Fernanda = new Persona();   //En este momento se alcanza el límite de objetos

console.log(empleado.fechaIngreso);




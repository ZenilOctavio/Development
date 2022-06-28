let x = 10;

console.log(x.lenght); //No sirve porque es un dato de tipo primitivo, el cual no tiene atributos o métodos

//Creación de objetos directos
const persona = {   //Los objetos tienen en realidad una referencia en código hexadecimal
    nombre: "Juan",
    apellido: "EOEOEO",
    edad: 15,
    pais: "México",
    nombreCompleto: function(){     //Cómo agregar métodos a un objeto
        return this.nombre +" "+ this.apellido;
    }
}

console.log(persona.nombreCompleto()); //Así se llaman a los atributos de un objeto

/* A los objetos se le pueden asignar diferentes tipos de valores, con la notación que se desee
y de cualquier tipo de dato */


//Creación de objetos, otra sintaxis

const persona2 = new Object();  //Creación de un objeto en memoria, vacíos
persona2.nombre = "UWU";
persona2.apellido = "unu";
persona2.direccion = "Cuellar";
persona.nono = "sisis";

//Acceder a propiedades de objetos en javascript
persona.nombre; //una forma de acceder
persona['apellido']; //Otra forma

console.log(persona.nombre);
console.log(persona['nombre']);

//for in
//Iteración especial para objetos

for(nombrePropiedad in persona){
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}

//Agregar propiedad a un object
persona.nuevoValor = 'new';

//Borrar atributo
delete persona.nuevoValor;
console.log(persona.nuevoValor)

//Formas de imprimir un objeto
//Concatenar

console.log(persona.nombre + " " +persona.apellido + " " + persona.edad);

//For in
for(i in persona){
    console.log(persona[i]);
}

//Object.values

let personarray = Object.values(persona);
console.log(personarray);

//JSON
let personaString = JSON.stringify(persona);
console.log(personaString);

/*Para transformar una función en un método*/
const persona3 = {   //Los objetos tienen en realidad una referencia en código hexadecimal
    nombre: "Juan",
    apellido: "EOEOEO",
    edad: 15,
    idioma: "es",
    get lang(){
        return this.idioma.toUpperCase();  //
    },
    set lang(lang){
        this.idioma = lang;
    },
    pais: "México",
    get nombreCompleto(){     //Agregas el "get" para que te devuelva el valor como propiedad
        return this.nombre +" "+ this.apellido;
    }
}
console.log(persona.nombreCompleto); //Da la función
console.log(persona3.nombreCompleto); //Da el resultado, gracias al método get

//Uso de GET
console.log(persona3.lang); //Lo devuelve en mayúsculas

persona.lang = "en";

console.log(persona3.lang);

//Constructores

function Persona (nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + " " + this.apellido;
    }
}
//Con Prototype puedes agregar nuevos atributos por default a un constructor
Persona.prototype.tel = '6621678480';


let padre = new Persona("Octavio", "Zenil","octavio_03zenil@hotmail.com");
let madre = new Persona("OWO", "IWI", "nombre@gmail.com");

console.log(padre.nombreCompleto());

console.log(padre .tel);
console.log(madre.tel);

//Otra forma de crear objetos

let miObjeto = new Object();
let miObjeto2 = {};
                                    //Uso de constructores default
let miCadena = new String('Coco');  //Con clase string
let miNumero = new Number(5);       //Con clase Number
let miBoolean = new Boolean(true);  //Con Boolean
let miArreglo = new Array();        //Con Arreglos    
let miFuncion = new Function();     //Con funciones
let mifuncion = function(){};       //Otra forma con funciones

//Uso de Call

/*
Call y apply sirven para llamar a métodos a trabajar con un objeto que no tiene acceso propio al mismo
** en call se pasan los valores por separado como argumentos, después del objeto a trabajar
** en apply se pasa un arreglo con con los valores como argumentos
*/ 
let $persona1 = {
    nombre: "Octavio",
    apellido: "Zenil",
    nombreCompleto: function(titulo, tel){
        return titulo + " " + this.nombre + " " + this.apellido + " " + tel;
    }
}

let $persona2 = {
    nombre: "Coyacán",
    apellido: "Zenil"
}
//Usamos call para el método de persona1 con persona2
console.log($persona1.nombreCompleto("Ingeniero", "454645")); //Original
console.log($persona1.nombreCompleto.call($persona2, "Licenciado", "4387862984"));  //Llamamos a persona2 con un método ajeno

//Uso de apply
let arreglo$ = ["Ingeniero","96264237861"]
console.log($persona1.nombreCompleto.apply($persona2,arreglo$))

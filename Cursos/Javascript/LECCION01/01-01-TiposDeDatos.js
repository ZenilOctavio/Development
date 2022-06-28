//Tipo de dato --> String
var nombre = "Roberto";

console.log(nombre);

//Tipo de dato --> Numerico
var numero = 145;

console.log(numero);

//Tipo de dato --> Object

var objeto = {
    name: "Balón",
    costo: 456,
    Color: "Negro",
    Tamaño: 'G'
};
console.log(objeto);

console.log(typeof objeto);

//Tipo de dato --> Boolean
var parametro = !true;

console.log(parametro);

//Tipo de dato --> Function

function imprimir (x){
    console.log(x)
}

imprimir(nombre);

//Tipo de dato --> Symbol

var simbolo = Symbol("r");

console.log(typeof simbolo);

//Tipo class es una function

class persona {
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof persona);

//Tipo de dato --> Undefined
var x;
console.log(x);
console.log(typeof x);

//null 
var y = null;
console.log(y);
console.log(typeof null);

var v = NaN;
console.log(v);
console.log(typeof v);

//array
var autos = ['BMW','AUDI','VOLVO'];

console.log(autos);
console.log(typeof autos);

//Empty string

var vacio = '';

console.log(vacio);

console.log(typeof vacio);

user1 = new persona ("Carlos", "Lara");
console.log(user1);



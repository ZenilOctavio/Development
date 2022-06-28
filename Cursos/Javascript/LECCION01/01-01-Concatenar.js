var nombre = "Octavio";
var apellido = "Zenil";

var persona1 = nombre + " " + apellido;

console.log(persona1);

var edad = 15;
var arreglo = "Me llamo Octavio Zenil Lopez"

var presentacion = persona1 + " tiene " + edad + " años";

console.log(presentacion);
function noEspacios(yu){
    for(var i = 0; i < yu.lenght; i++){
        if(yu[i] = " "){
            yu.splice(yu,i);
        }
    }
    return yu
}
console.log(noEspacios(arreglo));
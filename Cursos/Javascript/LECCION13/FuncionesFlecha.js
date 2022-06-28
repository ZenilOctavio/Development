funcion();  //  Hoisting (Javascript pone las funciones al principio del documento)

function funcion(){
    console.log("Funcion completada");
}

funcion();

let vfuncion = function(){
    console.log("Funcion en una variable completada");
}

let ffuncion = () => {
    console.log("Funcion flecha completada");
}//El hoisting no sirve con la función flecha

vfuncion();
ffuncion();

const funcionFlecha = () => console.log("Saludo");
funcionFlecha();

const funcionFlechaReturn = () => {return "eoeoeo"}
console.log(funcionFlechaReturn());

const funcionFlechaSimplificada  = () => "eoeoeoeo";
console.log(funcionFlechaSimplificada());

const funcionFlechaObjeto = () => ({nombre : "Juan"});  //Así se puede retornar un objeto
console.log(funcionFlechaObjeto());

//Tambien puede ir sin parentesis = mensaje =
const funcionParametro = (mensaje) => console.log(mensaje);
funcionParametro(59);
// var mensaje = "Hola Mundo desde TypeScript, escrito con JavaScript";
let mensaje:string = "Hola Mundo desde TypeScript, escrito con JavaScript";
// mensaje = 100;

let numero:number = 35;
// numero = "";

let cualquiera:any = "cualquiera";
cualquiera = 35;

const PI = 3.14;
// PI = 5;

let saludo = () =>{
    console.log(mensaje);
    console.log("El numero es: "+numero);
    console.log(cualquiera);
    console.log(PI);

}
saludo();
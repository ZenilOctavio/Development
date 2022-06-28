//Una función callback es una función determinada para actuar dentro de otra función, pasandola 
//como parámetro

function funcionrep(numero,callback){
    for(let i = 0; i < numero; i++){
        callback();
    }
}
function funcion$(){
    console.log("funcion$");
}

funcionrep(5,funcion$);

//Llamadas asíncronas con setTimeout

function mifuncionCallback(){
    console.log("Saludo asíncrono después de 5 segundos");
}
setTimeout(mifuncionCallback,5000);

setTimeout(function(){console.log("funcion declarada");},3000);//También se puede declarar la función aquí mismo

//Hay dos opciones al momemto de hacer un programa
//Programación síncrona o asíncrona

/*En la programación asíncrona se pueden realizar procesos mientras
se espera una respuesta*/

let clock = () => {
    let date = new Date();
    console.log(`${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`);
}
/*Con el metodo setInterval se establece un intervalo y una función que se
repetirá con respecto a este*/
setInterval(clock,1000);
'use strict';
/*
Cuando hay un error en el programa las acciones posteriores al error no
se ejecutan, por lo que se deben utilizar las siguientes estructuras para
manejarlos

Con el bloque try puedo manejar errores y realizar acciones mediante
el catch, despues de que se hayan realizado las operaciones
Con el bloque finally realizaré acciones sin importar si hubo error o no

Con la clausula throw podemos enviar nuestros propios errores
*/
let x = 0;
try{
    if(isNaN(x)) throw 'No es un número'
    else if(x === '') throw 'Es una cadena vacía'
    else if(x >= 0) throw 'Es positivo'
}
catch(error){
    console.log(error)
    console.log(error.name);
    console.log(error.message);
}
finally{
    console.log("eaaa");
}


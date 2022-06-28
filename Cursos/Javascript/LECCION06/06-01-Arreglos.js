let autos = new Array; //Sintaxis antigua

const AUTOS = ['PickUp','Camioneta','Sedán','Camión'];

console.log(AUTOS);

console.log(AUTOS[0]);      /*Se accede a los elementos de un arreglo como  (0 --> n-1)
                            Siendo n el tamaño del arreglo*/

for(let i = 0; i<AUTOS.length;i++){        //Imprimir cada elemento por separado
    console.log("El puesto "+ i + " es: " + AUTOS[i]);
}

AUTOS[3] = 'nuevo valor';       //Asignar nuevos valores a un cierto puesto de un arreglo

AUTOS.push('ERERE');            //Insertar un nuevo valor al arreglo al final

console.log(AUTOS);

//Otras formas de insertar nuevos valores a un arreglo

console.log(AUTOS.length);
AUTOS[AUTOS.length] = 'nwnw';

console.log(AUTOS);

AUTOS[8] = 'NOVACIO';
console.log(AUTOS);

//Como saber si estamos trabajando con un arrelgo

console.log(typeof AUTOS);

console.log(Array.isArray(AUTOS));

console.log(AUTOS instanceof Array);
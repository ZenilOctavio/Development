"use strict";
let suma = function (a, b) {
    return a + b;
};
console.log(suma(8, 2));
let sumaFlecha = (a, b) => {
    return a + b;
};
console.log(sumaFlecha(5, 2));
//Con las funciones flecha no es necesaria la palabra return para codigo inmediato:
let stringFlecha = () => "Valor de retorno";
// Lo anterior es perfectamente igual que un return "Valor de retorno"
console.log(stringFlecha());

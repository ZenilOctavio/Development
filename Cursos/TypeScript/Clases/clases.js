"use strict";
var Persona = /** @class */ (function () {
    function Persona(nombre) {
        this.nombre = nombre;
    }
    Persona.prototype.getNombre = function () {
        return this.nombre;
    };
    Persona.metodoEstatico = function () {
        return 15;
    };
    return Persona;
}());
var person1 = new Persona("Diego");
console.log(person1.getNombre());
console.log(Persona.metodoEstatico());

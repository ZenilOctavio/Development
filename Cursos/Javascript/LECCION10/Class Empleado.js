//Creación de clase hija Empleado en base a Persona
class Empleado extends Persona{
    static contadorEmpleados = 0;
    constructor(nombre,apellido,email,edad,sueldo){
        super(nombre,apellido,email,edad);
        this._idEmpleado = ++contadorEmpleados;
        this._sueldo = sueldo;
    }
    get idEmpleado(){
        return this._idEmpleado;
    }
    get sueldo(){
        return this._sueldo;
    }
    set sueldo(){
        this._sueldo = sueldo;
    }
    toString(){
        return `${super.toString} 
                ${this.idEmpleado} 
                ${this.sueldo}`
    }
}
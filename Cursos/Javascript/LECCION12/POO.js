class Empleado{
    constructor(nombre, sueldo){
        this._nombre = nombre;
        this._sueldo = sueldo;
    }
    get nombre(){
        return this._nombre;
    }
    get sueldo(){
        return this._sueldo;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }
    obtenerDetalles(){
        return `${this._nombre} , ${this._sueldo}`;
    }
}
class Gerente extends Empleado{
    constructor(nombre, sueldo, departamento){
        super(nombre, sueldo);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = this.departamento;
    }
    obtenerDetalles(){
        return super.obtenerDetalles() + ` , ${this._departamento}`;
    }
}

let Luis = new Gerente("Luis", 5000 , "Sistemas");

console.log(Luis.obtenerDetalles());
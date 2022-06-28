class Persona{
    static contadorPersonas = 0;
    constructor(nombre, apellido, email, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        this._email = email;
        this._idPersona = ++Persona.contadorPersonas;
        this._edad = edad;
    }
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }
    get email(){
        return this._email;
    }
    get idPersona(){
        return this._idPersona;
    }
    get edad(){
        return this._edad;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    set email(email){
        this._email = email;
    }
    set edad(edad){
        this._edad = edad;
    }
    //Template string
    toString(){
        return `${this.nombre} ${this.apellido} ${this.edad} ${this.email} ${this.idPersona}`;
    }
}

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
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }
    toString(){
        return `${super.toString} 
                ${this.idEmpleado} 
                ${this.sueldo}`
    }
}

class Cliente extends Persona{
    static contadorClientes = 0;
    constructor(nombre,apellido,email,edad,fechaRegistro){
        super(nombre,apellido,email,edad);
        this._fechaRegistro = fechaRegistro;
    }
    get fechaRegistro(){
        return this._fechaRegistro;
    }
    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro;
    }
    toString(){
        super.toString + ' ' + this.fechaRegistro;
    }
}

//Prueba de clase persona

let persona1 = new Persona('Ernesto','Hernandez','ernes_2134@gmail.com',35);
console.log(persona1.toString());

let persona2 = new Persona('Juan','Ramirez','juan34_86@gmail.com',24);
console.log(persona2.toString());

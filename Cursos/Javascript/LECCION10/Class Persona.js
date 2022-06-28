//Ejercicio de construcción de clases
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
        return this.edad;
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
        return `${this.nombre}  
                ${this.apellido} 
                ${this.edad} 
                ${this.email} 
                ${this.idPersona}`;
    }
}
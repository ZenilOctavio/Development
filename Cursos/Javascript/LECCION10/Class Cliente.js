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
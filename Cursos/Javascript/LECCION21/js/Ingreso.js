class Ingreso extends Dato{
    static idIngresos = 0;

    constructor(description, value){
        super(description,value);
        this._id = ++Ingreso.idIngresos;
    }
    get id(){
        return this._id;
    }
}
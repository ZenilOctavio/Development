class Egreso extends Dato{
    static idEgreso = 0;
    
    constructor(description, value){
        super(description,value);
        this._id = ++Egreso.idEgreso;
    }
    get id(){
        return this._id;
    }
}
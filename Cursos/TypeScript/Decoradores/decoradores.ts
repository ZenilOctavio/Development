function saludar(target:Function):void{
    target.prototype.saludos = function():void{
        console.log("Hola");
    }
};

@saludar
class Hola{
    constructor(){}
}

let hola1 = new Hola();

hola1.saludos();
class DispositivoEntrada{
    constructor(tipo, marca){
        this._tipo = tipo;
        this._marca = marca;
    }
    get tipo(){
        return this._tipo;
    }
    get marca(){
        return this._marca;
    }
    set tipo(tipo){
        this._tipo = tipo;
    }
    set marca(marca){
        this._marca = marca;
    }
}
class Raton extends DispositivoEntrada{
    static contadorRatones = 0;
    constructor(tipo, marca){
        super(tipo, marca);
        this._idRaton = ++Raton.contadorRatones; 
    }
    get id(){
        return this._idRaton;
    }
    toString(){
        return `{ ID: ${this._idRaton} , Tipo: ${this._tipo} , Marca: ${this._marca} } `;
    }
}
class Teclado extends DispositivoEntrada{
    static contadorTeclados = 0;
    constructor(tipo, marca){
        super(tipo, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }
    get id(){
        return this._idTeclado;
    }
    toString(){
        return `{ ID: ${this._idTeclado} , Tipo: ${this._tipo} , Marca: ${this._marca} }`;
    }
}

class Monitor{
    static contadorMonitores = 0;
    constructor(marca, tamaño){
        this._marca = marca;
        this._tamaño = tamaño;
        this._idMonitor = ++Monitor.contadorMonitores;
    }
    get marca(){
        return this._marca;
    }
    get tamaño(){
        return this._tamaño;
    }
    get id(){
        return this._idMonitor;
    }
    set marca(marca){
        this._marca = marca;
    }
    set tamaño(tamaño){
        this._tamaño = tamaño;
    }
    toString(){
        return `{ ID: ${this._idMonitor} , Marca: ${this._marca} , Tamaño: ${this._tamaño} pulgadas }`;
    }
}

class Computadora{
    static contadorComputadoras = 0;
    constructor(nombre, monitor, raton, teclado){
        this._nombre = nombre;
        this._monitor = monitor;
        this._raton = raton;
        this._teclado = teclado;
        this._idComputadora = ++Computadora.contadorComputadoras;
    }
    get nombre(){
        return this._nombre;
    }
    get monitor(){
        return this._monitor.toString();
    }
    get raton(){
        return this._raton.toString();
    }
    get teclado(){
        return this._teclado.toString();
    }
    get id(){
        return this._idComputadora;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set monitor(monitor){
        this._monitor = monitor;
    }
    set raton(raton){
        this._raton = raton;
    }
    set teclado(teclado){
        this._teclado = teclado;
    }
    toString(){
        return `ID: ${this._idComputadora}\nNombre: ${this._nombre}\nMonitor: ${this._monitor.toString()}
Raton: ${this.raton.toString()}\nTeclado: ${this._teclado.toString()}`;
    }
}

class Orden{
    static contadorOrdenes = 0;
    constructor(){
        this._computadoras = [];
        this._idOrden = ++Orden.contadorOrdenes;
        for(let i = 0; i < arguments.length; i++){
            this._computadoras.push(arguments[i]);
        }
    }
    get id(){
        return this._idOrden;
    }
    agregarComputadora(){
        for(let i = 0; i < arguments.length; i++){
            this._computadoras.push(arguments[i]);
        }
    }
    mostrarOrden(){
        let orden = "";
        for(let computadora of this._computadoras){
            orden += computadora.toString() + "\n";

        }
        console.log(`ID Orden: ${this._idOrden}\n${orden}`);
    }
}

let raton = new Raton("USB-C","HYPER-X");
let teclado = new Teclado("USB","LOGITEC");
let monitor = new Monitor("ASUS","27");

let computadora = new Computadora("PCMASTER",monitor,raton,teclado);

console.log(computadora.toString());

let orden = new Orden(computadora,computadora,computadora);

orden.mostrarOrden();

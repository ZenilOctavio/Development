class Producto{
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._nombre = nombre;
        this._precio = precio;
        this._idProducto = ++Producto.contadorProductos;
    }
    get nombre(){
        return this._nombre;
    }
    get precio(){
        return this._precio;
    }
    get id(){
        return this._idProducto;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set precio(precio){
        this._precio = precio;
    }
    toString(){
        return `ID: ${this._idProducto} \nNOMBRE: ${this._nombre}\nPRECIO: $${this._precio}`
    }
}
class Orden{
    static contadorOrdenes = 0;
    static get MAX_PRODUCTOS(){
        return 5;
    }
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        //this._contadorProductos = 0;
    }
    get id(){
        return this._idOrden;
    }
    get productos(){
        return this.productos.toString;
    }
    get cantidadProductos(){
        return this.contadorProductos;
    }
    agregarProducto(producto){
        if(this._productos.length < Orden.MAX_PRODUCTOS){
            this._productos.push(producto);
        }
        else{
            console.log("El límite de productos ha sido alcanzado");
        }
    }
    calcularVenta(){
        let precioTotal = 0;
        for(let producto of this._productos){
            precioTotal += producto.precio;
        }
        return precioTotal;
    }
    mostrarOrden(){
        let orden = "";
        for (let producto of this._productos) {
            orden += producto.toString() + "\n"; 
        }
        console.log(`Orden: ${this._idOrden}\nTotal: ${this.calcularVenta()}\n
Productos: \n\n${orden}`)
    }
}

let pollo = new Producto("Pollo frito", 56 );
let pantalon = new Producto("Pantalon", 200);
let mouse = new Producto("Mouse", 500);
let monitor = new Producto("Monitor", 5000);
let laptop = new Producto("Laptop", 12000);
let celular = new Producto("Celular", 5000);

//console.log(pollo.toString());
//console.log(pantalon.toString());

let orden1 = new Orden();
orden1.agregarProducto(pollo);
orden1.agregarProducto(pantalon);
orden1.agregarProducto(mouse);
orden1.agregarProducto(monitor);
orden1.agregarProducto(pollo);
orden1.agregarProducto(laptop);

//console.log(orden1.mostrarOrden);
orden1.mostrarOrden()

let orden2 = new Orden();
orden2.agregarProducto(pollo);
orden2.agregarProducto(pollo);
orden2.agregarProducto(pollo);
orden2.agregarProducto(pollo);
orden2.agregarProducto(pollo);
orden2.mostrarOrden();

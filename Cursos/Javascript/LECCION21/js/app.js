const ingresos = [
    new Ingreso('Salario', 1500),
    new Ingreso('Venta coche',25000)
];

const egresos = [
    new Egreso('Renta casa',4000),
    new Egreso('Pago celular',400)
];

let cargarApp = ()=>{
    cargarCabecero();
    cargarIngresos();
    cargarEgresos();
}
let cargarCabecero = ()=>{
    let ingreso = totalIngresos();
    let egreso = totalEgresos();
    let presupuesto = ingreso - egreso;
    let porcentajeEgreso = egreso / ingreso;
    document.getElementById('presupuesto').innerHTML = formatoMoneda(presupuesto);
    document.getElementById('egresoPorcentaje'). innerHTML = formatoPorcentaje(porcentajeEgreso);
    document.getElementById('ingreso').innerHTML = formatoMoneda(ingreso);
    document.getElementById('egreso').innerHTML = formatoMoneda(egreso);
}

let totalIngresos = ()=>{
    let ingreso = 0;
    for (const i of ingresos){
        ingreso += i.value;
    }
    return ingreso;
}


let totalEgresos = ()=>{
    let egreso = 0;
    for (const i of egresos) {
        egreso += i.value;
    }
    return egreso;
}

const formatoMoneda = (valor)=>{
    return valor.toLocaleString('en-US',{style:'currency',currency:'USD',minimunFractionDigits:2});
}
const formatoPorcentaje = (valor)=>{
    return valor.toLocaleString('en-US',{style:'percent',minimunFractionDigits: 2});
}

const cargarIngresos = ()=>{
    let ingresosHTML = '';
    for (let ingreso of ingresos) {
        ingresosHTML += crearIngresoHTML(ingreso);
    }
    document.getElementById("lista-ingresos").innerHTML = ingresosHTML;
} 

const cargarEgresos = ()=>{
    let egresosHTML = '';
    for(let egreso of egresos){
        egresosHTML += crearEgresoHTML(egreso);
    }
    document.getElementById("lista-egresos").innerHTML = egresosHTML;
}

const crearIngresoHTML = (ingreso)=>{
    let ingresoHTML = `<div class="elemento limpiarEstilos">
    <div class="elemento_descripcion">${ingreso.description}</div>
    <div class="derecha limpiarEstilos">
        <div class="elemento_valor">+${formatoMoneda(ingreso.value)}</div>
        <div class="elemento_eliminar">
            <button class="elemento_eliminar--btn">
                <ion-icon name="close-circle-outline"
                onclick="eliminarIngreso(${ingreso.id})"></ion-icon>
            </button>
        </div>
    </div>
</div>`;
return ingresoHTML;
}

const crearEgresoHTML = (egreso)=>{
    let egresoHTML = `<div class="elemento limpiarEstilos">
    <div class="elemento_descripcion">${egreso.description}</div>
    <div class="derecha limpiarEstilos">
        <div class="elemento_valor">-${formatoMoneda(egreso.value)}</div>
        <div class="elemento_porcentaje">${formatoPorcentaje(egreso.value/totalEgresos())}</div>
        <div class="elemento_eliminar">
            <button class="elemento_eliminar--btn">
                <ion-icon name="close-circle-outline"
                onclick="eliminarEgreso(${egreso.id})"></ion-icon>
            </button>
        </div>
    </div>
</div>`;
return egresoHTML;
}

const eliminarEgreso = (id)=>{
    let indice = egresos.findIndex(egreso => {egreso.id === id});   //Forma de buscar el indice de un objeto en un arreglo
    egresos.splice(indice,1);
    cargarEgresos();
    cargarCabecero();
}

const eliminarIngreso = (id)=>{
    let indice = ingresos.findIndex(ingreso => ingreso.id === id);
    ingresos.splice(indice,1);
    cargarCabecero();
    cargarIngresos();
}

let agregarDato = ()=>{
    let form = document.getElementById("form");
    let tipo = form["tipo"];
    let descripcion = form["descripcion"];
    let valor = form["valor"];

    if(descripcion.value !== "" && valor.value != ""){
        if(tipo.value === "ingreso"){
            ingresos.push(new Ingreso(descripcion.value,+valor.value));
            cargarIngresos();
        }
        else{
            egresos.push(new Egreso(descripcion.value,+valor.value));
            cargarEgresos();
        }
        cargarCabecero();
    }
    else{
        alert("Alguna de las casillas están vacías");
    }
}

/**/
let promesa = new Promise((resolved, rejected)=>{
    let expresion = true;
    if(expresion){
        resolved('Resuelto correctamente');
    }
    else{
        rejected('Se produjo un error');
    }
});

//promesa.then(valor => console.log(valor),error => console.log(error));
//promesa.then(valor => console.log(valor))
//.catch(error => console.log(error));

let promesa2 = new Promise((resolve) => {
    //console.log('inicio promesa')
    setTimeout((() => resolve('promesa y timeout')),5000);
   //console.log('fin promesa');
});

//promesa2.then(valor => console.log(valor));

/*Cuando trabajamos con async, debemos establecer que la función
devuelva una promesa*/
async function funcionasync(){
    return 'saludo con promesa async';
}

//funcionasync().then(valor => console.log(valor));

/*Await nos hace esperar la respuesta de nuestra promesa*/

//async con await
//await solo se puede utilizar dentro de una función async
//Con await podemos utilizar el valor de salida de la promesa
//sin necesidad del then o catch
/*async function funcionawait(){
    let promise = new Promise(resolve => {
        resolve('Promesa con await');
    });
    console.log(await promise);
}

funcionawait();*/

//Uso de async, await y setTimeout

async function funcionA(){
    console.log('inicio');
    let promesa3 = new Promise(resolve => {
        setTimeout(() => resolve('promesa con await async y timeout'),3000);
    });
    console.log(await promesa3);
    console.log('fin'); //Se ejecuta después de await
}
funcionA();

let x = 10;
let y = 20;

let z = x + y;
console.log("X: "+ x);
console.log("Y: "+ y);
console.log("Z: "+ z);
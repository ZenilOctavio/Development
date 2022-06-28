function rellenarArr(a){
    for(let i= 0; i<a.length;i++){
       a[i] = (Math.random()/(Math.random()/Math.random()))*10;
       return a
    }
}

let arreglo = [5];

arreglo = rellenarArr(arreglo);


console.log(arreglo);
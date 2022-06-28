let a = 5, b = 7, c = 3, d = 9;
//IF ELSE

if(a < b){
    console.log(a + " es menor a " + b);
}
else if (b < a){
    console.log(b +" es menor a "+ a);
}
else{
    console.log("Son iguales");
}

//SWITCH

switch(a){
    case 5:
        console.log("(a) equivale a 5");
    break;
    case 6:
        console.log("(a) equivale a 6");
    break;
    case 7:
        console.log("(a) equivale a 7");
    break;
    case 8:
        console.log("(a) equivale a 8");
    break;
    case 9:
        console.log("(a) equivale a 9");
    break;
}

//OPERADOR TERNARIO

let x = (a<b)?"El mayor es b":"El mayor es a";
console.log(x);
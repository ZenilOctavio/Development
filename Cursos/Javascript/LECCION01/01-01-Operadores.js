//SUMA
let a = 2, b = 3;
let $ab = a+b;

console.log("El resultado de la suma es: " + $ab);

//RESTA
$ab = a-b;

console.log("El resultado de la resta es: "+$ab);

//MULTIPLICACION
$ab = a*b;

console.log("El resultado de la multiplicacion es: "+$ab);

//DIVISION
$ab = a/b;

console.log("El resultado de la division es: "+$ab);

//RESIDUO
$ab = a%b;

console.log($ab);

//EXPONENCIA
$ab = a**b;

console.log($ab);

//PREINCREMENTO
console.log(a);
$ab = ++a;
console.log($ab);

//POSINCREMENTO
console.log(b);
$ab = b++;
console.log($ab);
console.log(b);

//ASIGNACION
a = 1;
console.log(a);

a += 3; 
console.log(a);

a -= 2;
console.log(a);

/*

*=
/=
%=
**=

*/

//COMPARACION
a = 2, b = 3, c = "2";
// "==" solo compara valores y no le importa los tipos
$ab = (a == b); 
console.log($ab);

// "===" verifica los valores y sus tipos
$ab = (a === c);
console.log($ab);

// "!=" diferente valor
console.log(a != c);

//"!==" diferente valor y tipo
console.log(a !== c);

// "<" ">" "<=" ">=" 
a = 2, b = 2, c = 4;
console.log(a < 4);
console.log(a < b);
console.log(a <= b);

function multiplicar(a,b){

    for(let i =2; i<=a; i++){
        b += (i<=a)?b:0;
    }
    console.log(b);
}
multiplicar(0,2);

function multiplicar2(a,b){
let m = 0;
console.log(arguments.length);
    for(let i =1; i<=a; i++){
       m += b;
    }
    
    return m;   //palabra reservada para devolver un valor
}
let c = multiplicar2(5,8);
console.log(c);

/*
Funciones de tipo expresión
Así evitamos poner nombre a la función
*/ 
//Declaración
let suma = function(g,r){
    return g+r;
}

//Uso
let resultado = suma(5,6);
console.log(resultado);


/*
Función de tipo self invoking 
se puede ejecutar en el momento de su colocación
no se puede reutilizar
*/
(function(a,b){
    console.log(a+b);
})(5,3);

console.log(multiplicar2(2,5))

let resString = multiplicar2.toString();

console.log(resString);

/*
Funciones flecha
no se pueden utilizar antes de haber sido declaradas
 */

const sumar = (a,b) => a+b;
resultado = sumar(5,600);
console.log(resultado);

//Diferencia entre parámetros y argumentos

/*
Parámetros: variables declaradas en una función
Argumentos: variables sustituidas en una función
*/

function sumar2(a=5,b=3){ //Parámetros
    console.log(arguments[0]);
    console.log(arguments[1]);
    return a+b;
}
sumar2(5,6) //Puede mostrar los valores dependiendo de los argumentos introducidos

sumar2(5);

resultado = sumar2();
console.log(resultado); //Toma los valores de los parámetros por default
                        //Pero no toma los valores de parámetros, pero si de parámetros

function sumari(){
    let res=0;
    for(let i = 0; i<arguments.length; i++){
        res += arguments[i];
    }
    return  res;
}
resultado = sumari(5,6,8,4,8,7,5,5,5,5,5,5);
console.log(resultado);

//Paso por valor y Paso por referencia

//Paso por valor
/*Cuando utilizamos datos de tipo primitivos*/

let x = 10; //Valor primitivo, no tiene atributos ni métodos asociados al valor


function cambiarValor (a){
    a = 20;
}

cambiarValor(x);

console.log(x);
/*"x" solo pasó su valor a "a", por lo que no sufrió ningún cambio "x", a esto se le llama
paso por valor */

console.log(/*a*/); /* Las variables dentro de métodos se destruyen después de la ejecución del método */

//Paso por referencia
//Creación de objetos

const persona = {
    nombre: "OSCAR",
    apellido: "JUAREZ"
};

function cambiarValorO(p1){
    p1.nombre = "Eriberto";
    p1.apellido= "Ueca";
}

cambiarValorO(persona); //Paso por referencia
/* Cuando hablamos de un tipo object, el parámetro obtiene del argumento object su referencia en codigo hexedecimal
por lo que cuando actúa en los atributos o métodos del parámetro, este si termina siendo afectado, a diferencia
de los tipos primitivos, los cuales no tienen referencia, solo valores, y estos no afectan globalmente. */

console.log(persona);
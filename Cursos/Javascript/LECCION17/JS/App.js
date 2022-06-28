function sumar(){
    let a = document.getElementById('form')['operandoA'].value;
    let b = document.getElementById('form')['operandoB'].value;
    let resultado = parseInt(a); + parseInt(b);

    if(isNaN(resultado)){
        document.getElementById('resultado').innerHTML = "La operación no incluye números";
        console.log("La operación no incluye números");
    }
    else{
        document.getElementById('resultado').innerHTML =`El resultado es: ${resultado}`;
        console.log(`El resultado es: ${resultado}`);
    }
}
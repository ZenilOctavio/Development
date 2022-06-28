let personas = [];
function mostrarPersonas(){
    console.log("Mostrar personas");
    let texto = "";
    
    for(let persona of personas){
        texto += `<li>${persona.nombre} ${persona.apellido}</li>`;
    }
    console.log(texto);
    document.getElementById("personas").innerHTML = texto;
}
function agregarPersona(){
    let form = document.forms['form'];
    let nombre = form['nombre'];
    let apellido = form['apellido'];

    if(nombre.value.toLowerCase() == "manuel" && apellido.value.toLowerCase() == "romero"){
        let imagenes = document.getElementById("imagenes").innerHTML = "<img src='tocamonos.png' >";
        alert("No tocamonos allowed");
    }
    else if(nombre.value != "" && apellido.value != ""){
        const persona = new Persona(nombre.value, apellido.value);

        let imagenes = document.getElementById("imagenes").innerHTML = "<img src='garcias.png' >";
        console.log(persona);
        personas.push(persona);
    
        mostrarPersonas();
    }
    else{
        alert("Introduzca un nombre válido");
    }

}
function verde(objeto){
    objeto.style.background = "green";
}
function azul(objeto){
    objeto.style.background = "#3f51b5";
}
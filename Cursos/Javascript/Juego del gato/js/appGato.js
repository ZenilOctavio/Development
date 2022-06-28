//Declaración de variables
let tablero = [["","",""],["","",""],["","",""]],
jugadores = ["X","O"],
jugador = 0;

let ingresarValor = (objeto)=>{
    if(hayGanador()){return;}
    let id = objeto.id[1] + objeto.id[2];
    let coordenadas = [id[0],id[1]];

    boton = document.getElementById(id);
    
    if(boton.innerHTML != ""){
        alert("Casilla ocupada");
        return ;
    }
    ingresarEnMatriz(coordenadas);
    boton.innerHTML = jugadores[jugador];
    if(hayGanador()){alert("El jugador "+(jugador+1)+" ha ganado ("+jugadores[jugador]+")");}
    jugador = (jugador == 0)?1:0;
}
let ingresarEnMatriz = (arreglo)=>{
    tablero[arreglo[0]][arreglo[1]] = jugadores[jugador];
}
let hayGanador = ()=>{
    let arreglo = new Array(3);

    // Verificar las filas
    for(let i = 0; i<tablero.length; i++){
        for(let j = 0; j<tablero[i].length; j++){
            arreglo[j] = tablero[i][j];
        }
        if((arreglo[0] == arreglo[1])&&(arreglo[1] == arreglo[2])&&(arreglo[1] != "")){
            return true;
        }
    }

    // Verificar columnas
    for(let i = 0; i<tablero.length; i++){
        for(let j = 0; j<tablero[i].length; j++){
            arreglo[j] = tablero[j][i];
        }
        if((arreglo[0] == arreglo[1])&&(arreglo[1] == arreglo[2])&&(arreglo[1] != "")){
            return true;
        }
    }

    //Verificar diagonales
        for(let i = 0; i<tablero.length;i++){ //Diagonal principal
            arreglo[i] = tablero[i][i];
        }
        if((arreglo[0] == arreglo[1])&&(arreglo[1] == arreglo[2])&&(arreglo[1] != "")){
            return true;
        }
        for(let i = 0; i<arreglo.length;i++){
            arreglo[i] = tablero[2-i][i];
        }
        if((arreglo[0] == arreglo[1])&&(arreglo[1] == arreglo[2])&&(arreglo[1] != "")){
            return true;
        }
}
let tableroLleno = ()=>{
    
}

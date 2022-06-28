let contador =0;
//While
while(contador < 10){
    console.log(contador);
    contador++
}

//Dowhile
contador =0;
do{
    console.log(contador);
    contador++;
}while(contador < 10);

//For
for(let i = 0; i<10; i++){
    console.log(i);
}

//Uso de la palabra break
/*Si quieres realizar una acción ciclada, pero que solo se realice la primera vez que se cumpla un parámetro*/ 
for(let i = 1; i <=10; i++){
    if(i % 2 == 0 ){
        console.log(i); break;
    }
}

inicio:
//Uso de la palabra continue
for(let i = 0; i <= 10; i++){
    if(i %2 != 0){
        continue inicio; //Saltar a la siguiente iteración
    }
    console.log(i);
}
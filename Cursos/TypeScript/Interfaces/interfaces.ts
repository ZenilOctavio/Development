interface Usuario{
    nombreUsuario:string;
    password:string
    confirmarPassword?:string;
}
let usuario1:Usuario = {nombreUsuario:"Roberto",password:"12345"};

console.log(usuario1);
console.log(usuario1.nombreUsuario);
console.log(usuario1.password);
// for (let key:any in usuario1) {
//         console.log(usuario1[key]);
//         for (let $key of key) {
//             console.log($key);
//         }
// }

interface Abordar{
    abordarTransporte():void;
}
let avion:Abordar = {
    abordarTransporte: function(){
        console.log("Abordando");
    }
}

avion.abordarTransporte();

const mostrarReloj = () =>{
    let fecha = new Date();
    let tiempo = formatoTiempo(fecha.getHours(),fecha.getMinutes(),fecha.getSeconds())
    document.getElementById('hora').innerHTML = tiempo ;

    const meses = ['Ene','Feb','Mar','Abr','May','Jun','Jul','Ago','Sep','Oct','Nov','Dic'];
    const dias = ['Lun','Mar','Mie','Jue','Vie','Sab','Dom'];

    let diaSemana = dias[fecha.getDay()];
    let dia = fecha.getDate();
    let mes = meses[fecha.getMonth()];

    fechaTexto = `${diaSemana},${dia},${mes}`;

    document.getElementById('fecha').innerHTML = fechaTexto;

    document.getElementById('contenedor').classList.toggle('animar');
}
const formatoTiempo = (hr,min,seg) =>{
    if(hr < 10){
        hr = '0' + hr;
    }
    if(min < 10){
        min = '0' + min;
    }
    if (seg < 10){
        seg = '0' + seg;
    }
    return `${hr}:${min}:${seg}`;
}
setInterval(mostrarReloj,1000);
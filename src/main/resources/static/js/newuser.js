$(document).ready(function() {
    // on ready
 });
 
 
 async function registrarUsuario() {
   let datos = {};
   datos.city = document.getElementById('txtCity').value;
   datos.country = document.getElementById('txtCountry').value;
   datos.email = document.getElementById('txtEmail').value;
   datos.name = document.getElementById('txtNombre').value;
 
   
 
   const request = await fetch('turing/api/v1', {
     method: 'POST',
     headers: {
       'Accept': 'application/json',
       'Content-Type': 'application/json'
     },
     body: JSON.stringify(datos)
   });
   alert("La cuenta fue creada con exito!");
   window.location.href = 'welcom.html'
 
 }